package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GETime extends js.Object {
  /**
    * Returns the GETimeControl object; this is the time slider.
    */
  def getControl(): GETimeControl
  /**
    * Whether or not historical imagery is enabled.
    */
  def getHistoricalImageryEnabled(): Boolean
  /**
    * Get the current plugin clock rate.
    */
  def getRate(): Double
  /**
    * Returns the current computer clock time as a KmlTimeStamp object.
    */
  def getSystemTime(): KmlTimeStamp
  /**
    * Get the current plugin time as a KmlTimeStamp or KmlTimeSpan.
    */
  def getTimePrimitive(): KmlTimePrimitive
  /**
    * Turn historical imagery on or off.
    * For more information, read the Time chapter of the Developer's Guide.
    */
  def setHistoricalImageryEnabled(historicalImageryEnabled: Boolean): Unit
  /**
    * Set the plugin's clock rate.
    * A value of 1 corresponds with real time; to pass one year in the plugin for every real second, set the rate to 31536000 (60 times 60 times 24 times 365).
    */
  def setRate(rate: Double): Unit
  /**
    * Sets the current plugin time.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit
}

object GETime {
  @scala.inline
  def apply(
    getControl: () => GETimeControl,
    getHistoricalImageryEnabled: () => Boolean,
    getRate: () => Double,
    getSystemTime: () => KmlTimeStamp,
    getTimePrimitive: () => KmlTimePrimitive,
    setHistoricalImageryEnabled: Boolean => Unit,
    setRate: Double => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit
  ): GETime = {
    val __obj = js.Dynamic.literal(getControl = js.Any.fromFunction0(getControl), getHistoricalImageryEnabled = js.Any.fromFunction0(getHistoricalImageryEnabled), getRate = js.Any.fromFunction0(getRate), getSystemTime = js.Any.fromFunction0(getSystemTime), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), setHistoricalImageryEnabled = js.Any.fromFunction1(setHistoricalImageryEnabled), setRate = js.Any.fromFunction1(setRate), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive))
    __obj.asInstanceOf[GETime]
  }
}

