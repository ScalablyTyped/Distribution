package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalImpressionFinding
  extends StObject
     with BackboneElement {
  
  var _cause: js.UndefOr[Element] = js.undefined
  
  /**
    * Which investigations support finding or diagnosis.
    */
  var cause: js.UndefOr[String] = js.undefined
  
  /**
    * Specific text of code for finding or diagnosis.
    */
  var item: CodeableConcept
}
object ClinicalImpressionFinding {
  
  inline def apply(item: CodeableConcept): ClinicalImpressionFinding = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionFinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalImpressionFinding] (val x: Self) extends AnyVal {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setItem(value: CodeableConcept): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def set_cause(value: Element): Self = StObject.set(x, "_cause", value.asInstanceOf[js.Any])
    
    inline def set_causeUndefined: Self = StObject.set(x, "_cause", js.undefined)
  }
}
