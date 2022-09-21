package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Dimensions for different sizes of a media object. */
trait MediaDimensions extends StObject {
  
  /** Returns dimensions for the full size of the media object. */
  def getFullDimensions(): Dimensions
  
  /** Returns dimensions for the preview size of the media object. */
  def getPreviewDimensions(): Dimensions
  
  /** Returns dimensions for the shrunken size of the media object. */
  def getShrunkenDimensions(): Dimensions
  
  /** Returns dimensions for the video thumbnail size of the media object. */
  def getVideoThumbnailDimensions(): Dimensions
}
object MediaDimensions {
  
  inline def apply(
    getFullDimensions: () => Dimensions,
    getPreviewDimensions: () => Dimensions,
    getShrunkenDimensions: () => Dimensions,
    getVideoThumbnailDimensions: () => Dimensions
  ): MediaDimensions = {
    val __obj = js.Dynamic.literal(getFullDimensions = js.Any.fromFunction0(getFullDimensions), getPreviewDimensions = js.Any.fromFunction0(getPreviewDimensions), getShrunkenDimensions = js.Any.fromFunction0(getShrunkenDimensions), getVideoThumbnailDimensions = js.Any.fromFunction0(getVideoThumbnailDimensions))
    __obj.asInstanceOf[MediaDimensions]
  }
  
  extension [Self <: MediaDimensions](x: Self) {
    
    inline def setGetFullDimensions(value: () => Dimensions): Self = StObject.set(x, "getFullDimensions", js.Any.fromFunction0(value))
    
    inline def setGetPreviewDimensions(value: () => Dimensions): Self = StObject.set(x, "getPreviewDimensions", js.Any.fromFunction0(value))
    
    inline def setGetShrunkenDimensions(value: () => Dimensions): Self = StObject.set(x, "getShrunkenDimensions", js.Any.fromFunction0(value))
    
    inline def setGetVideoThumbnailDimensions(value: () => Dimensions): Self = StObject.set(x, "getVideoThumbnailDimensions", js.Any.fromFunction0(value))
  }
}
