package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GETime")
@js.native
class GETime ()
  extends typings.googleEarth.google.earth.GETime {
  /**
    * Returns the GETimeControl object; this is the time slider.
    */
  /* CompleteClass */
  override def getControl(): typings.googleEarth.google.earth.GETimeControl = js.native
  /**
    * Whether or not historical imagery is enabled.
    */
  /* CompleteClass */
  override def getHistoricalImageryEnabled(): Boolean = js.native
  /**
    * Get the current plugin clock rate.
    */
  /* CompleteClass */
  override def getRate(): Double = js.native
  /**
    * Returns the current computer clock time as a KmlTimeStamp object.
    */
  /* CompleteClass */
  override def getSystemTime(): typings.googleEarth.google.earth.KmlTimeStamp = js.native
  /**
    * Get the current plugin time as a KmlTimeStamp or KmlTimeSpan.
    */
  /* CompleteClass */
  override def getTimePrimitive(): typings.googleEarth.google.earth.KmlTimePrimitive = js.native
  /**
    * Turn historical imagery on or off.
    * For more information, read the Time chapter of the Developer's Guide.
    */
  /* CompleteClass */
  override def setHistoricalImageryEnabled(historicalImageryEnabled: Boolean): Unit = js.native
  /**
    * Set the plugin's clock rate.
    * A value of 1 corresponds with real time; to pass one year in the plugin for every real second, set the rate to 31536000 (60 times 60 times 24 times 365).
    */
  /* CompleteClass */
  override def setRate(rate: Double): Unit = js.native
  /**
    * Sets the current plugin time.
    */
  /* CompleteClass */
  override def setTimePrimitive(timePrimitive: typings.googleEarth.google.earth.KmlTimePrimitive): Unit = js.native
}

