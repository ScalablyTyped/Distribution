package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an audio stream.
  */
@js.native
trait Schema$VideoFileDetailsAudioStream extends js.Object {
  /**
    * The audio stream&#39;s bitrate, in bits per second.
    */
  var bitrateBps: js.UndefOr[String] = js.native
  /**
    * The number of audio channels that the stream contains.
    */
  var channelCount: js.UndefOr[Double] = js.native
  /**
    * The audio codec that the stream uses.
    */
  var codec: js.UndefOr[String] = js.native
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is
    * a four-letter vendor code.
    */
  var vendor: js.UndefOr[String] = js.native
}

object Schema$VideoFileDetailsAudioStream {
  @scala.inline
  def apply(
    bitrateBps: String = null,
    channelCount: Int | Double = null,
    codec: String = null,
    vendor: String = null
  ): Schema$VideoFileDetailsAudioStream = {
    val __obj = js.Dynamic.literal()
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoFileDetailsAudioStream]
  }
}

