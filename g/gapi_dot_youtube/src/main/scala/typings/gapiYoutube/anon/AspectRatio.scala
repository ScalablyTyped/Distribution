package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AspectRatio extends js.Object {
  /**
    * The video contents display aspect ratio, which specifies the aspect ratio in which the video should be displayed.
    */
  var aspectRatio: Double = js.native
  /**
    * The video streams bitrate, in bits per second.
    */
  var bitrateBps: Double = js.native
  /**
    * The video codec that the stream uses.
    */
  var codec: String = js.native
  /**
    * The video streams frame rate, in frames per second.
    */
  var frameRateFps: Double = js.native
  /**
    * The encoded video contents height in pixels.
    */
  var heightPixels: Double = js.native
  /**
    * The amount that YouTube needs to rotate the original source content to properly display the video.
    */
  var rotation: String = js.native
  /**
    * A value that uniquely identifies a video vendor. Typically, the value is a four-letter vendor code.
    */
  var vender: String = js.native
  /**
    * The encoded video contents width in pixels.
    */
  var widthPixels: Double = js.native
}

object AspectRatio {
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
  ): AspectRatio = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], bitrateBps = bitrateBps.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], frameRateFps = frameRateFps.asInstanceOf[js.Any], heightPixels = heightPixels.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], vender = vender.asInstanceOf[js.Any], widthPixels = widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRatio]
  }
  @scala.inline
  implicit class AspectRatioOps[Self <: AspectRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitrateBps(value: Double): Self = this.set("bitrateBps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameRateFps(value: Double): Self = this.set("frameRateFps", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeightPixels(value: Double): Self = this.set("heightPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: String): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setVender(value: String): Self = this.set("vender", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthPixels(value: Double): Self = this.set("widthPixels", value.asInstanceOf[js.Any])
  }
  
}

