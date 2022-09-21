package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSubmitprovisioningconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The target location of the provisioning request.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The target project of the provisioning request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubmitProvisioningConfigRequest] = js.undefined
}
object ParamsResourceProjectsLocationsSubmitprovisioningconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsSubmitprovisioningconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSubmitprovisioningconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSubmitprovisioningconfig](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaSubmitProvisioningConfigRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
