package typings.dynmap.mod

import typings.leaflet.mod.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// js/dynmaputils.js
@js.native
trait DynmapProjection extends Class {
  
  def fromLatLngToLocation(location: LatLng[String | World | Null, Double, Double]): Null = js.native
  
  def fromLocationToLatLng(location: Location[String | World | Null, Double, Double, Double]): scala.Nothing = js.native
  
  @JSName("initialize")
  def initialize_options(
    options: WorldMapConfiguration & (/* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.DynmapTileLayer['options'] */ js.Any) & WorldMapOptions
  ): Unit = js.native
}
