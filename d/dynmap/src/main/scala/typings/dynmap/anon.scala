package typings.dynmap

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.dynmap.dynmapInts.`-1`
import typings.dynmap.dynmapInts.`1`
import typings.dynmap.mod.DynMap
import typings.dynmap.mod.global.Array
import typings.dynmap.mod.global.JQuery
import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_.ZoomOptions
import typings.leaflet.mod.CrossOrigin
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.ReferrerPolicy
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Chatpopups extends StObject {
    
    var chatpopups: Record[String | Double | js.Symbol, Any | Null | Array[Any]]
  }
  object Chatpopups {
    
    inline def apply(chatpopups: Record[String | Double | js.Symbol, Any | Null | Array[Any]]): Chatpopups = {
      val __obj = js.Dynamic.literal(chatpopups = chatpopups.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chatpopups]
    }
    
    extension [Self <: Chatpopups](x: Self) {
      
      inline def setChatpopups(value: Record[String | Double | js.Symbol, Any | Null | Array[Any]]): Self = StObject.set(x, "chatpopups", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined dynmap.dynmap.Component<{}> */
  @js.native
  trait Component
    extends StObject
       with /* data */ StringDictionary[Any]
       with Instantiable2[
          /* dynmap */ DynMap, 
          /* configuration */ Record[String | Double | js.Symbol, Any | Null | Array[Any]], 
          typings.dynmap.mod.Component[js.Object]
        ]
  
  /* Inlined dynmap.dynmap.Component<{  chatpopups :std.Record<string | number | symbol, unknown | null | dynmap.dynmap.<global>.Array<unknown>>}> */
  @js.native
  trait ComponentchatpopupsRecord
    extends StObject
       with /* data */ StringDictionary[Any]
       with Instantiable2[
          /* dynmap */ DynMap, 
          /* configuration */ Record[String | Double | js.Symbol, Any | Null | Array[Any]], 
          typings.dynmap.mod.Component[Chatpopups]
        ] {
    
    var chatpopups: Record[String | Double | js.Symbol, Any | Null | Array[Any]] = js.native
  }
  
  trait Configuration extends StObject {
    
    var configuration: String
    
    var login: String
    
    var markers: String
    
    var register: String
    
    var sendmessage: String
    
    var tiles: String
    
    var update: String
  }
  object Configuration {
    
    inline def apply(
      configuration: String,
      login: String,
      markers: String,
      register: String,
      sendmessage: String,
      tiles: String,
      update: String
    ): Configuration = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], register = register.asInstanceOf[js.Any], sendmessage = sendmessage.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setMarkers(value: String): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setRegister(value: String): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      inline def setSendmessage(value: String): Self = StObject.set(x, "sendmessage", value.asInstanceOf[js.Any])
      
      inline def setTiles(value: String): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cyrillic extends StObject {
    
    var cyrillic: Boolean
  }
  object Cyrillic {
    
    inline def apply(cyrillic: Boolean): Cyrillic = {
      val __obj = js.Dynamic.literal(cyrillic = cyrillic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cyrillic]
    }
    
    extension [Self <: Cyrillic](x: Self) {
      
      inline def setCyrillic(value: Boolean): Self = StObject.set(x, "cyrillic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Day[S, D] extends StObject {
    
    var day: D
    
    var days: Double
    
    var hours: Double
    
    var minutes: Double
    
    var night: D
    
    var seconds: Double
    
    var servertime: S
  }
  object Day {
    
    inline def apply[S, D](day: D, days: Double, hours: Double, minutes: Double, night: D, seconds: Double, servertime: S): Day[S, D] = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], servertime = servertime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Day[S, D]]
    }
    
    extension [Self <: Day[?, ?], S, D](x: Self & (Day[S, D])) {
      
      inline def setDay(value: D): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setNight(value: D): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setServertime(value: S): Self = StObject.set(x, "servertime", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownBtn[Content] extends StObject {
    
    var content: Content
    
    var downBtn: JQuery
    
    var legend: JQuery
    
    var section: JQuery
    
    var upBtn: JQuery
  }
  object DownBtn {
    
    inline def apply[Content](content: Content, downBtn: JQuery, legend: JQuery, section: JQuery, upBtn: JQuery): DownBtn[Content] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], downBtn = downBtn.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], upBtn = upBtn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownBtn[Content]]
    }
    
    extension [Self <: DownBtn[?], Content](x: Self & DownBtn[Content]) {
      
      inline def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDownBtn(value: JQuery): Self = StObject.set(x, "downBtn", value.asInstanceOf[js.Any])
      
      inline def setLegend(value: JQuery): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setSection(value: JQuery): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setUpBtn(value: JQuery): Self = StObject.set(x, "upBtn", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined leaflet.leaflet.Handler & {  _delta :number} */
  @js.native
  trait Handlerdeltanumber extends StObject {
    
    var _delta: Double = js.native
    
    // Extension methods
    var addHooks: js.UndefOr[js.Function0[Unit]] = js.native
    
    def disable(): this.type = js.native
    
    def enable(): this.type = js.native
    
    def enabled(): Boolean = js.native
    
    var removeHooks: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  /* Inlined leaflet.leaflet.Handler & {  _panKeys :std.Record<number, [number, number] | undefined>,   _zoomKeys :std.Record<number, 1 | -1>} */
  @js.native
  trait HandlerpanKeysRecordnumbe extends StObject {
    
    var _panKeys: Record[Double, js.UndefOr[js.Tuple2[Double, Double]]] = js.native
    
    var _zoomKeys: Record[Double, `1` | `-1`] = js.native
    
    // Extension methods
    var addHooks: js.UndefOr[js.Function0[Unit]] = js.native
    
    def disable(): this.type = js.native
    
    def enable(): this.type = js.native
    
    def enabled(): Boolean = js.native
    
    var removeHooks: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  @js.native
  trait Instantiable[Data /* <: Record[String | Double | js.Symbol, Any | Null | Array[Any]] */]
    extends StObject
       with /* data */ StringDictionary[Any]
       with Instantiable2[
          /* dynmap */ DynMap, 
          /* configuration */ Record[String | Double | js.Symbol, Any | Null | Array[Any]], 
          typings.dynmap.mod.Component[Data]
        ]
  
  /* Inlined leaflet.leaflet.TileLayerOptions & {  attribution :string | undefined,   continuousWorld :boolean | undefined,   unloadInvisibleTiles :boolean | undefined} */
  trait TileLayerOptionsattributi extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var attribution: js.UndefOr[String] = js.undefined
    
    var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var continuousWorld: js.UndefOr[Boolean] = js.undefined
    
    var crossOrigin: js.UndefOr[CrossOrigin | Boolean] = js.undefined
    
    var detectRetina: js.UndefOr[Boolean] = js.undefined
    
    var errorTileUrl: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keepBuffer: js.UndefOr[Double] = js.undefined
    
    var maxNativeZoom: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minNativeZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var pane: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy | Boolean] = js.undefined
    
    var subdomains: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tileSize: js.UndefOr[Double | Point_] = js.undefined
    
    var tms: js.UndefOr[Boolean] = js.undefined
    
    var unloadInvisibleTiles: js.UndefOr[Boolean] = js.undefined
    
    var updateInterval: js.UndefOr[Double] = js.undefined
    
    var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
    
    var updateWhenZooming: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
    
    var zoomOffset: js.UndefOr[Double] = js.undefined
    
    var zoomReverse: js.UndefOr[Boolean] = js.undefined
  }
  object TileLayerOptionsattributi {
    
    inline def apply(): TileLayerOptionsattributi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileLayerOptionsattributi]
    }
    
    extension [Self <: TileLayerOptionsattributi](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContinuousWorld(value: Boolean): Self = StObject.set(x, "continuousWorld", value.asInstanceOf[js.Any])
      
      inline def setContinuousWorldUndefined: Self = StObject.set(x, "continuousWorld", js.undefined)
      
      inline def setCrossOrigin(value: CrossOrigin | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDetectRetina(value: Boolean): Self = StObject.set(x, "detectRetina", value.asInstanceOf[js.Any])
      
      inline def setDetectRetinaUndefined: Self = StObject.set(x, "detectRetina", js.undefined)
      
      inline def setErrorTileUrl(value: String): Self = StObject.set(x, "errorTileUrl", value.asInstanceOf[js.Any])
      
      inline def setErrorTileUrlUndefined: Self = StObject.set(x, "errorTileUrl", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeepBuffer(value: Double): Self = StObject.set(x, "keepBuffer", value.asInstanceOf[js.Any])
      
      inline def setKeepBufferUndefined: Self = StObject.set(x, "keepBuffer", js.undefined)
      
      inline def setMaxNativeZoom(value: Double): Self = StObject.set(x, "maxNativeZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxNativeZoomUndefined: Self = StObject.set(x, "maxNativeZoom", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinNativeZoom(value: Double): Self = StObject.set(x, "minNativeZoom", value.asInstanceOf[js.Any])
      
      inline def setMinNativeZoomUndefined: Self = StObject.set(x, "minNativeZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      inline def setReferrerPolicy(value: ReferrerPolicy | Boolean): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setSubdomains(value: String | js.Array[String]): Self = StObject.set(x, "subdomains", value.asInstanceOf[js.Any])
      
      inline def setSubdomainsUndefined: Self = StObject.set(x, "subdomains", js.undefined)
      
      inline def setSubdomainsVarargs(value: String*): Self = StObject.set(x, "subdomains", js.Array(value*))
      
      inline def setTileSize(value: Double | Point_): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTms(value: Boolean): Self = StObject.set(x, "tms", value.asInstanceOf[js.Any])
      
      inline def setTmsUndefined: Self = StObject.set(x, "tms", js.undefined)
      
      inline def setUnloadInvisibleTiles(value: Boolean): Self = StObject.set(x, "unloadInvisibleTiles", value.asInstanceOf[js.Any])
      
      inline def setUnloadInvisibleTilesUndefined: Self = StObject.set(x, "unloadInvisibleTiles", js.undefined)
      
      inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
      
      inline def setUpdateWhenIdle(value: Boolean): Self = StObject.set(x, "updateWhenIdle", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhenIdleUndefined: Self = StObject.set(x, "updateWhenIdle", js.undefined)
      
      inline def setUpdateWhenZooming(value: Boolean): Self = StObject.set(x, "updateWhenZooming", value.asInstanceOf[js.Any])
      
      inline def setUpdateWhenZoomingUndefined: Self = StObject.set(x, "updateWhenZooming", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZoomOffset(value: Double): Self = StObject.set(x, "zoomOffset", value.asInstanceOf[js.Any])
      
      inline def setZoomOffsetUndefined: Self = StObject.set(x, "zoomOffset", js.undefined)
      
      inline def setZoomReverse(value: Boolean): Self = StObject.set(x, "zoomReverse", value.asInstanceOf[js.Any])
      
      inline def setZoomReverseUndefined: Self = StObject.set(x, "zoomReverse", js.undefined)
    }
  }
  
  /* Inlined leaflet.leaflet.Control.Zoom & leaflet.leaflet.Handler & {  _zoomInButton :std.HTMLElement,   _zoomOutButton :std.HTMLElement} */
  @js.native
  trait ZoomHandlerzoomInButtonHT extends StObject {
    
    var _zoomInButton: HTMLElement = js.native
    
    var _zoomOutButton: HTMLElement = js.native
    
    // Extension methods
    var addHooks: js.UndefOr[js.Function0[Unit]] = js.native
    
    def addTo(map: Map_): this.type = js.native
    
    def disable(): this.type = js.native
    
    def enable(): this.type = js.native
    
    def enabled(): Boolean = js.native
    
    def getContainer(): js.UndefOr[HTMLElement] = js.native
    
    def getPosition(): ControlPosition = js.native
    
    // Extension methods
    var onAdd: js.UndefOr[js.Function1[/* map */ Map_, HTMLElement]] = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* map */ Map_, Unit]] = js.native
    
    var options: ZoomOptions = js.native
    
    def remove(): this.type = js.native
    
    var removeHooks: js.UndefOr[js.Function0[Unit]] = js.native
    
    def setPosition(position: ControlPosition): this.type = js.native
  }
}
