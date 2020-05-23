package typings.fridaGum

import typings.fridaGum.anon.Index
import typings.fridaGum.anon.Value
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Arm64Operand extends js.Object

object Arm64Operand {
  @scala.inline
  def Arm64BarrierOperand(
    `type`: barrier,
    value: Double,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64PstateOperand(
    `type`: pstate,
    value: Double,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegMrsOperand(
    `type`: `reg-mrs`,
    value: Arm64Register,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64PrefetchOperand(
    `type`: prefetch,
    value: Double,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64CimmOperand(
    `type`: cimm,
    value: Int64,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegMsrOperand(
    `type`: `reg-msr`,
    value: Arm64Register,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64RegOperand(
    `type`: reg,
    value: Arm64Register,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64SysOperand(
    `type`: sys,
    value: Double,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64FpOperand(
    `type`: fp,
    value: Double,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64MemOperand(
    `type`: mem,
    value: Index,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
  @scala.inline
  def Arm64ImmOperand(
    `type`: imm,
    value: Int64,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64Operand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Operand]
  }
}

