package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaUrls extends StObject {
  
  def getFullMediaUrl(): String
  
  def getPreviewMediaUrl(): String
  
  def getShrunkenMediaUrl(): String
  
  def getVideoThumbnailMediaUrl(): String
}
object MediaUrls {
  
  inline def apply(
    getFullMediaUrl: () => String,
    getPreviewMediaUrl: () => String,
    getShrunkenMediaUrl: () => String,
    getVideoThumbnailMediaUrl: () => String
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullMediaUrl = js.Any.fromFunction0(getFullMediaUrl), getPreviewMediaUrl = js.Any.fromFunction0(getPreviewMediaUrl), getShrunkenMediaUrl = js.Any.fromFunction0(getShrunkenMediaUrl), getVideoThumbnailMediaUrl = js.Any.fromFunction0(getVideoThumbnailMediaUrl))
    __obj.asInstanceOf[MediaUrls]
  }
  
  extension [Self <: MediaUrls](x: Self) {
    
    inline def setGetFullMediaUrl(value: () => String): Self = StObject.set(x, "getFullMediaUrl", js.Any.fromFunction0(value))
    
    inline def setGetPreviewMediaUrl(value: () => String): Self = StObject.set(x, "getPreviewMediaUrl", js.Any.fromFunction0(value))
    
    inline def setGetShrunkenMediaUrl(value: () => String): Self = StObject.set(x, "getShrunkenMediaUrl", js.Any.fromFunction0(value))
    
    inline def setGetVideoThumbnailMediaUrl(value: () => String): Self = StObject.set(x, "getVideoThumbnailMediaUrl", js.Any.fromFunction0(value))
  }
}
