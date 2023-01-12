package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** URLs for different sizes of a media object. */
trait MediaUrls extends StObject {
  
  /** Returns the URL for the full size of the media object. */
  def getFullUrl(): String
  
  /** Returns the URL for the preview size of the media object. */
  def getPreviewUrl(): String
  
  /** Returns the URL for the shrunken size of the media object. */
  def getShrunkenUrl(): String
  
  /** Returns the URL for the video thumbnail size of the media object. */
  def getVideoThumbnailUrl(): String
}
object MediaUrls {
  
  inline def apply(
    getFullUrl: () => String,
    getPreviewUrl: () => String,
    getShrunkenUrl: () => String,
    getVideoThumbnailUrl: () => String
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullUrl = js.Any.fromFunction0(getFullUrl), getPreviewUrl = js.Any.fromFunction0(getPreviewUrl), getShrunkenUrl = js.Any.fromFunction0(getShrunkenUrl), getVideoThumbnailUrl = js.Any.fromFunction0(getVideoThumbnailUrl))
    __obj.asInstanceOf[MediaUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaUrls] (val x: Self) extends AnyVal {
    
    inline def setGetFullUrl(value: () => String): Self = StObject.set(x, "getFullUrl", js.Any.fromFunction0(value))
    
    inline def setGetPreviewUrl(value: () => String): Self = StObject.set(x, "getPreviewUrl", js.Any.fromFunction0(value))
    
    inline def setGetShrunkenUrl(value: () => String): Self = StObject.set(x, "getShrunkenUrl", js.Any.fromFunction0(value))
    
    inline def setGetVideoThumbnailUrl(value: () => String): Self = StObject.set(x, "getVideoThumbnailUrl", js.Any.fromFunction0(value))
  }
}
