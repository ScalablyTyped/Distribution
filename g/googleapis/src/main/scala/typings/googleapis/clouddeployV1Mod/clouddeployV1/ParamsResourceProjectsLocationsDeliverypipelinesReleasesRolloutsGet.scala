package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the `Rollout`. Format must be projects/{project_id\}/locations/{location_name\}/deliveryPipelines/{pipeline_name\}/releases/{release_name\}/rollouts/{rollout_name\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDeliverypipelinesReleasesRolloutsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
