package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86RegOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: reg
  var value: X86Register
}

object X86RegOperand {
  @scala.inline
  def apply(size: Double, `type`: reg, value: X86Register): X86RegOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86RegOperand]
  }
}

