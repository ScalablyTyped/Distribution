package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.MVCObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBox
  extends StObject
     with MVCObject {
  
  /**
    * Returns the bounds to which query predictions are biased.
    */
  def getBounds(): js.UndefOr[LatLngBounds] = js.native
  
  /**
    * Returns the query selected by the user to be used with
    * <code>places_changed</code> event.
    */
  def getPlaces(): js.UndefOr[js.Array[PlaceResult]] = js.native
  
  /**
    * Sets the region to use for biasing query predictions. Results will only
    * be biased towards this area and not be completely restricted to it.
    */
  def setBounds(): Unit = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
}
