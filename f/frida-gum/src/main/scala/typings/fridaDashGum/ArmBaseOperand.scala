package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArmBaseOperand extends js.Object {
  var shift: js.UndefOr[Anon_Type] = js.undefined
  var subtracted: Boolean
  var vectorIndex: js.UndefOr[Double] = js.undefined
}

object ArmBaseOperand {
  @scala.inline
  def apply(subtracted: Boolean, shift: Anon_Type = null, vectorIndex: Int | Double = null): ArmBaseOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmBaseOperand]
  }
}

