package typings.fridaGum

import typings.fridaGum.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64BaseOperand extends js.Object {
  var ext: js.UndefOr[Arm64Extender] = js.undefined
  var shift: js.UndefOr[Value] = js.undefined
  var vas: js.UndefOr[Arm64Vas] = js.undefined
  var vectorIndex: js.UndefOr[Double] = js.undefined
}

object Arm64BaseOperand {
  @scala.inline
  def apply(
    ext: Arm64Extender = null,
    shift: Value = null,
    vas: Arm64Vas = null,
    vectorIndex: js.UndefOr[Double] = js.undefined
  ): Arm64BaseOperand = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vas != null) __obj.updateDynamic("vas")(vas.asInstanceOf[js.Any])
    if (!js.isUndefined(vectorIndex)) __obj.updateDynamic("vectorIndex")(vectorIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64BaseOperand]
  }
}

