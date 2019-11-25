package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.imm
import typings.fridaDashGum.fridaDashGumStrings.mem
import typings.fridaDashGum.fridaDashGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.X86RegOperand
  - typings.fridaDashGum.X86ImmOperand
  - typings.fridaDashGum.X86MemOperand
*/
trait X86Operand extends js.Object

object X86Operand {
  @scala.inline
  def X86RegOperand(size: Double, `type`: reg, value: X86Register): X86Operand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Operand]
  }
  @scala.inline
  def X86ImmOperand(size: Double, `type`: imm, value: Double | Int64): X86Operand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Operand]
  }
  @scala.inline
  def X86MemOperand(size: Double, `type`: mem, value: Anon_Base): X86Operand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86Operand]
  }
}

