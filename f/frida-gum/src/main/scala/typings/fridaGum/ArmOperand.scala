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
  
  inline def ArmCimmOperand(access: OperandAccess, subtracted: Boolean, value: Double): typings.fridaGum.ArmCimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[typings.fridaGum.ArmCimmOperand]
  }
  
  inline def ArmFpOperand(access: OperandAccess, subtracted: Boolean, value: Double): typings.fridaGum.ArmFpOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[typings.fridaGum.ArmFpOperand]
  }
  
  inline def ArmImmOperand(access: OperandAccess, subtracted: Boolean, value: Double): typings.fridaGum.ArmImmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typings.fridaGum.ArmImmOperand]
  }
  
  inline def ArmMemOperand(access: OperandAccess, subtracted: Boolean, value: Disp): typings.fridaGum.ArmMemOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typings.fridaGum.ArmMemOperand]
  }
  
  inline def ArmPimmOperand(access: OperandAccess, subtracted: Boolean, value: Double): typings.fridaGum.ArmPimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pimm")
    __obj.asInstanceOf[typings.fridaGum.ArmPimmOperand]
  }
  
  inline def ArmRegOperand(access: OperandAccess, subtracted: Boolean, value: ArmRegister): typings.fridaGum.ArmRegOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typings.fridaGum.ArmRegOperand]
  }
  
  inline def ArmSetendOperand(access: OperandAccess, subtracted: Boolean, value: Endian): typings.fridaGum.ArmSetendOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setend")
    __obj.asInstanceOf[typings.fridaGum.ArmSetendOperand]
  }
  
  inline def ArmSysregOperand(access: OperandAccess, subtracted: Boolean, value: ArmRegister): typings.fridaGum.ArmSysregOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sysreg")
    __obj.asInstanceOf[typings.fridaGum.ArmSysregOperand]
  }
}
