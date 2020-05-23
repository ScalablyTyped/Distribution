package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.MapTypeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var enableScrollWheel: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Object] = js.undefined
  var lineColor: js.UndefOr[String] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var mapType: js.UndefOr[String] = js.undefined
  var mapTypeIds: js.UndefOr[js.Array[_]] = js.undefined
  var maps: MapTypeId
  var showInfoWindow: js.UndefOr[Boolean] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  var useMapTypeControl: js.UndefOr[Boolean] = js.undefined
  var zoomLevel: js.UndefOr[Double] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    maps: MapTypeId,
    enableScrollWheel: js.UndefOr[Boolean] = js.undefined,
    icons: js.Object = null,
    lineColor: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    mapType: String = null,
    mapTypeIds: js.Array[_] = null,
    showInfoWindow: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    useMapTypeControl: js.UndefOr[Boolean] = js.undefined,
    zoomLevel: js.UndefOr[Double] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
    if (!js.isUndefined(enableScrollWheel)) __obj.updateDynamic("enableScrollWheel")(enableScrollWheel.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (mapTypeIds != null) __obj.updateDynamic("mapTypeIds")(mapTypeIds.asInstanceOf[js.Any])
    if (!js.isUndefined(showInfoWindow)) __obj.updateDynamic("showInfoWindow")(showInfoWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapTypeControl)) __obj.updateDynamic("useMapTypeControl")(useMapTypeControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLevel)) __obj.updateDynamic("zoomLevel")(zoomLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

