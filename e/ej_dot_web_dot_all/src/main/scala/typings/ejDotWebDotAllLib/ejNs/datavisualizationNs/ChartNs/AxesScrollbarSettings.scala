package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AxesScrollbarSettings extends js.Object {
  /** Controls whether scrollbar has to be responsive in the chart.
               * @Default {false}
               */
  var canResize: js.UndefOr[scala.Boolean] = js.undefined
  /** The maximum number of points to be displayed in the scrollbar.
               * @Default {null}
               */
  var pointsLength: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the range for the scrollbar in the axis.
               */
  var range: js.UndefOr[AxesScrollbarSettingsRange] = js.undefined
  /** Specifies to enable or disable the scrollbar.
               * @Default {false}
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

