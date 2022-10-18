package typings.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt8ArrayBytesWrittenNumber extends StObject {
  
  var buffer: js.typedarray.Int8Array
  
  var bytesWritten: Double
}
object BufferInt8ArrayBytesWrittenNumber {
  
  inline def apply(buffer: js.typedarray.Int8Array, bytesWritten: Double): BufferInt8ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8ArrayBytesWrittenNumber]
  }
  
  extension [Self <: BufferInt8ArrayBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: js.typedarray.Int8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
