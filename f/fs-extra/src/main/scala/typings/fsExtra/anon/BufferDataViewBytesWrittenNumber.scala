package typings.fsExtra.anon

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferDataViewBytesWrittenNumber extends StObject {
  
  var buffer: DataView = js.native
  
  var bytesWritten: Double = js.native
}
object BufferDataViewBytesWrittenNumber {
  
  @scala.inline
  def apply(buffer: DataView, bytesWritten: Double): BufferDataViewBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataViewBytesWrittenNumber]
  }
  
  @scala.inline
  implicit class BufferDataViewBytesWrittenNumberMutableBuilder[Self <: BufferDataViewBytesWrittenNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: DataView): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
