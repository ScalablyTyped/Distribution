package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.imm
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
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmImmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmImmOperand]
  }
}

