package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency extends StObject {
  
  var AccountId: Double
  
  var createdAt: String
  
  var currency: String
  
  var deletedAt: String
  
  var fee: Double
  
  var fee_type: String
  
  var id: Double
  
  var updatedAt: String
}
object Currency {
  
  inline def apply(
    AccountId: Double,
    createdAt: String,
    currency: String,
    deletedAt: String,
    fee: Double,
    fee_type: String,
    id: Double,
    updatedAt: String
  ): Currency = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], deletedAt = deletedAt.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], fee_type = fee_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDeletedAt(value: String): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
    
    inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFee_type(value: String): Self = StObject.set(x, "fee_type", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
