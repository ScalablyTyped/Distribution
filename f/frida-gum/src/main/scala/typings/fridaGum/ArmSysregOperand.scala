package typings.fridaGum

import typings.fridaGum.fridaGumStrings.sysreg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmSysregOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: sysreg
  var value: ArmRegister
}

object ArmSysregOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: sysreg,
    value: ArmRegister,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmSysregOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmSysregOperand]
  }
}

