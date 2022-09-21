package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsUnregister
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the account.
    */
  var account: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudChannelV1UnregisterSubscriberRequest] = js.undefined
}
object ParamsResourceAccountsUnregister {
  
  inline def apply(): ParamsResourceAccountsUnregister = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsUnregister]
  }
  
  extension [Self <: ParamsResourceAccountsUnregister](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudChannelV1UnregisterSubscriberRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
