package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyFocus
  extends StObject
     with BackboneElement {
  
  var _factor: js.UndefOr[Element] = js.undefined
  
  /**
    * A factor corresponds to an independent variable manipulated by the experimentalist with the intention to affect biological systems in a way that can be measured by an assay.
    */
  var factor: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the focus is a medication, a device, a procedure, a specific factor or some other intervention or characteristic.
    */
  var focusType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Identification of product under study.  This may be any combination of code and/or name.
    */
  var productCode: js.UndefOr[CodeableConcept] = js.undefined
}
object ResearchStudyFocus {
  
  inline def apply(): ResearchStudyFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResearchStudyFocus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudyFocus] (val x: Self) extends AnyVal {
    
    inline def setFactor(value: String): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setFocusType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "focusType", value.asInstanceOf[js.Any])
    
    inline def setFocusTypeUndefined: Self = StObject.set(x, "focusType", js.undefined)
    
    inline def setFocusTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "focusType", js.Array(value*))
    
    inline def setProductCode(value: CodeableConcept): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def set_factor(value: Element): Self = StObject.set(x, "_factor", value.asInstanceOf[js.Any])
    
    inline def set_factorUndefined: Self = StObject.set(x, "_factor", js.undefined)
  }
}
