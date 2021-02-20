package typings.fsExtra.anon

import typings.std.Uint16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferUint16Array extends StObject {
  
  var buffer: Uint16Array = js.native
  
  var bytesWritten: Double = js.native
}
object BufferUint16Array {
  
  @scala.inline
  def apply(buffer: Uint16Array, bytesWritten: Double): BufferUint16Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferUint16Array]
  }
  
  @scala.inline
  implicit class BufferUint16ArrayMutableBuilder[Self <: BufferUint16Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Uint16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
