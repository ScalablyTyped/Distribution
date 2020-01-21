package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
  * Server that allows you to make requests to the API, as well as query and identify published features.
  */
@JSImport("leaflet", "esri.MapService")
@js.native
class MapService_ protected () extends Service {
  def this(options: MapServiceOptions) = this()
  /**
    * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
    * will be passed a GeoJSON FeatureCollection with the results or an error.
    */
  def find(): Find_ = js.native
  /**
    * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
    * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
    */
  def identify(): IdentifyFeatures_ = js.native
  /**
    * Returns a new `L.esri.Query` object that can be used to query this service.
    */
  def query(): Query_ = js.native
}

