package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X86RegOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: reg = js.native
  var value: X86Register = js.native
}

object X86RegOperand {
  @scala.inline
  def apply(size: Double, `type`: reg, value: X86Register): X86RegOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86RegOperand]
  }
  @scala.inline
  implicit class X86RegOperandOps[Self <: X86RegOperand] (val x: Self) extends AnyVal {
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
    def setValue(value: X86Register): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

