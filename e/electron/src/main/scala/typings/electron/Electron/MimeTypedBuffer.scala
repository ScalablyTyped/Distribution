package typings.electron.Electron

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MimeTypedBuffer extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/mime-typed-buffer
  /**
    * Charset of the buffer.
    */
  var charset: js.UndefOr[String] = js.native
  
  /**
    * The actual Buffer content.
    */
  var data: Buffer = js.native
  
  /**
    * MIME type of the buffer.
    */
  var mimeType: js.UndefOr[String] = js.native
}
object MimeTypedBuffer {
  
  @scala.inline
  def apply(data: Buffer): MimeTypedBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeTypedBuffer]
  }
  
  @scala.inline
  implicit class MimeTypedBufferMutableBuilder[Self <: MimeTypedBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
