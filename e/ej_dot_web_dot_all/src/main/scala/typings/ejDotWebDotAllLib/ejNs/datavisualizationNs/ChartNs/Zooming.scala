package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Zooming extends js.Object {
  /** Enables or disables zooming.
               * @Default {false}
               */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disables the differed zooming. When it is enabled, chart is updated only on mouse up action while zooming and panning.
               * @Default {false}
               */
  var enableDeferredZoom: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the ability to zoom the chart on moving the mouse wheel.
               * @Default {false}
               */
  var enableMouseWheel: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables pinch zooming.
               * @Default {true}
               */
  var enablePinching: js.UndefOr[scala.Boolean] = js.undefined
  /** Toggles the visibility of the scrollbar, which will be displayed while zooming.
               * @Default {false}
               */
  var enableScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /** To display user specified buttons in zooming toolbar.
               * @Default {[zoomIn, zoomOut, zoom, pan, reset]}
               */
  var toolbarItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies whether to allow zooming the chart vertically or horizontally or in both ways.
               * @Default {'x,y'}
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

