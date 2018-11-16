package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AxisLabelClickEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** location - X and Y co-ordinate of the labels in chart area.         index - Index of the label.    axis - Instance of the corresponding axis.    text - Label that is clicked.
               *
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

