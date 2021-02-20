package typings.fsExtra.anon

import typings.std.Int8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferInt8ArrayBytesWrittenNumber extends StObject {
  
  var buffer: Int8Array = js.native
  
  var bytesWritten: Double = js.native
}
object BufferInt8ArrayBytesWrittenNumber {
  
  @scala.inline
  def apply(buffer: Int8Array, bytesWritten: Double): BufferInt8ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8ArrayBytesWrittenNumber]
  }
  
  @scala.inline
  implicit class BufferInt8ArrayBytesWrittenNumberMutableBuilder[Self <: BufferInt8ArrayBytesWrittenNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Int8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
