package typings.esriLeafletGeocoder.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.esriLeafletGeocoder.anon.Address
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
import typings.leaflet.mod.GeoJSON_
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
    class ArcgisOnlineProvider_ ()
      extends GeocodeService_
         with GeosearchProvider {
      def this(options: ArcgisOnlineProviderOptions) = this()
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeatureLayerService * / any */ @JSImport("leaflet", "esri.Geocoding.FeatureLayerProvider")
    @js.native
    class FeatureLayerProvider_ ()
      extends StObject
         with GeosearchProvider {
      def this(options: FeatureLayerProviderOptions) = this()
    }
    
    @JSImport("leaflet", "esri.Geocoding.GeocodeServiceProvider")
    @js.native
    class GeocodeServiceProvider_ ()
      extends GeocodeService_
         with GeosearchProvider {
      def this(options: GeocodeServiceProviderOptions) = this()
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service * / any */ @JSImport("leaflet", "esri.Geocoding.GeocodeService")
    @js.native
    class GeocodeService_ () extends StObject {
      def this(options: GeocodeServiceOptions) = this()
      
      def geocode(): Geocode_ = js.native
      
      def reverse(): ReverseGeocode_ = js.native
      
      def suggest(): Suggest_ = js.native
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.Geocode")
    @js.native
    class Geocode_ () extends StObject {
      def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
      
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
              /* error */ js.UndefOr[js.Any], 
              /* results */ typings.esriLeafletGeocoder.anon.Results, 
              /* response */ js.Any, 
              Unit
            ]
      ): this.type = js.native
      def run(
        callback: js.Function3[
              /* error */ js.UndefOr[js.Any], 
              /* results */ typings.esriLeafletGeocoder.anon.Results, 
              /* response */ js.Any, 
              Unit
            ],
        context: js.Any
      ): this.type = js.native
      
      def subregion(text: String): this.type = js.native
      
      def text(text: String): this.type = js.native
      
      def within(bounds: LatLngBoundsExpression): this.type = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("leaflet", "esri.Geocoding.Geosearch")
    @js.native
    class GeosearchCls ()
      extends typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_ {
      def this(options: GeosearchObject) = this()
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.leaflet.mod.Class because Already inherited
    - typings.leaflet.mod.Evented because Inheritance from two classes. Inlined addEventListener, addEventListener, addEventListener, addEventListener_add, addEventListener_add, addEventListener_autopanstart, addEventListener_autopanstart, addEventListener_baselayerchange, addEventListener_baselayerchange, addEventListener_click, addEventListener_click, addEventListener_contextmenu, addEventListener_contextmenu, addEventListener_dblclick, addEventListener_dblclick, addEventListener_down, addEventListener_down, addEventListener_drag, addEventListener_drag, addEventListener_dragend, addEventListener_dragend, addEventListener_dragstart, addEventListener_dragstart, addEventListener_error, addEventListener_error, addEventListener_keydown, addEventListener_keydown, addEventListener_keypress, addEventListener_keypress, addEventListener_keyup, addEventListener_keyup, addEventListener_layeradd, addEventListener_layeradd, addEventListener_layerremove, addEventListener_layerremove, addEventListener_load, addEventListener_load, addEventListener_loading, addEventListener_loading, addEventListener_locationerror, addEventListener_locationerror, addEventListener_locationfound, addEventListener_locationfound, addEventListener_mousedown, addEventListener_mousedown, addEventListener_mousemove, addEventListener_mousemove, addEventListener_mouseout, addEventListener_mouseout, addEventListener_mouseover, addEventListener_mouseover, addEventListener_mouseup, addEventListener_mouseup, addEventListener_move, addEventListener_move, addEventListener_moveend, addEventListener_moveend, addEventListener_movestart, addEventListener_movestart, addEventListener_overlayadd, addEventListener_overlayadd, addEventListener_overlayremove, addEventListener_overlayremove, addEventListener_popupclose, addEventListener_popupclose, addEventListener_popupopen, addEventListener_popupopen, addEventListener_preclick, addEventListener_preclick, addEventListener_predrag, addEventListener_predrag, addEventListener_remove, addEventListener_remove, addEventListener_resize, addEventListener_resize, addEventListener_tileerror, addEventListener_tileerror, addEventListener_tileload, addEventListener_tileload, addEventListener_tileloadstart, addEventListener_tileloadstart, addEventListener_tileunload, addEventListener_tileunload, addEventListener_tooltipclose, addEventListener_tooltipclose, addEventListener_tooltipopen, addEventListener_tooltipopen, addEventListener_unload, addEventListener_unload, addEventListener_update, addEventListener_update, addEventListener_viewreset, addEventListener_viewreset, addEventListener_zoom, addEventListener_zoom, addEventListener_zoomanim, addEventListener_zoomanim, addEventListener_zoomend, addEventListener_zoomend, addEventListener_zoomlevelschange, addEventListener_zoomlevelschange, addEventListener_zoomstart, addEventListener_zoomstart, addEventParent, addOneTimeEventListener, addOneTimeEventListener, addOneTimeEventListener, addOneTimeEventListener_add, addOneTimeEventListener_add, addOneTimeEventListener_autopanstart, addOneTimeEventListener_autopanstart, addOneTimeEventListener_baselayerchange, addOneTimeEventListener_baselayerchange, addOneTimeEventListener_click, addOneTimeEventListener_click, addOneTimeEventListener_contextmenu, addOneTimeEventListener_contextmenu, addOneTimeEventListener_dblclick, addOneTimeEventListener_dblclick, addOneTimeEventListener_down, addOneTimeEventListener_down, addOneTimeEventListener_drag, addOneTimeEventListener_drag, addOneTimeEventListener_dragend, addOneTimeEventListener_dragend, addOneTimeEventListener_dragstart, addOneTimeEventListener_dragstart, addOneTimeEventListener_error, addOneTimeEventListener_error, addOneTimeEventListener_keydown, addOneTimeEventListener_keydown, addOneTimeEventListener_keypress, addOneTimeEventListener_keypress, addOneTimeEventListener_keyup, addOneTimeEventListener_keyup, addOneTimeEventListener_layeradd, addOneTimeEventListener_layeradd, addOneTimeEventListener_layerremove, addOneTimeEventListener_layerremove, addOneTimeEventListener_load, addOneTimeEventListener_load, addOneTimeEventListener_loading, addOneTimeEventListener_loading, addOneTimeEventListener_locationerror, addOneTimeEventListener_locationerror, addOneTimeEventListener_locationfound, addOneTimeEventListener_locationfound, addOneTimeEventListener_mousedown, addOneTimeEventListener_mousedown, addOneTimeEventListener_mousemove, addOneTimeEventListener_mousemove, addOneTimeEventListener_mouseout, addOneTimeEventListener_mouseout, addOneTimeEventListener_mouseover, addOneTimeEventListener_mouseover, addOneTimeEventListener_mouseup, addOneTimeEventListener_mouseup, addOneTimeEventListener_move, addOneTimeEventListener_move, addOneTimeEventListener_moveend, addOneTimeEventListener_moveend, addOneTimeEventListener_movestart, addOneTimeEventListener_movestart, addOneTimeEventListener_overlayadd, addOneTimeEventListener_overlayadd, addOneTimeEventListener_overlayremove, addOneTimeEventListener_overlayremove, addOneTimeEventListener_popupclose, addOneTimeEventListener_popupclose, addOneTimeEventListener_popupopen, addOneTimeEventListener_popupopen, addOneTimeEventListener_preclick, addOneTimeEventListener_preclick, addOneTimeEventListener_predrag, addOneTimeEventListener_predrag, addOneTimeEventListener_remove, addOneTimeEventListener_remove, addOneTimeEventListener_resize, addOneTimeEventListener_resize, addOneTimeEventListener_tileerror, addOneTimeEventListener_tileerror, addOneTimeEventListener_tileload, addOneTimeEventListener_tileload, addOneTimeEventListener_tileloadstart, addOneTimeEventListener_tileloadstart, addOneTimeEventListener_tileunload, addOneTimeEventListener_tileunload, addOneTimeEventListener_tooltipclose, addOneTimeEventListener_tooltipclose, addOneTimeEventListener_tooltipopen, addOneTimeEventListener_tooltipopen, addOneTimeEventListener_unload, addOneTimeEventListener_unload, addOneTimeEventListener_update, addOneTimeEventListener_update, addOneTimeEventListener_viewreset, addOneTimeEventListener_viewreset, addOneTimeEventListener_zoom, addOneTimeEventListener_zoom, addOneTimeEventListener_zoomanim, addOneTimeEventListener_zoomanim, addOneTimeEventListener_zoomend, addOneTimeEventListener_zoomend, addOneTimeEventListener_zoomlevelschange, addOneTimeEventListener_zoomlevelschange, addOneTimeEventListener_zoomstart, addOneTimeEventListener_zoomstart, clearAllEventListeners, fire, fire, fire, fire, fireEvent, fireEvent, fireEvent, fireEvent, hasEventListeners, listens, off, off, off, off, off, off, off, off_baselayerchange, off_baselayerchange, off_baselayerchange, off_baselayerchange, off_click, off_click, off_click, off_click, off_contextmenu, off_contextmenu, off_contextmenu, off_contextmenu, off_dblclick, off_dblclick, off_dblclick, off_dblclick, off_dragend, off_dragend, off_dragend, off_dragend, off_keydown, off_keydown, off_keydown, off_keydown, off_keypress, off_keypress, off_keypress, off_keypress, off_keyup, off_keyup, off_keyup, off_keyup, off_layeradd, off_layeradd, off_layeradd, off_layeradd, off_layerremove, off_layerremove, off_layerremove, off_layerremove, off_locationerror, off_locationerror, off_locationerror, off_locationerror, off_locationfound, off_locationfound, off_locationfound, off_locationfound, off_mousedown, off_mousedown, off_mousedown, off_mousedown, off_mousemove, off_mousemove, off_mousemove, off_mousemove, off_mouseout, off_mouseout, off_mouseout, off_mouseout, off_mouseover, off_mouseover, off_mouseover, off_mouseover, off_mouseup, off_mouseup, off_mouseup, off_mouseup, off_overlayadd, off_overlayadd, off_overlayadd, off_overlayadd, off_overlayremove, off_overlayremove, off_overlayremove, off_overlayremove, off_popupclose, off_popupclose, off_popupclose, off_popupclose, off_popupopen, off_popupopen, off_popupopen, off_popupopen, off_preclick, off_preclick, off_preclick, off_preclick, off_resize, off_resize, off_resize, off_resize, off_tileerror, off_tileerror, off_tileerror, off_tileerror, off_tileload, off_tileload, off_tileload, off_tileload, off_tileloadstart, off_tileloadstart, off_tileloadstart, off_tileloadstart, off_tileunload, off_tileunload, off_tileunload, off_tileunload, off_tooltipclose, off_tooltipclose, off_tooltipclose, off_tooltipclose, off_tooltipopen, off_tooltipopen, off_tooltipopen, off_tooltipopen, off_zoomanim, off_zoomanim, off_zoomanim, off_zoomanim, on, on, on, on_add, on_add, on_autopanstart, on_autopanstart, on_baselayerchange, on_baselayerchange, on_click, on_click, on_contextmenu, on_contextmenu, on_dblclick, on_dblclick, on_down, on_down, on_drag, on_drag, on_dragend, on_dragend, on_dragstart, on_dragstart, on_error, on_error, on_keydown, on_keydown, on_keypress, on_keypress, on_keyup, on_keyup, on_layeradd, on_layeradd, on_layerremove, on_layerremove, on_load, on_load, on_loading, on_loading, on_locationerror, on_locationerror, on_locationfound, on_locationfound, on_mousedown, on_mousedown, on_mousemove, on_mousemove, on_mouseout, on_mouseout, on_mouseover, on_mouseover, on_mouseup, on_mouseup, on_move, on_move, on_moveend, on_moveend, on_movestart, on_movestart, on_overlayadd, on_overlayadd, on_overlayremove, on_overlayremove, on_popupclose, on_popupclose, on_popupopen, on_popupopen, on_preclick, on_preclick, on_predrag, on_predrag, on_remove, on_remove, on_resize, on_resize, on_tileerror, on_tileerror, on_tileload, on_tileload, on_tileloadstart, on_tileloadstart, on_tileunload, on_tileunload, on_tooltipclose, on_tooltipclose, on_tooltipopen, on_tooltipopen, on_unload, on_unload, on_update, on_update, on_viewreset, on_viewreset, on_zoom, on_zoom, on_zoomanim, on_zoomanim, on_zoomend, on_zoomend, on_zoomlevelschange, on_zoomlevelschange, on_zoomstart, on_zoomstart, once, once, once, once_add, once_add, once_autopanstart, once_autopanstart, once_baselayerchange, once_baselayerchange, once_click, once_click, once_contextmenu, once_contextmenu, once_dblclick, once_dblclick, once_down, once_down, once_drag, once_drag, once_dragend, once_dragend, once_dragstart, once_dragstart, once_error, once_error, once_keydown, once_keydown, once_keypress, once_keypress, once_keyup, once_keyup, once_layeradd, once_layeradd, once_layerremove, once_layerremove, once_load, once_load, once_loading, once_loading, once_locationerror, once_locationerror, once_locationfound, once_locationfound, once_mousedown, once_mousedown, once_mousemove, once_mousemove, once_mouseout, once_mouseout, once_mouseover, once_mouseover, once_mouseup, once_mouseup, once_move, once_move, once_moveend, once_moveend, once_movestart, once_movestart, once_overlayadd, once_overlayadd, once_overlayremove, once_overlayremove, once_popupclose, once_popupclose, once_popupopen, once_popupopen, once_preclick, once_preclick, once_predrag, once_predrag, once_remove, once_remove, once_resize, once_resize, once_tileerror, once_tileerror, once_tileload, once_tileload, once_tileloadstart, once_tileloadstart, once_tileunload, once_tileunload, once_tooltipclose, once_tooltipclose, once_tooltipopen, once_tooltipopen, once_unload, once_unload, once_update, once_update, once_viewreset, once_viewreset, once_zoom, once_zoom, once_zoomanim, once_zoomanim, once_zoomend, once_zoomend, once_zoomlevelschange, once_zoomlevelschange, once_zoomstart, once_zoomstart, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener, removeEventListener_baselayerchange, removeEventListener_baselayerchange, removeEventListener_baselayerchange, removeEventListener_baselayerchange, removeEventListener_click, removeEventListener_click, removeEventListener_click, removeEventListener_click, removeEventListener_contextmenu, removeEventListener_contextmenu, removeEventListener_contextmenu, removeEventListener_contextmenu, removeEventListener_dblclick, removeEventListener_dblclick, removeEventListener_dblclick, removeEventListener_dblclick, removeEventListener_dragend, removeEventListener_dragend, removeEventListener_dragend, removeEventListener_dragend, removeEventListener_keydown, removeEventListener_keydown, removeEventListener_keydown, removeEventListener_keydown, removeEventListener_keypress, removeEventListener_keypress, removeEventListener_keypress, removeEventListener_keypress, removeEventListener_keyup, removeEventListener_keyup, removeEventListener_keyup, removeEventListener_keyup, removeEventListener_layeradd, removeEventListener_layeradd, removeEventListener_layeradd, removeEventListener_layeradd, removeEventListener_layerremove, removeEventListener_layerremove, removeEventListener_layerremove, removeEventListener_layerremove, removeEventListener_locationerror, removeEventListener_locationerror, removeEventListener_locationerror, removeEventListener_locationerror, removeEventListener_locationfound, removeEventListener_locationfound, removeEventListener_locationfound, removeEventListener_locationfound, removeEventListener_mousedown, removeEventListener_mousedown, removeEventListener_mousedown, removeEventListener_mousedown, removeEventListener_mousemove, removeEventListener_mousemove, removeEventListener_mousemove, removeEventListener_mousemove, removeEventListener_mouseout, removeEventListener_mouseout, removeEventListener_mouseout, removeEventListener_mouseout, removeEventListener_mouseover, removeEventListener_mouseover, removeEventListener_mouseover, removeEventListener_mouseover, removeEventListener_mouseup, removeEventListener_mouseup, removeEventListener_mouseup, removeEventListener_mouseup, removeEventListener_overlayadd, removeEventListener_overlayadd, removeEventListener_overlayadd, removeEventListener_overlayadd, removeEventListener_overlayremove, removeEventListener_overlayremove, removeEventListener_overlayremove, removeEventListener_overlayremove, removeEventListener_popupclose, removeEventListener_popupclose, removeEventListener_popupclose, removeEventListener_popupclose, removeEventListener_popupopen, removeEventListener_popupopen, removeEventListener_popupopen, removeEventListener_popupopen, removeEventListener_preclick, removeEventListener_preclick, removeEventListener_preclick, removeEventListener_preclick, removeEventListener_resize, removeEventListener_resize, removeEventListener_resize, removeEventListener_resize, removeEventListener_tileerror, removeEventListener_tileerror, removeEventListener_tileerror, removeEventListener_tileerror, removeEventListener_tileload, removeEventListener_tileload, removeEventListener_tileload, removeEventListener_tileload, removeEventListener_tileloadstart, removeEventListener_tileloadstart, removeEventListener_tileloadstart, removeEventListener_tileloadstart, removeEventListener_tileunload, removeEventListener_tileunload, removeEventListener_tileunload, removeEventListener_tileunload, removeEventListener_tooltipclose, removeEventListener_tooltipclose, removeEventListener_tooltipclose, removeEventListener_tooltipclose, removeEventListener_tooltipopen, removeEventListener_tooltipopen, removeEventListener_tooltipopen, removeEventListener_tooltipopen, removeEventListener_zoomanim, removeEventListener_zoomanim, removeEventListener_zoomanim, removeEventListener_zoomanim, removeEventParent */ @js.native
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
      def addEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def addEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addEventListener")
      def addEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      
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
      def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def addOneTimeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("addOneTimeEventListener")
      def addOneTimeEventListener_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      
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
      def fire(`type`: String, data: js.Any): this.type = js.native
      def fire(`type`: String, data: js.Any, propagate: Boolean): this.type = js.native
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
      def fireEvent(`type`: String, data: js.Any): this.type = js.native
      def fireEvent(`type`: String, data: js.Any, propagate: Boolean): this.type = js.native
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
      def listens(`type`: String): Boolean = js.native
      
      /**
        * Removes all listeners to all events on the object.
        */
      def off(): this.type = js.native
      /**
        * Removes a set of type/listener pairs.
        */
      // With an eventMap there are no additional arguments allowed
      def off(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      def off(
        `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
        fn: js.UndefOr[LeafletEventHandlerFn],
        context: js.UndefOr[js.Any]
      ): this.type = js.native
      // tslint:enable:unified-signatures
      /**
        * Removes a previously added listener function. If no function is specified,
        * it will remove all the listeners of that particular event from the object.
        * Note that if you passed a custom context to on, you must pass the same context
        * to off in order to remove the listener.
        */
      // tslint:disable:unified-signatures
      def off(`type`: String): this.type = js.native
      def off(`type`: String, fn: Unit, context: js.Any): this.type = js.native
      def off(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def off(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_baselayerchange(`type`: baselayerchange): this.type = js.native
      @JSName("off")
      def off_baselayerchange(`type`: baselayerchange, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_click(`type`: click): this.type = js.native
      @JSName("off")
      def off_click(`type`: click, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_contextmenu(`type`: contextmenu): this.type = js.native
      @JSName("off")
      def off_contextmenu(`type`: contextmenu, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_dblclick(`type`: dblclick): this.type = js.native
      @JSName("off")
      def off_dblclick(`type`: dblclick, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_keydown(`type`: keydown): this.type = js.native
      @JSName("off")
      def off_keydown(`type`: keydown, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_keypress(`type`: keypress): this.type = js.native
      @JSName("off")
      def off_keypress(`type`: keypress, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_keyup(`type`: keyup): this.type = js.native
      @JSName("off")
      def off_keyup(`type`: keyup, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_layeradd(`type`: layeradd): this.type = js.native
      @JSName("off")
      def off_layeradd(`type`: layeradd, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_layerremove(`type`: layerremove): this.type = js.native
      @JSName("off")
      def off_layerremove(`type`: layerremove, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mousedown(`type`: mousedown): this.type = js.native
      @JSName("off")
      def off_mousedown(`type`: mousedown, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mousemove(`type`: mousemove): this.type = js.native
      @JSName("off")
      def off_mousemove(`type`: mousemove, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mouseout(`type`: mouseout): this.type = js.native
      @JSName("off")
      def off_mouseout(`type`: mouseout, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mouseover(`type`: mouseover): this.type = js.native
      @JSName("off")
      def off_mouseover(`type`: mouseover, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mouseup(`type`: mouseup): this.type = js.native
      @JSName("off")
      def off_mouseup(`type`: mouseup, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_overlayadd(`type`: overlayadd): this.type = js.native
      @JSName("off")
      def off_overlayadd(`type`: overlayadd, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_overlayremove(`type`: overlayremove): this.type = js.native
      @JSName("off")
      def off_overlayremove(`type`: overlayremove, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_popupclose(`type`: popupclose): this.type = js.native
      @JSName("off")
      def off_popupclose(`type`: popupclose, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_popupopen(`type`: popupopen): this.type = js.native
      @JSName("off")
      def off_popupopen(`type`: popupopen, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_preclick(`type`: preclick): this.type = js.native
      @JSName("off")
      def off_preclick(`type`: preclick, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileload(`type`: tileload): this.type = js.native
      @JSName("off")
      def off_tileload(`type`: tileload, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileloadstart(`type`: tileloadstart): this.type = js.native
      @JSName("off")
      def off_tileloadstart(`type`: tileloadstart, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileunload(`type`: tileunload): this.type = js.native
      @JSName("off")
      def off_tileunload(`type`: tileunload, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tooltipclose(`type`: tooltipclose): this.type = js.native
      @JSName("off")
      def off_tooltipclose(`type`: tooltipclose, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tooltipopen(`type`: tooltipopen): this.type = js.native
      @JSName("off")
      def off_tooltipopen(`type`: tooltipopen, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim, fn: Unit, context: js.Any): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("off")
      def off_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
      
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
      def on(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def on(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("on")
      def on_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("on")
      def on_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      
      /**
        * Behaves as on(...), except the listener will only get fired once and then removed.
        */
      def once(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      /**
        * Behaves as on(...), except the listener will only get fired once and then removed.
        */
      // tslint:disable:unified-signatures
      def once(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def once(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_add(`type`: add, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_add(`type`: add, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_autopanstart(`type`: autopanstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_down(`type`: down, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_down(`type`: down, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_drag(`type`: drag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_drag(`type`: drag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_dragstart(`type`: dragstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_error(`type`: error, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_error(`type`: error, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_load(`type`: load, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_load(`type`: load, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_loading(`type`: loading, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_loading(`type`: loading, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_move(`type`: move, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_move(`type`: move, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_moveend(`type`: moveend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_moveend(`type`: moveend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_movestart(`type`: movestart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_movestart(`type`: movestart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_predrag(`type`: predrag, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_predrag(`type`: predrag, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_remove(`type`: remove, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_remove(`type`: remove, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_tileerror(`type`: tileerror, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_unload(`type`: unload, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_unload(`type`: unload, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_update(`type`: update, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_update(`type`: update, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_viewreset(`type`: viewreset, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_zoom(`type`: zoom, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_zoom(`type`: zoom, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_zoomend(`type`: zoomend, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_zoomlevelschange(`type`: zoomlevelschange, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("once")
      def once_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn): this.type = js.native
      @JSName("once")
      def once_zoomstart(`type`: zoomstart, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      
      /**
        * Alias for off(...)
        *
        * Removes a set of type/listener pairs.
        */
      def removeEventListener(eventMap: LeafletEventHandlerFnMap): this.type = js.native
      def removeEventListener(
        `type`: zoomlevelschange | unload | viewreset | load | zoomstart | movestart | zoom | move | zoomend | moveend | autopanstart | dragstart | drag | add | remove | loading | error | update | down | predrag,
        fn: js.UndefOr[LeafletEventHandlerFn],
        context: js.UndefOr[js.Any]
      ): this.type = js.native
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
      def removeEventListener(`type`: String): this.type = js.native
      def removeEventListener(`type`: String, fn: Unit, context: js.Any): this.type = js.native
      def removeEventListener(`type`: String, fn: LeafletEventHandlerFn): this.type = js.native
      def removeEventListener(`type`: String, fn: LeafletEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_baselayerchange(`type`: baselayerchange): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_baselayerchange(`type`: baselayerchange, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_baselayerchange(`type`: baselayerchange, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_click(`type`: click): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_click(`type`: click, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_click(`type`: click, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_contextmenu(`type`: contextmenu): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_contextmenu(`type`: contextmenu, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_contextmenu(`type`: contextmenu, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dblclick(`type`: dblclick): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dblclick(`type`: dblclick, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dblclick(`type`: dblclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_dragend(`type`: dragend, fn: DragEndEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keydown(`type`: keydown): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keydown(`type`: keydown, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keydown(`type`: keydown, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keypress(`type`: keypress): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keypress(`type`: keypress, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keypress(`type`: keypress, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keyup(`type`: keyup): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keyup(`type`: keyup, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_keyup(`type`: keyup, fn: LeafletKeyboardEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layeradd(`type`: layeradd): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layeradd(`type`: layeradd, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layeradd(`type`: layeradd, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layerremove(`type`: layerremove): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layerremove(`type`: layerremove, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_layerremove(`type`: layerremove, fn: LayerEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationerror(`type`: locationerror, fn: ErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_locationfound(`type`: locationfound, fn: LocationEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousedown(`type`: mousedown): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousedown(`type`: mousedown, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousedown(`type`: mousedown, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousemove(`type`: mousemove): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousemove(`type`: mousemove, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mousemove(`type`: mousemove, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseout(`type`: mouseout): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseout(`type`: mouseout, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseout(`type`: mouseout, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseover(`type`: mouseover): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseover(`type`: mouseover, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseover(`type`: mouseover, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseup(`type`: mouseup): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseup(`type`: mouseup, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_mouseup(`type`: mouseup, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayadd(`type`: overlayadd): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayadd(`type`: overlayadd, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayadd(`type`: overlayadd, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayremove(`type`: overlayremove): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayremove(`type`: overlayremove, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_overlayremove(`type`: overlayremove, fn: LayersControlEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupclose(`type`: popupclose): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupclose(`type`: popupclose, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupclose(`type`: popupclose, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupopen(`type`: popupopen): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupopen(`type`: popupopen, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_popupopen(`type`: popupopen, fn: PopupEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_preclick(`type`: preclick): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_preclick(`type`: preclick, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_preclick(`type`: preclick, fn: LeafletMouseEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_resize(`type`: resize, fn: ResizeEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileerror(`type`: tileerror, fn: TileErrorEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileload(`type`: tileload): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileload(`type`: tileload, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileload(`type`: tileload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileloadstart(`type`: tileloadstart): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileloadstart(`type`: tileloadstart, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileloadstart(`type`: tileloadstart, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileunload(`type`: tileunload): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileunload(`type`: tileunload, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tileunload(`type`: tileunload, fn: TileEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipclose(`type`: tooltipclose): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipclose(`type`: tooltipclose, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipclose(`type`: tooltipclose, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipopen(`type`: tooltipopen): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipopen(`type`: tooltipopen, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_tooltipopen(`type`: tooltipopen, fn: TooltipEventHandlerFn, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim, fn: Unit, context: js.Any): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn): this.type = js.native
      @JSName("removeEventListener")
      def removeEventListener_zoomanim(`type`: zoomanim, fn: ZoomAnimEventHandlerFn, context: js.Any): this.type = js.native
      
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
    class MapServiceProvider_ ()
      extends StObject
         with GeosearchProvider {
      def this(options: MapServiceProviderOptions) = this()
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.ReverseGeocode")
    @js.native
    class ReverseGeocode_ () extends StObject {
      def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
      
      def distance(distance: Double): this.type = js.native
      
      def language(language: String): this.type = js.native
      
      def latlng(latlng: LatLngExpression): this.type = js.native
      
      def run(
        callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ Address, /* response */ js.Any, Unit]
      ): this.type = js.native
      def run(
        callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ Address, /* response */ js.Any, Unit],
        context: js.Any
      ): this.type = js.native
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.Suggest")
    @js.native
    class Suggest_ () extends StObject {
      def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
      
      def category(text: String): this.type = js.native
      
      def nearby(latlng: LatLngExpression, distance: Double): this.type = js.native
      
      def run(
        callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ js.Any, /* response */ js.Any, Unit]
      ): this.type = js.native
      def run(
        callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ js.Any, /* response */ js.Any, Unit],
        context: js.Any
      ): this.type = js.native
      
      def text(text: String): this.type = js.native
      
      def within(bounds: LatLngBoundsExpression): this.type = js.native
    }
    
    @scala.inline
    def arcgisOnlineProvider(): ArcgisOnlineProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arcgisOnlineProvider")().asInstanceOf[ArcgisOnlineProvider_]
    @scala.inline
    def arcgisOnlineProvider(options: ArcgisOnlineProviderOptions): ArcgisOnlineProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("arcgisOnlineProvider")(options.asInstanceOf[js.Any]).asInstanceOf[ArcgisOnlineProvider_]
    
    @scala.inline
    def featureLayerProvider(): FeatureLayerProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("featureLayerProvider")().asInstanceOf[FeatureLayerProvider_]
    @scala.inline
    def featureLayerProvider(options: FeatureLayerProviderOptions): FeatureLayerProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("featureLayerProvider")(options.asInstanceOf[js.Any]).asInstanceOf[FeatureLayerProvider_]
    
    @scala.inline
    def geocode(): Geocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")().asInstanceOf[Geocode_]
    @scala.inline
    def geocode(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ js.Any
    ): Geocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(options.asInstanceOf[js.Any]).asInstanceOf[Geocode_]
    
    @scala.inline
    def geocodeService(): GeocodeService_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeService")().asInstanceOf[GeocodeService_]
    @scala.inline
    def geocodeService(options: GeocodeServiceOptions): GeocodeService_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeService")(options.asInstanceOf[js.Any]).asInstanceOf[GeocodeService_]
    
    @scala.inline
    def geocodeServiceProvider(): GeocodeServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeServiceProvider")().asInstanceOf[GeocodeServiceProvider_]
    @scala.inline
    def geocodeServiceProvider(options: GeocodeServiceProviderOptions): GeocodeServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeServiceProvider")(options.asInstanceOf[js.Any]).asInstanceOf[GeocodeServiceProvider_]
    
    @scala.inline
    def geosearch(): typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geosearch")().asInstanceOf[typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_]
    @scala.inline
    def geosearch(options: GeosearchObject): typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geosearch")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_]
    
    @scala.inline
    def mapServiceProvider(): MapServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("mapServiceProvider")().asInstanceOf[MapServiceProvider_]
    @scala.inline
    def mapServiceProvider(options: MapServiceProviderOptions): MapServiceProvider_ = ^.asInstanceOf[js.Dynamic].applyDynamic("mapServiceProvider")(options.asInstanceOf[js.Any]).asInstanceOf[MapServiceProvider_]
    
    @scala.inline
    def reverseGeocode(): ReverseGeocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")().asInstanceOf[ReverseGeocode_]
    @scala.inline
    def reverseGeocode(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ js.Any
    ): ReverseGeocode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(options.asInstanceOf[js.Any]).asInstanceOf[ReverseGeocode_]
    
    @scala.inline
    def suggest(): Suggest_ = ^.asInstanceOf[js.Dynamic].applyDynamic("suggest")().asInstanceOf[Suggest_]
    @scala.inline
    def suggest(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service */ js.Any
    ): Suggest_ = ^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(options.asInstanceOf[js.Any]).asInstanceOf[Suggest_]
    
    trait ArcgisOnlineProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var categories: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var countries: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var forStorage: js.UndefOr[Boolean] = js.undefined
    }
    object ArcgisOnlineProviderOptions {
      
      @scala.inline
      def apply(): ArcgisOnlineProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ArcgisOnlineProviderOptions]
      }
      
      @scala.inline
      implicit class ArcgisOnlineProviderOptionsMutableBuilder[Self <: ArcgisOnlineProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCategories(value: String | js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        @scala.inline
        def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
        
        @scala.inline
        def setCountries(value: String | js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
        
        @scala.inline
        def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
        
        @scala.inline
        def setForStorage(value: Boolean): Self = StObject.set(x, "forStorage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForStorageUndefined: Self = StObject.set(x, "forStorage", js.undefined)
      }
    }
    
    trait BaseProviderOptions extends StObject {
      
      var attribution: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var maxResults: js.UndefOr[Double] = js.undefined
      
      var token: js.UndefOr[String | Null] = js.undefined
    }
    object BaseProviderOptions {
      
      @scala.inline
      def apply(): BaseProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseProviderOptions]
      }
      
      @scala.inline
      implicit class BaseProviderOptionsMutableBuilder[Self <: BaseProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenNull: Self = StObject.set(x, "token", null)
        
        @scala.inline
        def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    trait FeatureLayerProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var bufferRadius: js.UndefOr[Double] = js.undefined
      
      var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ js.Any, String]] = js.undefined
      
      var searchFields: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var url: String
    }
    object FeatureLayerProviderOptions {
      
      @scala.inline
      def apply(url: String): FeatureLayerProviderOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[FeatureLayerProviderOptions]
      }
      
      @scala.inline
      implicit class FeatureLayerProviderOptionsMutableBuilder[Self <: FeatureLayerProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBufferRadius(value: Double): Self = StObject.set(x, "bufferRadius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBufferRadiusUndefined: Self = StObject.set(x, "bufferRadius", js.undefined)
        
        @scala.inline
        def setFormatSuggestion(value: /* featureInformation */ js.Any => String): Self = StObject.set(x, "formatSuggestion", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFormatSuggestionUndefined: Self = StObject.set(x, "formatSuggestion", js.undefined)
        
        @scala.inline
        def setSearchFields(value: String | js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchFieldsUndefined: Self = StObject.set(x, "searchFields", js.undefined)
        
        @scala.inline
        def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceOptions * / any */ trait GeocodeServiceOptions extends StObject {
      
      var supportsSuggest: js.UndefOr[Boolean] = js.undefined
    }
    object GeocodeServiceOptions {
      
      @scala.inline
      def apply(): GeocodeServiceOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeocodeServiceOptions]
      }
      
      @scala.inline
      implicit class GeocodeServiceOptionsMutableBuilder[Self <: GeocodeServiceOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSupportsSuggest(value: Boolean): Self = StObject.set(x, "supportsSuggest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSupportsSuggestUndefined: Self = StObject.set(x, "supportsSuggest", js.undefined)
      }
    }
    
    trait GeocodeServiceProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var url: String
    }
    object GeocodeServiceProviderOptions {
      
      @scala.inline
      def apply(url: String): GeocodeServiceProviderOptions = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[GeocodeServiceProviderOptions]
      }
      
      @scala.inline
      implicit class GeocodeServiceProviderOptionsMutableBuilder[Self <: GeocodeServiceProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    type GeosearchCallback = js.Function2[/* error */ js.UndefOr[js.Any], /* results */ js.Any, Unit]
    
    type GeosearchConstructor = Instantiable1[
        /* options */ js.UndefOr[GeosearchObject], 
        typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_
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
      
      @scala.inline
      def apply(): GeosearchObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeosearchObject]
      }
      
      @scala.inline
      implicit class GeosearchObjectMutableBuilder[Self <: GeosearchObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowMultipleResults(value: Boolean): Self = StObject.set(x, "allowMultipleResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowMultipleResultsUndefined: Self = StObject.set(x, "allowMultipleResults", js.undefined)
        
        @scala.inline
        def setCollapseAfterResult(value: Boolean): Self = StObject.set(x, "collapseAfterResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollapseAfterResultUndefined: Self = StObject.set(x, "collapseAfterResult", js.undefined)
        
        @scala.inline
        def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setProviders(value: js.Array[GeosearchProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
        
        @scala.inline
        def setProvidersVarargs(value: GeosearchProvider*): Self = StObject.set(x, "providers", js.Array(value :_*))
        
        @scala.inline
        def setSearchBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "searchBounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchBoundsNull: Self = StObject.set(x, "searchBounds", null)
        
        @scala.inline
        def setSearchBoundsUndefined: Self = StObject.set(x, "searchBounds", js.undefined)
        
        @scala.inline
        def setSearchBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "searchBounds", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUseMapBounds(value: Boolean | Double): Self = StObject.set(x, "useMapBounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseMapBoundsUndefined: Self = StObject.set(x, "useMapBounds", js.undefined)
        
        @scala.inline
        def setZoomToResult(value: Boolean): Self = StObject.set(x, "zoomToResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoomToResultUndefined: Self = StObject.set(x, "zoomToResult", js.undefined)
      }
    }
    
    @js.native
    trait GeosearchProvider extends StObject {
      
      def results(text: String, key: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
      def results(text: String, key: String, bounds: Unit, callback: GeosearchCallback): js.Any = js.native
      def results(text: String, key: String, bounds: LatLngBoundsExpression, callback: GeosearchCallback): js.Any = js.native
      
      def suggestions(text: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
      def suggestions(text: String, bounds: Unit, callback: GeosearchCallback): js.Any = js.native
      def suggestions(text: String, bounds: LatLngBoundsExpression, callback: GeosearchCallback): js.Any = js.native
    }
    
    trait MapServiceProviderOptions
      extends StObject
         with BaseProviderOptions {
      
      var bufferRadius: Double | js.Array[Double]
      
      def formatSuggestion(featureInformation: js.Any): String
      
      var layers: Double | js.Array[Double]
      
      var searchFields: String | js.Array[String]
      
      var url: String
    }
    object MapServiceProviderOptions {
      
      @scala.inline
      def apply(
        bufferRadius: Double | js.Array[Double],
        formatSuggestion: js.Any => String,
        layers: Double | js.Array[Double],
        searchFields: String | js.Array[String],
        url: String
      ): MapServiceProviderOptions = {
        val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = js.Any.fromFunction1(formatSuggestion), layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[MapServiceProviderOptions]
      }
      
      @scala.inline
      implicit class MapServiceProviderOptionsMutableBuilder[Self <: MapServiceProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBufferRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "bufferRadius", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBufferRadiusVarargs(value: Double*): Self = StObject.set(x, "bufferRadius", js.Array(value :_*))
        
        @scala.inline
        def setFormatSuggestion(value: js.Any => String): Self = StObject.set(x, "formatSuggestion", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLayers(value: Double | js.Array[Double]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayersVarargs(value: Double*): Self = StObject.set(x, "layers", js.Array(value :_*))
        
        @scala.inline
        def setSearchFields(value: String | js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    trait ResultObject
      extends StObject
         with /* key */ StringDictionary[js.Any] {
      
      var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
      
      var geojson: js.UndefOr[GeoJSON_[js.Any]] = js.undefined
      
      var latlng: js.UndefOr[LatLngExpression] = js.undefined
      
      var properties: js.UndefOr[js.Any] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object ResultObject {
      
      @scala.inline
      def apply(): ResultObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResultObject]
      }
      
      @scala.inline
      implicit class ResultObjectMutableBuilder[Self <: ResultObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
        
        @scala.inline
        def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
        
        @scala.inline
        def setGeojson(value: GeoJSON_[js.Any]): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGeojsonUndefined: Self = StObject.set(x, "geojson", js.undefined)
        
        @scala.inline
        def setLatlng(value: LatLngExpression): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatlngUndefined: Self = StObject.set(x, "latlng", js.undefined)
        
        @scala.inline
        def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait Results extends StObject {
      
      var bounds: LatLngBoundsExpression
      
      var latlng: LatLngExpression
      
      var results: js.Array[ResultObject]
    }
    object Results {
      
      @scala.inline
      def apply(bounds: LatLngBoundsExpression, latlng: LatLngExpression, results: js.Array[ResultObject]): Results = {
        val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
        __obj.asInstanceOf[Results]
      }
      
      @scala.inline
      implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
        
        @scala.inline
        def setLatlng(value: LatLngExpression): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResults(value: js.Array[ResultObject]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResultsVarargs(value: ResultObject*): Self = StObject.set(x, "results", js.Array(value :_*))
      }
    }
  }
}
