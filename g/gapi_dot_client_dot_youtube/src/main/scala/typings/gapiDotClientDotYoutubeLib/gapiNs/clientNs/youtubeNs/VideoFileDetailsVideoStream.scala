package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetailsVideoStream extends js.Object {
  /** The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed. */
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  /** The video stream's bitrate, in bits per second. */
  var bitrateBps: js.UndefOr[java.lang.String] = js.undefined
  /** The video codec that the stream uses. */
  var codec: js.UndefOr[java.lang.String] = js.undefined
  /** The video stream's frame rate, in frames per second. */
  var frameRateFps: js.UndefOr[scala.Double] = js.undefined
  /** The encoded video content's height in pixels. */
  var heightPixels: js.UndefOr[scala.Double] = js.undefined
  /** The amount that YouTube needs to rotate the original source content to properly display the video. */
  var rotation: js.UndefOr[java.lang.String] = js.undefined
  /** A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code. */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
  /** The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels. */
  var widthPixels: js.UndefOr[scala.Double] = js.undefined
}

object VideoFileDetailsVideoStream {
  @scala.inline
  def apply(
    aspectRatio: scala.Int | scala.Double = null,
    bitrateBps: java.lang.String = null,
    codec: java.lang.String = null,
    frameRateFps: scala.Int | scala.Double = null,
    heightPixels: scala.Int | scala.Double = null,
    rotation: java.lang.String = null,
    vendor: java.lang.String = null,
    widthPixels: scala.Int | scala.Double = null
  ): VideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps)
    if (codec != null) __obj.updateDynamic("codec")(codec)
    if (frameRateFps != null) __obj.updateDynamic("frameRateFps")(frameRateFps.asInstanceOf[js.Any])
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileDetailsVideoStream]
  }
}

