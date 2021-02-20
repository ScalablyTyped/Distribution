package typings.fridaGum

import typings.fridaGum.anon.BaseDisp
import typings.fridaGum.fridaGumStrings.imm
import typings.fridaGum.fridaGumStrings.mem
import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.MipsRegOperand
  - typings.fridaGum.MipsImmOperand
  - typings.fridaGum.MipsMemOperand
*/
trait MipsOperand extends StObject
object MipsOperand {
  
  @scala.inline
  def MipsImmOperand(`type`: imm, value: Double): typings.fridaGum.MipsImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.MipsImmOperand]
  }
  
  @scala.inline
  def MipsMemOperand(`type`: mem, value: BaseDisp): typings.fridaGum.MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.MipsMemOperand]
  }
  
  @scala.inline
  def MipsRegOperand(`type`: reg, value: MipsRegister): typings.fridaGum.MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.MipsRegOperand]
  }
}
