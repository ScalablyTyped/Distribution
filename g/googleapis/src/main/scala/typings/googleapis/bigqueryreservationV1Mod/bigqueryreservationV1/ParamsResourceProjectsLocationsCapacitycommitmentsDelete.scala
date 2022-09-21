package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapacitycommitmentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Can be used to force delete commitments even if assignments exist. Deleting commitments with assignments may cause queries to fail if they no longer have access to slots.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Resource name of the capacity commitment to delete. E.g., `projects/myproject/locations/US/capacityCommitments/123`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCapacitycommitmentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsCapacitycommitmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapacitycommitmentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapacitycommitmentsDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
