package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubmitProvisioningConfigRequest extends StObject {
  
  /**
    * Optional. Email provided to send a confirmation with provisioning config to.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The ProvisioningConfig to create.
    */
  var provisioningConfig: js.UndefOr[SchemaProvisioningConfig] = js.undefined
}
object SchemaSubmitProvisioningConfigRequest {
  
  inline def apply(): SchemaSubmitProvisioningConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitProvisioningConfigRequest]
  }
  
  extension [Self <: SchemaSubmitProvisioningConfigRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setProvisioningConfig(value: SchemaProvisioningConfig): Self = StObject.set(x, "provisioningConfig", value.asInstanceOf[js.Any])
    
    inline def setProvisioningConfigUndefined: Self = StObject.set(x, "provisioningConfig", js.undefined)
  }
}
