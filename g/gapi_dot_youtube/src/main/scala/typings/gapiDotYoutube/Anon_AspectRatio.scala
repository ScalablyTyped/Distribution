package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  /**
    * The video contents display aspect ratio, which specifies the aspect ratio in which the video should be displayed.
    */
  var aspectRatio: Double
  /**
    * The video streams bitrate, in bits per second.
    */
  var bitrateBps: Double
  /**
    * The video codec that the stream uses.
    */
  var codec: String
  /**
    * The video streams frame rate, in frames per second.
    */
  var frameRateFps: Double
  /**
    * The encoded video contents height in pixels.
    */
  var heightPixels: Double
  /**
    * The amount that YouTube needs to rotate the original source content to properly display the video.
    */
  var rotation: String
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vender: String
  /**
    * The encoded video contents width in pixels.
    */
  var widthPixels: Double
}

object Anon_AspectRatio {
  @scala.inline
  def apply(
    aspectRatio: Double,
    bitrateBps: Double,
    codec: String,
    frameRateFps: Double,
    heightPixels: Double,
    rotation: String,
    vender: String,
    widthPixels: Double
  ): Anon_AspectRatio = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio, bitrateBps = bitrateBps, codec = codec, frameRateFps = frameRateFps, heightPixels = heightPixels, rotation = rotation, vender = vender, widthPixels = widthPixels)
  
    __obj.asInstanceOf[Anon_AspectRatio]
  }
}

