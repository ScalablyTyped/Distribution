package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Media
@js.native
trait AdMedia extends StObject {
  
  def media(): AdWordsSelector[Media] = js.native
  
  def newImageBuilder(): ImageBuilder[Media] = js.native
  
  def newMediaBundleBuilder(): MediaBundleBuilder[Media] = js.native
  
  def newVideoBuilder(): VideoBuilder[Media] = js.native
}
object AdMedia {
  
  @scala.inline
  def apply(
    media: () => AdWordsSelector[Media],
    newImageBuilder: () => ImageBuilder[Media],
    newMediaBundleBuilder: () => MediaBundleBuilder[Media],
    newVideoBuilder: () => VideoBuilder[Media]
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = js.Any.fromFunction0(media), newImageBuilder = js.Any.fromFunction0(newImageBuilder), newMediaBundleBuilder = js.Any.fromFunction0(newMediaBundleBuilder), newVideoBuilder = js.Any.fromFunction0(newVideoBuilder))
    __obj.asInstanceOf[AdMedia]
  }
  
  @scala.inline
  implicit class AdMediaMutableBuilder[Self <: AdMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: () => AdWordsSelector[Media]): Self = StObject.set(x, "media", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewImageBuilder(value: () => ImageBuilder[Media]): Self = StObject.set(x, "newImageBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMediaBundleBuilder(value: () => MediaBundleBuilder[Media]): Self = StObject.set(x, "newMediaBundleBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewVideoBuilder(value: () => VideoBuilder[Media]): Self = StObject.set(x, "newVideoBuilder", js.Any.fromFunction0(value))
  }
}
