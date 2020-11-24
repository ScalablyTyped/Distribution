package typings.formatjsIntlDatetimeformat.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnpackedData extends js.Object {
  
  var abbrvs: js.Array[String] = js.native
  
  /**
    * Offset in seconds, base 36
    */
  var offsets: js.Array[Double] = js.native
  
  var zones: Record[String, js.Array[ZoneData]] = js.native
}
object UnpackedData {
  
  @scala.inline
  def apply(abbrvs: js.Array[String], offsets: js.Array[Double], zones: Record[String, js.Array[ZoneData]]): UnpackedData = {
    val __obj = js.Dynamic.literal(abbrvs = abbrvs.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnpackedData]
  }
  
  @scala.inline
  implicit class UnpackedDataOps[Self <: UnpackedData] (val x: Self) extends AnyVal {
    
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
    def setAbbrvsVarargs(value: String*): Self = this.set("abbrvs", js.Array(value :_*))
    
    @scala.inline
    def setAbbrvs(value: js.Array[String]): Self = this.set("abbrvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetsVarargs(value: Double*): Self = this.set("offsets", js.Array(value :_*))
    
    @scala.inline
    def setOffsets(value: js.Array[Double]): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZones(value: Record[String, js.Array[ZoneData]]): Self = this.set("zones", value.asInstanceOf[js.Any])
  }
}
