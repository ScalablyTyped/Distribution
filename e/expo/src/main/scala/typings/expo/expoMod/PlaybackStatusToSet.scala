package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackStatusToSet extends js.Object {
  var androidImplementation: js.UndefOr[String] = js.undefined
  var isLooping: js.UndefOr[Boolean] = js.undefined
  var isMuted: js.UndefOr[Boolean] = js.undefined
  var positionMillis: js.UndefOr[Double] = js.undefined
  var progressUpdateIntervalMillis: js.UndefOr[Double] = js.undefined
  /** The desired playback rate of the media. This value must be between `0.0` and `32.0`. Only available on Android API version 23 and later and iOS. */
  var rate: js.UndefOr[Double] = js.undefined
  var shouldCorrectPitch: js.UndefOr[Boolean] = js.undefined
  var shouldPlay: js.UndefOr[Boolean] = js.undefined
  /** A number between `0.0` (silence) and `1.0` (maximum volume). */
  var volume: js.UndefOr[Double] = js.undefined
}

object PlaybackStatusToSet {
  @scala.inline
  def apply(
    androidImplementation: String = null,
    isLooping: js.UndefOr[Boolean] = js.undefined,
    isMuted: js.UndefOr[Boolean] = js.undefined,
    positionMillis: Int | Double = null,
    progressUpdateIntervalMillis: Int | Double = null,
    rate: Int | Double = null,
    shouldCorrectPitch: js.UndefOr[Boolean] = js.undefined,
    shouldPlay: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null
  ): PlaybackStatusToSet = {
    val __obj = js.Dynamic.literal()
    if (androidImplementation != null) __obj.updateDynamic("androidImplementation")(androidImplementation)
    if (!js.isUndefined(isLooping)) __obj.updateDynamic("isLooping")(isLooping)
    if (!js.isUndefined(isMuted)) __obj.updateDynamic("isMuted")(isMuted)
    if (positionMillis != null) __obj.updateDynamic("positionMillis")(positionMillis.asInstanceOf[js.Any])
    if (progressUpdateIntervalMillis != null) __obj.updateDynamic("progressUpdateIntervalMillis")(progressUpdateIntervalMillis.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCorrectPitch)) __obj.updateDynamic("shouldCorrectPitch")(shouldCorrectPitch)
    if (!js.isUndefined(shouldPlay)) __obj.updateDynamic("shouldPlay")(shouldPlay)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackStatusToSet]
  }
}

