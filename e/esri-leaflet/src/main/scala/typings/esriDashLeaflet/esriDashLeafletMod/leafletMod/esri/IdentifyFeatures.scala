package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import typings.leaflet.leafletMod.Map
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
  * chainable API for building request parameters and executing the request.
  */
@JSImport("leaflet", "esri.IdentifyFeatures")
@js.native
class IdentifyFeatures protected () extends Task {
  def this(options: IdentifyFeaturesOptions) = this()
  def this(options: ImageService) = this()
  /**
    * Identifies features at a given LatLng geometry can also be an instance of `L.Marker`, `L.Polygon`,
    * `L.Polyline`, `L.LatLngBounds`, `L.GeoJSON` or a valid GeoJSON object literal.
    */
  def at(geometry: Geometry): this.type = js.native
  /**
    * Identifies features within a given time range.
    */
  def between(from: Date, to: Date): this.type = js.native
  /**
    * Add a layer definition to the query.
    */
  def layerDef(id: Double, where: String): this.type = js.native
  /**
    * By default, only the topmost feature will be identified, but it is possible to specify both an
    * alternative strategy and array of individual layers. See the REST API documentation for more information
    * about valid combinations.
    *
    * ex: `.layers('all:0')`.
    */
  def layers(layers: String): this.type = js.native
  def layers(layers: js.Array[String]): this.type = js.native
  /**
    * The map to identify features on.
    */
  def on(map: Map): this.type = js.native
  /**
    * Return only this many decimal points of precision in the output geometries.
    */
  def precision(precision: Double): this.type = js.native
  /**
    * Return geometry with results. Default is true.
    */
  def returnGeometry(returnGeometry: Boolean): this.type = js.native
  /**
    * Executes the identify request with the current parameters, identified features will be passed to callback
    * as a GeoJSON FeatureCollection. Accepts an optional function context
    */
  def run(callback: FeatureCallbackHandler): this.type = js.native
  def run(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
  /**
    * Simplify the geometries of the output features for the current map view. the factor parameter controls
    * the amount of simplification between `0` (no simplification) and `1` (the most basic shape possible).
    */
  def simplify(map: Map, factor: Double): this.type = js.native
  /**
    * Buffer the identify area by a given number of screen pixels.
    */
  def tolerance(precision: Double): this.type = js.native
}

@JSImport("leaflet", "esri.identifyFeatures")
@js.native
object identifyFeatures extends js.Object {
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  def apply(options: IdentifyFeaturesOptions): IdentifyFeatures = js.native
  def apply(options: ImageService): IdentifyFeatures = js.native
}

