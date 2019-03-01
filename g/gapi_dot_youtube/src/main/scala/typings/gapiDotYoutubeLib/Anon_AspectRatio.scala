package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  /**
    * The video contents display aspect ratio, which specifies the aspect ratio in which the video should be displayed.
    */
  var aspectRatio: scala.Double
  /**
    * The video streams bitrate, in bits per second.
    */
  var bitrateBps: scala.Double
  /**
    * The video codec that the stream uses.
    */
  var codec: java.lang.String
  /**
    * The video streams frame rate, in frames per second.
    */
  var frameRateFps: scala.Double
  /**
    * The encoded video contents height in pixels.
    */
  var heightPixels: scala.Double
  /**
    * The amount that YouTube needs to rotate the original source content to properly display the video.
    */
  var rotation: java.lang.String
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vender: java.lang.String
  /**
    * The encoded video contents width in pixels.
    */
  var widthPixels: scala.Double
}

object Anon_AspectRatio {
  @scala.inline
  def apply(
    aspectRatio: scala.Double,
    bitrateBps: scala.Double,
    codec: java.lang.String,
    frameRateFps: scala.Double,
    heightPixels: scala.Double,
    rotation: java.lang.String,
    vender: java.lang.String,
    widthPixels: scala.Double
  ): Anon_AspectRatio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aspectRatio")(aspectRatio)
    __obj.updateDynamic("bitrateBps")(bitrateBps)
    __obj.updateDynamic("codec")(codec)
    __obj.updateDynamic("frameRateFps")(frameRateFps)
    __obj.updateDynamic("heightPixels")(heightPixels)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("vender")(vender)
    __obj.updateDynamic("widthPixels")(widthPixels)
    __obj.asInstanceOf[Anon_AspectRatio]
  }
}

