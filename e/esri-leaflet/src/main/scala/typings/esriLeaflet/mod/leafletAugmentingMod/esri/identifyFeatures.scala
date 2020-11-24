package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "esri.identifyFeatures")
@js.native
object identifyFeatures extends js.Object {
  
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  def apply(options: IdentifyFeaturesOptions): IdentifyFeatures_ = js.native
  def apply(options: ImageService_): IdentifyFeatures_ = js.native
}
