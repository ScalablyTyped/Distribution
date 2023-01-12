package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanPlanSpecificCostBenefit
  extends StObject
     with BackboneElement {
  
  /**
    * List of the costs associated with a specific benefit.
    */
  var cost: js.UndefOr[js.Array[InsurancePlanPlanSpecificCostBenefitCost]] = js.undefined
  
  /**
    * Type of specific benefit (preventative; primary care office visit; speciality office visit; hospitalization; emergency room; urgent care).
    */
  var `type`: CodeableConcept
}
object InsurancePlanPlanSpecificCostBenefit {
  
  inline def apply(`type`: CodeableConcept): InsurancePlanPlanSpecificCostBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsurancePlanPlanSpecificCostBenefit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsurancePlanPlanSpecificCostBenefit] (val x: Self) extends AnyVal {
    
    inline def setCost(value: js.Array[InsurancePlanPlanSpecificCostBenefitCost]): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setCostVarargs(value: InsurancePlanPlanSpecificCostBenefitCost*): Self = StObject.set(x, "cost", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
