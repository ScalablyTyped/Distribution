package typings.fridaGum

import typings.fridaGum.anon.Disp
import typings.fridaGum.anon.Type
import typings.fridaGum.fridaGumStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmMemOperand
  extends ArmBaseOperand
     with ArmOperand {
  var `type`: mem
  var value: Disp
}

object ArmMemOperand {
  @scala.inline
  def apply(
    subtracted: Boolean,
    `type`: mem,
    value: Disp,
    shift: Type = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmMemOperand]
  }
}

