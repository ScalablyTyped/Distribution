package typings.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesWrittenNumber extends StObject {
  
  var buffer: js.typedarray.Uint32Array
  
  var bytesWritten: Double
}
object BytesWrittenNumber {
  
  inline def apply(buffer: js.typedarray.Uint32Array, bytesWritten: Double): BytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWrittenNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BytesWrittenNumber] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Uint32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
