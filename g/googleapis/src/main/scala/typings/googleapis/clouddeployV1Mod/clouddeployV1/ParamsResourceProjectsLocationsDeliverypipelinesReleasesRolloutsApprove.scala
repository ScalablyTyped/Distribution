package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Rollout. Format is projects/{project\}/locations/{location\}/deliveryPipelines/{deliveryPipeline\}/ releases/{release\}/rollouts/{rollout\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApproveRolloutRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove {
  
  inline def apply(): ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsApprove](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaApproveRolloutRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
