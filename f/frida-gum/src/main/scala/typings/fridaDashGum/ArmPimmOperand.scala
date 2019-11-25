package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.pimm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmPimmOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: pimm
  var value: Double
}

object ArmPimmOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: pimm,
    value: Double,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmPimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmPimmOperand]
  }
}

