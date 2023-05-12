package typings.esriLeafletGeocoder.leafletMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.esriLeafletGeocoder.anon.Address
import typings.geojson.mod.GeometryObject
import typings.leaflet.leafletStrings.add
import typings.leaflet.leafletStrings.autopanstart
import typings.leaflet.leafletStrings.baselayerchange
import typings.leaflet.leafletStrings.click
import typings.leaflet.leafletStrings.contextmenu
import typings.leaflet.leafletStrings.dblclick
import typings.leaflet.leafletStrings.down
import typings.leaflet.leafletStrings.drag
import typings.leaflet.leafletStrings.dragend
import typings.leaflet.leafletStrings.dragstart
import typings.leaflet.leafletStrings.error
import typings.leaflet.leafletStrings.keydown
import typings.leaflet.leafletStrings.keypress
import typings.leaflet.leafletStrings.keyup
import typings.leaflet.leafletStrings.layeradd
import typings.leaflet.leafletStrings.layerremove
import typings.leaflet.leafletStrings.load
import typings.leaflet.leafletStrings.loading
import typings.leaflet.leafletStrings.locationerror
import typings.leaflet.leafletStrings.locationfound
import typings.leaflet.leafletStrings.mousedown
import typings.leaflet.leafletStrings.mousemove
import typings.leaflet.leafletStrings.mouseout
import typings.leaflet.leafletStrings.mouseover
import typings.leaflet.leafletStrings.mouseup
import typings.leaflet.leafletStrings.move
import typings.leaflet.leafletStrings.moveend
import typings.leaflet.leafletStrings.movestart
import typings.leaflet.leafletStrings.overlayadd
import typings.leaflet.leafletStrings.overlayremove
import typings.leaflet.leafletStrings.popupclose
import typings.leaflet.leafletStrings.popupopen
import typings.leaflet.leafletStrings.preclick
import typings.leaflet.leafletStrings.predrag
import typings.leaflet.leafletStrings.remove
import typings.leaflet.leafletStrings.resize
import typings.leaflet.leafletStrings.tileabort
import typings.leaflet.leafletStrings.tileerror
import typings.leaflet.leafletStrings.tileload
import typings.leaflet.leafletStrings.tileloadstart
import typings.leaflet.leafletStrings.tileunload
import typings.leaflet.leafletStrings.tooltipclose
import typings.leaflet.leafletStrings.tooltipopen
import typings.leaflet.leafletStrings.unload
import typings.leaflet.leafletStrings.update
import typings.leaflet.leafletStrings.viewreset
import typings.leaflet.leafletStrings.zoom
import typings.leaflet.leafletStrings.zoomanim
import typings.leaflet.leafletStrings.zoomend
import typings.leaflet.leafletStrings.zoomlevelschange
import typings.leaflet.leafletStrings.zoomstart
import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_
import typings.leaflet.mod.DragEndEventHandlerFn
import typings.leaflet.mod.ErrorEventHandlerFn
import typings.leaflet.mod.Evented
import typings.leaflet.mod.GeoJSON__
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.LayerEventHandlerFn
import typings.leaflet.mod.LayersControlEventHandlerFn
import typings.leaflet.mod.LeafletEventHandlerFn
import typings.leaflet.mod.LeafletEventHandlerFnMap
import typings.leaflet.mod.LeafletKeyboardEventHandlerFn
import typings.leaflet.mod.LeafletMouseEventHandlerFn
import typings.leaflet.mod.LocationEventHandlerFn
import typings.leaflet.mod.PopupEventHandlerFn
import typings.leaflet.mod.ResizeEventHandlerFn
import typings.leaflet.mod.TileErrorEventHandlerFn
import typings.leaflet.mod.TileEventHandlerFn
import typings.leaflet.mod.TooltipEventHandlerFn
import typings.leaflet.mod.ZoomAnimEventHandlerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esri {
  
  object Geocoding {
    
    @JSImport("leaflet", "esri.Geocoding")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("leaflet", "esri.Geocoding.ArcgisOnlineProvider")
    @js.native
    open class ArcgisOnlineProvider_ ()
      extends GeocodeService_
         with GeosearchProvider {
      def this(options: ArcgisOnlineProviderOptions) = this()
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeatureLayerService * / any */ @JSImport("leaflet", "esri.Geocoding.FeatureLayerProvider")
    @js.native
    open class FeatureLayerProvider_ ()
      extends StObject
         with GeosearchProvider {
      def this(options: FeatureLayerProviderOptions) = this()
    }
    
    @JSImport("leaflet", "esri.Geocoding.GeocodeServiceProvider")
    @js.native
    open class GeocodeServiceProvider_ ()
      extends GeocodeService_
         with GeosearchProvider {
      def this(options: GeocodeServiceProviderOptions) = this()
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service * / any */ @JSImport("leaflet", "esri.Geocoding.GeocodeService")
    @js.native
    open class GeocodeService_ () extends StObject {
      def this(options: GeocodeServiceOptions) = this()
      
      def geocode(): Geocode_ = js.native
      
      def reverse(): ReverseGeocode_ = js.native
      
      def suggest(): Suggest_ = js.native
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.Geocode")
    @js.native
    open class Geocode_ () extends StObject {
      def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ Any) = this()
      
      def address(text: String): this.type = js.native
      
      def category(text: String): this.type = js.native
      
      def city(text: String): this.type = js.native
      
      def country(text: String): this.type = js.native
      
      def nearby(latlng: LatLngExpression, distance: Double): this.type = js.native
      
      def neighborhood(text: String): this.type = js.native
      
      def postal(text: String): this.type = js.native
      
      def region(text: String): this.type = js.native
      
      def run(
        callback: js.Function3[
              /* error */ js.UndefOr[Any], 
              /* results */ typings.esriLeafletGeocoder.anon.Results, 
              /* response */ Any, 
              Unit
            ]
      ): this.type = js.native
      def run(
        callback: js.Function3[
              /* error */ js.UndefOr[Any], 
              /* results */ typings.esriLeafletGeocoder.anon.Results, 
              /* response */ Any, 
              Unit
            ],
        context: Any
      ): this.type = js.native
      
      def subregion(text: String): this.type = js.native
      
      def text(text: String): this.type = js.native
      
      def within(bounds: LatLngBoundsExpression): this.type = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("leaflet", "esri.Geocoding.Geosearch")
    @js.native
    open class GeosearchCls ()
      extends typings.esriLeafletGeocoder.leafletMod.esri.Geocoding.Geosearch_ {
      def this(options: GeosearchObject) = this()
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.leaflet.mod.Class because Already inherited
    - typings.leaflet.mod.Evented because Inheritance from two classes. Inlined addEventListener, addEventListener, addEventListener, addEventListener, addEventListener, addEventListener_dragend, addEventListener_dragend, addEventListener_locationerror, addEventListener_locationerror, addEventListener_locationfound, addEventListener_locationfound, addEventListener_resize, addEventListener_resize, addEventListener_tileerror, addEventListener_tileerror, addEventListener_zoomanim, addEventListener_zoomanim, addEventParent, addOneTimeEventListener, addOneTimeEventListener, addOneTimeEventListener, addOneTimeEventListener, addOneTimeEventListener, addOneTimeEventListener_dragend, addOneTimeEventListener_dragend, addOneTimeEventListener_locationerror, addOneTimeEventListener_locationerror, addOneTimeEventListener_locationfound, addOneTimeEventListener_locationfound, addOneTimeEventListener_resize, addOneTimeEventListener_resize, addOneTimeEventListener_tileerror, addOneTimeEventListener_tileerror, addOneTimeEventListener_zoomanim, addOneTimeEventListener_zoomanim, clearAllEventListeners, fire, fire, fire, fire, fireEvent, fireEvent, fireEvent, fireEvent, hasEventListeners, listens, listens, listens, listens, listens, listens, listens, listens, listens, listens, listens_dragend, listens_dragend, listens_dragend, listens_dragend, listens_locationerror, listens_locationerror, listens_locationerror, listens_locationerror, listens_locationfound, listens_locationfound, listens_locationfound, listens_locationfound, listens_resize, listens_resize, listens_resize, listens_resize, listens_tileerror, listens_tileerror, listens_tileerror, listens_tileerror, listens_zoomanim, listens_zoomanim, listens_zoomanim, listens_zoomanim, off, off, off, off, off, off, off, off, off, off, off_dragend, off_dragend, off_dragend, off_dragend, off_locationerror, off_locationerror, off_locationerror, off_locationerror, off_locationfound, off_locationfound, off_locationfound, off_locationfound, off_resize, off_resize, off_resize, off_resize, off_tileerror, off_tileerror, off_tileerror, off_tileerror, off_zoomanim, off_zoomanim, off_zoomanim, off_zoomanim, on, on, on, on, on, on_dragend, on_dragend, on_locationerror, on_locationerror, on_locationfound, on_locationfound, on_resize, on_resize, on_tileerror, on_tileerror, on_zoomanim, on_zoomanim, once, once, once, once, once, once_dragend, once_dragend, once_locationerror, once_locationerror, once_locationfound, once_locationfound, once_resize, once_resize, once_tileerror, once_tileerror, once_zoomanim, once_zoomanim, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener_dragend, removeEventListener_dragend, removeEventListener_dragend, removeEventListener_dragend, removeEventListener_locationerror, removeEventListener_locationerror, removeEventListener_locationerror, removeEventListener_locationerror, removeEventListener_locationfound, removeEventListener_locationfound, removeEventListener_locationfound, removeEventListener_locationfound, removeEventListener_resize, removeEventListener_resize, removeEventListener_resize, removeEventListener_resize, removeEventListener_tileerror, removeEventListener_tileerror, removeEventListener_tileerror, removeEventListener_tileerror, removeEventListener_zoomanim, removeEventListener_zoomanim, removeEventListener_zoomanim, removeEventListener_zoomanim, removeEventParent */ @js.native
    trait Geosearch_ extends GeosearchControl {
      
      /**
        * Alias for on(...)
        *
        * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
        */
      def addEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      /**
        * Alias for on(...)
        *
        * Adds a listener function (fn) to a particular event type of the object.
        * You can optionally specify the context of the listener (object the this
        * keyword will point to). You can also pass several space-separated types
        * (e.g. 'click dblclick').
        */
      // tslint:disable:unified-signatures
      def addEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
      ): this.type = js.native
      def addEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any
      ): this.type = js.native
      def addEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def addEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
      
      // tslint:enable:unified-signatures
      /**
        * Adds an event parent - an Evented that will receive propagated events
        */
      def addEventParent(obj: Evented): this.type = js.native
      
      /**
        * Alias for once(...)
        *
        * Behaves as on(...), except the listener will only get fired once and then removed.
        */
      def addOneTimeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      /**
        * Alias for once(...)
        *
        * Behaves as on(...), except the listener will only get fired once and then removed.
        */
      // tslint:disable:unified-signatures
      def addOneTimeEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
      ): this.type = js.native
      def addOneTimeEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any
      ): this.type = js.native
      def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
      
      // tslint:enable:unified-signatures
      /**
        * Alias for off()
        *
        * Removes all listeners to all events on the object.
        */
      def clearAllEventListeners(): this.type = js.native
      
      // tslint:enable:unified-signatures
      /**
        * Fires an event of the specified type. You can optionally provide a data
        * object — the first argument of the listener function will contain its properties.
        * The event might can optionally be propagated to event parents.
        */
      def fire(`type`: String): this.type = js.native
      def fire(`type`: String, data: Any): this.type = js.native
      def fire(`type`: String, data: Any, propagate: Boolean): this.type = js.native
      def fire(`type`: String, data: Unit, propagate: Boolean): this.type = js.native
      
      // tslint:enable:unified-signatures
      /**
        * Alias for fire(...)
        *
        * Fires an event of the specified type. You can optionally provide a data
        * object — the first argument of the listener function will contain its properties.
        * The event might can optionally be propagated to event parents.
        */
      def fireEvent(`type`: String): this.type = js.native
      def fireEvent(`type`: String, data: Any): this.type = js.native
      def fireEvent(`type`: String, data: Any, propagate: Boolean): this.type = js.native
      def fireEvent(`type`: String, data: Unit, propagate: Boolean): this.type = js.native
      
      /**
        * Alias for listens(...)
        *
        * Returns true if a particular event type has any listeners attached to it.
        */
      def hasEventListeners(`type`: String): Boolean = js.native
      
      /**
        * Returns true if a particular event type has any listeners attached to it.
        */
      // tslint:disable:unified-signatures
      def listens(
        `type`: baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror
      ): Boolean = js.native
      def listens(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
      ): Boolean = js.native
      def listens(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any
      ): Boolean = js.native
      def listens(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any,
        propagate: Boolean
      ): Boolean = js.native
      def listens(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Unit,
        propagate: Boolean
      ): Boolean = js.native
      def listens(
        `type`: baselayerchange | overlayadd | overlayremove | layeradd | layerremove | zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag | resize | popupopen | tooltipopen | tooltipclose | locationerror | locationfound | click | dblclick | mousedown | mouseup | mouseover | mouseout | mousemove | contextmenu | preclick | keypress | keydown | keyup | zoomanim | dragend | tileunload | tileloadstart | tileload | tileabort | tileerror,
        propagate: Boolean
      ): Boolean = js.native
      def listens(`type`: String, fn: LeafletEventHandlerFn): Boolean = js.native
      def listens(`type`: String, fn: LeafletEventHandlerFn, context: Any): Boolean = js.native
      def listens(`type`: String, fn: LeafletEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
      def listens(`type`: String, fn: LeafletEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn): Boolean = js.native
      @JSName("listens")
      def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): Boolean = js.native
      @JSName("listens")
      def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): Boolean = js.native
      @JSName("listens")
      def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): Boolean = js.native
      @JSName("listens")
      def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): Boolean = js.native
      @JSName("listens")
      def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): Boolean = js.native
      @JSName("listens")
      def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_resize(`type`: resize, fn: ResizeEventHandlerFn): Boolean = js.native
      @JSName("listens")
      def listens_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): Boolean = js.native
      @JSName("listens")
      def listens_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn): Boolean = js.native
      @JSName("listens")
      def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Any): Boolean = js.native
      @JSName("listens")
      def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): Boolean = js.native
      @JSName("listens")
      def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): Boolean = js.native
      @JSName("listens")
      def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any, propagate: Boolean): Boolean = js.native
      @JSName("listens")
      def listens_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Unit, propagate: Boolean): Boolean = js.native
      
      /**
        * Removes all listeners to all events on the object.
        */
      def off(): this.type = js.native
      /**
        * Removes a set of type/listener pairs.
        */
      // With an eventMap there are no additional arguments allowed
      def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      // tslint:enable:unified-signatures
      /**
        * Removes a previously added listener function. If no function is specified,
        * it will remove all the listeners of that particular event from the object.
        * Note that if you passed a custom context to on, you must pass the same context
        * to off in order to remove the listener.
        */
      // tslint:disable:unified-signatures
      def off(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart
      ): this.type = js.native
      def off(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
      ): this.type = js.native
      def off(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any
      ): this.type = js.native
      def off(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: Unit,
        context: Any
      ): this.type = js.native
      def off(`type`: String): this.type = js.native
      def off(`type`: String, fn: Unit, context: Any): this.type = js.native
      def off(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def off(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend, fn: Unit, context: Any): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror, fn: Unit, context: Any): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound, fn: Unit, context: Any): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize, fn: Unit, context: Any): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror, fn: Unit, context: Any): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim, fn: Unit, context: Any): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
      
      /**
        * Adds a set of type/listener pairs, e.g. {click: onClick, mousemove: onMouseMove}
        */
      def on(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      /**
        * Adds a listener function (fn) to a particular event type of the object.
        * You can optionally specify the context of the listener (object the this
        * keyword will point to). You can also pass several space-separated types
        * (e.g. 'click dblclick').
        */
      // tslint:disable:unified-signatures
      def on(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
      ): this.type = js.native
      def on(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any
      ): this.type = js.native
      def on(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def on(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
      @JSName("on")
      def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
      @JSName("on")
      def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("on")
      def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
      @JSName("on")
      def on_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
      @JSName("on")
      def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("on")
      def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
      
      /**
        * Behaves as on(...), except the listener will only get fired once and then removed.
        */
      def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      /**
        * Behaves as on(...), except the listener will only get fired once and then removed.
        */
      // tslint:disable:unified-signatures
      def once(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
      ): this.type = js.native
      def once(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any
      ): this.type = js.native
      def once(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def once(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
      @JSName("once")
      def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
      @JSName("once")
      def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("once")
      def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
      @JSName("once")
      def once_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
      @JSName("once")
      def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: Any): this.type = js.native
      @JSName("once")
      def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
      
      /**
        * Alias for off(...)
        *
        * Removes a set of type/listener pairs.
        */
      def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      // tslint:enable:unified-signatures
      /**
        * Alias for off(...)
        *
        * Removes a previously added listener function. If no function is specified,
        * it will remove all the listeners of that particular event from the object.
        * Note that if you passed a custom context to on, you must pass the same context
        * to off in order to remove the listener.
        */
      // tslint:disable:unified-signatures
      def removeEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart
      ): this.type = js.native
      def removeEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn
      ): this.type = js.native
      def removeEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: LayerEventHandlerFn | LayersControlEventHandlerFn | LeafletEventHandlerFn | LeafletKeyboardEventHandlerFn | LeafletMouseEventHandlerFn | PopupEventHandlerFn | TileEventHandlerFn | TooltipEventHandlerFn,
        context: Any
      ): this.type = js.native
      def removeEventListener(
        `type`: add | autopanstart | baselayerchange | click | contextmenu | dblclick | down | drag | dragstart | error | keydown | keypress | keyup | layeradd | layerremove | load | loading | mousedown | mousemove | mouseout | mouseover | mouseup | move | moveend | movestart | overlayadd | overlayremove | popupclose | popupopen | preclick | predrag | remove | tileabort | tileload | tileloadstart | tileunload | tooltipclose | tooltipopen | unload | update | viewreset | zoom | zoomend | zoomlevelschange | zoomstart,
        fn: Unit,
        context: Any
      ): this.type = js.native
      def removeEventListener(`type`: String): this.type = js.native
      def removeEventListener(`type`: String, fn: Unit, context: Any): this.type = js.native
      def removeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def removeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend, fn: Unit, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror, fn: Unit, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound, fn: Unit, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize, fn: Unit, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror, fn: Unit, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim, fn: Unit, context: Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: Any): this.type = js.native
      
      /**
        * Removes an event parent, so it will stop receiving propagated events
        */
      def removeEventParent(obj: Evented): this.type = js.native
    }
    
    @JSImport("leaflet", "esri.Geocoding.Geosearch")
    @js.native
    val Geosearch_ : GeosearchConstructor = js.native
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapService * / any */ @JSImport("leaflet", "esri.Geocoding.MapServiceProvider")
    @js.native
    open class MapServiceProvider_ ()
      extends StObject
         with GeosearchProvider {
      def this(options: MapServiceProviderOptions) = this()
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.ReverseGeocode")
    @js.native
    open class ReverseGeocode_ () extends StObject {
      def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ Any) = this()
      
      def distance(distance: Double): this.type = js.native
      
      def language(language: String): this.type = js.native
      
      def latlng(latlng: LatLngExpression): this.type = js.native
      
      def run(
        callback: js.Function3[/* error */ js.UndefOr[Any], /* results */ Address, /* response */ Any, Unit]
      ): this.type = js.native
      def run(
        callback: js.Function3[/* error */ js.UndefOr[Any], /* results */ Address, /* response */ Any, Unit],
        context: Any
      ): this.type = js.native
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.Suggest")
    @js.native
    open class Suggest_ () extends StObject {
      def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ Any) = this()
      
      def category(text: String): this.type = js.native
      
      def nearby(latlng: LatLngExpression, distance: Double): this.type = js.native
      
      def run(callback: js.Function3[/* error */ js.UndefOr[Any], /* results */ Any, /* response */ Any, Unit]): this.type = js.native
      def run(
        callback: js.Function3[/* error */ js.UndefOr[Any], /* results */ Any, /* response */ Any, Unit],
        context: Any
      ): this.type = js.native
      
      def text(text: String): this.type = js.native
      
      def within(bounds: LatLngBoundsExpression): this.type = js.native
    }
    
    inline def arcgisOnlineProvider(): ArcgisOnlineProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arcgisOnlineProvider")().asInstanceOf[ArcgisOnlineProvider_]
    inline def arcgisOnlineProvider(options: ArcgisOnlineProviderOptions): ArcgisOnlineProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arcgisOnlineProvider")(options.asInstanceOf[js.Any]).asInstanceOf[ArcgisOnlineProvider_]
    
    inline def featureLayerProvider(): FeatureLayerProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("featureLayerProvider")().asInstanceOf[FeatureLayerProvider_]
    inline def featureLayerProvider(options: FeatureLayerProviderOptions): FeatureLayerProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("featureLayerProvider")(options.asInstanceOf[js.Any]).asInstanceOf[FeatureLayerProvider_]
    
    inline def geocode(): Geocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")().asInstanceOf[Geocode_]
    inline def geocode(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ Any
    ): Geocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(options.asInstanceOf[js.Any]).asInstanceOf[Geocode_]
    
    inline def geocodeService(): GeocodeService_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeService")().asInstanceOf[GeocodeService_]
    inline def geocodeService(options: GeocodeServiceOptions): GeocodeService_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeService")(options.asInstanceOf[js.Any]).asInstanceOf[GeocodeService_]
    
    inline def geocodeServiceProvider(): GeocodeServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeServiceProvider")().asInstanceOf[GeocodeServiceProvider_]
    inline def geocodeServiceProvider(options: GeocodeServiceProviderOptions): GeocodeServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeServiceProvider")(options.asInstanceOf[js.Any]).asInstanceOf[GeocodeServiceProvider_]
    
    inline def geosearch(): typings.esriLeafletGeocoder.leafletMod.esri.Geocoding.Geosearch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geosearch")().asInstanceOf[typings.esriLeafletGeocoder.leafletMod.esri.Geocoding.Geosearch_]
    inline def geosearch(options: GeosearchObject): typings.esriLeafletGeocoder.leafletMod.esri.Geocoding.Geosearch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geosearch")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeafletGeocoder.leafletMod.esri.Geocoding.Geosearch_]
    
    inline def mapServiceProvider(): MapServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("mapServiceProvider")().asInstanceOf[MapServiceProvider_]
    inline def mapServiceProvider(options: MapServiceProviderOptions): MapServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("mapServiceProvider")(options.asInstanceOf[js.Any]).asInstanceOf[MapServiceProvider_]
    
    inline def reverseGeocode(): ReverseGeocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")().asInstanceOf[ReverseGeocode_]
    inline def reverseGeocode(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ Any
    ): ReverseGeocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(options.asInstanceOf[js.Any]).asInstanceOf[ReverseGeocode_]
    
    inline def suggest(): Suggest_ = ^.asInstanceOf[js.Dynamic].applyDynamic("suggest")().asInstanceOf[Suggest_]
    inline def suggest(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ Any
    ): Suggest_ = ^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(options.asInstanceOf[js.Any]).asInstanceOf[Suggest_]
    
    trait ArcgisOnlineProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var categories: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var countries: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var forStorage: js.UndefOr[Boolean] = js.undefined
    }
    object ArcgisOnlineProviderOptions {
      
      inline def apply(): ArcgisOnlineProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ArcgisOnlineProviderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ArcgisOnlineProviderOptions] (val x: Self) extends AnyVal {
        
        inline def setCategories(value: String | js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
        
        inline def setCountries(value: String | js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
        
        inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
        
        inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
        
        inline def setForStorage(value: Boolean): Self = StObject.set(x, "forStorage", value.asInstanceOf[js.Any])
        
        inline def setForStorageUndefined: Self = StObject.set(x, "forStorage", js.undefined)
      }
    }
    
    trait BaseProviderOptions extends StObject {
      
      var attribution: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var maxResults: js.UndefOr[Double] = js.undefined
      
      var token: js.UndefOr[String | Null] = js.undefined
    }
    object BaseProviderOptions {
      
      inline def apply(): BaseProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseProviderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BaseProviderOptions] (val x: Self) extends AnyVal {
        
        inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
        
        inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenNull: Self = StObject.set(x, "token", null)
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait FeatureLayerProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var bufferRadius: js.UndefOr[Double] = js.undefined
      
      var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ Any, String]] = js.undefined
      
      var searchFields: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var url: String
    }
    object FeatureLayerProviderOptions {
      
      inline def apply(url: String): FeatureLayerProviderOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[FeatureLayerProviderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FeatureLayerProviderOptions] (val x: Self) extends AnyVal {
        
        inline def setBufferRadius(value: Double): Self = StObject.set(x, "bufferRadius", value.asInstanceOf[js.Any])
        
        inline def setBufferRadiusUndefined: Self = StObject.set(x, "bufferRadius", js.undefined)
        
        inline def setFormatSuggestion(value: /* featureInformation */ Any => String): Self = StObject.set(x, "formatSuggestion", js.Any.fromFunction1(value))
        
        inline def setFormatSuggestionUndefined: Self = StObject.set(x, "formatSuggestion", js.undefined)
        
        inline def setSearchFields(value: String | js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
        
        inline def setSearchFieldsUndefined: Self = StObject.set(x, "searchFields", js.undefined)
        
        inline def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value*))
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceOptions * / any */ trait GeocodeServiceOptions extends StObject {
      
      var supportsSuggest: js.UndefOr[Boolean] = js.undefined
    }
    object GeocodeServiceOptions {
      
      inline def apply(): GeocodeServiceOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeocodeServiceOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GeocodeServiceOptions] (val x: Self) extends AnyVal {
        
        inline def setSupportsSuggest(value: Boolean): Self = StObject.set(x, "supportsSuggest", value.asInstanceOf[js.Any])
        
        inline def setSupportsSuggestUndefined: Self = StObject.set(x, "supportsSuggest", js.undefined)
      }
    }
    
    trait GeocodeServiceProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var url: String
    }
    object GeocodeServiceProviderOptions {
      
      inline def apply(url: String): GeocodeServiceProviderOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[GeocodeServiceProviderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GeocodeServiceProviderOptions] (val x: Self) extends AnyVal {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    type GeosearchCallback = js.Function2[/* error */ js.UndefOr[Any], /* results */ Any, Unit]
    
    type GeosearchConstructor = Instantiable1[
        /* options */ js.UndefOr[GeosearchObject], 
        typings.esriLeafletGeocoder.leafletMod.esri.Geocoding.Geosearch_
      ]
    
    @js.native
    trait GeosearchControl extends Control_ {
      
      def clear(): this.type = js.native
      
      def clearSuggestions(): this.type = js.native
      
      def disable(): this.type = js.native
      
      def enable(): this.type = js.native
    }
    
    trait GeosearchObject extends StObject {
      
      var allowMultipleResults: js.UndefOr[Boolean] = js.undefined
      
      var collapseAfterResult: js.UndefOr[Boolean] = js.undefined
      
      var expanded: js.UndefOr[Boolean] = js.undefined
      
      var placeholder: js.UndefOr[String] = js.undefined
      
      var position: js.UndefOr[ControlPosition] = js.undefined
      
      var providers: js.UndefOr[js.Array[GeosearchProvider]] = js.undefined
      
      var searchBounds: js.UndefOr[LatLngBoundsExpression | Null] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var useMapBounds: js.UndefOr[Boolean | Double] = js.undefined
      
      var zoomToResult: js.UndefOr[Boolean] = js.undefined
    }
    object GeosearchObject {
      
      inline def apply(): GeosearchObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeosearchObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GeosearchObject] (val x: Self) extends AnyVal {
        
        inline def setAllowMultipleResults(value: Boolean): Self = StObject.set(x, "allowMultipleResults", value.asInstanceOf[js.Any])
        
        inline def setAllowMultipleResultsUndefined: Self = StObject.set(x, "allowMultipleResults", js.undefined)
        
        inline def setCollapseAfterResult(value: Boolean): Self = StObject.set(x, "collapseAfterResult", value.asInstanceOf[js.Any])
        
        inline def setCollapseAfterResultUndefined: Self = StObject.set(x, "collapseAfterResult", js.undefined)
        
        inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
        
        inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setProviders(value: js.Array[GeosearchProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
        
        inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
        
        inline def setProvidersVarargs(value: GeosearchProvider*): Self = StObject.set(x, "providers", js.Array(value*))
        
        inline def setSearchBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "searchBounds", value.asInstanceOf[js.Any])
        
        inline def setSearchBoundsNull: Self = StObject.set(x, "searchBounds", null)
        
        inline def setSearchBoundsUndefined: Self = StObject.set(x, "searchBounds", js.undefined)
        
        inline def setSearchBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "searchBounds", js.Array(value*))
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUseMapBounds(value: Boolean | Double): Self = StObject.set(x, "useMapBounds", value.asInstanceOf[js.Any])
        
        inline def setUseMapBoundsUndefined: Self = StObject.set(x, "useMapBounds", js.undefined)
        
        inline def setZoomToResult(value: Boolean): Self = StObject.set(x, "zoomToResult", value.asInstanceOf[js.Any])
        
        inline def setZoomToResultUndefined: Self = StObject.set(x, "zoomToResult", js.undefined)
      }
    }
    
    @js.native
    trait GeosearchProvider extends StObject {
      
      def results(text: String, key: String, bounds: Null, callback: GeosearchCallback): Any = js.native
      def results(text: String, key: String, bounds: Unit, callback: GeosearchCallback): Any = js.native
      def results(text: String, key: String, bounds: LatLngBoundsExpression, callback: GeosearchCallback): Any = js.native
      
      def suggestions(text: String, bounds: Null, callback: GeosearchCallback): Any = js.native
      def suggestions(text: String, bounds: Unit, callback: GeosearchCallback): Any = js.native
      def suggestions(text: String, bounds: LatLngBoundsExpression, callback: GeosearchCallback): Any = js.native
    }
    
    trait MapServiceProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var bufferRadius: Double | js.Array[Double]
      
      def formatSuggestion(featureInformation: Any): String
      
      var layers: Double | js.Array[Double]
      
      var searchFields: String | js.Array[String]
      
      var url: String
    }
    object MapServiceProviderOptions {
      
      inline def apply(
        bufferRadius: Double | js.Array[Double],
        formatSuggestion: Any => String,
        layers: Double | js.Array[Double],
        searchFields: String | js.Array[String],
        url: String
      ): MapServiceProviderOptions = {
        val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = js.Any.fromFunction1(formatSuggestion), layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[MapServiceProviderOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MapServiceProviderOptions] (val x: Self) extends AnyVal {
        
        inline def setBufferRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "bufferRadius", value.asInstanceOf[js.Any])
        
        inline def setBufferRadiusVarargs(value: Double*): Self = StObject.set(x, "bufferRadius", js.Array(value*))
        
        inline def setFormatSuggestion(value: Any => String): Self = StObject.set(x, "formatSuggestion", js.Any.fromFunction1(value))
        
        inline def setLayers(value: Double | js.Array[Double]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
        
        inline def setLayersVarargs(value: Double*): Self = StObject.set(x, "layers", js.Array(value*))
        
        inline def setSearchFields(value: String | js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
        
        inline def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value*))
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait ResultObject
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
      
      var geojson: js.UndefOr[GeoJSON__[Any, GeometryObject]] = js.undefined
      
      var latlng: js.UndefOr[LatLngExpression] = js.undefined
      
      var properties: js.UndefOr[Any] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object ResultObject {
      
      inline def apply(): ResultObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResultObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ResultObject] (val x: Self) extends AnyVal {
        
        inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
        
        inline def setGeojson(value: GeoJSON__[Any, GeometryObject]): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
        
        inline def setGeojsonUndefined: Self = StObject.set(x, "geojson", js.undefined)
        
        inline def setLatlng(value: LatLngExpression): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
        
        inline def setLatlngUndefined: Self = StObject.set(x, "latlng", js.undefined)
        
        inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait Results extends StObject {
      
      var bounds: LatLngBoundsExpression
      
      var latlng: LatLngExpression
      
      var results: js.Array[ResultObject]
    }
    object Results {
      
      inline def apply(bounds: LatLngBoundsExpression, latlng: LatLngExpression, results: js.Array[ResultObject]): Results = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
        __obj.asInstanceOf[Results]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
        
        inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
        
        inline def setLatlng(value: LatLngExpression): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
        
        inline def setResults(value: js.Array[ResultObject]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setResultsVarargs(value: ResultObject*): Self = StObject.set(x, "results", js.Array(value*))
      }
    }
  }
}
