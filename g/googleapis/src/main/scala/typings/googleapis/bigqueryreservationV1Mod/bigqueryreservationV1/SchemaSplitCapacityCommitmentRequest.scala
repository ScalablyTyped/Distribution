package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSplitCapacityCommitmentRequest extends StObject {
  
  /**
    * Number of slots in the capacity commitment after the split.
    */
  var slotCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaSplitCapacityCommitmentRequest {
  
  inline def apply(): SchemaSplitCapacityCommitmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplitCapacityCommitmentRequest]
  }
  
  extension [Self <: SchemaSplitCapacityCommitmentRequest](x: Self) {
    
    inline def setSlotCount(value: String): Self = StObject.set(x, "slotCount", value.asInstanceOf[js.Any])
    
    inline def setSlotCountNull: Self = StObject.set(x, "slotCount", null)
    
    inline def setSlotCountUndefined: Self = StObject.set(x, "slotCount", js.undefined)
  }
}
