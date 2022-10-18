package typings.fsExtra.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferDataViewBytesWrittenNumber extends StObject {
  
  var buffer: js.typedarray.DataView
  
  var bytesWritten: Double
}
object BufferDataViewBytesWrittenNumber {
  
  inline def apply(buffer: js.typedarray.DataView, bytesWritten: Double): BufferDataViewBytesWrittenNumber = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferDataViewBytesWrittenNumber]
  }
  
  extension [Self <: BufferDataViewBytesWrittenNumber](x: Self) {
    
    inline def setBuffer(value: js.typedarray.DataView): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
