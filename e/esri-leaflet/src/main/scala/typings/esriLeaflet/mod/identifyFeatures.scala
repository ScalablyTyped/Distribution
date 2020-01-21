package typings.esriLeaflet.mod

import typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeaturesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri-leaflet", "identifyFeatures")
@js.native
object identifyFeatures extends js.Object {
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  def apply(options: IdentifyFeaturesOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeatures_ = js.native
  def apply(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.ImageService_): typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeatures_ = js.native
}

