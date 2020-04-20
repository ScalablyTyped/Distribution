package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined giphy-api.giphy-api.BaseImage & {  size  :string} */
trait BaseImagesizestring extends js.Object {
  var height: String
  var size: String
  var url: String
  var width: String
}

object BaseImagesizestring {
  @scala.inline
  def apply(height: String, size: String, url: String, width: String): BaseImagesizestring = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImagesizestring]
  }
}

