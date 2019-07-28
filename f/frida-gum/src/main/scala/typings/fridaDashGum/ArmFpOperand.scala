package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.fp
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
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmFpOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmFpOperand]
  }
}

