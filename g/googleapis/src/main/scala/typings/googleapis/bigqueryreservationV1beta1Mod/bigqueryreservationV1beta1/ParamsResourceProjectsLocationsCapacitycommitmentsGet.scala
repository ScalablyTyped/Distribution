package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapacitycommitmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the capacity commitment to retrieve. E.g., `projects/myproject/locations/US/capacityCommitments/123`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCapacitycommitmentsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsCapacitycommitmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapacitycommitmentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapacitycommitmentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
