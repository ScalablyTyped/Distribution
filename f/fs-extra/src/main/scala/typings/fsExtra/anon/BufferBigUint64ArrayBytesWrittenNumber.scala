package typings.fsExtra.anon

import typings.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferBigUint64ArrayBytesWrittenNumber extends StObject {
  
  var buffer: BigUint64Array
  
  var bytesWritten: Double
}
object BufferBigUint64ArrayBytesWrittenNumber {
  
  inline def apply(buffer: BigUint64Array, bytesWritten: Double): BufferBigUint64ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBigUint64ArrayBytesWrittenNumber]
  }
  
  extension [Self <: BufferBigUint64ArrayBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: BigUint64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
