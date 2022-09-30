package typings.dynmap

import typings.dynmap.anon.Day
import typings.dynmap.dynmapBooleans.`false`
import typings.dynmap.dynmapBooleans.`true`
import typings.dynmap.dynmapStrings._empty
import typings.dynmap.mod.ChatMessage
import typings.dynmap.mod.ComponentRecord
import typings.dynmap.mod.DynMap
import typings.dynmap.mod.GlobalMap
import typings.dynmap.mod.MarkerSet
import typings.dynmap.mod.SidebarUtils
import typings.dynmap.mod.StandaloneConfiguration
import typings.dynmap.mod.WorldMapOptions
import typings.dynmap.mod.global.Array
import typings.jquery.JQuery.AjaxSettings
import typings.leaflet.mod.DivIconOptions
import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.Marker_
import typings.std.HTMLDivElement
import typings.std.HTMLImageElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Dynmap {
    
    @JSGlobal("Dynmap.LatLng")
    @js.native
    open class LatLng[W, L, F] protected ()
      extends typings.dynmap.mod.LatLng[W, L, F] {
      def this(world: W, lat: L, lng: F) = this()
    }
    
    @JSGlobal("Dynmap.Location")
    @js.native
    open class Location[W, X, Y, Z] protected ()
      extends typings.dynmap.mod.Location[W, X, Y, Z] {
      def this(world: W, x: X, y: Y, z: Z) = this()
    }
    
    @JSGlobal("Dynmap.World")
    @js.native
    open class World ()
      extends typings.dynmap.mod.World
    
    @JSGlobal("Dynmap.WorldMap")
    @js.native
    open class WorldMap protected ()
      extends typings.dynmap.mod.WorldMap {
      def this(options: WorldMapOptions) = this()
    }
    
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
      def maptypes: Record[String, js.UndefOr[typings.dynmap.mod.WorldMap]] = js.native
      inline def maptypes_=(x: Record[String, js.UndefOr[typings.dynmap.mod.WorldMap]]): Unit = js.Dynamic.global.updateDynamic("maptypes")(x.asInstanceOf[js.Any])
      
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
    }
    
    /* augmented module */
    object mod {
      
      @JSImport("leaflet", "CustomIcon")
      @js.native
      open class CustomIcon () extends DivIcon_ {
        def this(options: typings.dynmap.mod.leafletAugmentingMod.CustomIconOptions) = this()
        
        def initialize(options: DivIconOptions): js.Object = js.native
        
        @JSName("options")
        var options_CustomIcon: typings.dynmap.mod.leafletAugmentingMod.CustomIconOptions = js.native
      }
      
      @JSImport("leaflet", "CustomMarker")
      @js.native
      open class CustomMarker protected ()
        extends Marker_[typings.dynmap.mod.leafletAugmentingMod.CustomMarkerOptions] {
        def this(latlng: LatLngExpression) = this()
        def this(latlng: LatLngExpression, options: typings.dynmap.mod.leafletAugmentingMod.CustomMarkerOptions) = this()
        
        @JSName("options")
        var options_CustomMarker: typings.dynmap.mod.leafletAugmentingMod.CustomMarkerOptions = js.native
      }
      
      trait CustomIconOptions
        extends StObject
           with DivIconOptions {
        
        @JSName("className")
        var className_CustomIconOptions: _empty
        
        def elementCreator(): HTMLDivElement
        
        def shadowCreator(): Unit
      }
      object CustomIconOptions {
        
        inline def apply(elementCreator: () => HTMLDivElement, shadowCreator: () => Unit): CustomIconOptions = {
          val __obj = js.Dynamic.literal(className = "", elementCreator = js.Any.fromFunction0(elementCreator), shadowCreator = js.Any.fromFunction0(shadowCreator))
          __obj.asInstanceOf[CustomIconOptions]
        }
        
        extension [Self <: CustomIconOptions](x: Self) {
          
          inline def setClassName(value: _empty): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
          
          inline def setElementCreator(value: () => HTMLDivElement): Self = StObject.set(x, "elementCreator", js.Any.fromFunction0(value))
          
          inline def setShadowCreator(value: () => Unit): Self = StObject.set(x, "shadowCreator", js.Any.fromFunction0(value))
        }
      }
      
      trait CustomMarkerOptions
        extends StObject
           with MarkerOptions {
        
        var clickable: `true`
        
        @JSName("draggable")
        var draggable_CustomMarkerOptions: `false`
        
        var elementCreator: Unit
        
        @JSName("icon")
        var icon_CustomMarkerOptions: typings.dynmap.mod.leafletAugmentingMod.CustomIcon
        
        var shadowCreator: Unit
      }
      object CustomMarkerOptions {
        
        inline def apply(
          elementCreator: Unit,
          icon: typings.dynmap.mod.leafletAugmentingMod.CustomIcon,
          shadowCreator: Unit
        ): CustomMarkerOptions = {
          val __obj = js.Dynamic.literal(clickable = true, draggable = false, elementCreator = elementCreator.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], shadowCreator = shadowCreator.asInstanceOf[js.Any])
          __obj.asInstanceOf[CustomMarkerOptions]
        }
        
        extension [Self <: CustomMarkerOptions](x: Self) {
          
          inline def setClickable(value: `true`): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
          
          inline def setDraggable(value: `false`): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
          
          inline def setElementCreator(value: Unit): Self = StObject.set(x, "elementCreator", value.asInstanceOf[js.Any])
          
          inline def setIcon(value: typings.dynmap.mod.leafletAugmentingMod.CustomIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
          
          inline def setShadowCreator(value: Unit): Self = StObject.set(x, "shadowCreator", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
