package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.esriLeaflet.esriLeafletStrings.client
import typings.esriLeaflet.esriLeafletStrings.server
import typings.leaflet.mod.Canvas_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.Layer
import typings.leaflet.mod.SVG_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for FeatureLayer
  */
@js.native
trait FeatureLayerOptions extends LayerOptionsBase {
  /**
    * Will remove layers from the internal cache when they are removed from the map.
    */
  var cacheLayers: js.UndefOr[Boolean] = js.native
  /**
    *     An array of fieldnames to pull from the service. Includes all fields by default. You should always
    *     specify the name of the unique id for the service. Usually either `FID` or `OBJECTID`.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    *     When paired with to defines the time range of features to display. Requires the Feature Layer to be time
    *     enabled.
    */
  var from: js.UndefOr[Date] = js.native
  /**
    * When utilizing esri-leaflet-renderers '2.0.2' or above, this option makes it possible to override the
    * symbology defined by the service itself.
    */
  var ignoreRenderer: js.UndefOr[Boolean] = js.native
  /**
    * Set this to false if your own service supports GeoJSON as an output format but you'd like to ask for
    * Geoservices JSON instead.
    */
  var isModern: js.UndefOr[Boolean] = js.native
  /**
    * Closest zoom level the layer will be displayed on the map. example: maxZoom:19
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * Furthest zoom level the layer will be displayed on the map. example: minZoom:3
    */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    *     Provides an opportunity to introspect individual GeoJSON features in the layer.
    */
  var onEachFeature: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.native
  /**
    * Function that will be used for creating layers for GeoJSON points. If the option is not specified, simple
    * markers will be created). For point layers, custom panes should be passed through pointToLayer (example here).
    */
  var pointToLayer: js.UndefOr[js.Function2[/* feature */ js.Any, /* latLng */ LatLngExpression, Unit]] = js.native
  /**
    * How many digits of precision to request from the server. Wikipedia has a great reference of digit
    * precision to meters.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * The vector renderer to use to draw the service. Usually L.svg() is preferable but setting to `L.canvas()`
    * can have performance benefits for large polygon layers.
    */
  var renderer: js.UndefOr[SVG_ | Canvas_] = js.native
  /**
    *     How much to simplify polygons and polylines. A higher value gives better performance, a lower value
    *     gives a more accurate representation.
    */
  var simplifyFactor: js.UndefOr[Double] = js.native
  /**
    * Function that will be used to get style options for vector layers created for GeoJSON features.
    */
  var style: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.native
  /**
    * The name of the field to lookup the time of the feature. Can be an object like
    * {start:'startTime', end:'endTime'} or a string like 'created'.
    */
  var timeField: js.UndefOr[js.Any] = js.native
  /**
    * Determines where features are filtered by time. By default features will be filtered by the server. If
    * set to 'client' all features are requested and filtered by the app before display.
    */
  var timeFilterMode: js.UndefOr[server | client] = js.native
  /**
    * When paired with from defines the time range of features to display. Requires the Feature Layer to be
    * time enabled.
    */
  var to: js.UndefOr[Date] = js.native
  /**
    * An optional expression to filter features server side. String values should be denoted using single
    * quotes ie: where: "FIELDNAME = 'field value'"; More information about valid SQL syntax can be found here.
    */
  var where: js.UndefOr[String] = js.native
}

object FeatureLayerOptions {
  @scala.inline
  def apply(url: String): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerOptions]
  }
  @scala.inline
  implicit class FeatureLayerOptionsOps[Self <: FeatureLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheLayers(value: Boolean): Self = this.set("cacheLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheLayers: Self = this.set("cacheLayers", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFrom(value: Date): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setIgnoreRenderer(value: Boolean): Self = this.set("ignoreRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreRenderer: Self = this.set("ignoreRenderer", js.undefined)
    @scala.inline
    def setIsModern(value: Boolean): Self = this.set("isModern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModern: Self = this.set("isModern", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setOnEachFeature(value: (/* feature */ js.Any, /* layer */ Layer) => Unit): Self = this.set("onEachFeature", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEachFeature: Self = this.set("onEachFeature", js.undefined)
    @scala.inline
    def setPointToLayer(value: (/* feature */ js.Any, /* latLng */ LatLngExpression) => Unit): Self = this.set("pointToLayer", js.Any.fromFunction2(value))
    @scala.inline
    def deletePointToLayer: Self = this.set("pointToLayer", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setRenderer(value: SVG_ | Canvas_): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSimplifyFactor(value: Double): Self = this.set("simplifyFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimplifyFactor: Self = this.set("simplifyFactor", js.undefined)
    @scala.inline
    def setStyle(value: (/* feature */ js.Any, /* layer */ Layer) => Unit): Self = this.set("style", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTimeField(value: js.Any): Self = this.set("timeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeField: Self = this.set("timeField", js.undefined)
    @scala.inline
    def setTimeFilterMode(value: server | client): Self = this.set("timeFilterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeFilterMode: Self = this.set("timeFilterMode", js.undefined)
    @scala.inline
    def setTo(value: Date): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

