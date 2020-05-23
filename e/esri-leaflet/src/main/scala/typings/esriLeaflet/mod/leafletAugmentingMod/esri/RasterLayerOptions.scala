package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.CrossOrigin
import typings.leaflet.mod.ImageOverlayOptions
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
    *     Closest zoom level the layer will be displayed on the map.
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
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    position: String = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): RasterLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterLayerOptions]
  }
}

