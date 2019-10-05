package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.ImageServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
  * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
  * service.
  */
@JSImport("esri-leaflet", "ImageService")
@js.native
class ImageService protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.ImageService {
  def this(options: ImageServiceOptions) = this()
}

@JSImport("esri-leaflet", "imageService")
@js.native
object imageService extends js.Object {
  /**
    * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
    * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
    * service.
    */
  def apply(options: ImageServiceOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.ImageService = js.native
}

