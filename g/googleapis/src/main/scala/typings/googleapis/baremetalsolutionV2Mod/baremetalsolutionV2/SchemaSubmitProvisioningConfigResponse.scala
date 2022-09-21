package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubmitProvisioningConfigResponse extends StObject {
  
  /**
    * The submitted provisioning config.
    */
  var provisioningConfig: js.UndefOr[SchemaProvisioningConfig] = js.undefined
}
object SchemaSubmitProvisioningConfigResponse {
  
  inline def apply(): SchemaSubmitProvisioningConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitProvisioningConfigResponse]
  }
  
  extension [Self <: SchemaSubmitProvisioningConfigResponse](x: Self) {
    
    inline def setProvisioningConfig(value: SchemaProvisioningConfig): Self = StObject.set(x, "provisioningConfig", value.asInstanceOf[js.Any])
    
    inline def setProvisioningConfigUndefined: Self = StObject.set(x, "provisioningConfig", js.undefined)
  }
}
