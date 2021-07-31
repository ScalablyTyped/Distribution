package typings.fsExtra.anon

import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesWrittenNumber extends StObject {
  
  var buffer: Uint32Array
  
  var bytesWritten: Double
}
object BytesWrittenNumber {
  
  @scala.inline
  def apply(buffer: Uint32Array, bytesWritten: Double): BytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWrittenNumber]
  }
  
  @scala.inline
  implicit class BytesWrittenNumberMutableBuilder[Self <: BytesWrittenNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Uint32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
