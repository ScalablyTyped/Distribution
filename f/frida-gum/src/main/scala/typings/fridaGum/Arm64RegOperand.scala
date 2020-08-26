package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arm64RegOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: reg = js.native
  var value: Arm64Register = js.native
}

object Arm64RegOperand {
  @scala.inline
  def apply(`type`: reg, value: Arm64Register): Arm64RegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64RegOperand]
  }
  @scala.inline
  implicit class Arm64RegOperandOps[Self <: Arm64RegOperand] (val x: Self) extends AnyVal {
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
    def setValue(value: Arm64Register): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

