package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AxesTitleRenderingEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** axes - Instance of the axis whose title is being rendered    locationX - X-coordinate of title location    locationY - Y-coordinate of title location    title - Axis title
               * text. You can add custom text to the title.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object.
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

