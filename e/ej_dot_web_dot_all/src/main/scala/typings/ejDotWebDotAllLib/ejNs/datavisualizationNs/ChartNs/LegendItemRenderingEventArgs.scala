package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LegendItemRenderingEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** startX - X-coordinate of legend item in pixel    startY - Y-coordinate of legend item in pixel    legendItem - Instance of the legend item object that is about to be rendered
               * style - Options to customize the legend item styles such as border, color, size, etc.    symbolShape - Name of the legend item shape. Use this option to customize legend item
               * shape before rendering
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

