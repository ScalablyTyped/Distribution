package typings.fridaGum

import typings.fridaGum.fridaGumStrings.setend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmSetendOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: setend
  var value: Endian
}

object ArmSetendOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: setend,
    value: Endian,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmSetendOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmSetendOperand]
  }
}

