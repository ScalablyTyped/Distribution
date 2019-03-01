package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidImplementationDidJustFinish
  extends expoLib.expoMod.PlaybackStatus {
  var androidImplementation: js.UndefOr[java.lang.String] = js.undefined
  /** True exactly once when the track plays to finish. */
  var didJustFinish: scala.Boolean
  var durationMillis: js.UndefOr[scala.Double] = js.undefined
  var isBuffering: scala.Boolean
  var isLoaded: expoLib.expoLibNumbers.`true`
  var isLooping: scala.Boolean
  var isMuted: scala.Boolean
  var isPlaying: scala.Boolean
  var playableDurationMillis: js.UndefOr[scala.Double] = js.undefined
  var positionMillis: scala.Double
  var progressUpdateIntervalMillis: scala.Double
  var rate: scala.Double
  var shouldCorrectPitch: scala.Boolean
  var shouldPlay: scala.Boolean
  var uri: java.lang.String
  var volume: scala.Double
}

object Anon_AndroidImplementationDidJustFinish {
  @scala.inline
  def apply(
    didJustFinish: scala.Boolean,
    isBuffering: scala.Boolean,
    isLoaded: expoLib.expoLibNumbers.`true`,
    isLooping: scala.Boolean,
    isMuted: scala.Boolean,
    isPlaying: scala.Boolean,
    positionMillis: scala.Double,
    progressUpdateIntervalMillis: scala.Double,
    rate: scala.Double,
    shouldCorrectPitch: scala.Boolean,
    shouldPlay: scala.Boolean,
    uri: java.lang.String,
    volume: scala.Double,
    androidImplementation: java.lang.String = null,
    durationMillis: scala.Int | scala.Double = null,
    playableDurationMillis: scala.Int | scala.Double = null
  ): Anon_AndroidImplementationDidJustFinish = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("didJustFinish")(didJustFinish)
    __obj.updateDynamic("isBuffering")(isBuffering)
    __obj.updateDynamic("isLoaded")(isLoaded)
    __obj.updateDynamic("isLooping")(isLooping)
    __obj.updateDynamic("isMuted")(isMuted)
    __obj.updateDynamic("isPlaying")(isPlaying)
    __obj.updateDynamic("positionMillis")(positionMillis)
    __obj.updateDynamic("progressUpdateIntervalMillis")(progressUpdateIntervalMillis)
    __obj.updateDynamic("rate")(rate)
    __obj.updateDynamic("shouldCorrectPitch")(shouldCorrectPitch)
    __obj.updateDynamic("shouldPlay")(shouldPlay)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("volume")(volume)
    if (androidImplementation != null) __obj.updateDynamic("androidImplementation")(androidImplementation)
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (playableDurationMillis != null) __obj.updateDynamic("playableDurationMillis")(playableDurationMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AndroidImplementationDidJustFinish]
  }
}

