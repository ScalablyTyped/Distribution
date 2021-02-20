package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDimensions extends StObject {
  
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
  implicit class MediaDimensionsMutableBuilder[Self <: MediaDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFullMediaDimensions(value: () => Dimensions): Self = StObject.set(x, "getFullMediaDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviewMediaDimensions(value: () => Dimensions): Self = StObject.set(x, "getPreviewMediaDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShrunkenMediaDimensions(value: () => Dimensions): Self = StObject.set(x, "getShrunkenMediaDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVideoThumbnailDimensions(value: () => Dimensions): Self = StObject.set(x, "getVideoThumbnailDimensions", js.Any.fromFunction0(value))
  }
}
