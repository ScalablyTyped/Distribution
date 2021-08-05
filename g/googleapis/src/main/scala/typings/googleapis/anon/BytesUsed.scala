package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesUsed extends StObject {
  
  var bytesUsed: js.UndefOr[String] = js.undefined
  
  var serviceName: js.UndefOr[String] = js.undefined
}
object BytesUsed {
  
  inline def apply(): BytesUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BytesUsed]
  }
  
  extension [Self <: BytesUsed](x: Self) {
    
    inline def setBytesUsed(value: String): Self = StObject.set(x, "bytesUsed", value.asInstanceOf[js.Any])
    
    inline def setBytesUsedUndefined: Self = StObject.set(x, "bytesUsed", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
