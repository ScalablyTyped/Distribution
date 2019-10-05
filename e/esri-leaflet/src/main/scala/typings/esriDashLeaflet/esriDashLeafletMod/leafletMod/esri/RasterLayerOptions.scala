package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import typings.leaflet.leafletMod.CrossOrigin
import typings.leaflet.leafletMod.ImageOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for RasterLayer
  */
trait RasterLayerOptions extends ImageOverlayOptions {
  /**
    * Server response content type.
    * @default 'image'
    */
  var f: js.UndefOr[String] = js.undefined
  /**
    * 	Closest zoom level the layer will be displayed on the map.
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /**
    * Furthest zoom level the layer will be displayed on the map.
    */
  var minZoom: js.UndefOr[Double] = js.undefined
  /**
    * Position of the layer relative to other overlays.
    * @default 'front'
    */
  var position: js.UndefOr[String] = js.undefined
}

object RasterLayerOptions {
  @scala.inline
  def apply(
    alt: String = null,
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    errorOverlayUrl: String = null,
    f: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    opacity: Int | Double = null,
    pane: String = null,
    position: String = null,
    zIndex: Int | Double = null
  ): RasterLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (className != null) __obj.updateDynamic("className")(className)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl)
    if (f != null) __obj.updateDynamic("f")(f)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (position != null) __obj.updateDynamic("position")(position)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterLayerOptions]
  }
}

