package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zooming extends js.Object {
  /** Enables or disables zooming.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Enable or disables the differed zooming. When it is enabled, chart is updated only on mouse up action while zooming and panning.
    * @Default {false}
    */
  var enableDeferredZoom: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the ability to zoom the chart on moving the mouse wheel.
    * @Default {false}
    */
  var enableMouseWheel: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables pinch zooming.
    * @Default {true}
    */
  var enablePinching: js.UndefOr[Boolean] = js.undefined
  /** Toggles the visibility of the scrollbar, which will be displayed while zooming.
    * @Default {false}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.undefined
  /** To display user specified buttons in zooming toolbar.
    * @Default {[zoomIn, zoomOut, zoom, pan, reset]}
    */
  var toolbarItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies whether to allow zooming the chart vertically or horizontally or in both ways.
    * @Default {'x,y'}
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Zooming {
  @scala.inline
  def apply(
    enable: js.UndefOr[Boolean] = js.undefined,
    enableDeferredZoom: js.UndefOr[Boolean] = js.undefined,
    enableMouseWheel: js.UndefOr[Boolean] = js.undefined,
    enablePinching: js.UndefOr[Boolean] = js.undefined,
    enableScrollbar: js.UndefOr[Boolean] = js.undefined,
    toolbarItems: js.Array[_] = null,
    `type`: String = null
  ): Zooming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDeferredZoom)) __obj.updateDynamic("enableDeferredZoom")(enableDeferredZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseWheel)) __obj.updateDynamic("enableMouseWheel")(enableMouseWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePinching)) __obj.updateDynamic("enablePinching")(enablePinching.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScrollbar)) __obj.updateDynamic("enableScrollbar")(enableScrollbar.asInstanceOf[js.Any])
    if (toolbarItems != null) __obj.updateDynamic("toolbarItems")(toolbarItems.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zooming]
  }
}

