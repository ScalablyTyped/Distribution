package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackStatus extends js.Object {
  var androidImplementation: js.UndefOr[java.lang.String] = js.native
  /** True exactly once when the track plays to finish. */
  var didJustFinish: js.UndefOr[scala.Boolean] = js.native
  var durationMillis: js.UndefOr[scala.Double] = js.native
  /** Populated exactly once when an error forces the object to unload. */
  var error: js.UndefOr[java.lang.String] = js.native
  var isBuffering: js.UndefOr[scala.Boolean] = js.native
  var isLoaded: js.UndefOr[expoLib.expoLibNumbers.`false` | expoLib.expoLibNumbers.`true`] = js.native
  var isLooping: js.UndefOr[scala.Boolean] = js.native
  var isMuted: js.UndefOr[scala.Boolean] = js.native
  var isPlaying: js.UndefOr[scala.Boolean] = js.native
  var playableDurationMillis: js.UndefOr[scala.Double] = js.native
  var positionMillis: js.UndefOr[scala.Double] = js.native
  var progressUpdateIntervalMillis: js.UndefOr[scala.Double] = js.native
  var rate: js.UndefOr[scala.Double] = js.native
  var shouldCorrectPitch: js.UndefOr[scala.Boolean] = js.native
  var shouldPlay: js.UndefOr[scala.Boolean] = js.native
  var uri: js.UndefOr[java.lang.String] = js.native
  var volume: js.UndefOr[scala.Double] = js.native
}

