package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetailsAudioStream extends js.Object {
  /** The audio stream's bitrate, in bits per second. */
  var bitrateBps: js.UndefOr[String] = js.undefined
  /** The number of audio channels that the stream contains. */
  var channelCount: js.UndefOr[Double] = js.undefined
  /** The audio codec that the stream uses. */
  var codec: js.UndefOr[String] = js.undefined
  /** A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code. */
  var vendor: js.UndefOr[String] = js.undefined
}

object VideoFileDetailsAudioStream {
  @scala.inline
  def apply(
    bitrateBps: String = null,
    channelCount: Int | Double = null,
    codec: String = null,
    vendor: String = null
  ): VideoFileDetailsAudioStream = {
    val __obj = js.Dynamic.literal()
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileDetailsAudioStream]
  }
}

