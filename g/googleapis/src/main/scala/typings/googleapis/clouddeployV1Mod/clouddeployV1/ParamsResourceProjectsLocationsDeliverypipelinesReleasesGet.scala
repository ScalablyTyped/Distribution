package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the `Release`. Format must be projects/{project_id\}/locations/{location_name\}/deliveryPipelines/{pipeline_name\}/releases/{release_name\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDeliverypipelinesReleasesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
