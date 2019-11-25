package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import typings.esriDashLeaflet.esriDashLeafletStrings.client
import typings.esriDashLeaflet.esriDashLeafletStrings.server
import typings.leaflet.leafletMod.Canvas
import typings.leaflet.leafletMod.LatLngExpression
import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.SVG
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for FeatureLayer
  */
trait FeatureLayerOptions extends LayerOptionsBase {
  /**
    * Will remove layers from the internal cache when they are removed from the map.
    */
  var cacheLayers: js.UndefOr[Boolean] = js.undefined
  /**
    * 	An array of fieldnames to pull from the service. Includes all fields by default. You should always
    * 	specify the name of the unique id for the service. Usually either `FID` or `OBJECTID`.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 	When paired with to defines the time range of features to display. Requires the Feature Layer to be time
    * 	enabled.
    */
  var from: js.UndefOr[Date] = js.undefined
  /**
    * When utilizing esri-leaflet-renderers '2.0.2' or above, this option makes it possible to override the
    * symbology defined by the service itself.
    */
  var ignoreRenderer: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this to false if your own service supports GeoJSON as an output format but you'd like to ask for
    * Geoservices JSON instead.
    */
  var isModern: js.UndefOr[Boolean] = js.undefined
  /**
    * Closest zoom level the layer will be displayed on the map. example: maxZoom:19
    */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /**
    * Furthest zoom level the layer will be displayed on the map. example: minZoom:3
    */
  var minZoom: js.UndefOr[Double] = js.undefined
  /**
    * 	Provides an opportunity to introspect individual GeoJSON features in the layer.
    */
  var onEachFeature: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.undefined
  /**
    * Function that will be used for creating layers for GeoJSON points. If the option is not specified, simple
    * markers will be created). For point layers, custom panes should be passed through pointToLayer (example here).
    */
  var pointToLayer: js.UndefOr[js.Function2[/* feature */ js.Any, /* latLng */ LatLngExpression, Unit]] = js.undefined
  /**
    * How many digits of precision to request from the server. Wikipedia has a great reference of digit
    * precision to meters.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * The vector renderer to use to draw the service. Usually L.svg() is preferable but setting to `L.canvas()`
    * can have performance benefits for large polygon layers.
    */
  var renderer: js.UndefOr[SVG | Canvas] = js.undefined
  /**
    * 	How much to simplify polygons and polylines. A higher value gives better performance, a lower value
    * 	gives a more accurate representation.
    */
  var simplifyFactor: js.UndefOr[Double] = js.undefined
  /**
    * Function that will be used to get style options for vector layers created for GeoJSON features.
    */
  var style: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.undefined
  /**
    * The name of the field to lookup the time of the feature. Can be an object like
    * {start:'startTime', end:'endTime'} or a string like 'created'.
    */
  var timeField: js.UndefOr[js.Any] = js.undefined
  /**
    * Determines where features are filtered by time. By default features will be filtered by the server. If
    * set to 'client' all features are requested and filtered by the app before display.
    */
  var timeFilterMode: js.UndefOr[server | client] = js.undefined
  /**
    * When paired with from defines the time range of features to display. Requires the Feature Layer to be
    * time enabled.
    */
  var to: js.UndefOr[Date] = js.undefined
  /**
    * An optional expression to filter features server side. String values should be denoted using single
    * quotes ie: where: "FIELDNAME = 'field value'"; More information about valid SQL syntax can be found here.
    */
  var where: js.UndefOr[String] = js.undefined
}

object FeatureLayerOptions {
  @scala.inline
  def apply(
    url: String,
    cacheLayers: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    from: Date = null,
    ignoreRenderer: js.UndefOr[Boolean] = js.undefined,
    isModern: js.UndefOr[Boolean] = js.undefined,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    onEachFeature: (/* feature */ js.Any, /* layer */ Layer) => Unit = null,
    pointToLayer: (/* feature */ js.Any, /* latLng */ LatLngExpression) => Unit = null,
    precision: Int | Double = null,
    proxy: String = null,
    renderer: SVG | Canvas = null,
    simplifyFactor: Int | Double = null,
    style: (/* feature */ js.Any, /* layer */ Layer) => Unit = null,
    timeField: js.Any = null,
    timeFilterMode: server | client = null,
    to: Date = null,
    token: String = null,
    useCors: js.UndefOr[Boolean] = js.undefined,
    where: String = null
  ): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheLayers)) __obj.updateDynamic("cacheLayers")(cacheLayers.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRenderer)) __obj.updateDynamic("ignoreRenderer")(ignoreRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(isModern)) __obj.updateDynamic("isModern")(isModern.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onEachFeature != null) __obj.updateDynamic("onEachFeature")(js.Any.fromFunction2(onEachFeature))
    if (pointToLayer != null) __obj.updateDynamic("pointToLayer")(js.Any.fromFunction2(pointToLayer))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (simplifyFactor != null) __obj.updateDynamic("simplifyFactor")(simplifyFactor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(js.Any.fromFunction2(style))
    if (timeField != null) __obj.updateDynamic("timeField")(timeField.asInstanceOf[js.Any])
    if (timeFilterMode != null) __obj.updateDynamic("timeFilterMode")(timeFilterMode.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(useCors)) __obj.updateDynamic("useCors")(useCors.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerOptions]
  }
}

