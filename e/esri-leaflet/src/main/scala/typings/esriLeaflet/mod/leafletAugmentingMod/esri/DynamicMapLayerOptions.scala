package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.CrossOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.DynamicMapLayer`
  */
trait DynamicMapLayerOptions
  extends RasterLayerOptions
     with LayerOptionsBase {
  /**
    * If enabled, appends a timestamp to each request to ensure a fresh image is created server-side.
    */
  var disableCache: js.UndefOr[Boolean] = js.undefined
  /**
    * JSON object literal used to manipulate the layer symbology defined in the service itself. Requires a 10.1
    * (or above) map service which supports dynamicLayers requests.
    */
  var dynamicLayers: js.UndefOr[js.Any] = js.undefined
  /**
    * Output format of the image.
    * @default 'png24'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    *     SQL filters to define what features will be included in the image rendered by the service. An object is
    *     used with keys that map each query to its respective layer.
    *
    * { 3: "STATE_NAME='Kansas'", 9: "POP2007>25000" }
    */
  var layerDefs: js.UndefOr[js.Any] = js.undefined
  /**
    * An array of Layer IDs like [3,4,5] to show from the service.
    */
  var layers: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Allow the server to produce transparent images.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object DynamicMapLayerOptions {
  @scala.inline
  def apply(
    url: String,
    alt: String = null,
    attribution: String = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    crossOrigin: CrossOrigin = null,
    disableCache: js.UndefOr[Boolean] = js.undefined,
    dynamicLayers: js.Any = null,
    errorOverlayUrl: String = null,
    f: String = null,
    format: String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    layerDefs: js.Any = null,
    layers: js.Array[_] = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    position: String = null,
    proxy: String = null,
    token: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    useCors: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): DynamicMapLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache.get.asInstanceOf[js.Any])
    if (dynamicLayers != null) __obj.updateDynamic("dynamicLayers")(dynamicLayers.asInstanceOf[js.Any])
    if (errorOverlayUrl != null) __obj.updateDynamic("errorOverlayUrl")(errorOverlayUrl.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (layerDefs != null) __obj.updateDynamic("layerDefs")(layerDefs.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCors)) __obj.updateDynamic("useCors")(useCors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicMapLayerOptions]
  }
}

