package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityResponseInsurance
  extends StObject
     with BackboneElement {
  
  var _inforce: js.UndefOr[Element] = js.undefined
  
  /**
    * The term of the benefits documented in this response.
    */
  var benefitPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.
    */
  var coverage: Reference
  
  /**
    * Flag indicating if the coverage provided is inforce currently if no service date(s) specified or for the whole duration of the service dates.
    */
  var inforce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Benefits and optionally current balances, and authorization details by category or service.
    */
  var item: js.UndefOr[js.Array[CoverageEligibilityResponseInsuranceItem]] = js.undefined
}
object CoverageEligibilityResponseInsurance {
  
  inline def apply(coverage: Reference): CoverageEligibilityResponseInsurance = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityResponseInsurance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageEligibilityResponseInsurance] (val x: Self) extends AnyVal {
    
    inline def setBenefitPeriod(value: Period): Self = StObject.set(x, "benefitPeriod", value.asInstanceOf[js.Any])
    
    inline def setBenefitPeriodUndefined: Self = StObject.set(x, "benefitPeriod", js.undefined)
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setInforce(value: Boolean): Self = StObject.set(x, "inforce", value.asInstanceOf[js.Any])
    
    inline def setInforceUndefined: Self = StObject.set(x, "inforce", js.undefined)
    
    inline def setItem(value: js.Array[CoverageEligibilityResponseInsuranceItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: CoverageEligibilityResponseInsuranceItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def set_inforce(value: Element): Self = StObject.set(x, "_inforce", value.asInstanceOf[js.Any])
    
    inline def set_inforceUndefined: Self = StObject.set(x, "_inforce", js.undefined)
  }
}
