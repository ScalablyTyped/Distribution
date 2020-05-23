package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileDetailsVideoStream extends js.Object {
  /** The video content's display aspect ratio, which specifies the aspect ratio in which the video should be displayed. */
  var aspectRatio: js.UndefOr[Double] = js.undefined
  /** The video stream's bitrate, in bits per second. */
  var bitrateBps: js.UndefOr[String] = js.undefined
  /** The video codec that the stream uses. */
  var codec: js.UndefOr[String] = js.undefined
  /** The video stream's frame rate, in frames per second. */
  var frameRateFps: js.UndefOr[Double] = js.undefined
  /** The encoded video content's height in pixels. */
  var heightPixels: js.UndefOr[Double] = js.undefined
  /** The amount that YouTube needs to rotate the original source content to properly display the video. */
  var rotation: js.UndefOr[String] = js.undefined
  /** A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code. */
  var vendor: js.UndefOr[String] = js.undefined
  /** The encoded video content's width in pixels. You can calculate the video's encoding aspect ratio as width_pixels / height_pixels. */
  var widthPixels: js.UndefOr[Double] = js.undefined
}

object VideoFileDetailsVideoStream {
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[Double] = js.undefined,
    bitrateBps: String = null,
    codec: String = null,
    frameRateFps: js.UndefOr[Double] = js.undefined,
    heightPixels: js.UndefOr[Double] = js.undefined,
    rotation: String = null,
    vendor: String = null,
    widthPixels: js.UndefOr[Double] = js.undefined
  ): VideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps.asInstanceOf[js.Any])
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRateFps)) __obj.updateDynamic("frameRateFps")(frameRateFps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPixels)) __obj.updateDynamic("heightPixels")(heightPixels.get.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPixels)) __obj.updateDynamic("widthPixels")(widthPixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileDetailsVideoStream]
  }
}

