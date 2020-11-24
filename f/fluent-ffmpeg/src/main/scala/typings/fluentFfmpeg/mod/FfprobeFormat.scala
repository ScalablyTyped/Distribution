package typings.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FfprobeFormat
  extends /* key */ StringDictionary[js.Any] {
  
  var bit_rate: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var format_long_name: js.UndefOr[String] = js.native
  
  var format_name: js.UndefOr[String] = js.native
  
  var nb_programs: js.UndefOr[Double] = js.native
  
  var nb_streams: js.UndefOr[Double] = js.native
  
  var probe_score: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var start_time: js.UndefOr[Double] = js.native
  
  var tags: js.UndefOr[js.Array[_]] = js.native
}
object FfprobeFormat {
  
  @scala.inline
  def apply(): FfprobeFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FfprobeFormat]
  }
  
  @scala.inline
  implicit class FfprobeFormatOps[Self <: FfprobeFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBit_rate(value: Double): Self = this.set("bit_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBit_rate: Self = this.set("bit_rate", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFormat_long_name(value: String): Self = this.set("format_long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_long_name: Self = this.set("format_long_name", js.undefined)
    
    @scala.inline
    def setFormat_name(value: String): Self = this.set("format_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_name: Self = this.set("format_name", js.undefined)
    
    @scala.inline
    def setNb_programs(value: Double): Self = this.set("nb_programs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNb_programs: Self = this.set("nb_programs", js.undefined)
    
    @scala.inline
    def setNb_streams(value: Double): Self = this.set("nb_streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNb_streams: Self = this.set("nb_streams", js.undefined)
    
    @scala.inline
    def setProbe_score(value: Double): Self = this.set("probe_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProbe_score: Self = this.set("probe_score", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStart_time(value: Double): Self = this.set("start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: js.Any*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[_]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
