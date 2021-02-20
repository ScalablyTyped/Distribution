package typings.fridaGum

import typings.fridaGum.anon.Index
import typings.fridaGum.fridaGumStrings.`reg-mrs`
import typings.fridaGum.fridaGumStrings.`reg-msr`
import typings.fridaGum.fridaGumStrings.barrier
import typings.fridaGum.fridaGumStrings.cimm
import typings.fridaGum.fridaGumStrings.fp
import typings.fridaGum.fridaGumStrings.imm
import typings.fridaGum.fridaGumStrings.mem
import typings.fridaGum.fridaGumStrings.prefetch
import typings.fridaGum.fridaGumStrings.pstate
import typings.fridaGum.fridaGumStrings.reg
import typings.fridaGum.fridaGumStrings.sys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def Arm64BarrierOperand(`type`: barrier, value: Double): typings.fridaGum.Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64BarrierOperand]
  }
  
  @scala.inline
  def Arm64CimmOperand(`type`: cimm, value: Int64): typings.fridaGum.Arm64CimmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64CimmOperand]
  }
  
  @scala.inline
  def Arm64FpOperand(`type`: fp, value: Double): typings.fridaGum.Arm64FpOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64FpOperand]
  }
  
  @scala.inline
  def Arm64ImmOperand(`type`: imm, value: Int64): typings.fridaGum.Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64ImmOperand]
  }
  
  @scala.inline
  def Arm64MemOperand(`type`: mem, value: Index): typings.fridaGum.Arm64MemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64MemOperand]
  }
  
  @scala.inline
  def Arm64PrefetchOperand(`type`: prefetch, value: Double): typings.fridaGum.Arm64PrefetchOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64PrefetchOperand]
  }
  
  @scala.inline
  def Arm64PstateOperand(`type`: pstate, value: Double): typings.fridaGum.Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64PstateOperand]
  }
  
  @scala.inline
  def Arm64RegMrsOperand(`type`: `reg-mrs`, value: Arm64Register): typings.fridaGum.Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64RegMrsOperand]
  }
  
  @scala.inline
  def Arm64RegMsrOperand(`type`: `reg-msr`, value: Arm64Register): typings.fridaGum.Arm64RegMsrOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64RegMsrOperand]
  }
  
  @scala.inline
  def Arm64RegOperand(`type`: reg, value: Arm64Register): typings.fridaGum.Arm64RegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64RegOperand]
  }
  
  @scala.inline
  def Arm64SysOperand(`type`: sys, value: Double): typings.fridaGum.Arm64SysOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.Arm64SysOperand]
  }
}
