package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityRequestInsurance
  extends StObject
     with BackboneElement {
  
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  
  var _focal: js.UndefOr[Element] = js.undefined
  
  /**
    * A business agreement number established between the provider and the insurer for special business processing purposes.
    */
  var businessArrangement: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.
    */
  var coverage: Reference
  
  /**
    * A patient may (will) have multiple insurance policies which provide reimburement for healthcare services and products. For example a person may also be covered by their spouse's policy and both appear in the list (and may be from the same insurer). This flag will be set to true for only one of the listed policies and that policy will be used for evaluating this request. Other requests would be created to request evaluation against the other listed policies.
    */
  var focal: js.UndefOr[Boolean] = js.undefined
}
object CoverageEligibilityRequestInsurance {
  
  inline def apply(coverage: Reference): CoverageEligibilityRequestInsurance = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityRequestInsurance]
  }
  
  extension [Self <: CoverageEligibilityRequestInsurance](x: Self) {
    
    inline def setBusinessArrangement(value: String): Self = StObject.set(x, "businessArrangement", value.asInstanceOf[js.Any])
    
    inline def setBusinessArrangementUndefined: Self = StObject.set(x, "businessArrangement", js.undefined)
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setFocal(value: Boolean): Self = StObject.set(x, "focal", value.asInstanceOf[js.Any])
    
    inline def setFocalUndefined: Self = StObject.set(x, "focal", js.undefined)
    
    inline def set_businessArrangement(value: Element): Self = StObject.set(x, "_businessArrangement", value.asInstanceOf[js.Any])
    
    inline def set_businessArrangementUndefined: Self = StObject.set(x, "_businessArrangement", js.undefined)
    
    inline def set_focal(value: Element): Self = StObject.set(x, "_focal", value.asInstanceOf[js.Any])
    
    inline def set_focalUndefined: Self = StObject.set(x, "_focal", js.undefined)
  }
}
