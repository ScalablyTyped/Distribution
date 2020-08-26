package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinedNamesRanges extends js.Object {
  var name: String = js.native
  var range: js.Array[String] = js.native
}

object DefinedNamesRanges {
  @scala.inline
  def apply(name: String, range: js.Array[String]): DefinedNamesRanges = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedNamesRanges]
  }
  @scala.inline
  implicit class DefinedNamesRangesOps[Self <: DefinedNamesRanges] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeVarargs(value: String*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[String]): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

