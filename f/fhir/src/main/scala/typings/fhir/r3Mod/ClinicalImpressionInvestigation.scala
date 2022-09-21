package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalImpressionInvestigation
  extends StObject
     with BackboneElement {
  
  /**
    * A name/code for the group ("set") of investigations. Typically, this will be something like "signs", "symptoms", "clinical", "diagnostic", but the list is not constrained, and others such groups such as (exposure|family|travel|nutitirional) history may be used.
    */
  var code: CodeableConcept
  
  /**
    * Most investigations are observations of one kind of or another but some other specific types of data collection resources can also be used.
    */
  var item: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ClinicalImpressionInvestigation {
  
  inline def apply(code: CodeableConcept): ClinicalImpressionInvestigation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionInvestigation]
  }
  
  extension [Self <: ClinicalImpressionInvestigation](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Array[Reference]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: Reference*): Self = StObject.set(x, "item", js.Array(value*))
  }
}
