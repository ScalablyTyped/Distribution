package typings.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferFloat32Array extends StObject {
  
  var buffer: js.typedarray.Float32Array
  
  var bytesRead: Double
}
object BufferFloat32Array {
  
  inline def apply(buffer: js.typedarray.Float32Array, bytesRead: Double): BufferFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat32Array]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferFloat32Array] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Float32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
