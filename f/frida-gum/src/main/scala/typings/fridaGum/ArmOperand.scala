package typings.fridaGum

import typings.fridaGum.anon.Disp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def ArmCimmOperand(subtracted: Boolean, value: Double): typings.fridaGum.ArmCimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[typings.fridaGum.ArmCimmOperand]
  }
  
  @scala.inline
  def ArmFpOperand(subtracted: Boolean, value: Double): typings.fridaGum.ArmFpOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[typings.fridaGum.ArmFpOperand]
  }
  
  @scala.inline
  def ArmImmOperand(subtracted: Boolean, value: Double): typings.fridaGum.ArmImmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typings.fridaGum.ArmImmOperand]
  }
  
  @scala.inline
  def ArmMemOperand(subtracted: Boolean, value: Disp): typings.fridaGum.ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typings.fridaGum.ArmMemOperand]
  }
  
  @scala.inline
  def ArmPimmOperand(subtracted: Boolean, value: Double): typings.fridaGum.ArmPimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pimm")
    __obj.asInstanceOf[typings.fridaGum.ArmPimmOperand]
  }
  
  @scala.inline
  def ArmRegOperand(subtracted: Boolean, value: ArmRegister): typings.fridaGum.ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typings.fridaGum.ArmRegOperand]
  }
  
  @scala.inline
  def ArmSetendOperand(subtracted: Boolean, value: Endian): typings.fridaGum.ArmSetendOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setend")
    __obj.asInstanceOf[typings.fridaGum.ArmSetendOperand]
  }
  
  @scala.inline
  def ArmSysregOperand(subtracted: Boolean, value: ArmRegister): typings.fridaGum.ArmSysregOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sysreg")
    __obj.asInstanceOf[typings.fridaGum.ArmSysregOperand]
  }
}
