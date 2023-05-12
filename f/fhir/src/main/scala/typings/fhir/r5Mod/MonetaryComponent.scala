package typings.fhir.r5Mod

import typings.fhir.fhirStrings.base
import typings.fhir.fhirStrings.deduction
import typings.fhir.fhirStrings.discount
import typings.fhir.fhirStrings.informational
import typings.fhir.fhirStrings.surcharge
import typings.fhir.fhirStrings.tax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonetaryComponent
  extends StObject
     with Element {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Explicit value amount to be used.
    */
  var amount: js.UndefOr[Money] = js.undefined
  
  /**
    * Codes may be used to differentiate between kinds of taxes, surcharges, discounts etc.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Factor used for calculating this component.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * base | surcharge | deduction | discount | tax | informational.
    */
  var `type`: base | surcharge | deduction | discount | tax | informational
}
object MonetaryComponent {
  
  inline def apply(`type`: base | surcharge | deduction | discount | tax | informational): MonetaryComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonetaryComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonetaryComponent] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setType(value: base | surcharge | deduction | discount | tax | informational): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
