package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cardhash extends StObject {
  
  var AccountId: Double
  
  var address_1: String
  
  var address_2: String
  
  var amount: Double
  
  var bin_check_name: String
  
  var card_hash: String
  
  var card_type: String
  
  var cardpan: String
  
  var city: String
  
  var currency: String
  
  var cvv: String
  
  var date_created: String
  
  var expiration: String
  
  var id: Double
  
  var is_active: Boolean
  
  var maskedpan: String
  
  var name_on_card: String
  
  var send_to: String
  
  var state: String
  
  var zip_code: String
}
object Cardhash {
  
  inline def apply(
    AccountId: Double,
    address_1: String,
    address_2: String,
    amount: Double,
    bin_check_name: String,
    card_hash: String,
    card_type: String,
    cardpan: String,
    city: String,
    currency: String,
    cvv: String,
    date_created: String,
    expiration: String,
    id: Double,
    is_active: Boolean,
    maskedpan: String,
    name_on_card: String,
    send_to: String,
    state: String,
    zip_code: String
  ): Cardhash = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], address_1 = address_1.asInstanceOf[js.Any], address_2 = address_2.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], bin_check_name = bin_check_name.asInstanceOf[js.Any], card_hash = card_hash.asInstanceOf[js.Any], card_type = card_type.asInstanceOf[js.Any], cardpan = cardpan.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_active = is_active.asInstanceOf[js.Any], maskedpan = maskedpan.asInstanceOf[js.Any], name_on_card = name_on_card.asInstanceOf[js.Any], send_to = send_to.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip_code = zip_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardhash]
  }
  
  extension [Self <: Cardhash](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAddress_1(value: String): Self = StObject.set(x, "address_1", value.asInstanceOf[js.Any])
    
    inline def setAddress_2(value: String): Self = StObject.set(x, "address_2", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBin_check_name(value: String): Self = StObject.set(x, "bin_check_name", value.asInstanceOf[js.Any])
    
    inline def setCard_hash(value: String): Self = StObject.set(x, "card_hash", value.asInstanceOf[js.Any])
    
    inline def setCard_type(value: String): Self = StObject.set(x, "card_type", value.asInstanceOf[js.Any])
    
    inline def setCardpan(value: String): Self = StObject.set(x, "cardpan", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_active(value: Boolean): Self = StObject.set(x, "is_active", value.asInstanceOf[js.Any])
    
    inline def setMaskedpan(value: String): Self = StObject.set(x, "maskedpan", value.asInstanceOf[js.Any])
    
    inline def setName_on_card(value: String): Self = StObject.set(x, "name_on_card", value.asInstanceOf[js.Any])
    
    inline def setSend_to(value: String): Self = StObject.set(x, "send_to", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setZip_code(value: String): Self = StObject.set(x, "zip_code", value.asInstanceOf[js.Any])
  }
}
