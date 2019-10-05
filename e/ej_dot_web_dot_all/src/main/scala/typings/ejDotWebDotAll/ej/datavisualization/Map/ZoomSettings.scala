package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomSettings extends js.Object {
  /** Specifies animation duration for map shapes while zooming.
    * @Default {600}
    */
  var animationDuration: js.UndefOr[String] = js.undefined
  /** Enables or Disables the zoom on mouse wheel the map.
    * @Default {true}
    */
  var enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables the zooming of map
    * @Default {true}
    */
  var enableZoom: js.UndefOr[Boolean] = js.undefined
  /** Enables or Disables the zoom on selecting the map shape
    * @Default {false}
    */
  var enableZoomOnSelection: js.UndefOr[Boolean] = js.undefined
  /** Specifies the zoom factor for map zoom value.
    * @Default {1}
    */
  var factor: js.UndefOr[Double] = js.undefined
  /** Specifies the zoom level value for which map to be zoomed
    * @Default {1}
    */
  var level: js.UndefOr[Double] = js.undefined
  /** Specifies the maximum zoom level of the map
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Specifies the minimum zoomSettings level of the map
    * @Default {1}
    */
  var minValue: js.UndefOr[Double] = js.undefined
}

object ZoomSettings {
  @scala.inline
  def apply(
    animationDuration: String = null,
    enableMouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    enableZoom: js.UndefOr[Boolean] = js.undefined,
    enableZoomOnSelection: js.UndefOr[Boolean] = js.undefined,
    factor: Int | Double = null,
    level: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null
  ): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration)
    if (!js.isUndefined(enableMouseWheelZoom)) __obj.updateDynamic("enableMouseWheelZoom")(enableMouseWheelZoom)
    if (!js.isUndefined(enableZoom)) __obj.updateDynamic("enableZoom")(enableZoom)
    if (!js.isUndefined(enableZoomOnSelection)) __obj.updateDynamic("enableZoomOnSelection")(enableZoomOnSelection)
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomSettings]
  }
}

