package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AfterResizeEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** width - Chart width, after resize    height - Chart height, after resize    prevWidth - Chart width, before resize    prevHeight - Chart height, before resize
               * originalWidth- Chart width, when the chart was first rendered    originalHeight - Chart height, when the chart was first rendered
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

