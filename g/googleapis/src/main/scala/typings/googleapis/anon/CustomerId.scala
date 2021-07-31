package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerId extends StObject {
  
  var customerId: js.UndefOr[String] = js.undefined
  
  var entityId: js.UndefOr[String] = js.undefined
  
  var profileId: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var userEmail: js.UndefOr[String] = js.undefined
}
object CustomerId {
  
  @scala.inline
  def apply(): CustomerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerId]
  }
  
  @scala.inline
  implicit class CustomerIdMutableBuilder[Self <: CustomerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
