package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A circle on the Earth&#39;s surface; also known as a &quot;spherical
  * cap&quot;.
  */
@js.native
trait Circle
  extends StObject
     with MVCObject {
  
  /**
    * Gets the <code>LatLngBounds</code> of this Circle.
    */
  def getBounds(): LatLngBounds | Null = js.native
  
  /**
    * Returns the center of this circle.
    */
  def getCenter(): LatLng | Null = js.native
  
  /**
    * Returns whether this circle can be dragged by the user.
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * Returns whether this circle can be edited by the user.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Returns the map on which this circle is displayed.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Returns the radius of this circle (in meters).
    */
  def getRadius(): Double = js.native
  
  /**
    * Returns whether this circle is visible on the map.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Sets the center of this circle.
    */
  def setCenter(): Unit = js.native
  def setCenter(center: LatLng): Unit = js.native
  def setCenter(center: LatLngLiteral): Unit = js.native
  
  /**
    * If set to <code>true</code>, the user can drag this circle over the map.
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * If set to <code>true</code>, the user can edit this circle by dragging
    * the control points shown at the center and around the circumference of
    * the circle.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Renders the circle on the specified map. If map is set to
    * <code>null</code>, the circle will be removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: CircleOptions): Unit = js.native
  
  /**
    * Sets the radius of this circle (in meters).
    */
  def setRadius(radius: Double): Unit = js.native
  
  /**
    * Hides this circle if set to <code>false</code>.
    */
  def setVisible(visible: Boolean): Unit = js.native
}
