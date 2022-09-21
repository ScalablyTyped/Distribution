package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RectangleOptions object used to define the properties that can be set on a
  * Rectangle.
  */
trait RectangleOptions extends StObject {
  
  /**
    * The bounds.
    */
  var bounds: js.UndefOr[LatLngBounds | Null | LatLngBoundsLiteral] = js.undefined
  
  /**
    * Indicates whether this <code>Rectangle</code> handles mouse events.
    * @defaultValue <code>true</code>
    */
  var clickable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set to <code>true</code>, the user can drag this rectangle over the
    * map.
    * @defaultValue <code>false</code>
    */
  var draggable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set to <code>true</code>, the user can edit this rectangle by dragging
    * the control points shown at the corners and on each edge.
    * @defaultValue <code>false</code>
    */
  var editable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The fill color. All CSS3 colors are supported except for extended named
    * colors.
    */
  var fillColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fill opacity between 0.0 and 1.0
    */
  var fillOpacity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Map on which to display Rectangle.
    */
  var map: js.UndefOr[Map | Null] = js.undefined
  
  /**
    * The stroke color. All CSS3 colors are supported except for extended named
    * colors.
    */
  var strokeColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stroke opacity between 0.0 and 1.0
    */
  var strokeOpacity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The stroke position.
    * @defaultValue {@link google.maps.StrokePosition.CENTER}
    */
  var strokePosition: js.UndefOr[StrokePosition | Null] = js.undefined
  
  /**
    * The stroke width in pixels.
    */
  var strokeWeight: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether this rectangle is visible on the map.
    * @defaultValue <code>true</code>
    */
  var visible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The zIndex compared to other polys.
    */
  var zIndex: js.UndefOr[Double | Null] = js.undefined
}
object RectangleOptions {
  
  inline def apply(): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectangleOptions]
  }
  
  extension [Self <: RectangleOptions](x: Self) {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableNull: Self = StObject.set(x, "clickable", null)
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableNull: Self = StObject.set(x, "editable", null)
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorNull: Self = StObject.set(x, "fillColor", null)
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityNull: Self = StObject.set(x, "fillOpacity", null)
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityNull: Self = StObject.set(x, "strokeOpacity", null)
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokePosition(value: StrokePosition): Self = StObject.set(x, "strokePosition", value.asInstanceOf[js.Any])
    
    inline def setStrokePositionNull: Self = StObject.set(x, "strokePosition", null)
    
    inline def setStrokePositionUndefined: Self = StObject.set(x, "strokePosition", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightNull: Self = StObject.set(x, "strokeWeight", null)
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleNull: Self = StObject.set(x, "visible", null)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexNull: Self = StObject.set(x, "zIndex", null)
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
