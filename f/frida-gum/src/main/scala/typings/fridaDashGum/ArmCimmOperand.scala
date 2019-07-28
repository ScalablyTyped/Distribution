package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.cimm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmCimmOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: cimm
  var value: Double
}

object ArmCimmOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: cimm,
    value: Double,
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmCimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmCimmOperand]
  }
}

