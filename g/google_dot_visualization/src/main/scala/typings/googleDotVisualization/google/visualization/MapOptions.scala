package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.Anon_MapTypeId
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
  var maps: Anon_MapTypeId
  var showInfoWindow: js.UndefOr[Boolean] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  var useMapTypeControl: js.UndefOr[Boolean] = js.undefined
  var zoomLevel: js.UndefOr[Double] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    maps: Anon_MapTypeId,
    enableScrollWheel: js.UndefOr[Boolean] = js.undefined,
    icons: js.Object = null,
    lineColor: String = null,
    lineWidth: Int | Double = null,
    mapType: String = null,
    mapTypeIds: js.Array[_] = null,
    showInfoWindow: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    useMapTypeControl: js.UndefOr[Boolean] = js.undefined,
    zoomLevel: Int | Double = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal(maps = maps)
    if (!js.isUndefined(enableScrollWheel)) __obj.updateDynamic("enableScrollWheel")(enableScrollWheel)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType)
    if (mapTypeIds != null) __obj.updateDynamic("mapTypeIds")(mapTypeIds)
    if (!js.isUndefined(showInfoWindow)) __obj.updateDynamic("showInfoWindow")(showInfoWindow)
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (!js.isUndefined(useMapTypeControl)) __obj.updateDynamic("useMapTypeControl")(useMapTypeControl)
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

