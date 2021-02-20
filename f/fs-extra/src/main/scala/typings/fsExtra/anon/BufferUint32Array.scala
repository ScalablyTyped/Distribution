package typings.fsExtra.anon

import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferUint32Array extends StObject {
  
  var buffer: Uint32Array = js.native
  
  var bytesRead: Double = js.native
}
object BufferUint32Array {
  
  @scala.inline
  def apply(buffer: Uint32Array, bytesRead: Double): BufferUint32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint32Array]
  }
  
  @scala.inline
  implicit class BufferUint32ArrayMutableBuilder[Self <: BufferUint32Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Uint32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
