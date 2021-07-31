package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details by insurance coverage
  */
trait EligibilityResponseInsurance
  extends StObject
     with BackboneElement {
  
  /**
    * Benefits by Category
    */
  var benefitBalance: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalance]] = js.undefined
  
  /**
    * Contract details
    */
  var contract: js.UndefOr[Reference] = js.undefined
  
  /**
    * Updated Coverage details
    */
  var coverage: js.UndefOr[Reference] = js.undefined
}
object EligibilityResponseInsurance {
  
  @scala.inline
  def apply(): EligibilityResponseInsurance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EligibilityResponseInsurance]
  }
  
  @scala.inline
  implicit class EligibilityResponseInsuranceMutableBuilder[Self <: EligibilityResponseInsurance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenefitBalance(value: js.Array[EligibilityResponseInsuranceBenefitBalance]): Self = StObject.set(x, "benefitBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenefitBalanceUndefined: Self = StObject.set(x, "benefitBalance", js.undefined)
    
    @scala.inline
    def setBenefitBalanceVarargs(value: EligibilityResponseInsuranceBenefitBalance*): Self = StObject.set(x, "benefitBalance", js.Array(value :_*))
    
    @scala.inline
    def setContract(value: Reference): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    @scala.inline
    def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
  }
}
