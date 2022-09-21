package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * You can implement this class if you want to display custom types of overlay
  * objects on the map. <br><br>Inherit from this class by setting your
  * overlay&#39;s prototype: <code>MyOverlay.prototype = new
  * google.maps.OverlayView();</code>. The <code>OverlayView</code> constructor
  * is guaranteed to be an empty function. <br><br>You must implement three
  * methods: <code>onAdd()</code>, <code>draw()</code>, and
  * <code>onRemove()</code>. <ul> <li>In the <code>onAdd()</code> method, you
  * should create DOM objects and append them as children of the panes.</li>
  * <li>In the <code>draw()</code> method, you should position these
  * elements.</li> <li>In the <code>onRemove()</code> method, you should remove
  * the objects from the DOM.</li> </ul> You must call <code>setMap()</code>
  * with a valid <code>Map</code> object to trigger the call to the
  * <code>onAdd()</code> method and <code>setMap(null)</code> in order to
  * trigger the <code>onRemove()</code> method. The <code>setMap()</code>
  * method can be called at the time of construction or at any point afterward
  * when the overlay should be re-shown after removing. The <code>draw()</code>
  * method will then be called whenever a map property changes that could
  * change the position of the element, such as zoom, center, or map type.
  */
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
