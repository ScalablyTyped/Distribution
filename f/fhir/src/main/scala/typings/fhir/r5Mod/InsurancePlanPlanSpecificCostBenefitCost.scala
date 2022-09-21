package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanPlanSpecificCostBenefitCost
  extends StObject
     with BackboneElement {
  
  /**
    * Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).
    */
  var applicability: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).
    */
  var qualifiers: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Type of cost (copay; individual cap; family cap; coinsurance; deductible).
    */
  var `type`: CodeableConcept
  
  /**
    * The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).
    */
  var value: js.UndefOr[Quantity] = js.undefined
}
object InsurancePlanPlanSpecificCostBenefitCost {
  
  inline def apply(`type`: CodeableConcept): InsurancePlanPlanSpecificCostBenefitCost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsurancePlanPlanSpecificCostBenefitCost]
  }
  
  extension [Self <: InsurancePlanPlanSpecificCostBenefitCost](x: Self) {
    
    inline def setApplicability(value: CodeableConcept): Self = StObject.set(x, "applicability", value.asInstanceOf[js.Any])
    
    inline def setApplicabilityUndefined: Self = StObject.set(x, "applicability", js.undefined)
    
    inline def setQualifiers(value: js.Array[CodeableConcept]): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
    
    inline def setQualifiersUndefined: Self = StObject.set(x, "qualifiers", js.undefined)
    
    inline def setQualifiersVarargs(value: CodeableConcept*): Self = StObject.set(x, "qualifiers", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Quantity): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
