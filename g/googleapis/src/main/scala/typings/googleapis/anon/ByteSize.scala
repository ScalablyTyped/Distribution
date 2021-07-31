package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteSize extends StObject {
  
  var byteSize: js.UndefOr[Double] = js.undefined
  
  var contextLink: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var thumbnailHeight: js.UndefOr[Double] = js.undefined
  
  var thumbnailLink: js.UndefOr[String] = js.undefined
  
  var thumbnailWidth: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ByteSize {
  
  @scala.inline
  def apply(): ByteSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteSize]
  }
  
  @scala.inline
  implicit class ByteSizeMutableBuilder[Self <: ByteSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteSizeUndefined: Self = StObject.set(x, "byteSize", js.undefined)
    
    @scala.inline
    def setContextLink(value: String): Self = StObject.set(x, "contextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextLinkUndefined: Self = StObject.set(x, "contextLink", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setThumbnailHeight(value: Double): Self = StObject.set(x, "thumbnailHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailHeightUndefined: Self = StObject.set(x, "thumbnailHeight", js.undefined)
    
    @scala.inline
    def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
    
    @scala.inline
    def setThumbnailWidth(value: Double): Self = StObject.set(x, "thumbnailWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailWidthUndefined: Self = StObject.set(x, "thumbnailWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
