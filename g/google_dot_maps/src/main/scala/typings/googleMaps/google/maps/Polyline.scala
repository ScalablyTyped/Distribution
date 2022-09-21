package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A polyline is a linear overlay of connected line segments on the map.
  */
@js.native
trait Polyline
  extends StObject
     with MVCObject {
  
  /**
    * Returns whether this shape can be dragged by the user.
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * Returns whether this shape can be edited by the user.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Returns the map on which this shape is attached.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Retrieves the path.
    */
  def getPath(): MVCArray[LatLng] = js.native
  
  /**
    * Returns whether this poly is visible on the map.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * If set to <code>true</code>, the user can drag this shape over the map.
    * The <code>geodesic</code> property defines the mode of dragging.
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * If set to <code>true</code>, the user can edit this shape by dragging the
    * control points shown at the vertices and on each segment.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Renders this shape on the specified map. If map is set to
    * <code>null</code>, the shape will be removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: PolylineOptions): Unit = js.native
  
  def setPath(path: js.Array[LatLng | LatLngLiteral]): Unit = js.native
  /**
    * Sets the path. See <em><code><a
    * href="#PolylineOptions">PolylineOptions</a></code></em> for more details.
    */
  def setPath(path: MVCArray[LatLng]): Unit = js.native
  
  /**
    * Hides this poly if set to <code>false</code>.
    */
  def setVisible(visible: Boolean): Unit = js.native
}
