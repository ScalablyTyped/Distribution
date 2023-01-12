package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEHitTestResult extends StObject {
  
  /**
    * Altitude of sampled point.
    */
  def getAltitude(): Double
  
  /**
    * Latitude of sampled point.
    */
  def getLatitude(): Double
  
  /**
    * Longitude of sampled point.
    */
  def getLongitude(): Double
  
  /**
    * Altitude of sampled point.
    */
  def setAltitude(altitude: Double): Unit
  
  /**
    * Latitude of sampled point.
    */
  def setLatitude(latitude: Double): Unit
  
  /**
    * Longitude of sampled point.
    */
  def setLongitude(longitude: Double): Unit
}
object GEHitTestResult {
  
  inline def apply(
    getAltitude: () => Double,
    getLatitude: () => Double,
    getLongitude: () => Double,
    setAltitude: Double => Unit,
    setLatitude: Double => Unit,
    setLongitude: Double => Unit
  ): GEHitTestResult = {
    val __obj = js.Dynamic.literal(getAltitude = js.Any.fromFunction0(getAltitude), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), setAltitude = js.Any.fromFunction1(setAltitude), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude))
    __obj.asInstanceOf[GEHitTestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GEHitTestResult] (val x: Self) extends AnyVal {
    
    inline def setGetAltitude(value: () => Double): Self = StObject.set(x, "getAltitude", js.Any.fromFunction0(value))
    
    inline def setGetLatitude(value: () => Double): Self = StObject.set(x, "getLatitude", js.Any.fromFunction0(value))
    
    inline def setGetLongitude(value: () => Double): Self = StObject.set(x, "getLongitude", js.Any.fromFunction0(value))
    
    inline def setSetAltitude(value: Double => Unit): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1(value))
    
    inline def setSetLatitude(value: Double => Unit): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1(value))
    
    inline def setSetLongitude(value: Double => Unit): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1(value))
  }
}
