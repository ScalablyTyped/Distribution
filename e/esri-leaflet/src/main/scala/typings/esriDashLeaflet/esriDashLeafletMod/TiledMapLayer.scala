package typings.esriDashLeaflet.esriDashLeafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.TiledMapLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
  * service is added to map attribution automatically.
  */
@JSImport("esri-leaflet", "TiledMapLayer")
@js.native
class TiledMapLayer protected ()
  extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.TiledMapLayer {
  def this(options: TiledMapLayerOptions) = this()
}

@JSImport("esri-leaflet", "tiledMapLayer")
@js.native
object tiledMapLayer extends js.Object {
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  def apply(options: TiledMapLayerOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.TiledMapLayer = js.native
}

