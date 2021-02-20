package typings.fsExtra.anon

import typings.std.Int16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferInt16ArrayBytesWrittenNumber extends StObject {
  
  var buffer: Int16Array = js.native
  
  var bytesWritten: Double = js.native
}
object BufferInt16ArrayBytesWrittenNumber {
  
  @scala.inline
  def apply(buffer: Int16Array, bytesWritten: Double): BufferInt16ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16ArrayBytesWrittenNumber]
  }
  
  @scala.inline
  implicit class BufferInt16ArrayBytesWrittenNumberMutableBuilder[Self <: BufferInt16ArrayBytesWrittenNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Int16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
