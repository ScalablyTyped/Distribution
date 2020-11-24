package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaUrls extends js.Object {
  
  def getFullMediaUrl(): String = js.native
  
  def getPreviewMediaUrl(): String = js.native
  
  def getShrunkenMediaUrl(): String = js.native
  
  def getVideoThumbnailMediaUrl(): String = js.native
}
object MediaUrls {
  
  @scala.inline
  def apply(
    getFullMediaUrl: () => String,
    getPreviewMediaUrl: () => String,
    getShrunkenMediaUrl: () => String,
    getVideoThumbnailMediaUrl: () => String
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullMediaUrl = js.Any.fromFunction0(getFullMediaUrl), getPreviewMediaUrl = js.Any.fromFunction0(getPreviewMediaUrl), getShrunkenMediaUrl = js.Any.fromFunction0(getShrunkenMediaUrl), getVideoThumbnailMediaUrl = js.Any.fromFunction0(getVideoThumbnailMediaUrl))
    __obj.asInstanceOf[MediaUrls]
  }
  
  @scala.inline
  implicit class MediaUrlsOps[Self <: MediaUrls] (val x: Self) extends AnyVal {
    
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
    def setGetFullMediaUrl(value: () => String): Self = this.set("getFullMediaUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviewMediaUrl(value: () => String): Self = this.set("getPreviewMediaUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShrunkenMediaUrl(value: () => String): Self = this.set("getShrunkenMediaUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVideoThumbnailMediaUrl(value: () => String): Self = this.set("getVideoThumbnailMediaUrl", js.Any.fromFunction0(value))
  }
}
