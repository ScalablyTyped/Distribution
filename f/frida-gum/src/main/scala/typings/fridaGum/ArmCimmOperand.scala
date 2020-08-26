package typings.fridaGum

import typings.fridaGum.fridaGumStrings.cimm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArmCimmOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: cimm = js.native
  var value: Double = js.native
}

object ArmCimmOperand {
  @scala.inline
  def apply(subtracted: Boolean, `type`: cimm, value: Double): ArmCimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmCimmOperand]
  }
  @scala.inline
  implicit class ArmCimmOperandOps[Self <: ArmCimmOperand] (val x: Self) extends AnyVal {
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
    def setType(value: cimm): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

