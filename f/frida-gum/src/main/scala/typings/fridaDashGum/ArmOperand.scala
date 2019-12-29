package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.cimm
import typings.fridaDashGum.fridaDashGumStrings.fp
import typings.fridaDashGum.fridaDashGumStrings.imm
import typings.fridaDashGum.fridaDashGumStrings.mem
import typings.fridaDashGum.fridaDashGumStrings.pimm
import typings.fridaDashGum.fridaDashGumStrings.reg
import typings.fridaDashGum.fridaDashGumStrings.setend
import typings.fridaDashGum.fridaDashGumStrings.sysreg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.ArmRegOperand
  - typings.fridaDashGum.ArmImmOperand
  - typings.fridaDashGum.ArmMemOperand
  - typings.fridaDashGum.ArmFpOperand
  - typings.fridaDashGum.ArmCimmOperand
  - typings.fridaDashGum.ArmPimmOperand
  - typings.fridaDashGum.ArmSetendOperand
  - typings.fridaDashGum.ArmSysregOperand
*/
trait ArmOperand extends js.Object

object ArmOperand {
  @scala.inline
  def ArmImmOperand(
    subtracted: Boolean,
    `type`: imm,
    value: Double,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmSetendOperand(
    subtracted: Boolean,
    `type`: setend,
    value: Endian,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmFpOperand(
    subtracted: Boolean,
    `type`: fp,
    value: Double,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmPimmOperand(
    subtracted: Boolean,
    `type`: pimm,
    value: Double,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmRegOperand(
    subtracted: Boolean,
    `type`: reg,
    value: ArmRegister,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmMemOperand(
    subtracted: Boolean,
    `type`: mem,
    value: Anon_BaseDisp,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmSysregOperand(
    subtracted: Boolean,
    `type`: sysreg,
    value: ArmRegister,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmCimmOperand(
    subtracted: Boolean,
    `type`: cimm,
    value: Double,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
}

