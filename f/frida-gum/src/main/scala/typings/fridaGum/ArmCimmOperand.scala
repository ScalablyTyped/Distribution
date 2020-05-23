package typings.fridaGum

import typings.fridaGum.anon.Type
import typings.fridaGum.fridaGumStrings.cimm
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
    shift: Type = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): ArmCimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmCimmOperand]
  }
}

