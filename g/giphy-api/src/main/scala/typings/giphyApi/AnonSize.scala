package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var size: String
  var webp: String
  var webp_size: String
}

object AnonSize {
  @scala.inline
  def apply(size: String, webp: String, webp_size: String): AnonSize = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSize]
  }
}

