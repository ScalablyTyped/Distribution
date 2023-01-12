package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EligibilityResponseInsurance
  extends StObject
     with BackboneElement {
  
  /**
    * Benefits and optionally current balances by Category.
    */
  var benefitBalance: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalance]] = js.undefined
  
  /**
    * The contract resource which may provide more detailed information.
    */
  var contract: js.UndefOr[Reference] = js.undefined
  
  /**
    * A suite of updated or additional Coverages from the Insurer.
    */
  var coverage: js.UndefOr[Reference] = js.undefined
}
object EligibilityResponseInsurance {
  
  inline def apply(): EligibilityResponseInsurance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EligibilityResponseInsurance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EligibilityResponseInsurance] (val x: Self) extends AnyVal {
    
    inline def setBenefitBalance(value: js.Array[EligibilityResponseInsuranceBenefitBalance]): Self = StObject.set(x, "benefitBalance", value.asInstanceOf[js.Any])
    
    inline def setBenefitBalanceUndefined: Self = StObject.set(x, "benefitBalance", js.undefined)
    
    inline def setBenefitBalanceVarargs(value: EligibilityResponseInsuranceBenefitBalance*): Self = StObject.set(x, "benefitBalance", js.Array(value*))
    
    inline def setContract(value: Reference): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
  }
}
