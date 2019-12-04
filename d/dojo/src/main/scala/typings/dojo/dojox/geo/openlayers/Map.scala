package typings.dojo.dojox.geo.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/Map.html
  *
  * A map viewer based on the OpenLayers library.
  * The dojox.geo.openlayers.Map object allows to view maps from various map providers.
  * It encapsulates  an OpenLayers.Map object on which most operations are delegated.
  * GFX layers can be added to display GFX georeferenced shapes as well as Dojo widgets.
  * Parameters can be passed as argument at construction time to define the base layer
  * type and the base layer parameters such as url or options depending on the type
  * specified. These parameters can be any of:
  *
  * baseLayerType: type of the base layer. Can be any of:
  *
  * dojox.geo.openlayers.BaseLayerType.OSM: Open Street Map base layer
  * dojox.geo.openlayers.BaseLayerType.WMS: Web Map Service layer
  * dojox.geo.openlayers.BaseLayerType.GOOGLE: Google layer
  * dojox.geo.openlayers.BaseLayerType.VIRTUAL_EARTH: Virtual Earth layer
  * dojox.geo.openlayers.BaseLayerType.BING: Bing layer
  * dojox.geo.openlayers.BaseLayerType.YAHOO: Yahoo layer
  * dojox.geo.openlayers.BaseLayerType.ARCGIS: ESRI ArgGIS layer
  * Note that access to commercial server such as Google, Virtual Earth or Yahoo may need specific licencing.
  *
  * The parameters value also include:
  *
  * baseLayerName: The name of the base layer.
  * baseLayerUrl: Some layer may need an url such as Web Map Server
  * baseLayerOptions: Additional specific options passed to OpensLayers layer,
  * such as The list of layer to display, for Web Map Server layer.
  *
  * @param div
  * @param options
  */
@JSGlobal("dojox.geo.openlayers.Map")
@js.native
class Map protected () extends js.Object {
  def this(div: js.Any, options: js.Any) = this()
  /**
    * The underlying OpenLayers.Map object.
    * Should be accessed on read mode only.
    *
    */
  var olMap: js.Object = js.native
  /**
    * Add the specified layer to the map.
    *
    * @param layer The layer to add to the map.
    */
  def addLayer(layer: Layer): Unit = js.native
  /**
    * Fits the map on a point,or an area
    * Fits the map on the point or extent specified as parameter.
    *
    * @param o Object with key values fit parameters or a JSON string.
    */
  def fitTo(o: js.Object): Unit = js.native
  /**
    * Returns the base layer type.
    *
    */
  def getBaseLayerType(): js.Any = js.native
  /**
    * Returns the layer whose property matches the value.
    *
    * @param property The property to check
    * @param value The value to match
    */
  def getLayer(property: String, value: js.Object): js.Any = js.native
  /**
    * Returns the count of layers of this map.
    *
    */
  def getLayerCount(): js.Any = js.native
  /**
    * gets the underlying OpenLayers map object.
    *
    */
  def getOLMap(): js.Any = js.native
  /**
    * Returns the current scale
    *
    * @param geodesic Tell if geodesic calculation should be performed. If set totrue, the scale will be calculated based on the horizontal size of thepixel in the center of the map viewport.
    */
  def getScale(geodesic: Boolean): js.Any = js.native
  /**
    * Performs an initial fit to contents.
    *
    * @param params
    */
  def initialFit(params: js.Any): Unit = js.native
  /**
    * Set or retrieve the layer index.
    * Set or get the layer index, that is the z-order of the layer.
    * if the index parameter is provided, the layer index is set to
    * this value. If the index parameter is not provided, the index of
    * the layer is returned.
    *
    * @param layer the layer to retrieve the index.
    * @param index               Optionalindex of the layer
    */
  def layerIndex(layer: Layer, index: Double): js.Any = js.native
  /**
    * Remove the specified layer from the map.
    *
    * @param layer The layer to remove from the map.
    */
  def removeLayer(layer: Layer): Unit = js.native
  /**
    * Set the base layer type, replacing the existing base layer
    *
    * @param type base layer type
    */
  def setBaseLayerType(`type`: Layer): js.Any = js.native
  /**
    * Transforms the point passed as argument, expressed in the from
    * coordinate system to the map coordinate system.
    * Transforms the point passed as argument without modifying it. The point is supposed to be expressed
    * in the from coordinate system and is transformed to the map coordinate system.
    *
    * @param p The point to transform
    * @param from The projection in which the point is expressed.
    * @param to
    */
  def transform(p: js.Any, from: js.Object, to: js.Any): js.Any = js.native
  /**
    * Transforms the coordinates passed as argument, expressed in the from
    * coordinate system to the map coordinate system.
    * Transforms the coordinates passed as argument. The coordinate are supposed to be expressed
    * in the from coordinate system and are transformed to the map coordinate system.
    *
    * @param x The longitude coordinate to transform.
    * @param y The latitude coordinate to transform.
    * @param from               OptionalThe projection in which the point is expressed, or EPSG4326 is not specified.
    * @param to               OptionalThe projection in which the point is converted to. In not specifed, the map projection is used.
    */
  def transformXY(x: Double, y: Double, from: js.Object, to: js.Object): js.Any = js.native
}

