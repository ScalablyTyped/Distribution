package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customertoken extends StObject {
  
  var AccountId: Double
  
  var createdAt: Double
  
  var customertoken: Any
  
  var deletedAt: Any
  
  var email: Double
  
  var fullName: Double
  
  var id: Double
  
  var phone: Double
  
  var updatedAt: Double
}
object Customertoken {
  
  inline def apply(
    AccountId: Double,
    createdAt: Double,
    customertoken: Any,
    deletedAt: Any,
    email: Double,
    fullName: Double,
    id: Double,
    phone: Double,
    updatedAt: Double
  ): Customertoken = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], customertoken = customertoken.asInstanceOf[js.Any], deletedAt = deletedAt.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customertoken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Customertoken] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCustomertoken(value: Any): Self = StObject.set(x, "customertoken", value.asInstanceOf[js.Any])
    
    inline def setDeletedAt(value: Any): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: Double): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFullName(value: Double): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: Double): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
