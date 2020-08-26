package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArmRegOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: reg = js.native
  var value: ArmRegister = js.native
}

object ArmRegOperand {
  @scala.inline
  def apply(subtracted: Boolean, `type`: reg, value: ArmRegister): ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmRegOperand]
  }
  @scala.inline
  implicit class ArmRegOperandOps[Self <: ArmRegOperand] (val x: Self) extends AnyVal {
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
    def setType(value: reg): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ArmRegister): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

