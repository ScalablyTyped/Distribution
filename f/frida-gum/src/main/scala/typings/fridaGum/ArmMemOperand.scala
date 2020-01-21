package typings.fridaGum

import typings.fridaGum.fridaGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmMemOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: mem
  var value: AnonBaseDisp
}

object ArmMemOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: mem,
    value: AnonBaseDisp,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmMemOperand]
  }
}

