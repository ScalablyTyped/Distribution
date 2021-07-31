package typings.fsExtra.anon

import typings.std.Int8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt8Array extends StObject {
  
  var buffer: Int8Array
  
  var bytesRead: Double
}
object BufferInt8Array {
  
  @scala.inline
  def apply(buffer: Int8Array, bytesRead: Double): BufferInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt8Array]
  }
  
  @scala.inline
  implicit class BufferInt8ArrayMutableBuilder[Self <: BufferInt8Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Int8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
