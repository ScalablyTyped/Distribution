package typings.fridaGum

import typings.fridaGum.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmBaseOperand extends js.Object {
  var shift: js.UndefOr[Type] = js.undefined
  var subtracted: Boolean
  var vectorIndex: js.UndefOr[Double] = js.undefined
}

object ArmBaseOperand {
  @scala.inline
  def apply(subtracted: Boolean, shift: Type = null, vectorIndex: js.UndefOr[Double] = js.undefined): ArmBaseOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmBaseOperand]
  }
}

