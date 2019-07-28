package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.imm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86ImmOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: imm
  var value: Double | Int64
}

object X86ImmOperand {
  @scala.inline
  def apply(size: Double, `type`: imm, value: Double | Int64): X86ImmOperand = {
    val __obj = js.Dynamic.literal(size = size, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[X86ImmOperand]
  }
}

