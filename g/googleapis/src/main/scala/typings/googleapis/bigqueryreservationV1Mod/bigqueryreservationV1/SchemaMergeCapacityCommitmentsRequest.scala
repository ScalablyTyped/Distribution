package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMergeCapacityCommitmentsRequest extends StObject {
  
  /**
    * Ids of capacity commitments to merge. These capacity commitments must exist under admin project and location specified in the parent. ID is the last portion of capacity commitment name e.g., 'abc' for projects/myproject/locations/US/capacityCommitments/abc
    */
  var capacityCommitmentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaMergeCapacityCommitmentsRequest {
  
  inline def apply(): SchemaMergeCapacityCommitmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeCapacityCommitmentsRequest]
  }
  
  extension [Self <: SchemaMergeCapacityCommitmentsRequest](x: Self) {
    
    inline def setCapacityCommitmentIds(value: js.Array[String]): Self = StObject.set(x, "capacityCommitmentIds", value.asInstanceOf[js.Any])
    
    inline def setCapacityCommitmentIdsNull: Self = StObject.set(x, "capacityCommitmentIds", null)
    
    inline def setCapacityCommitmentIdsUndefined: Self = StObject.set(x, "capacityCommitmentIds", js.undefined)
    
    inline def setCapacityCommitmentIdsVarargs(value: String*): Self = StObject.set(x, "capacityCommitmentIds", js.Array(value*))
  }
}
