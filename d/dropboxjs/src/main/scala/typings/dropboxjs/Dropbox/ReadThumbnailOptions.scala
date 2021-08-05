package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadThumbnailOptions
  extends StObject
     with ThumbnailUrlOptions {
  
  var arrayBuffer: js.UndefOr[Boolean] = js.undefined
  
  var blob: js.UndefOr[Boolean] = js.undefined
  
  var buffer: js.UndefOr[Boolean] = js.undefined
}
object ReadThumbnailOptions {
  
  inline def apply(): ReadThumbnailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadThumbnailOptions]
  }
  
  extension [Self <: ReadThumbnailOptions](x: Self) {
    
    inline def setArrayBuffer(value: Boolean): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setArrayBufferUndefined: Self = StObject.set(x, "arrayBuffer", js.undefined)
    
    inline def setBlob(value: Boolean): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
  }
}
