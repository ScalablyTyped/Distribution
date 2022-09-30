package typings.dynmap.mod

import typings.dynmap.anon.TileLayerOptionsattributi
import typings.dynmap.mod.global.Array
import typings.leaflet.mod.Projection
import typings.leaflet.mod.TileLayer_
import typings.std.HTMLImageElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynmapTileLayer extends TileLayer_ {
  
  var _cachedTileUrls: Record[String, js.UndefOr[String]] = js.native
  
  var _loadQueue: Array[HTMLImageElement] = js.native
  
  var _loadingTiles: Array[HTMLImageElement] = js.native
  
  var _namedTiles: Record[String, js.UndefOr[HTMLImageElement]] = js.native
  
  def _removeTile(key: String): Unit = js.native
  
  def _tickLoadQueue(): Unit = js.native
  
  def createTile(coords: Location[String | World | Null, Double, Double, Double]): HTMLImageElement = js.native
  def createTile(coords: Location[String | World | Null, Double, Double, Double], done: js.Function0[Unit]): HTMLImageElement = js.native
  
  def getProjection(): Projection = js.native
  
  def getTileInfo(coords: Location[String | World | Null, Double, Double, Double]): TileInformation = js.native
  
  def getTileName(coords: Location[String | World | Null, Double, Double, Double]): scala.Nothing = js.native
  
  def getTileUrl(coords: Location[String | World | Null, Double, Double, Double]): String = js.native
  def getTileUrl(coords: Location[String | World | Null, Double, Double, Double], timestamp: String): String = js.native
  
  def getTileUrlFromName(tileName: String, timestamp: String): String = js.native
  
  @JSName("options")
  var options_DynmapTileLayer: TileLayerOptionsattributi = js.native
  
  var projection: js.UndefOr[Projection] = js.native
  
  def updateNamedTile(name: String, timestamp: String): Unit = js.native
  
  def zoomprefix(amount: Double): String = js.native
}
