package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse extends StObject {
  
  /**
    * The Cloud Identity accounts associated with the domain.
    */
  var cloudIdentityAccounts: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount]] = js.undefined
}
object SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse](x: Self) {
    
    inline def setCloudIdentityAccounts(value: js.Array[SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount]): Self = StObject.set(x, "cloudIdentityAccounts", value.asInstanceOf[js.Any])
    
    inline def setCloudIdentityAccountsUndefined: Self = StObject.set(x, "cloudIdentityAccounts", js.undefined)
    
    inline def setCloudIdentityAccountsVarargs(value: SchemaGoogleCloudChannelV1CloudIdentityCustomerAccount*): Self = StObject.set(x, "cloudIdentityAccounts", js.Array(value*))
  }
}
