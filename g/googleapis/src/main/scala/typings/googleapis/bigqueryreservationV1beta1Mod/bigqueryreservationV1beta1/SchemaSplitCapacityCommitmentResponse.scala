package typings.googleapis.bigqueryreservationV1beta1Mod.bigqueryreservationV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSplitCapacityCommitmentResponse extends StObject {
  
  /**
    * First capacity commitment, result of a split.
    */
  var first: js.UndefOr[SchemaCapacityCommitment] = js.undefined
  
  /**
    * Second capacity commitment, result of a split.
    */
  var second: js.UndefOr[SchemaCapacityCommitment] = js.undefined
}
object SchemaSplitCapacityCommitmentResponse {
  
  inline def apply(): SchemaSplitCapacityCommitmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplitCapacityCommitmentResponse]
  }
  
  extension [Self <: SchemaSplitCapacityCommitmentResponse](x: Self) {
    
    inline def setFirst(value: SchemaCapacityCommitment): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setSecond(value: SchemaCapacityCommitment): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
  }
}
