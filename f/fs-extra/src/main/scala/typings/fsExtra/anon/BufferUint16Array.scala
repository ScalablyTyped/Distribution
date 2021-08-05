package typings.fsExtra.anon

import typings.std.Uint16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferUint16Array extends StObject {
  
  var buffer: Uint16Array
  
  var bytesWritten: Double
}
object BufferUint16Array {
  
  inline def apply(buffer: Uint16Array, bytesWritten: Double): BufferUint16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint16Array]
  }
  
  extension [Self <: BufferUint16Array](x: Self) {
    
    inline def setBuffer(value: Uint16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
