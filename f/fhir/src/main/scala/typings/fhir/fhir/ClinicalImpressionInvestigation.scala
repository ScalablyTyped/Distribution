package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One or more sets of investigations (signs, symptions, etc.)
  */
trait ClinicalImpressionInvestigation
  extends StObject
     with BackboneElement {
  
  /**
    * A name/code for the set
    */
  var code: CodeableConcept
  
  /**
    * Record of a specific investigation
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
    
    inline def setItemVarargs(value: Reference*): Self = StObject.set(x, "item", js.Array(value :_*))
  }
}
