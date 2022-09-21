package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDeliverypipelinesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the `DeliveryPipeline`. Format must be projects/{project_id\}/locations/{location_name\}/deliveryPipelines/{pipeline_name\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDeliverypipelinesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDeliverypipelinesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDeliverypipelinesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDeliverypipelinesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
