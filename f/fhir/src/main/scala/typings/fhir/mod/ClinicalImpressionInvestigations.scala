package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalImpressionInvestigations
  extends StObject
     with BackboneElement {
  
  /**
    * A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.
    */
  var code: CodeableConcept
  
  /**
    * A record of a specific investigation that was undertaken.
    */
  var item: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ClinicalImpressionInvestigations {
  
  inline def apply(code: CodeableConcept): ClinicalImpressionInvestigations = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionInvestigations]
  }
  
  extension [Self <: ClinicalImpressionInvestigations](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Array[Reference]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: Reference*): Self = StObject.set(x, "item", js.Array(value*))
  }
}
