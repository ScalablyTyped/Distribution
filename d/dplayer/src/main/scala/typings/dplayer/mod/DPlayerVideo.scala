package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerVideo extends js.Object {
  
  var customType: js.UndefOr[js.Any] = js.native
  
  var defaultQuality: js.UndefOr[Double] = js.native
  
  var pic: js.UndefOr[String] = js.native
  
  var quality: js.UndefOr[js.Array[DPlayerVideoQuality]] = js.native
  
  var thumbnails: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[VideoType | String] = js.native
  
  var url: String = js.native
}
object DPlayerVideo {
  
  @scala.inline
  def apply(url: String): DPlayerVideo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerVideo]
  }
  
  @scala.inline
  implicit class DPlayerVideoOps[Self <: DPlayerVideo] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomType(value: js.Any): Self = this.set("customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    
    @scala.inline
    def setDefaultQuality(value: Double): Self = this.set("defaultQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultQuality: Self = this.set("defaultQuality", js.undefined)
    
    @scala.inline
    def setPic(value: String): Self = this.set("pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePic: Self = this.set("pic", js.undefined)
    
    @scala.inline
    def setQualityVarargs(value: DPlayerVideoQuality*): Self = this.set("quality", js.Array(value :_*))
    
    @scala.inline
    def setQuality(value: js.Array[DPlayerVideoQuality]): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setThumbnails(value: String): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    
    @scala.inline
    def setType(value: VideoType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
