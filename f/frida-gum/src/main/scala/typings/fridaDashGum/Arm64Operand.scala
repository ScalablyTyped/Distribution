package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.`reg-mrs`
import typings.fridaDashGum.fridaDashGumStrings.`reg-msr`
import typings.fridaDashGum.fridaDashGumStrings.barrier
import typings.fridaDashGum.fridaDashGumStrings.cimm
import typings.fridaDashGum.fridaDashGumStrings.fp
import typings.fridaDashGum.fridaDashGumStrings.imm
import typings.fridaDashGum.fridaDashGumStrings.mem
import typings.fridaDashGum.fridaDashGumStrings.prefetch
import typings.fridaDashGum.fridaDashGumStrings.pstate
import typings.fridaDashGum.fridaDashGumStrings.reg
import typings.fridaDashGum.fridaDashGumStrings.sys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.Arm64RegOperand
  - typings.fridaDashGum.Arm64ImmOperand
  - typings.fridaDashGum.Arm64MemOperand
  - typings.fridaDashGum.Arm64FpOperand
  - typings.fridaDashGum.Arm64CimmOperand
  - typings.fridaDashGum.Arm64RegMrsOperand
  - typings.fridaDashGum.Arm64RegMsrOperand
  - typings.fridaDashGum.Arm64PstateOperand
  - typings.fridaDashGum.Arm64SysOperand
  - typings.fridaDashGum.Arm64PrefetchOperand
  - typings.fridaDashGum.Arm64BarrierOperand
*/
trait Arm64Operand extends js.Object

object Arm64Operand {
  @scala.inline
  def Arm64PstateOperand(
    `type`: pstate,
    value: Double,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegMsrOperand(
    `type`: `reg-msr`,
    value: Arm64Register,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64ImmOperand(
    `type`: imm,
    value: Int64,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64PrefetchOperand(
    `type`: prefetch,
    value: Double,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegOperand(
    `type`: reg,
    value: Arm64Register,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegMrsOperand(
    `type`: `reg-mrs`,
    value: Arm64Register,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64SysOperand(
    `type`: sys,
    value: Double,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64BarrierOperand(
    `type`: barrier,
    value: Double,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64MemOperand(
    `type`: mem,
    value: Anon_BaseDispIndex,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64CimmOperand(
    `type`: cimm,
    value: Int64,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64FpOperand(
    `type`: fp,
    value: Double,
    ext: Arm64Extender = null,
    shift: Anon_TypeValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
}

