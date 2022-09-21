package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanPlanSpecificCost
  extends StObject
     with BackboneElement {
  
  /**
    * List of the specific benefits under this category of benefit.
    */
  var benefit: js.UndefOr[js.Array[InsurancePlanPlanSpecificCostBenefit]] = js.undefined
  
  /**
    * General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).
    */
  var category: CodeableConcept
}
object InsurancePlanPlanSpecificCost {
  
  inline def apply(category: CodeableConcept): InsurancePlanPlanSpecificCost = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsurancePlanPlanSpecificCost]
  }
  
  extension [Self <: InsurancePlanPlanSpecificCost](x: Self) {
    
    inline def setBenefit(value: js.Array[InsurancePlanPlanSpecificCostBenefit]): Self = StObject.set(x, "benefit", value.asInstanceOf[js.Any])
    
    inline def setBenefitUndefined: Self = StObject.set(x, "benefit", js.undefined)
    
    inline def setBenefitVarargs(value: InsurancePlanPlanSpecificCostBenefit*): Self = StObject.set(x, "benefit", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
  }
}
