package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrames extends js.Object {
  var frames: String
  var mp4: String
  var mp4_size: String
  var size: String
  var webp: String
  var webp_size: String
}

object AnonFrames {
  @scala.inline
  def apply(frames: String, mp4: String, mp4_size: String, size: String, webp: String, webp_size: String): AnonFrames = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFrames]
  }
}

