package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCapacityCommitmentsResponse extends StObject {
  
  /**
    * List of capacity commitments visible to the user.
    */
  var capacityCommitments: js.UndefOr[js.Array[SchemaCapacityCommitment]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCapacityCommitmentsResponse {
  
  inline def apply(): SchemaListCapacityCommitmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCapacityCommitmentsResponse]
  }
  
  extension [Self <: SchemaListCapacityCommitmentsResponse](x: Self) {
    
    inline def setCapacityCommitments(value: js.Array[SchemaCapacityCommitment]): Self = StObject.set(x, "capacityCommitments", value.asInstanceOf[js.Any])
    
    inline def setCapacityCommitmentsUndefined: Self = StObject.set(x, "capacityCommitments", js.undefined)
    
    inline def setCapacityCommitmentsVarargs(value: SchemaCapacityCommitment*): Self = StObject.set(x, "capacityCommitments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
