package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteCount extends StObject {
  
  var byteCount: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ByteCount {
  
  inline def apply(): ByteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteCount]
  }
  
  extension [Self <: ByteCount](x: Self) {
    
    inline def setByteCount(value: String): Self = StObject.set(x, "byteCount", value.asInstanceOf[js.Any])
    
    inline def setByteCountUndefined: Self = StObject.set(x, "byteCount", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
