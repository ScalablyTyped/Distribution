package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisDeploymentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID to use for the deployment, which will become the final component of the deployment's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
    */
  var apiDeploymentId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent, which owns this collection of deployments. Format: projects/x/locations/x/apis/x
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApiDeployment] = js.undefined
}
object ParamsResourceProjectsLocationsApisDeploymentsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsApisDeploymentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisDeploymentsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisDeploymentsCreate](x: Self) {
    
    inline def setApiDeploymentId(value: String): Self = StObject.set(x, "apiDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setApiDeploymentIdUndefined: Self = StObject.set(x, "apiDeploymentId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaApiDeployment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
