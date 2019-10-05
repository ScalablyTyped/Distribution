package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
  * Server that allows you to make requests to the API, as well as query and identify published features.
  */
@JSImport("leaflet", "esri.MapService")
@js.native
class MapService protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Service {
  def this(options: MapServiceOptions) = this()
  /**
    * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
    * will be passed a GeoJSON FeatureCollection with the results or an error.
    */
  def find(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Find = js.native
  /**
    * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
    * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
    */
  def identify(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.IdentifyFeatures = js.native
  /**
    * Returns a new `L.esri.Query` object that can be used to query this service.
    */
  def query(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Query = js.native
}

@JSImport("leaflet", "esri.mapService")
@js.native
object mapService extends js.Object {
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  def apply(options: MapServiceOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.MapService = js.native
}

