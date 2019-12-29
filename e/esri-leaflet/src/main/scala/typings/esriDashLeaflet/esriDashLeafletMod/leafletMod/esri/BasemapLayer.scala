package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import typings.leaflet.leafletMod.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.BasemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
  * The Terms of Use for Esri hosted services apply to all Leaflet applications.
  */
@JSImport("leaflet", "esri.BasemapLayer")
@js.native
class BasemapLayer protected () extends TileLayer {
  def this(key: Basemaps) = this()
  def this(key: Basemaps, options: BasemapLayerOptions) = this()
}

@JSImport("leaflet", "esri.basemapLayer")
@js.native
object basemapLayer extends js.Object {
  /**
    * `L.esri.basemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
    * The Terms of Use for Esri hosted services apply to all Leaflet applications.
    */
  def apply(key: Basemaps): BasemapLayer = js.native
  def apply(key: Basemaps, options: BasemapLayerOptions): BasemapLayer = js.native
}

