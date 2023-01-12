package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanCoverageBenefitLimit
  extends StObject
     with BackboneElement {
  
  /**
    * Use `CodeableConcept.text` element if the data is free (uncoded) text.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * May also be called “eligible expense,” “payment allowance,” or “negotiated rate.”.
    */
  var value: js.UndefOr[Quantity] = js.undefined
}
object InsurancePlanCoverageBenefitLimit {
  
  inline def apply(): InsurancePlanCoverageBenefitLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsurancePlanCoverageBenefitLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsurancePlanCoverageBenefitLimit] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setValue(value: Quantity): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
