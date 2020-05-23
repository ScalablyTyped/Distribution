package typings.giphyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: String
  var mp4: String
  var mp4_size: String
  var width: String
}

object Height {
  @scala.inline
  def apply(height: String, mp4: String, mp4_size: String, width: String): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

