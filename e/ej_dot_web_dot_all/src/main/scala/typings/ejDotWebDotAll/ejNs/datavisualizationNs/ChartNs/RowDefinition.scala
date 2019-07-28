package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDefinition extends js.Object {
  /** Color of the line that indicates the starting point of the row in plotting area.
    * @Default {transparent}
    */
  var lineColor: js.UndefOr[String] = js.undefined
  /** Width of the line that indicates the starting point of the row in plot area.
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** Height of the row in plotting area. Height is measured in either pixel or percentage based on the value of unit property.
    * @Default {50}
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the unit to measure the height of the row in plotting area.
    * @Default {'pixel'. See Unit}
    */
  var unit: js.UndefOr[Unit | String] = js.undefined
}

object RowDefinition {
  @scala.inline
  def apply(
    lineColor: String = null,
    lineWidth: Int | Double = null,
    rowHeight: Int | Double = null,
    unit: Unit | String = null
  ): RowDefinition = {
    val __obj = js.Dynamic.literal()
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDefinition]
  }
}

