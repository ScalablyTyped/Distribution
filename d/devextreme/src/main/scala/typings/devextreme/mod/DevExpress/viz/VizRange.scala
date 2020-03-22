package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VizRange extends js.Object {
  /** The range's end value. */
  var endValue: js.UndefOr[Double | Date | String] = js.undefined
  /** The range's length. */
  var length: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** The range's start value. */
  var startValue: js.UndefOr[Double | Date | String] = js.undefined
}

object VizRange {
  @scala.inline
  def apply(
    endValue: Double | Date | String = null,
    length: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    startValue: Double | Date | String = null
  ): VizRange = {
    val __obj = js.Dynamic.literal()
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VizRange]
  }
}

