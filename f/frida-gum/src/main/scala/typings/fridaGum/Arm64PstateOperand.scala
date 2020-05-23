package typings.fridaGum

import typings.fridaGum.anon.Value
import typings.fridaGum.fridaGumStrings.pstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64PstateOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  var `type`: pstate
  var value: Double
}

object Arm64PstateOperand {
  @scala.inline
  def apply(
    `type`: pstate,
    value: Double,
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64PstateOperand]
  }
}

