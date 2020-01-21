package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
  * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
  * service.
  */
@JSImport("leaflet", "esri.ImageService")
@js.native
class ImageService_ protected () extends Service {
  def this(options: ImageServiceOptions) = this()
  /**
    * Returns a new `L.esri.Query` object that can be used to query this service.
    */
  def query(): Query_ = js.native
}

