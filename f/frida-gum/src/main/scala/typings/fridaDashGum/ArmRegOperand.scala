package typings.fridaDashGum

import typings.fridaDashGum.fridaDashGumStrings.reg
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
    shift: Anon_Type = null,
    vectorIndex: Int | Double = null
  ): ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmRegOperand]
  }
}

