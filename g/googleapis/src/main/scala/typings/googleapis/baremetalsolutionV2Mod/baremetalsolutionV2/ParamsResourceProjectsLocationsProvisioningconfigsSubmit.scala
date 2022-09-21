package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProvisioningconfigsSubmit
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent project and location containing the ProvisioningConfig.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubmitProvisioningConfigRequest] = js.undefined
}
object ParamsResourceProjectsLocationsProvisioningconfigsSubmit {
  
  inline def apply(): ParamsResourceProjectsLocationsProvisioningconfigsSubmit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProvisioningconfigsSubmit]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProvisioningconfigsSubmit](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSubmitProvisioningConfigRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
