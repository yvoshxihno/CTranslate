
package site.yvo11.ctranslate.Shanbay;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnDefinition {

    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("defn")
    @Expose
    private String defn;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EnDefinition() {
    }

    /**
     * 
     * @param defn
     * @param pos
     */
    public EnDefinition(String pos, String defn) {
        super();
        this.pos = pos;
        this.defn = defn;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getDefn() {
        return defn;
    }

    public void setDefn(String defn) {
        this.defn = defn;
    }

}
