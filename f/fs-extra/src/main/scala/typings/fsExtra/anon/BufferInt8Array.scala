package typings.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt8Array extends StObject {
  
  var buffer: js.typedarray.Int8Array
  
  var bytesRead: Double
}
object BufferInt8Array {
  
  inline def apply(buffer: js.typedarray.Int8Array, bytesRead: Double): BufferInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8Array]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferInt8Array] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Int8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
