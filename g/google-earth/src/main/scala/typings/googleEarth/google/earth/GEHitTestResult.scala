package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GEHitTestResult extends js.Object {
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
}

