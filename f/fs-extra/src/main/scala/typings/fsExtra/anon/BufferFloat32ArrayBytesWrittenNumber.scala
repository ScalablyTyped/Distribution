package typings.fsExtra.anon

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferFloat32ArrayBytesWrittenNumber extends StObject {
  
  var buffer: Float32Array
  
  var bytesWritten: Double
}
object BufferFloat32ArrayBytesWrittenNumber {
  
  inline def apply(buffer: Float32Array, bytesWritten: Double): BufferFloat32ArrayBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat32ArrayBytesWrittenNumber]
  }
  
  extension [Self <: BufferFloat32ArrayBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: Float32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
