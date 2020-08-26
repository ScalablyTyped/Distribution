package typings.formatjsIntlDatetimeformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackedData extends js.Object {
  var abbrvs: String = js.native
  var offsets: String = js.native
  var zones: js.Array[String] = js.native
}

object PackedData {
  @scala.inline
  def apply(abbrvs: String, offsets: String, zones: js.Array[String]): PackedData = {
    val __obj = js.Dynamic.literal(abbrvs = abbrvs.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackedData]
  }
  @scala.inline
  implicit class PackedDataOps[Self <: PackedData] (val x: Self) extends AnyVal {
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
    def setAbbrvs(value: String): Self = this.set("abbrvs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsets(value: String): Self = this.set("offsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
  }
  
}

