package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerVideo extends StObject {
  
  var customType: js.UndefOr[Any] = js.undefined
  
  var defaultQuality: js.UndefOr[Double] = js.undefined
  
  var pic: js.UndefOr[String] = js.undefined
  
  var quality: js.UndefOr[js.Array[DPlayerVideoQuality]] = js.undefined
  
  var thumbnails: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[VideoType | String] = js.undefined
  
  var url: String
}
object DPlayerVideo {
  
  inline def apply(url: String): DPlayerVideo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerVideo]
  }
  
  extension [Self <: DPlayerVideo](x: Self) {
    
    inline def setCustomType(value: Any): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setDefaultQuality(value: Double): Self = StObject.set(x, "defaultQuality", value.asInstanceOf[js.Any])
    
    inline def setDefaultQualityUndefined: Self = StObject.set(x, "defaultQuality", js.undefined)
    
    inline def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    inline def setPicUndefined: Self = StObject.set(x, "pic", js.undefined)
    
    inline def setQuality(value: js.Array[DPlayerVideoQuality]): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setQualityVarargs(value: DPlayerVideoQuality*): Self = StObject.set(x, "quality", js.Array(value*))
    
    inline def setThumbnails(value: String): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setType(value: VideoType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
