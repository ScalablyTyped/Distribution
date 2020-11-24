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
trait ArmOperand extends js.Object
object ArmOperand {
  
  @scala.inline
  def ArmMemOperand(subtracted: Boolean, `type`: mem, value: Disp): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  
  @scala.inline
  def ArmPimmOperand(subtracted: Boolean, `type`: pimm, value: Double): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  
  @scala.inline
  def ArmCimmOperand(subtracted: Boolean, `type`: cimm, value: Double): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  
  @scala.inline
  def ArmSetendOperand(subtracted: Boolean, `type`: setend, value: Endian): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  
  @scala.inline
  def ArmImmOperand(subtracted: Boolean, `type`: imm, value: Double): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  
  @scala.inline
  def ArmFpOperand(subtracted: Boolean, `type`: fp, value: Double): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  
  @scala.inline
  def ArmSysregOperand(subtracted: Boolean, `type`: sysreg, value: ArmRegister): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  
  @scala.inline
  def ArmRegOperand(subtracted: Boolean, `type`: reg, value: ArmRegister): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
}
