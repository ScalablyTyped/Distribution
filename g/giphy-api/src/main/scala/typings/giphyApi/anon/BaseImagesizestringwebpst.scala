package typings.giphyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined giphy-api.giphy-api.BaseImage & {  size :string,   webp :string,   webp_size :string} */
@js.native
trait BaseImagesizestringwebpst extends js.Object {
  var height: String = js.native
  var size: String = js.native
  var url: String = js.native
  var webp: String = js.native
  var webp_size: String = js.native
  var width: String = js.native
}

object BaseImagesizestringwebpst {
  @scala.inline
  def apply(height: String, size: String, url: String, webp: String, webp_size: String, width: String): BaseImagesizestringwebpst = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImagesizestringwebpst]
  }
  @scala.inline
  implicit class BaseImagesizestringwebpstOps[Self <: BaseImagesizestringwebpst] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebp(value: String): Self = this.set("webp", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebp_size(value: String): Self = this.set("webp_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

