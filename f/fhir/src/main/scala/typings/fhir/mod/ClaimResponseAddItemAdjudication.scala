package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseAddItemAdjudication
  extends StObject
     with BackboneElement {
  
  /**
    * Monetary amount associated with the code.
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Code indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
    */
  var code: Coding
  
  /**
    * A non-monetary value for example a percentage. Mutually exclusive to the amount element above.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ClaimResponseAddItemAdjudication {
  
  inline def apply(code: Coding): ClaimResponseAddItemAdjudication = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseAddItemAdjudication]
  }
  
  extension [Self <: ClaimResponseAddItemAdjudication](x: Self) {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
