package typings.fridaGum

import typings.fridaGum.anon.Type
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
    shift: Type = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmRegOperand]
  }
}

