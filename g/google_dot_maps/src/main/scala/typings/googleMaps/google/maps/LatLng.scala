package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.places._LocationBias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LatLng
  extends StObject
     with _LocationBias {
  
  /**
    * Comparison function.
    */
  def equals(): Boolean = js.native
  def equals(other: LatLng): Boolean = js.native
  
  /**
    * Returns the latitude in degrees.
    */
  def lat(): Double = js.native
  
  /**
    * Returns the longitude in degrees.
    */
  def lng(): Double = js.native
  
  /**
    * Converts to JSON representation. This function is intended to be used via
    * <code>JSON.stringify</code>.
    */
  def toJSON(): LatLngLiteral = js.native
  
  /**
    * Returns a string of the form &quot;lat,lng&quot; for this LatLng. We
    * round the lat/lng values to 6 decimal places by default.
    */
  def toUrlValue(): String = js.native
  def toUrlValue(precision: Double): String = js.native
}
