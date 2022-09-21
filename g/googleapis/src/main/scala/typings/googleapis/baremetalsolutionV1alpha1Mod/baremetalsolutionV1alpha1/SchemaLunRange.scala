package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLunRange extends StObject {
  
  /**
    * Number of LUNs to create.
    */
  var quantity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The requested size of each LUN, in GB.
    */
  var sizeGb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLunRange {
  
  inline def apply(): SchemaLunRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLunRange]
  }
  
  extension [Self <: SchemaLunRange](x: Self) {
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbNull: Self = StObject.set(x, "sizeGb", null)
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
  }
}
