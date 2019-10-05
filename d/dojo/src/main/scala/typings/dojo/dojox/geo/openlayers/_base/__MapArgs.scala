package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.__MapArgs.html
  *
  * The keyword arguments that can be passed in a Map constructor.
  *
  */
trait __MapArgs extends js.Object {
  /**
    * The name of the base layer.
    *
    */
  var baseLayerName: String
  /**
    * Additional specific options passed to OpensLayers layer, such as The list of layer to display, for Web Map Server layer.
    *
    */
  var baseLayerOptions: String
  /**
    * type of the base layer. Can be any of
    *
    * dojox.geo.openlayers.BaseLayerType.OSM: Open Street Map base layer
    * dojox.geo.openlayers.BaseLayerType.WMS: Web Map Service layer
    * dojox.geo.openlayers.BaseLayerType.GOOGLE: Google layer
    * dojox.geo.openlayers.BaseLayerType.VIRTUAL_EARTH: Virtual Earth layer
    * dojox.geo.openlayers.BaseLayerType.BING: Bing layer
    * dojox.geo.openlayers.BaseLayerType.YAHOO: Yahoo layer
    * dojox.geo.openlayers.BaseLayerType.ARCGIS: ESRI ArgGIS layer
    *
    */
  var baseLayerType: String
  /**
    * Some layer may need an url such as Web Map Server.
    *
    */
  var baseLayerUrl: String
}

object __MapArgs {
  @scala.inline
  def apply(baseLayerName: String, baseLayerOptions: String, baseLayerType: String, baseLayerUrl: String): __MapArgs = {
    val __obj = js.Dynamic.literal(baseLayerName = baseLayerName, baseLayerOptions = baseLayerOptions, baseLayerType = baseLayerType, baseLayerUrl = baseLayerUrl)
  
    __obj.asInstanceOf[__MapArgs]
  }
}

