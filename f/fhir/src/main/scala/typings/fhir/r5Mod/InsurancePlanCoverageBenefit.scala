package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanCoverageBenefit
  extends StObject
     with BackboneElement {
  
  var _requirement: js.UndefOr[Element] = js.undefined
  
  /**
    * The specific limits on the benefit.
    */
  var limit: js.UndefOr[js.Array[InsurancePlanCoverageBenefitLimit]] = js.undefined
  
  /**
    * The referral requirements to have access/coverage for this benefit.
    */
  var requirement: js.UndefOr[String] = js.undefined
  
  /**
    * Type of benefit (primary care; speciality care; inpatient; outpatient).
    */
  var `type`: CodeableConcept
}
object InsurancePlanCoverageBenefit {
  
  inline def apply(`type`: CodeableConcept): InsurancePlanCoverageBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsurancePlanCoverageBenefit]
  }
  
  extension [Self <: InsurancePlanCoverageBenefit](x: Self) {
    
    inline def setLimit(value: js.Array[InsurancePlanCoverageBenefitLimit]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLimitVarargs(value: InsurancePlanCoverageBenefitLimit*): Self = StObject.set(x, "limit", js.Array(value*))
    
    inline def setRequirement(value: String): Self = StObject.set(x, "requirement", value.asInstanceOf[js.Any])
    
    inline def setRequirementUndefined: Self = StObject.set(x, "requirement", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_requirement(value: Element): Self = StObject.set(x, "_requirement", value.asInstanceOf[js.Any])
    
    inline def set_requirementUndefined: Self = StObject.set(x, "_requirement", js.undefined)
  }
}
