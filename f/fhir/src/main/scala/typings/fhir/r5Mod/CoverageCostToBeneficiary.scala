package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageCostToBeneficiary
  extends StObject
     with BackboneElement {
  
  /**
    * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A suite of codes indicating exceptions or reductions to patient costs and their effective periods.
    */
  var exception: js.UndefOr[js.Array[CoverageCostToBeneficiaryException]] = js.undefined
  
  /**
    * Is a flag to indicate whether the benefits refer to in-network providers or out-of-network providers.
    */
  var network: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual visits'.
    */
  var term: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For example visit, specialist visits, emergency, inpatient care, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates if the benefits apply to an individual or to the family.
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageCostToBeneficiary] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setException(value: js.Array[CoverageCostToBeneficiaryException]): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setExceptionVarargs(value: CoverageCostToBeneficiaryException*): Self = StObject.set(x, "exception", js.Array(value*))
    
    inline def setNetwork(value: CodeableConcept): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setTerm(value: CodeableConcept): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValueMoney(value: Money): Self = StObject.set(x, "valueMoney", value.asInstanceOf[js.Any])
    
    inline def setValueMoneyUndefined: Self = StObject.set(x, "valueMoney", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
  }
}
