package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadThumbnailOptions extends ThumbnailUrlOptions {
  
  var arrayBuffer: js.UndefOr[Boolean] = js.native
  
  var blob: js.UndefOr[Boolean] = js.native
  
  var buffer: js.UndefOr[Boolean] = js.native
}
object ReadThumbnailOptions {
  
  @scala.inline
  def apply(): ReadThumbnailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadThumbnailOptions]
  }
  
  @scala.inline
  implicit class ReadThumbnailOptionsMutableBuilder[Self <: ReadThumbnailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: Boolean): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayBufferUndefined: Self = StObject.set(x, "arrayBuffer", js.undefined)
    
    @scala.inline
    def setBlob(value: Boolean): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
  }
}
