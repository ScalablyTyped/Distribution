package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeaturesOptions
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
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures {
  def this(options: IdentifyFeaturesOptions) = this()
  def this(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.ImageService) = this()
}

