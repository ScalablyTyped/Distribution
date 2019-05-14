package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackStatus extends js.Object {
  var androidImplementation: js.UndefOr[java.lang.String] = js.undefined
  /** True exactly once when the track plays to finish. */
  var didJustFinish: js.UndefOr[scala.Boolean] = js.undefined
  var durationMillis: js.UndefOr[scala.Double] = js.undefined
  /** Populated exactly once when an error forces the object to unload. */
  var error: js.UndefOr[java.lang.String] = js.undefined
  var isBuffering: js.UndefOr[scala.Boolean] = js.undefined
  var isLoaded: js.UndefOr[expoLib.expoLibNumbers.`false` | expoLib.expoLibNumbers.`true`] = js.undefined
  var isLooping: js.UndefOr[scala.Boolean] = js.undefined
  var isMuted: js.UndefOr[scala.Boolean] = js.undefined
  var isPlaying: js.UndefOr[scala.Boolean] = js.undefined
  var playableDurationMillis: js.UndefOr[scala.Double] = js.undefined
  var positionMillis: js.UndefOr[scala.Double] = js.undefined
  var progressUpdateIntervalMillis: js.UndefOr[scala.Double] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var shouldCorrectPitch: js.UndefOr[scala.Boolean] = js.undefined
  var shouldPlay: js.UndefOr[scala.Boolean] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object PlaybackStatus {
  @scala.inline
  def apply(
    androidImplementation: java.lang.String = null,
    didJustFinish: js.UndefOr[scala.Boolean] = js.undefined,
    durationMillis: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    isBuffering: js.UndefOr[scala.Boolean] = js.undefined,
    isLoaded: expoLib.expoLibNumbers.`false` = null,
    isLooping: js.UndefOr[scala.Boolean] = js.undefined,
    isMuted: js.UndefOr[scala.Boolean] = js.undefined,
    isPlaying: js.UndefOr[scala.Boolean] = js.undefined,
    playableDurationMillis: scala.Int | scala.Double = null,
    positionMillis: scala.Int | scala.Double = null,
    progressUpdateIntervalMillis: scala.Int | scala.Double = null,
    rate: scala.Int | scala.Double = null,
    shouldCorrectPitch: js.UndefOr[scala.Boolean] = js.undefined,
    shouldPlay: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String = null,
    volume: scala.Int | scala.Double = null
  ): PlaybackStatus = {
    val __obj = js.Dynamic.literal()
    if (androidImplementation != null) __obj.updateDynamic("androidImplementation")(androidImplementation)
    if (!js.isUndefined(didJustFinish)) __obj.updateDynamic("didJustFinish")(didJustFinish)
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isBuffering)) __obj.updateDynamic("isBuffering")(isBuffering)
    if (isLoaded != null) __obj.updateDynamic("isLoaded")(isLoaded)
    if (!js.isUndefined(isLooping)) __obj.updateDynamic("isLooping")(isLooping)
    if (!js.isUndefined(isMuted)) __obj.updateDynamic("isMuted")(isMuted)
    if (!js.isUndefined(isPlaying)) __obj.updateDynamic("isPlaying")(isPlaying)
    if (playableDurationMillis != null) __obj.updateDynamic("playableDurationMillis")(playableDurationMillis.asInstanceOf[js.Any])
    if (positionMillis != null) __obj.updateDynamic("positionMillis")(positionMillis.asInstanceOf[js.Any])
    if (progressUpdateIntervalMillis != null) __obj.updateDynamic("progressUpdateIntervalMillis")(progressUpdateIntervalMillis.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCorrectPitch)) __obj.updateDynamic("shouldCorrectPitch")(shouldCorrectPitch)
    if (!js.isUndefined(shouldPlay)) __obj.updateDynamic("shouldPlay")(shouldPlay)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackStatus]
  }
}

