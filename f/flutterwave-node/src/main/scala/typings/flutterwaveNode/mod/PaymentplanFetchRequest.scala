package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentplanFetchRequest extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
}
object PaymentplanFetchRequest {
  
  inline def apply(): PaymentplanFetchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentplanFetchRequest]
  }
  
  extension [Self <: PaymentplanFetchRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
