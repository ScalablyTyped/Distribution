package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferSize extends StObject {
  
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var fd: js.UndefOr[String] = js.undefined
  
  var flags: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
}
object BufferSize {
  
  inline def apply(): BufferSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferSize]
  }
  
  extension [Self <: BufferSize](x: Self) {
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
