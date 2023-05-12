package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions extends StObject {
  
  /**
    * The offset from the marker&#39;s position to the tip of an InfoWindow
    * that has been opened with the marker as anchor.
    */
  var anchorPoint: js.UndefOr[Point | Null] = js.undefined
  
  /**
    * Which animation to play when marker is added to a map.
    * @defaultValue <code>null</code>
    */
  var animation: js.UndefOr[Animation | Null] = js.undefined
  
  /**
    * If <code>true</code>, the marker receives mouse and touch events.
    * @defaultValue <code>true</code>
    */
  var clickable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * Set a collision behavior for markers on vector maps.
    * @defaultValue <code>null</code>
    */
  var collisionBehavior: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If <code>false</code>, disables cross that appears beneath the marker
    * when dragging.
    * @defaultValue <code>true</code>
    */
  var crossOnDrag: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mouse cursor type to show on hover.
    * @defaultValue <code>pointer</code>
    */
  var cursor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If <code>true</code>, the marker can be dragged.
    * @defaultValue <code>false</code>
    */
  var draggable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Icon for the foreground. If a string is provided, it is treated as though
    * it were an <code>Icon</code> with the string as <code>url</code>.
    */
  var icon: js.UndefOr[String | Null | Icon | Symbol] = js.undefined
  
  /**
    * Adds a label to the marker. A marker label is a letter or number that
    * appears inside a marker. The label can either be a string, or a
    * <code>MarkerLabel</code> object. If provided and {@link
    * google.maps.MarkerOptions.title} is not provided, an accessibility text
    * (e.g. for use with screen readers) will be added to the marker with the
    * provided label&#39;s text. Please note that the <code>label</code> is
    * currently only used for accessibility text for non-optimized markers.
    * @defaultValue <code>null</code>
    */
  var label: js.UndefOr[String | Null | MarkerLabel] = js.undefined
  
  /**
    * Map on which to display Marker. The map is required to display the marker
    * and can be provided with {@link google.maps.Marker.setMap} if not
    * provided at marker construction.
    */
  var map: js.UndefOr[Map | Null | StreetViewPanorama] = js.undefined
  
  /**
    * A number between 0.0, transparent, and 1.0, opaque.
    * @defaultValue 1.0
    */
  var opacity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optimization enhances performance by rendering many markers as a single
    * static element. This is useful in cases where a large number of markers
    * is required. Read more about <a
    * href="https://developers.google.com/maps/documentation/javascript/markers#optimize">marker
    * optimization</a>.
    */
  var optimized: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Sets the marker position. A marker may be constructed but not displayed
    * until its position is provided - for example, by a user&#39;s actions or
    * choices. A marker position can be provided with {@link
    * google.maps.Marker.setPosition} if not provided at marker construction.
    */
  var position: js.UndefOr[LatLng | Null | LatLngLiteral] = js.undefined
  
  /**
    * Image map region definition used for drag/click.
    */
  var shape: js.UndefOr[MarkerShape | Null] = js.undefined
  
  /**
    * Rollover text. If provided, an accessibility text (e.g. for use with
    * screen readers) will be added to the marker with the provided value.
    * Please note that the <code>title</code> is currently only used for
    * accessibility text for non-optimized markers.
    * @defaultValue <code>undefined</code>
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If <code>true</code>, the marker is visible.
    * @defaultValue <code>true</code>
    */
  var visible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * All markers are displayed on the map in order of their zIndex, with
    * higher values displaying in front of markers with lower values. By
    * default, markers are displayed according to their vertical position on
    * screen, with lower markers appearing in front of markers further up the
    * screen.
    */
  var zIndex: js.UndefOr[Double | Null] = js.undefined
}
object MarkerOptions {
  
  inline def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointNull: Self = StObject.set(x, "anchorPoint", null)
    
    inline def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationNull: Self = StObject.set(x, "animation", null)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableNull: Self = StObject.set(x, "clickable", null)
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setCollisionBehavior(value: String): Self = StObject.set(x, "collisionBehavior", value.asInstanceOf[js.Any])
    
    inline def setCollisionBehaviorNull: Self = StObject.set(x, "collisionBehavior", null)
    
    inline def setCollisionBehaviorUndefined: Self = StObject.set(x, "collisionBehavior", js.undefined)
    
    inline def setCrossOnDrag(value: Boolean): Self = StObject.set(x, "crossOnDrag", value.asInstanceOf[js.Any])
    
    inline def setCrossOnDragNull: Self = StObject.set(x, "crossOnDrag", null)
    
    inline def setCrossOnDragUndefined: Self = StObject.set(x, "crossOnDrag", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorNull: Self = StObject.set(x, "cursor", null)
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String | MarkerLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMap(value: Map | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptimized(value: Boolean): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
    
    inline def setOptimizedNull: Self = StObject.set(x, "optimized", null)
    
    inline def setOptimizedUndefined: Self = StObject.set(x, "optimized", js.undefined)
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeNull: Self = StObject.set(x, "shape", null)
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleNull: Self = StObject.set(x, "visible", null)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexNull: Self = StObject.set(x, "zIndex", null)
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
