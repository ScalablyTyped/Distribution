package typings.fsExtra.anon

import typings.std.Float64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferFloat64ArrayBytesWrittenNumber extends StObject {
  
  var buffer: Float64Array = js.native
  
  var bytesWritten: Double = js.native
}
object BufferFloat64ArrayBytesWrittenNumber {
  
  @scala.inline
  def apply(buffer: Float64Array, bytesWritten: Double): BufferFloat64ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat64ArrayBytesWrittenNumber]
  }
  
  @scala.inline
  implicit class BufferFloat64ArrayBytesWrittenNumberMutableBuilder[Self <: BufferFloat64ArrayBytesWrittenNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Float64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
