package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmImmOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: imm
  var value: Double
}

object ArmImmOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: imm,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmImmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmImmOperand]
  }
}

