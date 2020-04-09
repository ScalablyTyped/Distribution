package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleBreak extends js.Object {
  /** @name ScaleBreak.endValue */
  var endValue: js.UndefOr[Double | Date | String] = js.undefined
  /** @name ScaleBreak.startValue */
  var startValue: js.UndefOr[Double | Date | String] = js.undefined
}

object ScaleBreak {
  @scala.inline
  def apply(endValue: Double | Date | String = null, startValue: Double | Date | String = null): ScaleBreak = {
    val __obj = js.Dynamic.literal()
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleBreak]
  }
}

