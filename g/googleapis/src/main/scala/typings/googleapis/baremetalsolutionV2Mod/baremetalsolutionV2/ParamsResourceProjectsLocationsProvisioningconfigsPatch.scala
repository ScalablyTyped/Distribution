package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProvisioningconfigsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Email provided to send a confirmation with provisioning config to.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The name of the provisioning config.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProvisioningConfig] = js.undefined
  
  /**
    * Required. The list of fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsProvisioningconfigsPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsProvisioningconfigsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProvisioningconfigsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProvisioningconfigsPatch](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaProvisioningConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
