package typings.googleMaps.google.maps

import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolyMouseEvent
  extends StObject
     with MapMouseEvent {
  
  /**
    * The index of the edge within the path beneath the cursor when the event
    * occurred, if the event occurred on a mid-point on an editable polygon.
    */
  var edge: js.UndefOr[Double] = js.undefined
  
  /**
    * The index of the path beneath the cursor when the event occurred, if the
    * event occurred on a vertex and the polygon is editable. Otherwise
    * <code>undefined</code>.
    */
  var path: js.UndefOr[Double] = js.undefined
  
  /**
    * The index of the vertex beneath the cursor when the event occurred, if
    * the event occurred on a vertex and the polyline or polygon is editable.
    * If the event does not occur on a vertex, the value is
    * <code>undefined</code>.
    */
  var vertex: js.UndefOr[Double] = js.undefined
}
object PolyMouseEvent {
  
  inline def apply(domEvent: MouseEvent | TouchEvent | PointerEvent | KeyboardEvent | Event, stop: () => Unit): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), latLng = null)
    __obj.asInstanceOf[PolyMouseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolyMouseEvent] (val x: Self) extends AnyVal {
    
    inline def setEdge(value: Double): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setPath(value: Double): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setVertex(value: Double): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
