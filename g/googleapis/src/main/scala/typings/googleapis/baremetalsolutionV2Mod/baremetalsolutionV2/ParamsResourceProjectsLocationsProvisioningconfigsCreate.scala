package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProvisioningconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Email provided to send a confirmation with provisioning config to.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent project and location containing the ProvisioningConfig.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProvisioningConfig] = js.undefined
}
object ParamsResourceProjectsLocationsProvisioningconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsProvisioningconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProvisioningconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProvisioningconfigsCreate](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaProvisioningConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
