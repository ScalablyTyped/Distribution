package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import typings.leaflet.leafletMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Find` is an abstraction for the find API included in Map Services. It provides a chainable API for
  * building request parameters and executing find tasks.
  */
@JSImport("leaflet", "esri.Find")
@js.native
class Find protected () extends Task {
  def this(options: FindOptions) = this()
  def this(options: MapService) = this()
  /**
    * When true find task will search for a value that contains the searchText. When false it will do an exact
    * match on the searchText string. Default is true.
    */
  def contains(contains: Boolean): this.type = js.native
  /**
    * Property used for adding new layers or modifying the data source of existing ones in the current map
    * service.
    */
  def dynamicLayers(dynamicLayers: js.Any): this.type = js.native
  /**
    * 	An array or comma-separated list of field names to search. If not specified, all fields are searched.
    */
  def fields(fields: String): this.type = js.native
  def fields(fields: js.Array[String]): this.type = js.native
  /**
    * 	Add a layer definition to the find task.
    */
  def layerDef(id: Double, where: String): this.type = js.native
  /**
    * 	Layers to perform find task on. Accepts an array of layer IDs or comma-separated list.
    */
  def layers(layers: String): this.type = js.native
  def layers(layers: js.Array[String]): this.type = js.native
  /**
    * Specifies the maximum allowable offset to be used for generalizing geometries returned by the find task.
    */
  def maxAllowableOffset(maxAllowableOffset: Double): this.type = js.native
  /**
    * Specifies the number of decimal places in returned geometries.
    */
  def precision(precision: Double): this.type = js.native
  /**
    * Return geometry with results. Default is true.
    */
  def returnGeometry(returnGeometry: Boolean): this.type = js.native
  /**
    * Includes M values if the features have them. Default value is false. This parameter only applies if
    * `returnGeometry=true`.
    */
  def returnM(returnM: Boolean): this.type = js.native
  /**
    * Include Z values in the results. Default value is true. This parameter only applies if
    * `returnGeometry=true`.
    */
  def returnZ(returnZ: Boolean): this.type = js.native
  /**
    * Executes the find request with the current parameters, features will be passed to callback as a GeoJSON
    * FeatureCollection. Accepts an optional function context.
    */
  def run(callback: FeatureCallbackHandler): this.type = js.native
  def run(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
  /**
    * Simplify the geometries of the output features for the current map view. the factor parameter controls
    * the amount of simplification between `0` (no simplification) and `1`
    * (simplify to the most basic shape possible).
    */
  def simplify(map: Map, factor: Double): this.type = js.native
  /**
    * 	The well known ID (ex. 4326) for the results.
    */
  def spatialReference(sr: Double): this.type = js.native
  /**
    * Text that is searched across the layers and fields the user specifies.
    */
  def text(text: String): this.type = js.native
}

@JSImport("leaflet", "esri.find")
@js.native
object find extends js.Object {
  /**
    * L.esri.Find is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  def apply(options: FindOptions): Find = js.native
  def apply(options: MapService): Find = js.native
}

