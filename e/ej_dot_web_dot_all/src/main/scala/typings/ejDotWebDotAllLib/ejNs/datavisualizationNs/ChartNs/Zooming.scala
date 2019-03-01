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

object Zooming {
  @scala.inline
  def apply(
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    enableDeferredZoom: js.UndefOr[scala.Boolean] = js.undefined,
    enableMouseWheel: js.UndefOr[scala.Boolean] = js.undefined,
    enablePinching: js.UndefOr[scala.Boolean] = js.undefined,
    enableScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarItems: js.Array[_] = null,
    `type`: java.lang.String = null
  ): Zooming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(enableDeferredZoom)) __obj.updateDynamic("enableDeferredZoom")(enableDeferredZoom)
    if (!js.isUndefined(enableMouseWheel)) __obj.updateDynamic("enableMouseWheel")(enableMouseWheel)
    if (!js.isUndefined(enablePinching)) __obj.updateDynamic("enablePinching")(enablePinching)
    if (!js.isUndefined(enableScrollbar)) __obj.updateDynamic("enableScrollbar")(enableScrollbar)
    if (toolbarItems != null) __obj.updateDynamic("toolbarItems")(toolbarItems)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Zooming]
  }
}

