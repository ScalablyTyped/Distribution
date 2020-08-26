package typings.ebml.mod.Tag

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Record<ebml.ebml.TagType, any> */
@js.native
trait DataTypeToTypeMap extends js.Object {
  var `8`: String = js.native
  var b: Double = js.native
  var d: Date = js.native
  var f: Double = js.native
  var i: Double = js.native
  var m: js.UndefOr[scala.Nothing] = js.native
  var s: String = js.native
  var u: Double = js.native
}

object DataTypeToTypeMap {
  @scala.inline
  def apply(`8`: String, b: Double, d: Date, f: Double, i: Double, s: String, u: Double): DataTypeToTypeMap = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeToTypeMap]
  }
  @scala.inline
  implicit class DataTypeToTypeMapOps[Self <: DataTypeToTypeMap] (val x: Self) extends AnyVal {
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
    def set8(value: String): Self = this.set("8", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setD(value: Date): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setU(value: Double): Self = this.set("u", value.asInstanceOf[js.Any])
  }
  
}

