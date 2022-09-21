package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCheckcloudidentityaccountsexist
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The reseller account's resource name. Parent uses the format: accounts/{account_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest] = js.undefined
}
object ParamsResourceAccountsCheckcloudidentityaccountsexist {
  
  inline def apply(): ParamsResourceAccountsCheckcloudidentityaccountsexist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCheckcloudidentityaccountsexist]
  }
  
  extension [Self <: ParamsResourceAccountsCheckcloudidentityaccountsexist](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
