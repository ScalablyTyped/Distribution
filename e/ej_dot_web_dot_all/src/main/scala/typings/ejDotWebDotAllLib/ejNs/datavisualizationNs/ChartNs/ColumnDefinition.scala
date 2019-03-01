package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends js.Object {
  /** Width of the column in plotting area. Width is measured in either pixel or percentage based on the value of unit property.
    * @Default {50}
    */
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  /** Color of the line that indicates the starting point of the column in plotting area.
    * @Default {transparent}
    */
  var lineColor: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the line that indicates the starting point of the column in plot area.
    * @Default {1}
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the unit to measure the width of the column in plotting area.
    * @Default {'pixel'. See Unit}
    */
  var unit: js.UndefOr[Unit | java.lang.String] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    columnWidth: scala.Int | scala.Double = null,
    lineColor: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    unit: Unit | java.lang.String = null
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

