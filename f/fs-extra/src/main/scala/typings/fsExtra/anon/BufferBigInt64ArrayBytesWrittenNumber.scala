package typings.fsExtra.anon

import typings.std.BigInt64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferBigInt64ArrayBytesWrittenNumber extends StObject {
  
  var buffer: BigInt64Array
  
  var bytesWritten: Double
}
object BufferBigInt64ArrayBytesWrittenNumber {
  
  inline def apply(buffer: BigInt64Array, bytesWritten: Double): BufferBigInt64ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBigInt64ArrayBytesWrittenNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferBigInt64ArrayBytesWrittenNumber] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: BigInt64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
