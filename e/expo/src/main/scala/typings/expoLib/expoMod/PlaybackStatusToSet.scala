package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlaybackStatusToSet extends js.Object {
  var androidImplementation: js.UndefOr[java.lang.String] = js.undefined
  var isLooping: js.UndefOr[scala.Boolean] = js.undefined
  var isMuted: js.UndefOr[scala.Boolean] = js.undefined
  var positionMillis: js.UndefOr[scala.Double] = js.undefined
  var progressUpdateIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  /** The desired playback rate of the media. This value must be between `0.0` and `32.0`. Only available on Android API version 23 and later and iOS. */
  var rate: js.UndefOr[scala.Double] = js.undefined
  var shouldCorrectPitch: js.UndefOr[scala.Boolean] = js.undefined
  var shouldPlay: js.UndefOr[scala.Boolean] = js.undefined
  /** A number between `0.0` (silence) and `1.0` (maximum volume). */
  var volume: js.UndefOr[scala.Double] = js.undefined
}

