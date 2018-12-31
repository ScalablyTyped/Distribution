package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GETime")
@js.native
class GETime () extends js.Object {
  /**
    * Returns the GETimeControl object; this is the time slider.
    */
  def getControl(): GETimeControl = js.native
  /**
    * Whether or not historical imagery is enabled.
    */
  def getHistoricalImageryEnabled(): scala.Boolean = js.native
  /**
    * Get the current plugin clock rate.
    */
  def getRate(): scala.Double = js.native
  /**
    * Returns the current computer clock time as a KmlTimeStamp object.
    */
  def getSystemTime(): KmlTimeStamp = js.native
  /**
    * Get the current plugin time as a KmlTimeStamp or KmlTimeSpan.
    */
  def getTimePrimitive(): KmlTimePrimitive = js.native
  /**
    * Turn historical imagery on or off.
    * For more information, read the Time chapter of the Developer's Guide.
    */
  def setHistoricalImageryEnabled(historicalImageryEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Set the plugin's clock rate.
    * A value of 1 corresponds with real time; to pass one year in the plugin for every real second, set the rate to 31536000 (60 times 60 times 24 times 365).
    */
  def setRate(rate: scala.Double): scala.Unit = js.native
  /**
    * Sets the current plugin time.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): scala.Unit = js.native
}

