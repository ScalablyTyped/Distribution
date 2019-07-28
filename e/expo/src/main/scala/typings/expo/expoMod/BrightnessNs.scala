package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Brightness")
@js.native
object BrightnessNs extends js.Object {
  /**
    * Gets screen brightness.
    * @returns A Promise that is resolved with a number between `0` and `1`, representing the current screen brightness.
    */
  def getBrightnessAsync(): js.Promise[Double] = js.native
  /**
    * Gets global system screen brightness.
    * @returns A Promise that is resolved with a number between `0` and `1`, representing the current system screen brightness.
    */
  def getSystemBrightnessAsync(): js.Promise[Double] = js.native
  /** Sets screen brightness. */
  def setBrightnessAsync(
    /** A number between `0` and `1`, representing the desired screen brightness. */
  brightnessValue: Double
  ): js.Promise[Unit] = js.native
  /** Sets global system screen brightness, requires `WRITE_SETTINGS` permissions on Android. */
  def setSystemBrightnessAsync(
    /** A number between `0` and `1`, representing the desired screen brightness. */
  brightnessValue: Double
  ): js.Promise[Unit] = js.native
}

