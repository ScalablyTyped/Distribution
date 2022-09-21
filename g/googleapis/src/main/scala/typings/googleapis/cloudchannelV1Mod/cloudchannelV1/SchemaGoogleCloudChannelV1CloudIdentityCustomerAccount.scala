package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount extends StObject {
  
  /**
    * If existing = true, the Cloud Identity ID of the customer.
    */
  var customerCloudIdentityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If owned = true, the name of the customer that owns the Cloud Identity account. Customer_name uses the format: accounts/{account_id\}/customers/{customer_id\}
    */
  var customerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Returns true if a Cloud Identity account exists for a specific domain.
    */
  var existing: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Returns true if the Cloud Identity account is associated with a customer of the Channel Services partner.
    */
  var owned: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount {
  
  inline def apply(): SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount](x: Self) {
    
    inline def setCustomerCloudIdentityId(value: String): Self = StObject.set(x, "customerCloudIdentityId", value.asInstanceOf[js.Any])
    
    inline def setCustomerCloudIdentityIdNull: Self = StObject.set(x, "customerCloudIdentityId", null)
    
    inline def setCustomerCloudIdentityIdUndefined: Self = StObject.set(x, "customerCloudIdentityId", js.undefined)
    
    inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
    
    inline def setCustomerNameNull: Self = StObject.set(x, "customerName", null)
    
    inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
    
    inline def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    inline def setExistingNull: Self = StObject.set(x, "existing", null)
    
    inline def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
    
    inline def setOwned(value: Boolean): Self = StObject.set(x, "owned", value.asInstanceOf[js.Any])
    
    inline def setOwnedNull: Self = StObject.set(x, "owned", null)
    
    inline def setOwnedUndefined: Self = StObject.set(x, "owned", js.undefined)
  }
}
