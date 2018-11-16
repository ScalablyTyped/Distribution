package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DraggingEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** seriesIndex - Series Index of the point held for dragging    pointIndex - PointIndex of the point held for dragging    oldValue - Previous value of the point before dragging
               * newValue - Current value of the point
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

