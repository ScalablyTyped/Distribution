package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @js.native
  sealed trait OverlayType extends StObject
  /**
    * The types of overlay that may be created by the
    * <code>DrawingManager</code>. Specify these by value, or by using the
    * constant&#39;s name. For example, <code>'polygon'</code> or
    * <code>google.maps.drawing.OverlayType.POLYGON</code>.
    */
  @JSGlobal("google.maps.drawing.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    /**
      * Specifies that the <code>DrawingManager</code> creates circles, and that
      * the overlay given in the <code>overlaycomplete</code> event is a circle.
      */
    @js.native
    sealed trait CIRCLE
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the <code>DrawingManager</code> creates markers, and that
      * the overlay given in the <code>overlaycomplete</code> event is a marker.
      */
    @js.native
    sealed trait MARKER
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the <code>DrawingManager</code> creates polygons, and that
      * the overlay given in the <code>overlaycomplete</code> event is a polygon.
      */
    @js.native
    sealed trait POLYGON
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the <code>DrawingManager</code> creates polylines, and
      * that the overlay given in the <code>overlaycomplete</code> event is a
      * polyline.
      */
    @js.native
    sealed trait POLYLINE
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the <code>DrawingManager</code> creates rectangles, and
      * that the overlay given in the <code>overlaycomplete</code> event is a
      * rectangle.
      */
    @js.native
    sealed trait RECTANGLE
      extends StObject
         with OverlayType
  }
  
  /**
    * Options for the rendering of the drawing control.
    */
  trait DrawingControlOptions extends StObject {
    
    /**
      * The drawing modes to display in the drawing control, in the order in
      * which they are to be displayed. The hand icon (which corresponds to the
      * <code>null</code> drawing mode) is always available and is not to be
      * specified in this array.
      * @defaultValue <code>[{@link
      * google.maps.drawing.OverlayType.MARKER}, {@link
      * google.maps.drawing.OverlayType.POLYLINE}, {@link
      * google.maps.drawing.OverlayType.RECTANGLE}, {@link
      * google.maps.drawing.OverlayType.CIRCLE}, {@link
      * google.maps.drawing.OverlayType.POLYGON}]</code>
      */
    var drawingModes: js.UndefOr[js.Array[OverlayType] | Null] = js.undefined
    
    /**
      * Position id. Used to specify the position of the control on the map.
      * @defaultValue {@link google.maps.ControlPosition.TOP_LEFT}
      */
    var position: js.UndefOr[ControlPosition | Null] = js.undefined
  }
  object DrawingControlOptions {
    
    inline def apply(): DrawingControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingControlOptions]
    }
    
    extension [Self <: DrawingControlOptions](x: Self) {
      
      inline def setDrawingModes(value: js.Array[OverlayType]): Self = StObject.set(x, "drawingModes", value.asInstanceOf[js.Any])
      
      inline def setDrawingModesNull: Self = StObject.set(x, "drawingModes", null)
      
      inline def setDrawingModesUndefined: Self = StObject.set(x, "drawingModes", js.undefined)
      
      inline def setDrawingModesVarargs(value: OverlayType*): Self = StObject.set(x, "drawingModes", js.Array(value*))
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionNull: Self = StObject.set(x, "position", null)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  /**
    * Allows users to draw markers, polygons, polylines, rectangles, and circles
    * on the map. The <code>DrawingManager</code>&#39;s drawing mode defines the
    * type of overlay that will be created by the user. Adds a control to the
    * map, allowing the user to switch drawing mode.
    */
  @js.native
  trait DrawingManager
    extends StObject
       with MVCObject {
    
    /**
      * Returns the <code>DrawingManager</code>&#39;s drawing mode.
      */
    def getDrawingMode(): OverlayType | Null = js.native
    
    /**
      * Returns the <code>Map</code> to which the <code>DrawingManager</code> is
      * attached, which is the <code>Map</code> on which the overlays created
      * will be placed.
      */
    def getMap(): Map | Null = js.native
    
    /**
      * Changes the <code>DrawingManager</code>&#39;s drawing mode, which defines
      * the type of overlay to be added on the map. Accepted values are
      * <code>'marker'</code>, <code>'polygon'</code>, <code>'polyline'</code>,
      * <code>'rectangle'</code>, <code>'circle'</code>, or <code>null</code>. A
      * drawing mode of <code>null</code> means that the user can interact with
      * the map as normal, and clicks do not draw anything.
      */
    def setDrawingMode(): Unit = js.native
    def setDrawingMode(drawingMode: OverlayType): Unit = js.native
    
    /**
      * Attaches the <code>DrawingManager</code> object to the specified
      * <code>Map</code>.
      */
    def setMap(): Unit = js.native
    def setMap(map: Map): Unit = js.native
    
    /**
      * Sets the <code>DrawingManager</code>&#39;s options.
      */
    def setOptions(): Unit = js.native
    def setOptions(options: DrawingManagerOptions): Unit = js.native
  }
  
  /**
    * Options for the drawing manager.
    */
  trait DrawingManagerOptions extends StObject {
    
    /**
      * Options to apply to any new circles created with this
      * <code>DrawingManager</code>. The <code>center</code> and
      * <code>radius</code> properties are ignored, and the <code>map</code>
      * property of a new circle is always set to the
      * <code>DrawingManager</code>&#39;s map.
      */
    var circleOptions: js.UndefOr[CircleOptions | Null] = js.undefined
    
    /**
      * The enabled/disabled state of the drawing control.
      * @defaultValue <code>true</code>
      */
    var drawingControl: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The display options for the drawing control.
      */
    var drawingControlOptions: js.UndefOr[DrawingControlOptions | Null] = js.undefined
    
    /**
      * The <code>DrawingManager</code>&#39;s drawing mode, which defines the
      * type of overlay to be added on the map. Accepted values are
      * <code>'marker'</code>, <code>'polygon'</code>, <code>'polyline'</code>,
      * <code>'rectangle'</code>, <code>'circle'</code>, or <code>null</code>. A
      * drawing mode of <code>null</code> means that the user can interact with
      * the map as normal, and clicks do not draw anything.
      */
    var drawingMode: js.UndefOr[OverlayType | Null] = js.undefined
    
    /**
      * The <code>Map</code> to which the <code>DrawingManager</code> is
      * attached, which is the <code>Map</code> on which the overlays created
      * will be placed.
      */
    var map: js.UndefOr[Map | Null] = js.undefined
    
    /**
      * Options to apply to any new markers created with this
      * <code>DrawingManager</code>. The <code>position</code> property is
      * ignored, and the <code>map</code> property of a new marker is always set
      * to the <code>DrawingManager</code>&#39;s map.
      */
    var markerOptions: js.UndefOr[MarkerOptions | Null] = js.undefined
    
    /**
      * Options to apply to any new polygons created with this
      * <code>DrawingManager</code>. The <code>paths</code> property is ignored,
      * and the <code>map</code> property of a new polygon is always set to the
      * <code>DrawingManager</code>&#39;s map.
      */
    var polygonOptions: js.UndefOr[PolygonOptions | Null] = js.undefined
    
    /**
      * Options to apply to any new polylines created with this
      * <code>DrawingManager</code>. The <code>path</code> property is ignored,
      * and the <code>map</code> property of a new polyline is always set to the
      * <code>DrawingManager</code>&#39;s map.
      */
    var polylineOptions: js.UndefOr[PolylineOptions | Null] = js.undefined
    
    /**
      * Options to apply to any new rectangles created with this
      * <code>DrawingManager</code>. The <code>bounds</code> property is ignored,
      * and the <code>map</code> property of a new rectangle is always set to the
      * <code>DrawingManager</code>&#39;s map.
      */
    var rectangleOptions: js.UndefOr[RectangleOptions | Null] = js.undefined
  }
  object DrawingManagerOptions {
    
    inline def apply(): DrawingManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingManagerOptions]
    }
    
    extension [Self <: DrawingManagerOptions](x: Self) {
      
      inline def setCircleOptions(value: CircleOptions): Self = StObject.set(x, "circleOptions", value.asInstanceOf[js.Any])
      
      inline def setCircleOptionsNull: Self = StObject.set(x, "circleOptions", null)
      
      inline def setCircleOptionsUndefined: Self = StObject.set(x, "circleOptions", js.undefined)
      
      inline def setDrawingControl(value: Boolean): Self = StObject.set(x, "drawingControl", value.asInstanceOf[js.Any])
      
      inline def setDrawingControlNull: Self = StObject.set(x, "drawingControl", null)
      
      inline def setDrawingControlOptions(value: DrawingControlOptions): Self = StObject.set(x, "drawingControlOptions", value.asInstanceOf[js.Any])
      
      inline def setDrawingControlOptionsNull: Self = StObject.set(x, "drawingControlOptions", null)
      
      inline def setDrawingControlOptionsUndefined: Self = StObject.set(x, "drawingControlOptions", js.undefined)
      
      inline def setDrawingControlUndefined: Self = StObject.set(x, "drawingControl", js.undefined)
      
      inline def setDrawingMode(value: OverlayType): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
      
      inline def setDrawingModeNull: Self = StObject.set(x, "drawingMode", null)
      
      inline def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
      
      inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
      
      inline def setMarkerOptionsNull: Self = StObject.set(x, "markerOptions", null)
      
      inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
      
      inline def setPolygonOptions(value: PolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      inline def setPolygonOptionsNull: Self = StObject.set(x, "polygonOptions", null)
      
      inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      inline def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
      
      inline def setPolylineOptionsNull: Self = StObject.set(x, "polylineOptions", null)
      
      inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
      
      inline def setRectangleOptions(value: RectangleOptions): Self = StObject.set(x, "rectangleOptions", value.asInstanceOf[js.Any])
      
      inline def setRectangleOptionsNull: Self = StObject.set(x, "rectangleOptions", null)
      
      inline def setRectangleOptionsUndefined: Self = StObject.set(x, "rectangleOptions", js.undefined)
    }
  }
  
  /**
    * The properties of an overlaycomplete event on a
    * <code>DrawingManager</code>.
    */
  trait OverlayCompleteEvent extends StObject {
    
    /**
      * The completed overlay.
      */
    var overlay: Marker_ | Null | Polygon | Polyline | Rectangle | Circle
    
    /**
      * The completed overlay&#39;s type.
      */
    var `type`: OverlayType
  }
  object OverlayCompleteEvent {
    
    inline def apply(`type`: OverlayType): OverlayCompleteEvent = {
      val __obj = js.Dynamic.literal(overlay = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayCompleteEvent]
    }
    
    extension [Self <: OverlayCompleteEvent](x: Self) {
      
      inline def setOverlay(value: Marker_ | Polygon | Polyline | Rectangle | Circle): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setType(value: OverlayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
