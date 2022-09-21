package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbillsUpdateRequest extends StObject {
  
  var amount: String
  
  var currency: js.UndefOr[String] = js.undefined
  
  var reference: String
}
object EbillsUpdateRequest {
  
  inline def apply(amount: String, reference: String): EbillsUpdateRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbillsUpdateRequest]
  }
  
  extension [Self <: EbillsUpdateRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
