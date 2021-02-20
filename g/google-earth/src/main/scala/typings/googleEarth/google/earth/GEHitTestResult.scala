package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GEHitTestResult extends StObject {
  
  /**
    * Altitude of sampled point.
    */
  def getAltitude(): Double = js.native
  
  /**
    * Latitude of sampled point.
    */
  def getLatitude(): Double = js.native
  
  /**
    * Longitude of sampled point.
    */
  def getLongitude(): Double = js.native
  
  /**
    * Altitude of sampled point.
    */
  def setAltitude(altitude: Double): Unit = js.native
  
  /**
    * Latitude of sampled point.
    */
  def setLatitude(latitude: Double): Unit = js.native
  
  /**
    * Longitude of sampled point.
    */
  def setLongitude(longitude: Double): Unit = js.native
}
object GEHitTestResult {
  
  @scala.inline
  def apply(
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
  implicit class GEHitTestResultMutableBuilder[Self <: GEHitTestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAltitude(value: () => Double): Self = StObject.set(x, "getAltitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLatitude(value: () => Double): Self = StObject.set(x, "getLatitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLongitude(value: () => Double): Self = StObject.set(x, "getLongitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAltitude(value: Double => Unit): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLatitude(value: Double => Unit): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLongitude(value: Double => Unit): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1(value))
  }
}
