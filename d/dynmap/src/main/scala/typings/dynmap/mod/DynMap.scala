package typings.dynmap.mod

import typings.dynmap.anon.ComponentchatpopupsRecord
import typings.dynmap.mod.global.Array
import typings.dynmap.mod.global.JQuery
import typings.leaflet.mod.Layer
import typings.leaflet.mod.Point_
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynMap extends StObject {
  
  var DynmapLayerControl: js.UndefOr[typings.dynmap.mod.DynmapLayerControl] = js.native
  
  def addPlayer(player: Player, update: Player): Unit = js.native
  
  def addToLayerSelector(layer: Layer, name: String, priority: Double): Unit = js.native
  
  var alertbox: js.UndefOr[JQuery | Null] = js.native
  
  def checkForSavedURL(): Unit = js.native
  
  var components: Array[js.UndefOr[ComponentchatpopupsRecord | typings.dynmap.anon.Component]] = js.native
  
  def configure(configuration: Configuration): Unit = js.native
  
  var currentcount: Double = js.native
  
  var defaultworld: World = js.native
  
  def followPlayer(player: Player): Unit = js.native
  
  var followingPlayer: String = js.native
  
  def formatUrl(name: String, options: Options): String = js.native
  
  def getBoolParameterByName(name: String): Boolean | Null = js.native
  
  def getIntParameterByName(name: String): Double | Null = js.native
  
  def getLink(): String = js.native
  
  def getParameterByName(name: String): String = js.native
  
  var getProjection: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<dynmap.dynmap.DynmapTileLayer | undefined>['getProjection'] */ js.Any = js.native
  
  def getTileUrl(
    tileName: /* import warning: importer.ImportType#apply Failed type conversion: 'alertbox' | 'components' | 'currentcount' | 'defaultworld' | 'followingPlayer' | 'initfollow' | 'inittime' | 'lasttimestamp' | 'DynmapLayerControl' | 'layersetlist' | 'maptype' | 'map' | 'maxcount' | 'missedupdates' | 'nocompass' | 'nogui' | 'options' | 'playerfield' | 'playerlist' | 'players' | 'registeredTiles' | 'reqid' | 'serverday' | 'servertime' | 'sidebar' | 'sidebarPanel' | 'sidebarSections' | 'worldlist' | 'worlds' | 'getProjection'['registeredTiles'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: std.Record<number | string, string>['alertbox' | 'components' | 'currentcount' | 'defaultworld' | 'followingPlayer' | 'initfollow' | 'inittime' | 'lasttimestamp' | 'DynmapLayerControl' | 'layersetlist' | 'maptype' | 'map' | 'maxcount' | 'missedupdates' | 'nocompass' | 'nogui' | 'options' | 'playerfield' | 'playerlist' | 'players' | 'registeredTiles' | 'reqid' | 'serverday' | 'servertime' | 'sidebar' | 'sidebarPanel' | 'sidebarSections' | 'worldlist' | 'worlds' | 'getProjection'['registeredTiles']] */ js.Any = js.native
  
  def initLogin(): Unit = js.native
  
  var initfollow: Null = js.native
  
  def initialize(): Unit = js.native
  
  var inittime: Double = js.native
  
  var lasttimestamp: Double = js.native
  
  var layersetlist: Array[LayerSet] = js.native
  
  var map: js.UndefOr[GlobalMap] = js.native
  
  var maptype: js.UndefOr[DynmapTileLayer] = js.native
  
  var maxcount: Double = js.native
  
  var missedupdates: Double = js.native
  
  var nocompass: Boolean = js.native
  
  var nogui: Boolean = js.native
  
  var options: Options = js.native
  
  def panToLatLng(latlng: LatLng[String | World | Null, Double, Double]): Unit = js.native
  def panToLatLng(latlng: LatLng[String | World | Null, Double, Double], completed: js.Function0[Unit]): Unit = js.native
  
  def panToLayerPoint(point: Point_): Unit = js.native
  def panToLayerPoint(point: Point_, completed: js.Function0[Unit]): Unit = js.native
  
  def panToLocation(location: Location[String | World | Null, Double, Double, Double]): Unit = js.native
  def panToLocation(location: Location[String | World | Null, Double, Double, Double], completion: js.Function0[Unit]): Unit = js.native
  
  var playerfield: js.UndefOr[JQuery | Null] = js.native
  
  var playerlist: js.UndefOr[JQuery | Null] = js.native
  
  var players: Record[String | Double | js.Symbol, Any | Null | Array[Any]] = js.native
  
  var registeredTiles: Record[Double | String, String] = js.native
  
  def removeFromLayerSelector(layer: Layer): Unit = js.native
  
  def removePlayer(player: Player): Unit = js.native
  
  var reqid: Double = js.native
  
  def saveURL(): Unit = js.native
  
  def selectMap(map: WorldMap): Unit = js.native
  def selectMap(map: WorldMap, completed: js.Function0[Unit]): Unit = js.native
  
  def selectMapAndPan(map: WorldMap, location: Location[String | World | Null, Double, Double, Double]): Unit = js.native
  def selectMapAndPan(
    map: WorldMap,
    location: Location[String | World | Null, Double, Double, Double],
    completed: js.Function0[Unit]
  ): Unit = js.native
  
  def selectWorld(world: World): Unit = js.native
  def selectWorld(world: World, completed: js.Function0[Unit]): Unit = js.native
  
  def selectWorldAndPan(world: World, location: Location[String | World | Null, Double, Double, Double]): Unit = js.native
  def selectWorldAndPan(
    world: World,
    location: Location[String | World | Null, Double, Double, Double],
    completed: js.Function0[Unit]
  ): Unit = js.native
  
  var serverday: Boolean = js.native
  
  var servertime: Double = js.native
  
  var sidebar: js.UndefOr[JQuery | Null] = js.native
  
  var sidebarPanel: js.UndefOr[JQuery | Null] = js.native
  
  var sidebarSections: Array[
    ReturnType[
      js.Function1[
        /* labelText */ String, 
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.SidebarUtils['createSection'] */ js.Any
        ]
      ]
    ]
  ] = js.native
  
  def update(): Unit = js.native
  
  def updateBackground(): Unit = js.native
  
  def updateSidebarHeight(): Unit = js.native
  
  var worldlist: js.UndefOr[JQuery] = js.native
  
  var worlds: Record[String, js.UndefOr[World]] = js.native
}
