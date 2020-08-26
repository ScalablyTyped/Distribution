package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitValue extends js.Object {
  var unit: typings.formatjsIntlUtils.mod.Unit = js.native
  var value: Double = js.native
}

object UnitValue {
  @scala.inline
  def apply(unit: typings.formatjsIntlUtils.mod.Unit, value: Double): UnitValue = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitValue]
  }
  @scala.inline
  implicit class UnitValueOps[Self <: UnitValue] (val x: Self) extends AnyVal {
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
    def setUnit(value: typings.formatjsIntlUtils.mod.Unit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

