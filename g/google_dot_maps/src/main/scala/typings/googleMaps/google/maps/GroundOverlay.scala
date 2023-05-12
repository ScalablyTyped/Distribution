package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundOverlay
  extends StObject
     with MVCObject {
  
  /**
    * Gets the <code>LatLngBounds</code> of this overlay.
    */
  def getBounds(): LatLngBounds | Null = js.native
  
  /**
    * Returns the map on which this ground overlay is displayed.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Returns the opacity of this ground overlay.
    */
  def getOpacity(): Double = js.native
  
  /**
    * Gets the url of the projected image.
    */
  def getUrl(): String = js.native
  
  /**
    * Renders the ground overlay on the specified map. If map is set to
    * <code>null</code>, the overlay is removed.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Sets the opacity of this ground overlay.
    */
  def setOpacity(opacity: Double): Unit = js.native
}
