package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait daySettings extends js.Object {
  var names: js.Array[String] = js.native
  var namesAbbr: js.Array[String] = js.native
  var namesShort: js.Array[String] = js.native
}

object daySettings {
  @scala.inline
  def apply(names: js.Array[String], namesAbbr: js.Array[String], namesShort: js.Array[String]): daySettings = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], namesAbbr = namesAbbr.asInstanceOf[js.Any], namesShort = namesShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[daySettings]
  }
  @scala.inline
  implicit class daySettingsOps[Self <: daySettings] (val x: Self) extends AnyVal {
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
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesAbbrVarargs(value: String*): Self = this.set("namesAbbr", js.Array(value :_*))
    @scala.inline
    def setNamesAbbr(value: js.Array[String]): Self = this.set("namesAbbr", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesShortVarargs(value: String*): Self = this.set("namesShort", js.Array(value :_*))
    @scala.inline
    def setNamesShort(value: js.Array[String]): Self = this.set("namesShort", value.asInstanceOf[js.Any])
  }
  
}

