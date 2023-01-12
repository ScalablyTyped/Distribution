package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualCardsCreateRequest extends StObject {
  
  var amount: String
  
  var billing_address: js.UndefOr[String] = js.undefined
  
  var billing_city: js.UndefOr[String] = js.undefined
  
  var billing_country: js.UndefOr[String] = js.undefined
  
  var billing_name: String
  
  var billing_postal_code: js.UndefOr[String] = js.undefined
  
  var billing_state: js.UndefOr[String] = js.undefined
  
  var callback_url: js.UndefOr[String] = js.undefined
  
  var currency: String
}
object VirtualCardsCreateRequest {
  
  inline def apply(amount: String, billing_name: String, currency: String): VirtualCardsCreateRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], billing_name = billing_name.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualCardsCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualCardsCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBilling_address(value: String): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
    
    inline def setBilling_addressUndefined: Self = StObject.set(x, "billing_address", js.undefined)
    
    inline def setBilling_city(value: String): Self = StObject.set(x, "billing_city", value.asInstanceOf[js.Any])
    
    inline def setBilling_cityUndefined: Self = StObject.set(x, "billing_city", js.undefined)
    
    inline def setBilling_country(value: String): Self = StObject.set(x, "billing_country", value.asInstanceOf[js.Any])
    
    inline def setBilling_countryUndefined: Self = StObject.set(x, "billing_country", js.undefined)
    
    inline def setBilling_name(value: String): Self = StObject.set(x, "billing_name", value.asInstanceOf[js.Any])
    
    inline def setBilling_postal_code(value: String): Self = StObject.set(x, "billing_postal_code", value.asInstanceOf[js.Any])
    
    inline def setBilling_postal_codeUndefined: Self = StObject.set(x, "billing_postal_code", js.undefined)
    
    inline def setBilling_state(value: String): Self = StObject.set(x, "billing_state", value.asInstanceOf[js.Any])
    
    inline def setBilling_stateUndefined: Self = StObject.set(x, "billing_state", js.undefined)
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setCallback_urlUndefined: Self = StObject.set(x, "callback_url", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
  }
}
