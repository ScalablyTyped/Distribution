package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxButtonTypes extends js.Object {
  
  var close: String = js.native
  
  var download: String = js.native
  
  var fullScreen: String = js.native
  
  var share: String = js.native
  
  var slideShow: String = js.native
  
  var thumbs: String = js.native
  
  var zoom: String = js.native
}
object FancyBoxButtonTypes {
  
  @scala.inline
  def apply(
    close: String,
    download: String,
    fullScreen: String,
    share: String,
    slideShow: String,
    thumbs: String,
    zoom: String
  ): FancyBoxButtonTypes = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], slideShow = slideShow.asInstanceOf[js.Any], thumbs = thumbs.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxButtonTypes]
  }
  
  @scala.inline
  implicit class FancyBoxButtonTypesOps[Self <: FancyBoxButtonTypes] (val x: Self) extends AnyVal {
    
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: String): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare(value: String): Self = this.set("share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShow(value: String): Self = this.set("slideShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbs(value: String): Self = this.set("thumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: String): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
