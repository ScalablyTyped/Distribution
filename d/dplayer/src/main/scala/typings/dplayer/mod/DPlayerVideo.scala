package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerVideo extends StObject {
  
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
  implicit class DPlayerVideoMutableBuilder[Self <: DPlayerVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomType(value: js.Any): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    @scala.inline
    def setDefaultQuality(value: Double): Self = StObject.set(x, "defaultQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultQualityUndefined: Self = StObject.set(x, "defaultQuality", js.undefined)
    
    @scala.inline
    def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicUndefined: Self = StObject.set(x, "pic", js.undefined)
    
    @scala.inline
    def setQuality(value: js.Array[DPlayerVideoQuality]): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setQualityVarargs(value: DPlayerVideoQuality*): Self = StObject.set(x, "quality", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: String): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setType(value: VideoType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
