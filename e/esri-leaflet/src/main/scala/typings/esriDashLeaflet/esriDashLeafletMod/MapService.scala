package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.MapServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
  * Server that allows you to make requests to the API, as well as query and identify published features.
  */
@JSImport("esri-leaflet", "MapService")
@js.native
class MapService protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.MapService {
  def this(options: MapServiceOptions) = this()
}

@JSImport("esri-leaflet", "mapService")
@js.native
object mapService extends js.Object {
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  def apply(options: MapServiceOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.MapService = js.native
}

