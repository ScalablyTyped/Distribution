package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var brand: String
  
  var cardBIN: String
  
  var card_tokens: js.Array[Embedtoken]
  
  var expirymonth: String
  
  var expiryyear: String
  
  var last4digits: String
  
  var life_time_token: String
}
object Brand {
  
  inline def apply(
    brand: String,
    cardBIN: String,
    card_tokens: js.Array[Embedtoken],
    expirymonth: String,
    expiryyear: String,
    last4digits: String,
    life_time_token: String
  ): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], cardBIN = cardBIN.asInstanceOf[js.Any], card_tokens = card_tokens.asInstanceOf[js.Any], expirymonth = expirymonth.asInstanceOf[js.Any], expiryyear = expiryyear.asInstanceOf[js.Any], last4digits = last4digits.asInstanceOf[js.Any], life_time_token = life_time_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCardBIN(value: String): Self = StObject.set(x, "cardBIN", value.asInstanceOf[js.Any])
    
    inline def setCard_tokens(value: js.Array[Embedtoken]): Self = StObject.set(x, "card_tokens", value.asInstanceOf[js.Any])
    
    inline def setCard_tokensVarargs(value: Embedtoken*): Self = StObject.set(x, "card_tokens", js.Array(value*))
    
    inline def setExpirymonth(value: String): Self = StObject.set(x, "expirymonth", value.asInstanceOf[js.Any])
    
    inline def setExpiryyear(value: String): Self = StObject.set(x, "expiryyear", value.asInstanceOf[js.Any])
    
    inline def setLast4digits(value: String): Self = StObject.set(x, "last4digits", value.asInstanceOf[js.Any])
    
    inline def setLife_time_token(value: String): Self = StObject.set(x, "life_time_token", value.asInstanceOf[js.Any])
  }
}
