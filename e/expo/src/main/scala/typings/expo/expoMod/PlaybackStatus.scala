package typings.expo.expoMod

import typings.expo.expoNumbers.`false`
import typings.expo.expoNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackStatus extends js.Object {
  var androidImplementation: js.UndefOr[String] = js.undefined
  /** True exactly once when the track plays to finish. */
  var didJustFinish: js.UndefOr[Boolean] = js.undefined
  var durationMillis: js.UndefOr[Double] = js.undefined
  /** Populated exactly once when an error forces the object to unload. */
  var error: js.UndefOr[String] = js.undefined
  var isBuffering: js.UndefOr[Boolean] = js.undefined
  var isLoaded: js.UndefOr[`false` | `true`] = js.undefined
  var isLooping: js.UndefOr[Boolean] = js.undefined
  var isMuted: js.UndefOr[Boolean] = js.undefined
  var isPlaying: js.UndefOr[Boolean] = js.undefined
  var playableDurationMillis: js.UndefOr[Double] = js.undefined
  var positionMillis: js.UndefOr[Double] = js.undefined
  var progressUpdateIntervalMillis: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var shouldCorrectPitch: js.UndefOr[Boolean] = js.undefined
  var shouldPlay: js.UndefOr[Boolean] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object PlaybackStatus {
  @scala.inline
  def apply(
    androidImplementation: String = null,
    didJustFinish: js.UndefOr[Boolean] = js.undefined,
    durationMillis: Int | Double = null,
    error: String = null,
    isBuffering: js.UndefOr[Boolean] = js.undefined,
    isLoaded: `false` = null,
    isLooping: js.UndefOr[Boolean] = js.undefined,
    isMuted: js.UndefOr[Boolean] = js.undefined,
    isPlaying: js.UndefOr[Boolean] = js.undefined,
    playableDurationMillis: Int | Double = null,
    positionMillis: Int | Double = null,
    progressUpdateIntervalMillis: Int | Double = null,
    rate: Int | Double = null,
    shouldCorrectPitch: js.UndefOr[Boolean] = js.undefined,
    shouldPlay: js.UndefOr[Boolean] = js.undefined,
    uri: String = null,
    volume: Int | Double = null
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

