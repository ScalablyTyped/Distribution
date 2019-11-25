package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.BaseLayerType.html
  *
  * Defines the base layer types to be used at Map construction time or
  * with the setBaseLayerType function.
  * This object defines the base layer types to be used at Map construction
  * time or with the setBaseLayerType function.
  *
  */
trait BaseLayerType extends js.Object {
  /**
    * The ESRI ARCGis base layer selector.
    *
    */
  var ARCGIS: String
  /**
    * Same as Virtual Earth
    *
    */
  var BING: String
  /**
    * The Google base layer type selector.
    *
    */
  var GOOGLE: String
  /**
    * The Open Street Map base layer type selector.
    *
    */
  var OSM: String
  /**
    * The Virtual Earth base layer type selector.
    *
    */
  var VIRTUAL_EARTH: String
  /**
    * The Web Map Server base layer type selector.
    *
    */
  var WMS: String
  /**
    * The Yahoo base layer type selector.
    *
    */
  var YAHOO: String
}

object BaseLayerType {
  @scala.inline
  def apply(
    ARCGIS: String,
    BING: String,
    GOOGLE: String,
    OSM: String,
    VIRTUAL_EARTH: String,
    WMS: String,
    YAHOO: String
  ): BaseLayerType = {
    val __obj = js.Dynamic.literal(ARCGIS = ARCGIS.asInstanceOf[js.Any], BING = BING.asInstanceOf[js.Any], GOOGLE = GOOGLE.asInstanceOf[js.Any], OSM = OSM.asInstanceOf[js.Any], VIRTUAL_EARTH = VIRTUAL_EARTH.asInstanceOf[js.Any], WMS = WMS.asInstanceOf[js.Any], YAHOO = YAHOO.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseLayerType]
  }
}

