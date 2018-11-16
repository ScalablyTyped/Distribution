package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DisplayTextRenderingEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** text - Text displayed in data label. You can add custom text to the data label    locationX - X-coordinate of data label location    locationY - Y-coordinate of data label
               * location    seriesIndex - Index of the series in series Collection whose data label is being rendered    pointIndex - Index of the point in series whose data label is being
               * rendered
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

