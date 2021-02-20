package typings.fridaGum

import typings.fridaGum.anon.Disp
import typings.fridaGum.fridaGumStrings.cimm
import typings.fridaGum.fridaGumStrings.fp
import typings.fridaGum.fridaGumStrings.imm
import typings.fridaGum.fridaGumStrings.mem
import typings.fridaGum.fridaGumStrings.pimm
import typings.fridaGum.fridaGumStrings.reg
import typings.fridaGum.fridaGumStrings.setend
import typings.fridaGum.fridaGumStrings.sysreg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.ArmRegOperand
  - typings.fridaGum.ArmImmOperand
  - typings.fridaGum.ArmMemOperand
  - typings.fridaGum.ArmFpOperand
  - typings.fridaGum.ArmCimmOperand
  - typings.fridaGum.ArmPimmOperand
  - typings.fridaGum.ArmSetendOperand
  - typings.fridaGum.ArmSysregOperand
*/
trait ArmOperand extends StObject
object ArmOperand {
  
  @scala.inline
  def ArmCimmOperand(subtracted: Boolean, `type`: cimm, value: Double): typings.fridaGum.ArmCimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmCimmOperand]
  }
  
  @scala.inline
  def ArmFpOperand(subtracted: Boolean, `type`: fp, value: Double): typings.fridaGum.ArmFpOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmFpOperand]
  }
  
  @scala.inline
  def ArmImmOperand(subtracted: Boolean, `type`: imm, value: Double): typings.fridaGum.ArmImmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmImmOperand]
  }
  
  @scala.inline
  def ArmMemOperand(subtracted: Boolean, `type`: mem, value: Disp): typings.fridaGum.ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmMemOperand]
  }
  
  @scala.inline
  def ArmPimmOperand(subtracted: Boolean, `type`: pimm, value: Double): typings.fridaGum.ArmPimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmPimmOperand]
  }
  
  @scala.inline
  def ArmRegOperand(subtracted: Boolean, `type`: reg, value: ArmRegister): typings.fridaGum.ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmRegOperand]
  }
  
  @scala.inline
  def ArmSetendOperand(subtracted: Boolean, `type`: setend, value: Endian): typings.fridaGum.ArmSetendOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmSetendOperand]
  }
  
  @scala.inline
  def ArmSysregOperand(subtracted: Boolean, `type`: sysreg, value: ArmRegister): typings.fridaGum.ArmSysregOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.ArmSysregOperand]
  }
}
