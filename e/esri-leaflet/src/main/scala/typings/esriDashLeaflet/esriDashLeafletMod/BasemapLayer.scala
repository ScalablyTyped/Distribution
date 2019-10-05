package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.BasemapLayerOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.Basemaps
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
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.BasemapLayer {
  def this(key: Basemaps) = this()
  def this(key: Basemaps, options: BasemapLayerOptions) = this()
}

@JSImport("esri-leaflet", "basemapLayer")
@js.native
object basemapLayer extends js.Object {
  /**
    * `L.esri.basemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
    * The Terms of Use for Esri hosted services apply to all Leaflet applications.
    */
  def apply(key: Basemaps): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.BasemapLayer = js.native
  def apply(key: Basemaps, options: BasemapLayerOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.BasemapLayer = js.native
}

