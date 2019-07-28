package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisRange extends js.Object {
  /** Interval for the range.
    * @Default {null}
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** Maximum value of the axis range.
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.undefined
  /** Minimum value of the axis range.
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.undefined
}

object PrimaryYAxisRange {
  @scala.inline
  def apply(interval: Int | Double = null, max: Int | Double = null, min: Int | Double = null): PrimaryYAxisRange = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisRange]
  }
}

