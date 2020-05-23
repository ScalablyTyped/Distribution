package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends js.Object {
  /** Width of the column in plotting area. Width is measured in either pixel or percentage based on the value of unit property.
    * @Default {50}
    */
  var columnWidth: js.UndefOr[Double] = js.undefined
  /** Color of the line that indicates the starting point of the column in plotting area.
    * @Default {transparent}
    */
  var lineColor: js.UndefOr[String] = js.undefined
  /** Width of the line that indicates the starting point of the column in plot area.
    * @Default {1}
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the unit to measure the width of the column in plotting area.
    * @Default {'pixel'. See Unit}
    */
  var unit: js.UndefOr[Unit | String] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    columnWidth: js.UndefOr[Double] = js.undefined,
    lineColor: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    unit: Unit | String = null
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

