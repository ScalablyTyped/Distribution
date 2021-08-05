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
  
  inline def apply(buffer: Uint32Array, bytesWritten: Double): BytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWrittenNumber]
  }
  
  extension [Self <: BytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: Uint32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
