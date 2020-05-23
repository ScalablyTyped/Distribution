package typings.ejWebAll.ej.datavisualization.Map

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
    factor: js.UndefOr[Double] = js.undefined,
    level: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined
  ): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseWheelZoom)) __obj.updateDynamic("enableMouseWheelZoom")(enableMouseWheelZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableZoom)) __obj.updateDynamic("enableZoom")(enableZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableZoomOnSelection)) __obj.updateDynamic("enableZoomOnSelection")(enableZoomOnSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomSettings]
  }
}

