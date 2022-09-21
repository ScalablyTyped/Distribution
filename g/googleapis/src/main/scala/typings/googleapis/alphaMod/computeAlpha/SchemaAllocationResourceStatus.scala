package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllocationResourceStatus extends StObject {
  
  /**
    * Allocation Properties of this reservation.
    */
  var specificSkuAllocation: js.UndefOr[SchemaAllocationResourceStatusSpecificSKUAllocation] = js.undefined
}
object SchemaAllocationResourceStatus {
  
  inline def apply(): SchemaAllocationResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationResourceStatus]
  }
  
  extension [Self <: SchemaAllocationResourceStatus](x: Self) {
    
    inline def setSpecificSkuAllocation(value: SchemaAllocationResourceStatusSpecificSKUAllocation): Self = StObject.set(x, "specificSkuAllocation", value.asInstanceOf[js.Any])
    
    inline def setSpecificSkuAllocationUndefined: Self = StObject.set(x, "specificSkuAllocation", js.undefined)
  }
}
