package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined giphy-api.giphy-api.BaseImage & {  size  :string,   webp  :string,   webp_size  :string} */
trait BaseImagesizestringwebpst extends js.Object {
  var height: String
  var size: String
  var url: String
  var webp: String
  var webp_size: String
  var width: String
}

object BaseImagesizestringwebpst {
  @scala.inline
  def apply(height: String, size: String, url: String, webp: String, webp_size: String, width: String): BaseImagesizestringwebpst = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseImagesizestringwebpst]
  }
}

