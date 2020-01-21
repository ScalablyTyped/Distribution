package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86ImmOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: imm
  var value: Double | Int64_
}

object X86ImmOperand {
  @scala.inline
  def apply(size: Double, `type`: imm, value: Double | Int64_): X86ImmOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86ImmOperand]
  }
}

