package typings.dynmap.mod

import typings.dynmap.anon.TileLayerOptionsattributi
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletEventHandlerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynmap", "WorldMap")
@js.native
open class WorldMap protected () extends DynmapTileLayer {
  def this(options: WorldMapOptions) = this()
  
  var _currentzoom: Double = js.native
  
  def _limitedUpdate(event: LeafletEvent): Unit = js.native
  @JSName("_limitedUpdate")
  var _limitedUpdate_Original: LeafletEventHandlerFn = js.native
  
  var dynmap: DynMap = js.native
  
  @JSName("options")
  var options_WorldMap: WorldMapConfiguration & TileLayerOptionsattributi & WorldMapOptions = js.native
}
