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

