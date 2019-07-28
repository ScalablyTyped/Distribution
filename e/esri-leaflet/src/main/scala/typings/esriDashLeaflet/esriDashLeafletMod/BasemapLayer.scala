package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.BasemapLayerOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Basemaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.BasemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
  * The Terms of Use for Esri hosted services apply to all Leaflet applications.
  */
@JSImport("esri-leaflet", "BasemapLayer")
@js.native
class BasemapLayer protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.BasemapLayer {
  def this(key: Basemaps) = this()
  def this(key: Basemaps, options: BasemapLayerOptions) = this()
}

