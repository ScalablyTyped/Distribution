package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapacitycommitmentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character cannot be a dash. Max length is 64 characters. NOTE: this ID won't be kept if the capacity commitment is split or merged.
    */
  var capacityCommitmentId: js.UndefOr[String] = js.undefined
  
  /**
    * If true, fail the request if another project in the organization has a capacity commitment.
    */
  var enforceSingleAdminProjectPerOrg: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Resource name of the parent reservation. E.g., `projects/myproject/locations/US`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCapacityCommitment] = js.undefined
}
object ParamsResourceProjectsLocationsCapacitycommitmentsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsCapacitycommitmentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapacitycommitmentsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapacitycommitmentsCreate](x: Self) {
    
    inline def setCapacityCommitmentId(value: String): Self = StObject.set(x, "capacityCommitmentId", value.asInstanceOf[js.Any])
    
    inline def setCapacityCommitmentIdUndefined: Self = StObject.set(x, "capacityCommitmentId", js.undefined)
    
    inline def setEnforceSingleAdminProjectPerOrg(value: Boolean): Self = StObject.set(x, "enforceSingleAdminProjectPerOrg", value.asInstanceOf[js.Any])
    
    inline def setEnforceSingleAdminProjectPerOrgUndefined: Self = StObject.set(x, "enforceSingleAdminProjectPerOrg", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCapacityCommitment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
