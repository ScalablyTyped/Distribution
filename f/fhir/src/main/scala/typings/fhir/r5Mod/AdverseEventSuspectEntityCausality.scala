package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventSuspectEntityCausality
  extends StObject
     with BackboneElement {
  
  /**
    * The method of evaluating the relatedness of the suspected entity to the event.
    */
  var assessmentMethod: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The author of the information on the possible cause of the event.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * The result of the assessment regarding the relatedness of the suspected entity to the event.
    */
  var entityRelatedness: js.UndefOr[CodeableConcept] = js.undefined
}
object AdverseEventSuspectEntityCausality {
  
  inline def apply(): AdverseEventSuspectEntityCausality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEventSuspectEntityCausality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdverseEventSuspectEntityCausality] (val x: Self) extends AnyVal {
    
    inline def setAssessmentMethod(value: CodeableConcept): Self = StObject.set(x, "assessmentMethod", value.asInstanceOf[js.Any])
    
    inline def setAssessmentMethodUndefined: Self = StObject.set(x, "assessmentMethod", js.undefined)
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setEntityRelatedness(value: CodeableConcept): Self = StObject.set(x, "entityRelatedness", value.asInstanceOf[js.Any])
    
    inline def setEntityRelatednessUndefined: Self = StObject.set(x, "entityRelatedness", js.undefined)
  }
}
