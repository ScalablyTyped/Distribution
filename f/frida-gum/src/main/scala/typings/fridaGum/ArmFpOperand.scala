package typings.fridaGum

import typings.fridaGum.fridaGumStrings.fp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmFpOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: fp
  var value: Double
}

object ArmFpOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: fp,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmFpOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmFpOperand]
  }
}

