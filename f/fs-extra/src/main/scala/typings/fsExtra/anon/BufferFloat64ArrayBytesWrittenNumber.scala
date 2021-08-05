package typings.fsExtra.anon

import typings.std.Float64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferFloat64ArrayBytesWrittenNumber extends StObject {
  
  var buffer: Float64Array
  
  var bytesWritten: Double
}
object BufferFloat64ArrayBytesWrittenNumber {
  
  inline def apply(buffer: Float64Array, bytesWritten: Double): BufferFloat64ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat64ArrayBytesWrittenNumber]
  }
  
  extension [Self <: BufferFloat64ArrayBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: Float64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
