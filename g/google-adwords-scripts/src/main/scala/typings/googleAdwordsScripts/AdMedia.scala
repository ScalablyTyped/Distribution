package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Media
@js.native
trait AdMedia extends js.Object {
  
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
  implicit class AdMediaOps[Self <: AdMedia] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: () => AdWordsSelector[Media]): Self = this.set("media", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewImageBuilder(value: () => ImageBuilder[Media]): Self = this.set("newImageBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMediaBundleBuilder(value: () => MediaBundleBuilder[Media]): Self = this.set("newMediaBundleBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewVideoBuilder(value: () => VideoBuilder[Media]): Self = this.set("newVideoBuilder", js.Any.fromFunction0(value))
  }
}
