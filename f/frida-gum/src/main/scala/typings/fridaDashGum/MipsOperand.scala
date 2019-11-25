package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.imm
import typings.fridaDashGum.fridaDashGumStrings.mem
import typings.fridaDashGum.fridaDashGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.MipsRegOperand
  - typings.fridaDashGum.MipsImmOperand
  - typings.fridaDashGum.MipsMemOperand
*/
trait MipsOperand extends js.Object

object MipsOperand {
  @scala.inline
  def MipsRegOperand(`type`: reg, value: MipsRegister): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
  @scala.inline
  def MipsImmOperand(`type`: imm, value: Double): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
  @scala.inline
  def MipsMemOperand(`type`: mem, value: Anon_BaseDispMipsRegister): MipsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsOperand]
  }
}

