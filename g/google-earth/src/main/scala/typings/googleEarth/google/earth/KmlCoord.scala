package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlCoord extends StObject {
  
  /**
    * Distance from the earth's surface.
    */
  def getAltitude(): Double = js.native
  
  /**
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): Double = js.native
  
  /**
    * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double = js.native
  
  /**
    * Distance from the earth's surface.
    */
  def setAltitude(altitude: Double): Unit = js.native
  
  /**
    * Sets the latitude, longitude, altitude.
    */
  def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  
  /**
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: Double): Unit = js.native
  
  /**
    * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit = js.native
}
object KmlCoord {
  
  @scala.inline
  def apply(
    getAltitude: () => Double,
    getLatitude: () => Double,
    getLongitude: () => Double,
    setAltitude: Double => Unit,
    setLatLngAlt: (Double, Double, Double) => Unit,
    setLatitude: Double => Unit,
    setLongitude: Double => Unit
  ): KmlCoord = {
    val __obj = js.Dynamic.literal(getAltitude = js.Any.fromFunction0(getAltitude), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), setAltitude = js.Any.fromFunction1(setAltitude), setLatLngAlt = js.Any.fromFunction3(setLatLngAlt), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude))
    __obj.asInstanceOf[KmlCoord]
  }
  
  @scala.inline
  implicit class KmlCoordMutableBuilder[Self <: KmlCoord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAltitude(value: () => Double): Self = StObject.set(x, "getAltitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLatitude(value: () => Double): Self = StObject.set(x, "getLatitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLongitude(value: () => Double): Self = StObject.set(x, "getLongitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAltitude(value: Double => Unit): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLatLngAlt(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setLatLngAlt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetLatitude(value: Double => Unit): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLongitude(value: Double => Unit): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1(value))
  }
}
