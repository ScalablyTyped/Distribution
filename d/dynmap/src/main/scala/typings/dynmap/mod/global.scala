package typings.dynmap.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dynmap.anon.Day
import typings.dynmap.anon.TileLayerOptionsattributi
import typings.dynmap.dynmapStrings.add
import typings.dynmap.dynmapStrings.autopanstart
import typings.dynmap.dynmapStrings.baselayerchange
import typings.dynmap.dynmapStrings.click
import typings.dynmap.dynmapStrings.contextmenu
import typings.dynmap.dynmapStrings.dblclick
import typings.dynmap.dynmapStrings.down
import typings.dynmap.dynmapStrings.drag
import typings.dynmap.dynmapStrings.dragend
import typings.dynmap.dynmapStrings.dragstart
import typings.dynmap.dynmapStrings.error
import typings.dynmap.dynmapStrings.keydown
import typings.dynmap.dynmapStrings.keypress
import typings.dynmap.dynmapStrings.keyup
import typings.dynmap.dynmapStrings.layeradd
import typings.dynmap.dynmapStrings.layerremove
import typings.dynmap.dynmapStrings.load
import typings.dynmap.dynmapStrings.loading
import typings.dynmap.dynmapStrings.locationerror
import typings.dynmap.dynmapStrings.locationfound
import typings.dynmap.dynmapStrings.mousedown
import typings.dynmap.dynmapStrings.mousemove
import typings.dynmap.dynmapStrings.mouseout
import typings.dynmap.dynmapStrings.mouseover
import typings.dynmap.dynmapStrings.mouseup
import typings.dynmap.dynmapStrings.move
import typings.dynmap.dynmapStrings.moveend
import typings.dynmap.dynmapStrings.movestart
import typings.dynmap.dynmapStrings.overlayadd
import typings.dynmap.dynmapStrings.overlayremove
import typings.dynmap.dynmapStrings.popupopen
import typings.dynmap.dynmapStrings.preclick
import typings.dynmap.dynmapStrings.predrag
import typings.dynmap.dynmapStrings.remove
import typings.dynmap.dynmapStrings.resize
import typings.dynmap.dynmapStrings.tileabort
import typings.dynmap.dynmapStrings.tileerror
import typings.dynmap.dynmapStrings.tileload
import typings.dynmap.dynmapStrings.tileloadstart
import typings.dynmap.dynmapStrings.tileunload
import typings.dynmap.dynmapStrings.tooltipclose
import typings.dynmap.dynmapStrings.tooltipopen
import typings.dynmap.dynmapStrings.unload
import typings.dynmap.dynmapStrings.update
import typings.dynmap.dynmapStrings.viewreset
import typings.dynmap.dynmapStrings.zoom
import typings.dynmap.dynmapStrings.zoomanim
import typings.dynmap.dynmapStrings.zoomend
import typings.dynmap.dynmapStrings.zoomlevelschange
import typings.dynmap.dynmapStrings.zoomstart
import typings.jquery.JQuery.AjaxSettings
import typings.leaflet.mod.Content
import typings.leaflet.mod.Coords
import typings.leaflet.mod.DoneCallback
import typings.leaflet.mod.Evented
import typings.leaflet.mod.InternalTiles
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LayersControlEventHandlerFn
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.LeafletEventHandlerFn
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.Popup_
import typings.leaflet.mod.Projection
import typings.leaflet.mod.Tooltip_
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // js/sidebarutils.js
  @JSGlobal("SidebarUtils")
  @js.native
  def SidebarUtils: typings.dynmap.mod.SidebarUtils = js.native
  inline def SidebarUtils_=(x: SidebarUtils): Unit = js.Dynamic.global.updateDynamic("SidebarUtils")(x.asInstanceOf[js.Any])
  
  // js/map.js
  inline def chatEncoder(message: ChatMessage): String = js.Dynamic.global.applyDynamic("chat_encoder")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSGlobal("componentconstructors")
  @js.native
  def componentconstructors: ComponentRecord = js.native
  inline def componentconstructors_=(x: ComponentRecord): Unit = js.Dynamic.global.updateDynamic("componentconstructors")(x.asInstanceOf[js.Any])
  
  inline def concatURL(base: String, addition: String): String = (js.Dynamic.global.applyDynamic("concatURL")(base.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  // standalone/config.js
  @JSGlobal("config")
  @js.native
  def config: StandaloneConfiguration = js.native
  inline def config_=(x: StandaloneConfiguration): Unit = js.Dynamic.global.updateDynamic("config")(x.asInstanceOf[js.Any])
  
  // js/minecraft.js
  inline def createMinecraftHead(
    player: String,
    size: String,
    completed: js.Function0[HTMLImageElement],
    failed: js.Function0[Unit]
  ): Unit = (js.Dynamic.global.applyDynamic("createMinecraftHead")(player.asInstanceOf[js.Any], size.asInstanceOf[js.Any], completed.asInstanceOf[js.Any], failed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("dynmap")
  @js.native
  def dynmap: DynMap = js.native
  inline def dynmap_=(x: DynMap): Unit = js.Dynamic.global.updateDynamic("dynmap")(x.asInstanceOf[js.Any])
  
  // js/markers.js
  @JSGlobal("dynmapmarkersets")
  @js.native
  def dynmapmarkersets: js.UndefOr[Record[String, js.UndefOr[MarkerSet]]] = js.native
  inline def dynmapmarkersets_=(x: js.UndefOr[Record[String, js.UndefOr[MarkerSet]]]): Unit = js.Dynamic.global.updateDynamic("dynmapmarkersets")(x.asInstanceOf[js.Any])
  
  // js/version.js
  @JSGlobal("dynmapversion")
  @js.native
  def dynmapversion: /* template literal string: ${string}-${string} */ String = js.native
  inline def dynmapversion_=(x: /* template literal string: ${string}-${string} */ String): Unit = js.Dynamic.global.updateDynamic("dynmapversion")(x.asInstanceOf[js.Any])
  
  inline def fixedAjax(obj: AjaxSettings[Any]): Unit = js.Dynamic.global.applyDynamic("fixedAjax")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getMinecraftHead(player: String, size: String, completed: js.Function0[HTMLImageElement]): Unit = (js.Dynamic.global.applyDynamic("getMinecraftHead")(player.asInstanceOf[js.Any], size.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMinecraftTime[S, D](servertime: S): Day[S, D] = js.Dynamic.global.applyDynamic("getMinecraftTime")(servertime.asInstanceOf[js.Any]).asInstanceOf[Day[S, D]]
  
  inline def loadcss(url: String, completed: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("loadcss")(url.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // js/dynmaputils.js
  inline def loadjs(url: String, completed: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("loadjs")(url.asInstanceOf[js.Any], completed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("map")
  @js.native
  def map: GlobalMap | Null = js.native
  inline def map_=(x: GlobalMap | Null): Unit = js.Dynamic.global.updateDynamic("map")(x.asInstanceOf[js.Any])
  
  @JSGlobal("maptypes")
  @js.native
  def maptypes: Record[String, js.UndefOr[WorldMap]] = js.native
  inline def maptypes_=(x: Record[String, js.UndefOr[WorldMap]]): Unit = js.Dynamic.global.updateDynamic("maptypes")(x.asInstanceOf[js.Any])
  
  inline def namedReplace(str: String, obj: Record[String | Double | js.Symbol, Any | Null | Array[Any]]): String = (js.Dynamic.global.applyDynamic("namedReplace")(str.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def splitArgs(s: String): Record[String, js.UndefOr[String]] = js.Dynamic.global.applyDynamic("splitArgs")(s.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.UndefOr[String]]]
  
  inline def swtch(
    value: String,
    options: Record[String | Double | js.Symbol, Any | Null | Array[Any]],
    defaultOption: Any
  ): Any = (js.Dynamic.global.applyDynamic("swtch")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], defaultOption.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def swtch(
    value: js.Symbol,
    options: Record[String | Double | js.Symbol, Any | Null | Array[Any]],
    defaultOption: Any
  ): Any = (js.Dynamic.global.applyDynamic("swtch")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], defaultOption.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def swtch(
    value: Double,
    options: Record[String | Double | js.Symbol, Any | Null | Array[Any]],
    defaultOption: Any
  ): Any = (js.Dynamic.global.applyDynamic("swtch")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], defaultOption.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Array[T] extends StObject {
    
    def indexOf(searchElement: T): Double
  }
  object Array {
    
    inline def apply[T](indexOf: T => Double): Array[T] = {
      val __obj = js.Dynamic.literal(indexOf = js.Any.fromFunction1(indexOf))
      __obj.asInstanceOf[Array[T]]
    }
    
    extension [Self <: Array[?], T](x: Self & Array[T]) {
      
      inline def setIndexOf(value: T => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Omit<dynmap.dynmap.WorldMap, 'getTileName'> */
  trait HDMapType extends StObject {
    
    def _abortLoading(): Unit
    @JSName("_abortLoading")
    var _abortLoading_Original: js.Function0[Unit]
    
    var _cachedTileUrls: Record[String, js.UndefOr[String]]
    
    var _currentzoom: Double
    
    def _getZoomForUrl(): Double
    @JSName("_getZoomForUrl")
    var _getZoomForUrl_Original: js.Function0[Double]
    
    def _limitedUpdate(event: LeafletEvent): Unit
    @JSName("_limitedUpdate")
    var _limitedUpdate_Original: LeafletEventHandlerFn
    
    var _loadQueue: Array[HTMLImageElement]
    
    var _loadingTiles: Array[HTMLImageElement]
    
    var _map: Map_
    
    var _namedTiles: Record[String, js.UndefOr[HTMLImageElement]]
    
    def _removeTile(key: String): Unit
    @JSName("_removeTile")
    var _removeTile_Original: js.Function1[/* key */ String, Unit]
    
    def _tickLoadQueue(): Unit
    @JSName("_tickLoadQueue")
    var _tickLoadQueue_Original: js.Function0[Unit]
    
    def _tileCoordsToKey(coords: Coords): String
    @JSName("_tileCoordsToKey")
    var _tileCoordsToKey_Original: js.Function1[/* coords */ Coords, String]
    
    def _tileOnError(done: DoneCallback, tile: HTMLElement, e: js.Error): Unit
    @JSName("_tileOnError")
    var _tileOnError_Original: js.Function3[/* done */ DoneCallback, /* tile */ HTMLElement, /* e */ js.Error, Unit]
    
    def _tileOnLoad(done: DoneCallback, tile: HTMLElement): Unit
    @JSName("_tileOnLoad")
    var _tileOnLoad_Original: js.Function2[/* done */ DoneCallback, /* tile */ HTMLElement, Unit]
    
    var _tileZoom: js.UndefOr[Double] = js.undefined
    
    var _tiles: InternalTiles
    
    def _wrapCoords(parameter: Coords): Coords
    @JSName("_wrapCoords")
    var _wrapCoords_Original: js.Function1[/* parameter */ Coords, Coords]
    
    def addEventListener(`type`: baselayerchange | overlayadd | overlayremove, fn: LayersControlEventHandlerFn): this.type
    @JSName("addEventListener")
    var addEventListener_Original: js.Function2[
        /* type */ baselayerchange | overlayadd | overlayremove, 
        /* fn */ LayersControlEventHandlerFn, 
        this.type
      ]
    
    def addEventParent(obj: Evented): this.type
    @JSName("addEventParent")
    var addEventParent_Original: js.Function1[/* obj */ Evented, this.type]
    
    var addInitHook: js.UndefOr[Any] = js.undefined
    
    def addInteractiveTarget(targetEl: HTMLElement): this.type
    @JSName("addInteractiveTarget")
    var addInteractiveTarget_Original: js.Function1[/* targetEl */ HTMLElement, this.type]
    
    def addOneTimeEventListener(`type`: baselayerchange | overlayadd | overlayremove, fn: LayersControlEventHandlerFn): this.type
    @JSName("addOneTimeEventListener")
    var addOneTimeEventListener_Original: js.Function2[
        /* type */ baselayerchange | overlayadd | overlayremove, 
        /* fn */ LayersControlEventHandlerFn, 
        this.type
      ]
    
    def addTo(map: Map_): this.type
    @JSName("addTo")
    var addTo_Original: js.Function1[/* map */ Map_, this.type]
    
    var beforeAdd: js.UndefOr[js.Function1[/* map */ Map_, this.type]] = js.undefined
    
    def bindPopup(content: js.Function1[/* layer */ this.type, Content]): this.type
    @JSName("bindPopup")
    var bindPopup_Original: js.Function1[/* content */ js.Function1[/* layer */ this.type, Content], this.type]
    
    def bindTooltip(content: js.Function1[/* layer */ this.type, Content]): this.type
    @JSName("bindTooltip")
    var bindTooltip_Original: js.Function1[/* content */ js.Function1[/* layer */ this.type, Content], this.type]
    
    def bringToBack(): this.type
    @JSName("bringToBack")
    var bringToBack_Original: js.Function0[this.type]
    
    def bringToFront(): this.type
    @JSName("bringToFront")
    var bringToFront_Original: js.Function0[this.type]
    
    var callInitHooks: js.UndefOr[Any] = js.undefined
    
    def clearAllEventListeners(): this.type
    @JSName("clearAllEventListeners")
    var clearAllEventListeners_Original: js.Function0[this.type]
    
    def closePopup(): this.type
    @JSName("closePopup")
    var closePopup_Original: js.Function0[this.type]
    
    def closeTooltip(): this.type
    @JSName("closeTooltip")
    var closeTooltip_Original: js.Function0[this.type]
    
    @JSName("constructor")
    var constructor_Original: js.Function1[/* options */ WorldMapOptions, Any]
    
    def createTile(coords: Location[String | World | Null, Double, Double, Double]): HTMLImageElement
    def createTile(coords: Location[String | World | Null, Double, Double, Double], done: js.Function0[Unit]): HTMLImageElement
    @JSName("createTile")
    var createTile_Original: js.Function2[
        /* coords */ Location[String | World | Null, Double, Double, Double], 
        /* done */ js.UndefOr[js.Function0[Unit]], 
        HTMLImageElement
      ]
    
    var dynmap: DynMap
    
    var extend: js.UndefOr[Any] = js.undefined
    
    def fire(`type`: String): this.type
    
    def fireEvent(`type`: String): this.type
    @JSName("fireEvent")
    var fireEvent_Original: js.Function1[/* type */ String, this.type]
    
    @JSName("fire")
    var fire_Original: js.Function1[/* type */ String, this.type]
    
    var getAttribution: js.UndefOr[js.Function0[String | Null]] = js.undefined
    
    def getContainer(): HTMLElement | Null
    @JSName("getContainer")
    var getContainer_Original: js.Function0[HTMLElement | Null]
    
    var getEvents: js.UndefOr[js.Function0[StringDictionary[LeafletEventHandlerFn]]] = js.undefined
    
    def getPane(): js.UndefOr[HTMLElement]
    @JSName("getPane")
    var getPane_Original: js.Function0[js.UndefOr[HTMLElement]]
    
    def getPopup(): js.UndefOr[Popup_]
    @JSName("getPopup")
    var getPopup_Original: js.Function0[js.UndefOr[Popup_]]
    
    def getProjection(): Projection
    @JSName("getProjection")
    var getProjection_Original: js.Function0[Projection]
    
    def getTileInfo(coords: Location[String | World | Null, Double, Double, Double]): TileInformation
    @JSName("getTileInfo")
    var getTileInfo_Original: js.Function1[
        /* coords */ Location[String | World | Null, Double, Double, Double], 
        TileInformation
      ]
    
    def getTileName(coords: Location[String | World | Null, Double, Double, Double]): String
    
    def getTileSize(): Point_
    @JSName("getTileSize")
    var getTileSize_Original: js.Function0[Point_]
    
    def getTileUrl(coords: Location[String | World | Null, Double, Double, Double]): String
    def getTileUrl(coords: Location[String | World | Null, Double, Double, Double], timestamp: String): String
    
    def getTileUrlFromName(tileName: String, timestamp: String): String
    @JSName("getTileUrlFromName")
    var getTileUrlFromName_Original: js.Function2[/* tileName */ String, /* timestamp */ String, String]
    
    @JSName("getTileUrl")
    var getTileUrl_Original: js.Function2[
        /* coords */ Location[String | World | Null, Double, Double, Double], 
        /* timestamp */ js.UndefOr[String], 
        String
      ]
    
    def getTooltip(): js.UndefOr[Tooltip_]
    @JSName("getTooltip")
    var getTooltip_Original: js.Function0[js.UndefOr[Tooltip_]]
    
    def hasEventListeners(`type`: String): Boolean
    @JSName("hasEventListeners")
    var hasEventListeners_Original: js.Function1[/* type */ String, Boolean]
    
    var include: js.UndefOr[Any] = js.undefined
    
    @JSName("initialize")
    def initialize_options(
      options: WorldMapConfiguration & (/* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.DynmapTileLayer['options'] */ js.Any) & WorldMapOptions
    ): Unit
    
    def isLoading(): Boolean
    @JSName("isLoading")
    var isLoading_Original: js.Function0[Boolean]
    
    def isPopupOpen(): Boolean
    @JSName("isPopupOpen")
    var isPopupOpen_Original: js.Function0[Boolean]
    
    def isTooltipOpen(): Boolean
    @JSName("isTooltipOpen")
    var isTooltipOpen_Original: js.Function0[Boolean]
    
    def listens(
      `type`: baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror
    ): Boolean
    @JSName("listens")
    var listens_Original: js.Function1[
        /* type */ baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror, 
        Boolean
      ]
    
    var mergeOptions: js.UndefOr[Any] = js.undefined
    
    def off(`type`: baselayerchange | overlayadd | overlayremove): this.type
    @JSName("off")
    var off_Original: js.Function1[/* type */ baselayerchange | overlayadd | overlayremove, this.type]
    
    def on(`type`: baselayerchange | overlayadd | overlayremove, fn: LayersControlEventHandlerFn): this.type
    
    def onAdd(map: Map_): this.type
    @JSName("onAdd")
    var onAdd_Original: js.Function1[/* map */ Map_, this.type]
    
    def onRemove(map: Map_): this.type
    @JSName("onRemove")
    var onRemove_Original: js.Function1[/* map */ Map_, this.type]
    
    @JSName("on")
    var on_Original: js.Function2[
        /* type */ baselayerchange | overlayadd | overlayremove, 
        /* fn */ LayersControlEventHandlerFn, 
        this.type
      ]
    
    def once(`type`: baselayerchange | overlayadd | overlayremove, fn: LayersControlEventHandlerFn): this.type
    @JSName("once")
    var once_Original: js.Function2[
        /* type */ baselayerchange | overlayadd | overlayremove, 
        /* fn */ LayersControlEventHandlerFn, 
        this.type
      ]
    
    def openPopup(): this.type
    @JSName("openPopup")
    var openPopup_Original: js.Function0[this.type]
    
    def openTooltip(): this.type
    @JSName("openTooltip")
    var openTooltip_Original: js.Function0[this.type]
    
    var options: WorldMapConfiguration & (/* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.DynmapTileLayer['options'] */ js.Any) & WorldMapOptions
    
    var projection: js.UndefOr[Projection] = js.undefined
    
    def redraw(): this.type
    @JSName("redraw")
    var redraw_Original: js.Function0[this.type]
    
    def remove(): this.type
    
    def removeEventListener(`type`: baselayerchange | overlayadd | overlayremove): this.type
    @JSName("removeEventListener")
    var removeEventListener_Original: js.Function1[/* type */ baselayerchange | overlayadd | overlayremove, this.type]
    
    def removeEventParent(obj: Evented): this.type
    @JSName("removeEventParent")
    var removeEventParent_Original: js.Function1[/* obj */ Evented, this.type]
    
    def removeFrom(map: Map_): this.type
    @JSName("removeFrom")
    var removeFrom_Original: js.Function1[/* map */ Map_, this.type]
    
    def removeInteractiveTarget(targetEl: HTMLElement): this.type
    @JSName("removeInteractiveTarget")
    var removeInteractiveTarget_Original: js.Function1[/* targetEl */ HTMLElement, this.type]
    
    @JSName("remove")
    var remove_Original: js.Function0[this.type]
    
    def setOpacity(opacity: Double): this.type
    @JSName("setOpacity")
    var setOpacity_Original: js.Function1[/* opacity */ Double, this.type]
    
    def setPopupContent(content: Content): this.type
    @JSName("setPopupContent")
    var setPopupContent_Original: js.Function1[/* content */ Content, this.type]
    
    def setTooltipContent(content: Content): this.type
    @JSName("setTooltipContent")
    var setTooltipContent_Original: js.Function1[/* content */ Content, this.type]
    
    def setUrl(url: String): this.type
    @JSName("setUrl")
    var setUrl_Original: js.Function1[/* url */ String, this.type]
    
    def setZIndex(zIndex: Double): this.type
    @JSName("setZIndex")
    var setZIndex_Original: js.Function1[/* zIndex */ Double, this.type]
    
    def togglePopup(): this.type
    @JSName("togglePopup")
    var togglePopup_Original: js.Function0[this.type]
    
    def toggleTooltip(): this.type
    @JSName("toggleTooltip")
    var toggleTooltip_Original: js.Function0[this.type]
    
    def unbindPopup(): this.type
    @JSName("unbindPopup")
    var unbindPopup_Original: js.Function0[this.type]
    
    def unbindTooltip(): this.type
    @JSName("unbindTooltip")
    var unbindTooltip_Original: js.Function0[this.type]
    
    def updateNamedTile(name: String, timestamp: String): Unit
    @JSName("updateNamedTile")
    var updateNamedTile_Original: js.Function2[/* name */ String, /* timestamp */ String, Unit]
    
    def zoomprefix(amount: Double): String
    @JSName("zoomprefix")
    var zoomprefix_Original: js.Function1[/* amount */ Double, String]
  }
  object HDMapType {
    
    inline def apply(
      _abortLoading: () => Unit,
      _cachedTileUrls: Record[String, js.UndefOr[String]],
      _currentzoom: Double,
      _getZoomForUrl: () => Double,
      _limitedUpdate: /* event */ LeafletEvent => Unit,
      _loadQueue: Array[HTMLImageElement],
      _loadingTiles: Array[HTMLImageElement],
      _map: Map_,
      _namedTiles: Record[String, js.UndefOr[HTMLImageElement]],
      _removeTile: /* key */ String => Unit,
      _tickLoadQueue: () => Unit,
      _tileCoordsToKey: /* coords */ Coords => String,
      _tileOnError: (/* done */ DoneCallback, /* tile */ HTMLElement, /* e */ js.Error) => Unit,
      _tileOnLoad: (/* done */ DoneCallback, /* tile */ HTMLElement) => Unit,
      _tiles: InternalTiles,
      _wrapCoords: /* parameter */ Coords => Coords,
      addEventListener: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType,
      addEventParent: /* obj */ Evented => HDMapType,
      addInteractiveTarget: /* targetEl */ HTMLElement => HDMapType,
      addOneTimeEventListener: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType,
      addTo: /* map */ Map_ => HDMapType,
      bindPopup: /* content */ js.Function1[HDMapType, Content] => HDMapType,
      bindTooltip: /* content */ js.Function1[HDMapType, Content] => HDMapType,
      bringToBack: () => HDMapType,
      bringToFront: () => HDMapType,
      clearAllEventListeners: () => HDMapType,
      closePopup: () => HDMapType,
      closeTooltip: () => HDMapType,
      constructor: /* options */ WorldMapOptions => Any,
      createTile: (/* coords */ Location[String | World | Null, Double, Double, Double], /* done */ js.UndefOr[js.Function0[Unit]]) => HTMLImageElement,
      dynmap: DynMap,
      fire: /* type */ String => HDMapType,
      fireEvent: /* type */ String => HDMapType,
      getContainer: () => HTMLElement | Null,
      getPane: () => js.UndefOr[HTMLElement],
      getPopup: () => js.UndefOr[Popup_],
      getProjection: () => Projection,
      getTileInfo: /* coords */ Location[String | World | Null, Double, Double, Double] => TileInformation,
      getTileName: Location[String | World | Null, Double, Double, Double] => String,
      getTileSize: () => Point_,
      getTileUrl: (/* coords */ Location[String | World | Null, Double, Double, Double], /* timestamp */ js.UndefOr[String]) => String,
      getTileUrlFromName: (/* tileName */ String, /* timestamp */ String) => String,
      getTooltip: () => js.UndefOr[Tooltip_],
      hasEventListeners: /* type */ String => Boolean,
      initialize: WorldMapConfiguration & (/* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.DynmapTileLayer['options'] */ js.Any) & WorldMapOptions => Unit,
      isLoading: () => Boolean,
      isPopupOpen: () => Boolean,
      isTooltipOpen: () => Boolean,
      listens: /* type */ baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror => Boolean,
      off: /* type */ baselayerchange | overlayadd | overlayremove => HDMapType,
      on: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType,
      onAdd: /* map */ Map_ => HDMapType,
      onRemove: /* map */ Map_ => HDMapType,
      once: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType,
      openPopup: () => HDMapType,
      openTooltip: () => HDMapType,
      options: WorldMapConfiguration & (/* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.DynmapTileLayer['options'] */ js.Any) & WorldMapOptions,
      redraw: () => HDMapType,
      remove: () => HDMapType,
      removeEventListener: /* type */ baselayerchange | overlayadd | overlayremove => HDMapType,
      removeEventParent: /* obj */ Evented => HDMapType,
      removeFrom: /* map */ Map_ => HDMapType,
      removeInteractiveTarget: /* targetEl */ HTMLElement => HDMapType,
      setOpacity: /* opacity */ Double => HDMapType,
      setPopupContent: /* content */ Content => HDMapType,
      setTooltipContent: /* content */ Content => HDMapType,
      setUrl: /* url */ String => HDMapType,
      setZIndex: /* zIndex */ Double => HDMapType,
      togglePopup: () => HDMapType,
      toggleTooltip: () => HDMapType,
      unbindPopup: () => HDMapType,
      unbindTooltip: () => HDMapType,
      updateNamedTile: (/* name */ String, /* timestamp */ String) => Unit,
      zoomprefix: /* amount */ Double => String
    ): HDMapType = {
      val __obj = js.Dynamic.literal(_abortLoading = js.Any.fromFunction0(_abortLoading), _cachedTileUrls = _cachedTileUrls.asInstanceOf[js.Any], _currentzoom = _currentzoom.asInstanceOf[js.Any], _getZoomForUrl = js.Any.fromFunction0(_getZoomForUrl), _limitedUpdate = js.Any.fromFunction1(_limitedUpdate), _loadQueue = _loadQueue.asInstanceOf[js.Any], _loadingTiles = _loadingTiles.asInstanceOf[js.Any], _map = _map.asInstanceOf[js.Any], _namedTiles = _namedTiles.asInstanceOf[js.Any], _removeTile = js.Any.fromFunction1(_removeTile), _tickLoadQueue = js.Any.fromFunction0(_tickLoadQueue), _tileCoordsToKey = js.Any.fromFunction1(_tileCoordsToKey), _tileOnError = js.Any.fromFunction3(_tileOnError), _tileOnLoad = js.Any.fromFunction2(_tileOnLoad), _tiles = _tiles.asInstanceOf[js.Any], _wrapCoords = js.Any.fromFunction1(_wrapCoords), addEventListener = js.Any.fromFunction2(addEventListener), addEventParent = js.Any.fromFunction1(addEventParent), addInteractiveTarget = js.Any.fromFunction1(addInteractiveTarget), addOneTimeEventListener = js.Any.fromFunction2(addOneTimeEventListener), addTo = js.Any.fromFunction1(addTo), bindPopup = js.Any.fromFunction1(bindPopup), bindTooltip = js.Any.fromFunction1(bindTooltip), bringToBack = js.Any.fromFunction0(bringToBack), bringToFront = js.Any.fromFunction0(bringToFront), clearAllEventListeners = js.Any.fromFunction0(clearAllEventListeners), closePopup = js.Any.fromFunction0(closePopup), closeTooltip = js.Any.fromFunction0(closeTooltip), constructor = js.Any.fromFunction1(constructor), createTile = js.Any.fromFunction2(createTile), dynmap = dynmap.asInstanceOf[js.Any], fire = js.Any.fromFunction1(fire), fireEvent = js.Any.fromFunction1(fireEvent), getContainer = js.Any.fromFunction0(getContainer), getPane = js.Any.fromFunction0(getPane), getPopup = js.Any.fromFunction0(getPopup), getProjection = js.Any.fromFunction0(getProjection), getTileInfo = js.Any.fromFunction1(getTileInfo), getTileName = js.Any.fromFunction1(getTileName), getTileSize = js.Any.fromFunction0(getTileSize), getTileUrl = js.Any.fromFunction2(getTileUrl), getTileUrlFromName = js.Any.fromFunction2(getTileUrlFromName), getTooltip = js.Any.fromFunction0(getTooltip), hasEventListeners = js.Any.fromFunction1(hasEventListeners), initialize = js.Any.fromFunction1(initialize), isLoading = js.Any.fromFunction0(isLoading), isPopupOpen = js.Any.fromFunction0(isPopupOpen), isTooltipOpen = js.Any.fromFunction0(isTooltipOpen), listens = js.Any.fromFunction1(listens), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove), once = js.Any.fromFunction2(once), openPopup = js.Any.fromFunction0(openPopup), openTooltip = js.Any.fromFunction0(openTooltip), options = options.asInstanceOf[js.Any], redraw = js.Any.fromFunction0(redraw), remove = js.Any.fromFunction0(remove), removeEventListener = js.Any.fromFunction1(removeEventListener), removeEventParent = js.Any.fromFunction1(removeEventParent), removeFrom = js.Any.fromFunction1(removeFrom), removeInteractiveTarget = js.Any.fromFunction1(removeInteractiveTarget), setOpacity = js.Any.fromFunction1(setOpacity), setPopupContent = js.Any.fromFunction1(setPopupContent), setTooltipContent = js.Any.fromFunction1(setTooltipContent), setUrl = js.Any.fromFunction1(setUrl), setZIndex = js.Any.fromFunction1(setZIndex), togglePopup = js.Any.fromFunction0(togglePopup), toggleTooltip = js.Any.fromFunction0(toggleTooltip), unbindPopup = js.Any.fromFunction0(unbindPopup), unbindTooltip = js.Any.fromFunction0(unbindTooltip), updateNamedTile = js.Any.fromFunction2(updateNamedTile), zoomprefix = js.Any.fromFunction1(zoomprefix))
      __obj.asInstanceOf[HDMapType]
    }
    
    extension [Self <: HDMapType](x: Self) {
      
      inline def setAddEventListener(
        value: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAddEventParent(value: /* obj */ Evented => HDMapType): Self = StObject.set(x, "addEventParent", js.Any.fromFunction1(value))
      
      inline def setAddInitHook(value: Any): Self = StObject.set(x, "addInitHook", value.asInstanceOf[js.Any])
      
      inline def setAddInitHookUndefined: Self = StObject.set(x, "addInitHook", js.undefined)
      
      inline def setAddInteractiveTarget(value: /* targetEl */ HTMLElement => HDMapType): Self = StObject.set(x, "addInteractiveTarget", js.Any.fromFunction1(value))
      
      inline def setAddOneTimeEventListener(
        value: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType
      ): Self = StObject.set(x, "addOneTimeEventListener", js.Any.fromFunction2(value))
      
      inline def setAddTo(value: /* map */ Map_ => HDMapType): Self = StObject.set(x, "addTo", js.Any.fromFunction1(value))
      
      inline def setBeforeAdd(value: /* map */ Map_ => HDMapType): Self = StObject.set(x, "beforeAdd", js.Any.fromFunction1(value))
      
      inline def setBeforeAddUndefined: Self = StObject.set(x, "beforeAdd", js.undefined)
      
      inline def setBindPopup(value: /* content */ js.Function1[HDMapType, Content] => HDMapType): Self = StObject.set(x, "bindPopup", js.Any.fromFunction1(value))
      
      inline def setBindTooltip(value: /* content */ js.Function1[HDMapType, Content] => HDMapType): Self = StObject.set(x, "bindTooltip", js.Any.fromFunction1(value))
      
      inline def setBringToBack(value: () => HDMapType): Self = StObject.set(x, "bringToBack", js.Any.fromFunction0(value))
      
      inline def setBringToFront(value: () => HDMapType): Self = StObject.set(x, "bringToFront", js.Any.fromFunction0(value))
      
      inline def setCallInitHooks(value: Any): Self = StObject.set(x, "callInitHooks", value.asInstanceOf[js.Any])
      
      inline def setCallInitHooksUndefined: Self = StObject.set(x, "callInitHooks", js.undefined)
      
      inline def setClearAllEventListeners(value: () => HDMapType): Self = StObject.set(x, "clearAllEventListeners", js.Any.fromFunction0(value))
      
      inline def setClosePopup(value: () => HDMapType): Self = StObject.set(x, "closePopup", js.Any.fromFunction0(value))
      
      inline def setCloseTooltip(value: () => HDMapType): Self = StObject.set(x, "closeTooltip", js.Any.fromFunction0(value))
      
      inline def setConstructor(value: /* options */ WorldMapOptions => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setCreateTile(
        value: (/* coords */ Location[String | World | Null, Double, Double, Double], /* done */ js.UndefOr[js.Function0[Unit]]) => HTMLImageElement
      ): Self = StObject.set(x, "createTile", js.Any.fromFunction2(value))
      
      inline def setDynmap(value: DynMap): Self = StObject.set(x, "dynmap", value.asInstanceOf[js.Any])
      
      inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setFire(value: /* type */ String => HDMapType): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
      
      inline def setFireEvent(value: /* type */ String => HDMapType): Self = StObject.set(x, "fireEvent", js.Any.fromFunction1(value))
      
      inline def setGetAttribution(value: () => String | Null): Self = StObject.set(x, "getAttribution", js.Any.fromFunction0(value))
      
      inline def setGetAttributionUndefined: Self = StObject.set(x, "getAttribution", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement | Null): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetEvents(value: () => StringDictionary[LeafletEventHandlerFn]): Self = StObject.set(x, "getEvents", js.Any.fromFunction0(value))
      
      inline def setGetEventsUndefined: Self = StObject.set(x, "getEvents", js.undefined)
      
      inline def setGetPane(value: () => js.UndefOr[HTMLElement]): Self = StObject.set(x, "getPane", js.Any.fromFunction0(value))
      
      inline def setGetPopup(value: () => js.UndefOr[Popup_]): Self = StObject.set(x, "getPopup", js.Any.fromFunction0(value))
      
      inline def setGetProjection(value: () => Projection): Self = StObject.set(x, "getProjection", js.Any.fromFunction0(value))
      
      inline def setGetTileInfo(value: /* coords */ Location[String | World | Null, Double, Double, Double] => TileInformation): Self = StObject.set(x, "getTileInfo", js.Any.fromFunction1(value))
      
      inline def setGetTileName(value: Location[String | World | Null, Double, Double, Double] => String): Self = StObject.set(x, "getTileName", js.Any.fromFunction1(value))
      
      inline def setGetTileSize(value: () => Point_): Self = StObject.set(x, "getTileSize", js.Any.fromFunction0(value))
      
      inline def setGetTileUrl(
        value: (/* coords */ Location[String | World | Null, Double, Double, Double], /* timestamp */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction2(value))
      
      inline def setGetTileUrlFromName(value: (/* tileName */ String, /* timestamp */ String) => String): Self = StObject.set(x, "getTileUrlFromName", js.Any.fromFunction2(value))
      
      inline def setGetTooltip(value: () => js.UndefOr[Tooltip_]): Self = StObject.set(x, "getTooltip", js.Any.fromFunction0(value))
      
      inline def setHasEventListeners(value: /* type */ String => Boolean): Self = StObject.set(x, "hasEventListeners", js.Any.fromFunction1(value))
      
      inline def setInclude(value: Any): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setInitialize(
        value: WorldMapConfiguration & (/* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.DynmapTileLayer['options'] */ js.Any) & WorldMapOptions => Unit
      ): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
      
      inline def setIsPopupOpen(value: () => Boolean): Self = StObject.set(x, "isPopupOpen", js.Any.fromFunction0(value))
      
      inline def setIsTooltipOpen(value: () => Boolean): Self = StObject.set(x, "isTooltipOpen", js.Any.fromFunction0(value))
      
      inline def setListens(
        value: /* type */ baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror => Boolean
      ): Self = StObject.set(x, "listens", js.Any.fromFunction1(value))
      
      inline def setMergeOptions(value: Any): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
      
      inline def setMergeOptionsUndefined: Self = StObject.set(x, "mergeOptions", js.undefined)
      
      inline def setOff(value: /* type */ baselayerchange | overlayadd | overlayremove => HDMapType): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(
        value: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnAdd(value: /* map */ Map_ => HDMapType): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: /* map */ Map_ => HDMapType): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnce(
        value: (/* type */ baselayerchange | overlayadd | overlayremove, /* fn */ LayersControlEventHandlerFn) => HDMapType
      ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setOpenPopup(value: () => HDMapType): Self = StObject.set(x, "openPopup", js.Any.fromFunction0(value))
      
      inline def setOpenTooltip(value: () => HDMapType): Self = StObject.set(x, "openTooltip", js.Any.fromFunction0(value))
      
      inline def setOptions(
        value: WorldMapConfiguration & (/* import warning: importer.ImportType#apply Failed type conversion: dynmap.dynmap.DynmapTileLayer['options'] */ js.Any) & WorldMapOptions
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRedraw(value: () => HDMapType): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => HDMapType): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRemoveEventListener(value: /* type */ baselayerchange | overlayadd | overlayremove => HDMapType): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
      
      inline def setRemoveEventParent(value: /* obj */ Evented => HDMapType): Self = StObject.set(x, "removeEventParent", js.Any.fromFunction1(value))
      
      inline def setRemoveFrom(value: /* map */ Map_ => HDMapType): Self = StObject.set(x, "removeFrom", js.Any.fromFunction1(value))
      
      inline def setRemoveInteractiveTarget(value: /* targetEl */ HTMLElement => HDMapType): Self = StObject.set(x, "removeInteractiveTarget", js.Any.fromFunction1(value))
      
      inline def setSetOpacity(value: /* opacity */ Double => HDMapType): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1(value))
      
      inline def setSetPopupContent(value: /* content */ Content => HDMapType): Self = StObject.set(x, "setPopupContent", js.Any.fromFunction1(value))
      
      inline def setSetTooltipContent(value: /* content */ Content => HDMapType): Self = StObject.set(x, "setTooltipContent", js.Any.fromFunction1(value))
      
      inline def setSetUrl(value: /* url */ String => HDMapType): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
      
      inline def setSetZIndex(value: /* zIndex */ Double => HDMapType): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
      
      inline def setTogglePopup(value: () => HDMapType): Self = StObject.set(x, "togglePopup", js.Any.fromFunction0(value))
      
      inline def setToggleTooltip(value: () => HDMapType): Self = StObject.set(x, "toggleTooltip", js.Any.fromFunction0(value))
      
      inline def setUnbindPopup(value: () => HDMapType): Self = StObject.set(x, "unbindPopup", js.Any.fromFunction0(value))
      
      inline def setUnbindTooltip(value: () => HDMapType): Self = StObject.set(x, "unbindTooltip", js.Any.fromFunction0(value))
      
      inline def setUpdateNamedTile(value: (/* name */ String, /* timestamp */ String) => Unit): Self = StObject.set(x, "updateNamedTile", js.Any.fromFunction2(value))
      
      inline def setZoomprefix(value: /* amount */ Double => String): Self = StObject.set(x, "zoomprefix", js.Any.fromFunction1(value))
      
      inline def set_abortLoading(value: () => Unit): Self = StObject.set(x, "_abortLoading", js.Any.fromFunction0(value))
      
      inline def set_cachedTileUrls(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "_cachedTileUrls", value.asInstanceOf[js.Any])
      
      inline def set_currentzoom(value: Double): Self = StObject.set(x, "_currentzoom", value.asInstanceOf[js.Any])
      
      inline def set_getZoomForUrl(value: () => Double): Self = StObject.set(x, "_getZoomForUrl", js.Any.fromFunction0(value))
      
      inline def set_limitedUpdate(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "_limitedUpdate", js.Any.fromFunction1(value))
      
      inline def set_loadQueue(value: Array[HTMLImageElement]): Self = StObject.set(x, "_loadQueue", value.asInstanceOf[js.Any])
      
      inline def set_loadingTiles(value: Array[HTMLImageElement]): Self = StObject.set(x, "_loadingTiles", value.asInstanceOf[js.Any])
      
      inline def set_map(value: Map_): Self = StObject.set(x, "_map", value.asInstanceOf[js.Any])
      
      inline def set_namedTiles(value: Record[String, js.UndefOr[HTMLImageElement]]): Self = StObject.set(x, "_namedTiles", value.asInstanceOf[js.Any])
      
      inline def set_removeTile(value: /* key */ String => Unit): Self = StObject.set(x, "_removeTile", js.Any.fromFunction1(value))
      
      inline def set_tickLoadQueue(value: () => Unit): Self = StObject.set(x, "_tickLoadQueue", js.Any.fromFunction0(value))
      
      inline def set_tileCoordsToKey(value: /* coords */ Coords => String): Self = StObject.set(x, "_tileCoordsToKey", js.Any.fromFunction1(value))
      
      inline def set_tileOnError(value: (/* done */ DoneCallback, /* tile */ HTMLElement, /* e */ js.Error) => Unit): Self = StObject.set(x, "_tileOnError", js.Any.fromFunction3(value))
      
      inline def set_tileOnLoad(value: (/* done */ DoneCallback, /* tile */ HTMLElement) => Unit): Self = StObject.set(x, "_tileOnLoad", js.Any.fromFunction2(value))
      
      inline def set_tileZoom(value: Double): Self = StObject.set(x, "_tileZoom", value.asInstanceOf[js.Any])
      
      inline def set_tileZoomUndefined: Self = StObject.set(x, "_tileZoom", js.undefined)
      
      inline def set_tiles(value: InternalTiles): Self = StObject.set(x, "_tiles", value.asInstanceOf[js.Any])
      
      inline def set_wrapCoords(value: /* parameter */ Coords => Coords): Self = StObject.set(x, "_wrapCoords", js.Any.fromFunction1(value))
    }
  }
  
  // js/hdmap.js
  /* Inlined parent std.Omit<dynmap.dynmap.DynmapProjection, 'fromLocationToLatLng' | 'fromLatLngToLocation'> */
  trait HDProjection extends StObject {
    
    var addInitHook: js.UndefOr[Any] = js.undefined
    
    var callInitHooks: js.UndefOr[Any] = js.undefined
    
    var extend: js.UndefOr[Any] = js.undefined
    
    def fromLatLngToLocation(location: LatLng_): Location[String | World | Null, Double, Double, Double]
    
    def fromLocationToLatLng(location: Location[String | World | Null, Double, Double, Double]): LatLng_
    
    var include: js.UndefOr[Any] = js.undefined
    
    def initialize(options: WorldMapConfiguration & TileLayerOptionsattributi & WorldMapOptions): Unit
    @JSName("initialize")
    var initialize_Original: js.Function1[
        /* options */ WorldMapConfiguration & TileLayerOptionsattributi & WorldMapOptions, 
        Unit
      ]
    
    var mergeOptions: js.UndefOr[Any] = js.undefined
  }
  object HDProjection {
    
    inline def apply(
      fromLatLngToLocation: LatLng_ => Location[String | World | Null, Double, Double, Double],
      fromLocationToLatLng: Location[String | World | Null, Double, Double, Double] => LatLng_,
      initialize: /* options */ WorldMapConfiguration & TileLayerOptionsattributi & WorldMapOptions => Unit
    ): HDProjection = {
      val __obj = js.Dynamic.literal(fromLatLngToLocation = js.Any.fromFunction1(fromLatLngToLocation), fromLocationToLatLng = js.Any.fromFunction1(fromLocationToLatLng), initialize = js.Any.fromFunction1(initialize))
      __obj.asInstanceOf[HDProjection]
    }
    
    extension [Self <: HDProjection](x: Self) {
      
      inline def setAddInitHook(value: Any): Self = StObject.set(x, "addInitHook", value.asInstanceOf[js.Any])
      
      inline def setAddInitHookUndefined: Self = StObject.set(x, "addInitHook", js.undefined)
      
      inline def setCallInitHooks(value: Any): Self = StObject.set(x, "callInitHooks", value.asInstanceOf[js.Any])
      
      inline def setCallInitHooksUndefined: Self = StObject.set(x, "callInitHooks", js.undefined)
      
      inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setFromLatLngToLocation(value: LatLng_ => Location[String | World | Null, Double, Double, Double]): Self = StObject.set(x, "fromLatLngToLocation", js.Any.fromFunction1(value))
      
      inline def setFromLocationToLatLng(value: Location[String | World | Null, Double, Double, Double] => LatLng_): Self = StObject.set(x, "fromLocationToLatLng", js.Any.fromFunction1(value))
      
      inline def setInclude(value: Any): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setInitialize(value: /* options */ WorldMapConfiguration & TileLayerOptionsattributi & WorldMapOptions => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
      
      inline def setMergeOptions(value: Any): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
      
      inline def setMergeOptionsUndefined: Self = StObject.set(x, "mergeOptions", js.undefined)
    }
  }
  
  @js.native
  trait JQuery extends StObject {
    
    /**
      * Getter-setter for element scroll height.
      *
      * @param height New scroll height of element (not implemented).
      */
    def scrollHeight(): Double = js.native
    def scrollHeight(height: Double): Double = js.native
  }
  
  // js/jquery.json.js
  @js.native
  trait JQueryStatic extends StObject {
    
    def deleteJSON(url: String, success: JQuerySuccessHandlerFn, error: JQueryErrorHandlerFn): Unit = js.native
    
    def getJSON(url: String, success: JQuerySuccessHandlerFn, error: JQueryErrorHandlerFn): Unit = js.native
    
    def parseJSON(str: String): Any = js.native
    
    def postJSON(obj: Any, url: String, success: JQuerySuccessHandlerFn, error: JQueryErrorHandlerFn): Unit = js.native
    
    def putJSON(obj: Any, url: String, success: JQuerySuccessHandlerFn, error: JQueryErrorHandlerFn): Unit = js.native
    
    def stringifyJSON(): String = js.native
    def stringifyJSON(obj: Any): String = js.native
  }
}
