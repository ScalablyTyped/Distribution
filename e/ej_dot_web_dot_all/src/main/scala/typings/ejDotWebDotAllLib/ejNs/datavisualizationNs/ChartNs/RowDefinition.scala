package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RowDefinition extends js.Object {
  /** Color of the line that indicates the starting point of the row in plotting area.
               * @Default {transparent}
               */
  var lineColor: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the line that indicates the starting point of the row in plot area.
               * @Default {1}
               */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** Height of the row in plotting area. Height is measured in either pixel or percentage based on the value of unit property.
               * @Default {50}
               */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the unit to measure the height of the row in plotting area.
               * @Default {'pixel'. See Unit}
               */
  var unit: js.UndefOr[Unit | java.lang.String] = js.undefined
}

