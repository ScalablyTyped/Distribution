package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMp4 extends js.Object {
  var mp4: String
  var mp4_size: String
  var size: String
  var webp: String
  var webp_size: String
}

object AnonMp4 {
  @scala.inline
  def apply(mp4: String, mp4_size: String, size: String, webp: String, webp_size: String): AnonMp4 = {
    val __obj = js.Dynamic.literal(mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMp4]
  }
}

