package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageCostToBeneficiary
  extends StObject
     with BackboneElement {
  
  /**
    * A suite of codes indicating exceptions or reductions to patient costs and their effective periods.
    */
  var exception: js.UndefOr[js.Array[CoverageCostToBeneficiaryException]] = js.undefined
  
  /**
    * For example visit, specialist visits, emergency, inpatient care, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Amount may be expressed as a percentage of the service/product cost or a fixed amount of currency.
    */
  var valueMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * Amount may be expressed as a percentage of the service/product cost or a fixed amount of currency.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
}
object CoverageCostToBeneficiary {
  
  inline def apply(): CoverageCostToBeneficiary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageCostToBeneficiary]
  }
  
  extension [Self <: CoverageCostToBeneficiary](x: Self) {
    
    inline def setException(value: js.Array[CoverageCostToBeneficiaryException]): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setExceptionVarargs(value: CoverageCostToBeneficiaryException*): Self = StObject.set(x, "exception", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueMoney(value: Money): Self = StObject.set(x, "valueMoney", value.asInstanceOf[js.Any])
    
    inline def setValueMoneyUndefined: Self = StObject.set(x, "valueMoney", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
  }
}
