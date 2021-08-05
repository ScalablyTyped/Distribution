package typings.fsExtra.anon

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferDataView extends StObject {
  
  var buffer: DataView
  
  var bytesRead: Double
}
object BufferDataView {
  
  inline def apply(buffer: DataView, bytesRead: Double): BufferDataView = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataView]
  }
  
  extension [Self <: BufferDataView](x: Self) {
    
    inline def setBuffer(value: DataView): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
