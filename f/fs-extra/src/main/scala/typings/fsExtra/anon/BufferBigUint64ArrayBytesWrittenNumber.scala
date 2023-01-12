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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferBigUint64ArrayBytesWrittenNumber] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: BigUint64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
