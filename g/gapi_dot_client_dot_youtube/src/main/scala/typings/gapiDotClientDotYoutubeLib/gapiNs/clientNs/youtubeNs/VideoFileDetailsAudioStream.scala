package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetailsAudioStream extends js.Object {
  /** The audio stream's bitrate, in bits per second. */
  var bitrateBps: js.UndefOr[java.lang.String] = js.undefined
  /** The number of audio channels that the stream contains. */
  var channelCount: js.UndefOr[scala.Double] = js.undefined
  /** The audio codec that the stream uses. */
  var codec: js.UndefOr[java.lang.String] = js.undefined
  /** A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code. */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

object VideoFileDetailsAudioStream {
  @scala.inline
  def apply(
    bitrateBps: java.lang.String = null,
    channelCount: scala.Int | scala.Double = null,
    codec: java.lang.String = null,
    vendor: java.lang.String = null
  ): VideoFileDetailsAudioStream = {
    val __obj = js.Dynamic.literal()
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps)
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[VideoFileDetailsAudioStream]
  }
}

