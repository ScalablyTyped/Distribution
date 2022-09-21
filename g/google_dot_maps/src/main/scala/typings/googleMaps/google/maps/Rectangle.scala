package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangle overlay.
  */
@js.native
trait Rectangle
  extends StObject
     with MVCObject {
  
  /**
    * Returns the bounds of this rectangle.
    */
  def getBounds(): LatLngBounds | Null = js.native
  
  /**
    * Returns whether this rectangle can be dragged by the user.
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * Returns whether this rectangle can be edited by the user.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Returns the map on which this rectangle is displayed.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Returns whether this rectangle is visible on the map.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Sets the bounds of this rectangle.
    */
  def setBounds(): Unit = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  
  /**
    * If set to <code>true</code>, the user can drag this rectangle over the
    * map.
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * If set to <code>true</code>, the user can edit this rectangle by dragging
    * the control points shown at the corners and on each edge.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Renders the rectangle on the specified map. If map is set to
    * <code>null</code>, the rectangle will be removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: RectangleOptions): Unit = js.native
  
  /**
    * Hides this rectangle if set to <code>false</code>.
    */
  def setVisible(visible: Boolean): Unit = js.native
}
