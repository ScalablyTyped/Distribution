package typings.fsExtra.anon

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferBytesWritten extends StObject {
  
  var buffer: Uint8ClampedArray
  
  var bytesWritten: Double
}
object BufferBytesWritten {
  
  inline def apply(buffer: Uint8ClampedArray, bytesWritten: Double): BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesWritten]
  }
  
  extension [Self <: BufferBytesWritten](x: Self) {
    
    inline def setBuffer(value: Uint8ClampedArray): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
