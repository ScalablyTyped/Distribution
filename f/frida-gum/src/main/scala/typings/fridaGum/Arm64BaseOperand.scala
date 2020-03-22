package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64BaseOperand extends js.Object {
  var ext: js.UndefOr[Arm64Extender] = js.undefined
  var shift: js.UndefOr[AnonValue] = js.undefined
  var vas: js.UndefOr[Arm64Vas] = js.undefined
  var vectorIndex: js.UndefOr[Double] = js.undefined
}

object Arm64BaseOperand {
  @scala.inline
  def apply(
    ext: Arm64Extender = null,
    shift: AnonValue = null,
    vas: Arm64Vas = null,
    vectorIndex: Int | Double = null
  ): Arm64BaseOperand = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64BaseOperand]
  }
}

