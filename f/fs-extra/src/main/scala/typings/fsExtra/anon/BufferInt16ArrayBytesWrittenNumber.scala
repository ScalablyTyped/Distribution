package typings.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt16ArrayBytesWrittenNumber extends StObject {
  
  var buffer: js.typedarray.Int16Array
  
  var bytesWritten: Double
}
object BufferInt16ArrayBytesWrittenNumber {
  
  inline def apply(buffer: js.typedarray.Int16Array, bytesWritten: Double): BufferInt16ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt16ArrayBytesWrittenNumber]
  }
  
  extension [Self <: BufferInt16ArrayBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: js.typedarray.Int16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
