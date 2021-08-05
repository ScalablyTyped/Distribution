package typings.fsExtra.anon

import typings.std.DataView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferDataViewBytesWrittenNumber extends StObject {
  
  var buffer: DataView
  
  var bytesWritten: Double
}
object BufferDataViewBytesWrittenNumber {
  
  inline def apply(buffer: DataView, bytesWritten: Double): BufferDataViewBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataViewBytesWrittenNumber]
  }
  
  extension [Self <: BufferDataViewBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: DataView): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
