package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AxesRangeCalculateEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** delta - Difference between minimum and maximum value of axis range.    interval - Interval value of axis range. Grid lines, tick lines and axis labels are drawn based on this
               * interval value.    max - Maximum value of axis range.    min - Minimum value of axis range.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

