package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Root object for fetching and creating media objects. */
trait AdMedia extends StObject {
  
  /** Returns a selector for all media in the account. */
  def media(): MediaSelector
  
  /** Returns a builder to upload an image. */
  def newImageBuilder(): ImageBuilder
  
  /** Returns a builder to upload a media bundle. */
  def newMediaBundleBuilder(): MediaBundleBuilder
  
  /** Returns a builder to upload a video. */
  def newVideoBuilder(): VideoBuilder
}
object AdMedia {
  
  inline def apply(
    media: () => MediaSelector,
    newImageBuilder: () => ImageBuilder,
    newMediaBundleBuilder: () => MediaBundleBuilder,
    newVideoBuilder: () => VideoBuilder
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = js.Any.fromFunction0(media), newImageBuilder = js.Any.fromFunction0(newImageBuilder), newMediaBundleBuilder = js.Any.fromFunction0(newMediaBundleBuilder), newVideoBuilder = js.Any.fromFunction0(newVideoBuilder))
    __obj.asInstanceOf[AdMedia]
  }
  
  extension [Self <: AdMedia](x: Self) {
    
    inline def setMedia(value: () => MediaSelector): Self = StObject.set(x, "media", js.Any.fromFunction0(value))
    
    inline def setNewImageBuilder(value: () => ImageBuilder): Self = StObject.set(x, "newImageBuilder", js.Any.fromFunction0(value))
    
    inline def setNewMediaBundleBuilder(value: () => MediaBundleBuilder): Self = StObject.set(x, "newMediaBundleBuilder", js.Any.fromFunction0(value))
    
    inline def setNewVideoBuilder(value: () => VideoBuilder): Self = StObject.set(x, "newVideoBuilder", js.Any.fromFunction0(value))
  }
}
