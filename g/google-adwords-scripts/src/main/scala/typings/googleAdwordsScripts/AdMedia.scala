package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Media
trait AdMedia extends StObject {
  
  def media(): AdWordsSelector[Media]
  
  def newImageBuilder(): ImageBuilder[Media]
  
  def newMediaBundleBuilder(): MediaBundleBuilder[Media]
  
  def newVideoBuilder(): VideoBuilder[Media]
}
object AdMedia {
  
  inline def apply(
    media: () => AdWordsSelector[Media],
    newImageBuilder: () => ImageBuilder[Media],
    newMediaBundleBuilder: () => MediaBundleBuilder[Media],
    newVideoBuilder: () => VideoBuilder[Media]
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = js.Any.fromFunction0(media), newImageBuilder = js.Any.fromFunction0(newImageBuilder), newMediaBundleBuilder = js.Any.fromFunction0(newMediaBundleBuilder), newVideoBuilder = js.Any.fromFunction0(newVideoBuilder))
    __obj.asInstanceOf[AdMedia]
  }
  
  extension [Self <: AdMedia](x: Self) {
    
    inline def setMedia(value: () => AdWordsSelector[Media]): Self = StObject.set(x, "media", js.Any.fromFunction0(value))
    
    inline def setNewImageBuilder(value: () => ImageBuilder[Media]): Self = StObject.set(x, "newImageBuilder", js.Any.fromFunction0(value))
    
    inline def setNewMediaBundleBuilder(value: () => MediaBundleBuilder[Media]): Self = StObject.set(x, "newMediaBundleBuilder", js.Any.fromFunction0(value))
    
    inline def setNewVideoBuilder(value: () => VideoBuilder[Media]): Self = StObject.set(x, "newVideoBuilder", js.Any.fromFunction0(value))
  }
}
