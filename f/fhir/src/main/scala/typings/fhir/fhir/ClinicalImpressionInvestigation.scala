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
  
  @scala.inline
  def apply(code: CodeableConcept): ClinicalImpressionInvestigation = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionInvestigation]
  }
  
  @scala.inline
  implicit class ClinicalImpressionInvestigationMutableBuilder[Self <: ClinicalImpressionInvestigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Array[Reference]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: Reference*): Self = StObject.set(x, "item", js.Array(value :_*))
  }
}
