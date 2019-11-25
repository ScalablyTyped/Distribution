package typings.giphyDashApi.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseImage extends js.Object {
  var height: String
  var url: String
  var width: String
}

object BaseImage {
  @scala.inline
  def apply(height: String, url: String, width: String): BaseImage = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseImage]
  }
}

