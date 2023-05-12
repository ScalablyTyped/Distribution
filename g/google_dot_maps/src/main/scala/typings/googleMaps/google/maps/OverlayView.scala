package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayView
  extends StObject
     with MVCObject {
  
  /**
    * Implement this method to draw or update the overlay. Use the position
    * from projection.fromLatLngToDivPixel() to correctly position the overlay
    * relative to the MapPanes. This method is called after onAdd(), and is
    * called on change of zoom or center. It is not recommended to do
    * computationally expensive work in this method.
    */
  def draw(): Unit = js.native
  
  def getMap(): Map | Null | StreetViewPanorama = js.native
  
  /**
    * Returns the panes in which this OverlayView can be rendered. The panes
    * are not initialized until <code>onAdd</code> is called by the API.
    */
  def getPanes(): MapPanes | Null = js.native
  
  /**
    * Returns the <code>MapCanvasProjection</code> object associated with this
    * <code>OverlayView</code>. The projection is not initialized until
    * <code>onAdd</code> is called by the API.
    */
  def getProjection(): MapCanvasProjection = js.native
  
  /**
    * Implement this method to initialize the overlay DOM elements. This method
    * is called once after setMap() is called with a valid map. At this point,
    * panes and projection will have been initialized.
    */
  def onAdd(): Unit = js.native
  
  /**
    * Implement this method to remove your elements from the DOM. This method
    * is called once following a call to setMap(null).
    */
  def onRemove(): Unit = js.native
  
  /**
    * Adds the overlay to the map or panorama.
    * @param map The map or panorama. If <code>null</code>, the layer will be
    *     removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setMap(map: StreetViewPanorama): Unit = js.native
}
