package typings.giphyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined giphy-api.giphy-api.BaseImage & {  size :string,   mp4 :string,   mp4_size :string,   webp :string,   webp_size :string} */
@js.native
trait BaseImagesizestringmp4str extends js.Object {
  
  var height: String = js.native
  
  var mp4: String = js.native
  
  var mp4_size: String = js.native
  
  var size: String = js.native
  
  var url: String = js.native
  
  var webp: String = js.native
  
  var webp_size: String = js.native
  
  var width: String = js.native
}
object BaseImagesizestringmp4str {
  
  @scala.inline
  def apply(
    height: String,
    mp4: String,
    mp4_size: String,
    size: String,
    url: String,
    webp: String,
    webp_size: String,
    width: String
  ): BaseImagesizestringmp4str = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mp4 = mp4.asInstanceOf[js.Any], mp4_size = mp4_size.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any], webp_size = webp_size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImagesizestringmp4str]
  }
  
  @scala.inline
  implicit class BaseImagesizestringmp4strOps[Self <: BaseImagesizestringmp4str] (val x: Self) extends AnyVal {
    
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
    def setMp4(value: String): Self = this.set("mp4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMp4_size(value: String): Self = this.set("mp4_size", value.asInstanceOf[js.Any])
    
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
