package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.IdentifyFeaturesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
  * chainable API for building request parameters and executing the request.
  */
@JSImport("esri-leaflet", "IdentifyFeatures")
@js.native
class IdentifyFeatures protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.IdentifyFeatures {
  def this(options: IdentifyFeaturesOptions) = this()
  def this(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.ImageService) = this()
}

@JSImport("esri-leaflet", "identifyFeatures")
@js.native
object identifyFeatures extends js.Object {
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  def apply(options: IdentifyFeaturesOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.IdentifyFeatures = js.native
  def apply(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.ImageService): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.IdentifyFeatures = js.native
}

