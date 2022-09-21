package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Release. Format is projects/{project\}/locations/{location\}/deliveryPipelines/{deliveryPipeline\}/ releases/{release\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAbandonReleaseRequest] = js.undefined
}
object ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon {
  
  inline def apply(): ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDeliverypipelinesReleasesAbandon](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAbandonReleaseRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
