package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmRegOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: reg
  var value: ArmRegister
}

object ArmRegOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: reg,
    value: ArmRegister,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmRegOperand]
  }
}

