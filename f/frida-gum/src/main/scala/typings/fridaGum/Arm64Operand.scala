package typings.fridaGum

import typings.fridaGum.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.Arm64RegOperand
  - typings.fridaGum.Arm64ImmOperand
  - typings.fridaGum.Arm64MemOperand
  - typings.fridaGum.Arm64FpOperand
  - typings.fridaGum.Arm64CimmOperand
  - typings.fridaGum.Arm64RegMrsOperand
  - typings.fridaGum.Arm64RegMsrOperand
  - typings.fridaGum.Arm64PstateOperand
  - typings.fridaGum.Arm64SysOperand
  - typings.fridaGum.Arm64PrefetchOperand
  - typings.fridaGum.Arm64BarrierOperand
*/
trait Arm64Operand extends StObject
object Arm64Operand {
  
  inline def Arm64BarrierOperand(access: OperandAccess, value: Double): typings.fridaGum.Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("barrier")
    __obj.asInstanceOf[typings.fridaGum.Arm64BarrierOperand]
  }
  
  inline def Arm64CimmOperand(access: OperandAccess, value: Int64): typings.fridaGum.Arm64CimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[typings.fridaGum.Arm64CimmOperand]
  }
  
  inline def Arm64FpOperand(access: OperandAccess, value: Double): typings.fridaGum.Arm64FpOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[typings.fridaGum.Arm64FpOperand]
  }
  
  inline def Arm64ImmOperand(access: OperandAccess, value: Int64): typings.fridaGum.Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typings.fridaGum.Arm64ImmOperand]
  }
  
  inline def Arm64MemOperand(access: OperandAccess, value: Index): typings.fridaGum.Arm64MemOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typings.fridaGum.Arm64MemOperand]
  }
  
  inline def Arm64PrefetchOperand(access: OperandAccess, value: Double): typings.fridaGum.Arm64PrefetchOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("prefetch")
    __obj.asInstanceOf[typings.fridaGum.Arm64PrefetchOperand]
  }
  
  inline def Arm64PstateOperand(access: OperandAccess, value: Double): typings.fridaGum.Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pstate")
    __obj.asInstanceOf[typings.fridaGum.Arm64PstateOperand]
  }
  
  inline def Arm64RegMrsOperand(access: OperandAccess, value: Arm64Register): typings.fridaGum.Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-mrs")
    __obj.asInstanceOf[typings.fridaGum.Arm64RegMrsOperand]
  }
  
  inline def Arm64RegMsrOperand(access: OperandAccess, value: Arm64Register): typings.fridaGum.Arm64RegMsrOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-msr")
    __obj.asInstanceOf[typings.fridaGum.Arm64RegMsrOperand]
  }
  
  inline def Arm64RegOperand(access: OperandAccess, value: Arm64Register): typings.fridaGum.Arm64RegOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typings.fridaGum.Arm64RegOperand]
  }
  
  inline def Arm64SysOperand(access: OperandAccess, value: Double): typings.fridaGum.Arm64SysOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sys")
    __obj.asInstanceOf[typings.fridaGum.Arm64SysOperand]
  }
}
