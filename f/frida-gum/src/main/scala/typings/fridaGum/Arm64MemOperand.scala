package typings.fridaGum

import typings.fridaGum.anon.Index
import typings.fridaGum.fridaGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arm64MemOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: mem = js.native
  var value: Index = js.native
}

object Arm64MemOperand {
  @scala.inline
  def apply(`type`: mem, value: Index): Arm64MemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64MemOperand]
  }
  @scala.inline
  implicit class Arm64MemOperandOps[Self <: Arm64MemOperand] (val x: Self) extends AnyVal {
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
    def setType(value: mem): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Index): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

