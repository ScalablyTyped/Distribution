package typings.esriLeaflet.mod.leafletAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esri {
  
  type CallbackHandler = js.Function2[/* error */ js.Any, /* metadata */ js.Any, scala.Unit]
  
  type FeatureCallbackHandler = js.Function3[
    /* error */ js.UndefOr[js.Any], 
    /* featureCollection */ js.UndefOr[js.Any], 
    /* response */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  /**
    * Options for FeatureLayerService
    */
  type FeatureLayerServiceOptions = typings.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  /**
    * Options for Find Task
    */
  type FindOptions = typings.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  type GeoJSONGeometry = typings.geojson.mod.Point | typings.geojson.mod.Polygon | typings.geojson.mod.LineString
  
  type Geometry = typings.esriLeaflet.mod.leafletAugmentingMod.esri.LeafletGeometry | typings.esriLeaflet.mod.leafletAugmentingMod.esri.GeoJSONGeometry
  
  /**
    * Options for IdentifyFeatures
    */
  type IdentifyFeaturesOptions = typings.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  /**
    * Options for ImageService
    */
  type ImageServiceOptions = typings.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  type LeafletGeometry = typings.leaflet.mod.Marker_[js.Any] | typings.leaflet.mod.Polygon_[js.Any] | (typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, js.Any]) | typings.leaflet.mod.LatLngExpression | typings.leaflet.mod.LatLngBounds_ | typings.leaflet.mod.GeoJSON_[js.Any]
  
  /**
    * Options for MapService
    */
  type MapServiceOptions = typings.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
  
  /**
    * Options for Query
    */
  type QueryOptions = typings.esriLeaflet.mod.leafletAugmentingMod.esri.TaskOptions
  
  type ResponseCallbackHandler = js.Function2[/* error */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], scala.Unit]
  
  type SpatialReferenceExpression = scala.Double | typings.esriLeaflet.mod.leafletAugmentingMod.esri.SpatialReference
  
  type StyleCallback = js.Function1[/* feature */ js.Any, js.Any]
  
  /**
    * Options for Task
    */
  type TaskOptions = typings.esriLeaflet.mod.leafletAugmentingMod.esri.ServiceOptions
}
