package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDimensions extends js.Object {
  
  def getFullMediaDimensions(): Dimensions = js.native
  
  def getPreviewMediaDimensions(): Dimensions = js.native
  
  def getShrunkenMediaDimensions(): Dimensions = js.native
  
  def getVideoThumbnailDimensions(): Dimensions = js.native
}
object MediaDimensions {
  
  @scala.inline
  def apply(
    getFullMediaDimensions: () => Dimensions,
    getPreviewMediaDimensions: () => Dimensions,
    getShrunkenMediaDimensions: () => Dimensions,
    getVideoThumbnailDimensions: () => Dimensions
  ): MediaDimensions = {
    val __obj = js.Dynamic.literal(getFullMediaDimensions = js.Any.fromFunction0(getFullMediaDimensions), getPreviewMediaDimensions = js.Any.fromFunction0(getPreviewMediaDimensions), getShrunkenMediaDimensions = js.Any.fromFunction0(getShrunkenMediaDimensions), getVideoThumbnailDimensions = js.Any.fromFunction0(getVideoThumbnailDimensions))
    __obj.asInstanceOf[MediaDimensions]
  }
  
  @scala.inline
  implicit class MediaDimensionsOps[Self <: MediaDimensions] (val x: Self) extends AnyVal {
    
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
    def setGetFullMediaDimensions(value: () => Dimensions): Self = this.set("getFullMediaDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviewMediaDimensions(value: () => Dimensions): Self = this.set("getPreviewMediaDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShrunkenMediaDimensions(value: () => Dimensions): Self = this.set("getShrunkenMediaDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVideoThumbnailDimensions(value: () => Dimensions): Self = this.set("getVideoThumbnailDimensions", js.Any.fromFunction0(value))
  }
}
