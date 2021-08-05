package typings.fsExtra.anon

import typings.std.Int32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt32ArrayBytesWrittenNumber extends StObject {
  
  var buffer: Int32Array
  
  var bytesWritten: Double
}
object BufferInt32ArrayBytesWrittenNumber {
  
  inline def apply(buffer: Int32Array, bytesWritten: Double): BufferInt32ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt32ArrayBytesWrittenNumber]
  }
  
  extension [Self <: BufferInt32ArrayBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: Int32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
