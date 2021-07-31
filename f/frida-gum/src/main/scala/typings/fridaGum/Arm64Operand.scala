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
  
  @scala.inline
  def Arm64BarrierOperand(value: Double): typings.fridaGum.Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("barrier")
    __obj.asInstanceOf[typings.fridaGum.Arm64BarrierOperand]
  }
  
  @scala.inline
  def Arm64CimmOperand(value: Int64): typings.fridaGum.Arm64CimmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[typings.fridaGum.Arm64CimmOperand]
  }
  
  @scala.inline
  def Arm64FpOperand(value: Double): typings.fridaGum.Arm64FpOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[typings.fridaGum.Arm64FpOperand]
  }
  
  @scala.inline
  def Arm64ImmOperand(value: Int64): typings.fridaGum.Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typings.fridaGum.Arm64ImmOperand]
  }
  
  @scala.inline
  def Arm64MemOperand(value: Index): typings.fridaGum.Arm64MemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typings.fridaGum.Arm64MemOperand]
  }
  
  @scala.inline
  def Arm64PrefetchOperand(value: Double): typings.fridaGum.Arm64PrefetchOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("prefetch")
    __obj.asInstanceOf[typings.fridaGum.Arm64PrefetchOperand]
  }
  
  @scala.inline
  def Arm64PstateOperand(value: Double): typings.fridaGum.Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pstate")
    __obj.asInstanceOf[typings.fridaGum.Arm64PstateOperand]
  }
  
  @scala.inline
  def Arm64RegMrsOperand(value: Arm64Register): typings.fridaGum.Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-mrs")
    __obj.asInstanceOf[typings.fridaGum.Arm64RegMrsOperand]
  }
  
  @scala.inline
  def Arm64RegMsrOperand(value: Arm64Register): typings.fridaGum.Arm64RegMsrOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-msr")
    __obj.asInstanceOf[typings.fridaGum.Arm64RegMsrOperand]
  }
  
  @scala.inline
  def Arm64RegOperand(value: Arm64Register): typings.fridaGum.Arm64RegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typings.fridaGum.Arm64RegOperand]
  }
  
  @scala.inline
  def Arm64SysOperand(value: Double): typings.fridaGum.Arm64SysOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sys")
    __obj.asInstanceOf[typings.fridaGum.Arm64SysOperand]
  }
}
