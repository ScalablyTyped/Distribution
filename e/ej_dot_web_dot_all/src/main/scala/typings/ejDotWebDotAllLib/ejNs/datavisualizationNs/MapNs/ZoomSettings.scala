package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ZoomSettings extends js.Object {
  /** Specifies animation duration for map shapes while zooming.
               * @Default {600}
               */
  var animationDuration: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or Disables the zoom on mouse wheel the map.
               * @Default {true}
               */
  var enableMouseWheelZoom: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables the zooming of map
               * @Default {true}
               */
  var enableZoom: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or Disables the zoom on selecting the map shape
               * @Default {false}
               */
  var enableZoomOnSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the zoom factor for map zoom value.
               * @Default {1}
               */
  var factor: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the zoom level value for which map to be zoomed
               * @Default {1}
               */
  var level: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the maximum zoom level of the map
               * @Default {100}
               */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum zoomSettings level of the map
               * @Default {1}
               */
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

