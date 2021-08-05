package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action to occur as part of plan
  */
trait CarePlanActivity
  extends StObject
     with BackboneElement {
  
  /**
    * In-line definition of activity
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.undefined
  
  /**
    * Results of the activity
    */
  var outcomeCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Appointment, Encounter, Procedure, etc.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Comments about the activity status/progress
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Activity details defined in specific resource
    */
  var reference: js.UndefOr[Reference] = js.undefined
}
object CarePlanActivity {
  
  inline def apply(): CarePlanActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarePlanActivity]
  }
  
  extension [Self <: CarePlanActivity](x: Self) {
    
    inline def setDetail(value: CarePlanActivityDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setOutcomeCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "outcomeCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setOutcomeCodeableConceptUndefined: Self = StObject.set(x, "outcomeCodeableConcept", js.undefined)
    
    inline def setOutcomeCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "outcomeCodeableConcept", js.Array(value :_*))
    
    inline def setOutcomeReference(value: js.Array[Reference]): Self = StObject.set(x, "outcomeReference", value.asInstanceOf[js.Any])
    
    inline def setOutcomeReferenceUndefined: Self = StObject.set(x, "outcomeReference", js.undefined)
    
    inline def setOutcomeReferenceVarargs(value: Reference*): Self = StObject.set(x, "outcomeReference", js.Array(value :_*))
    
    inline def setProgress(value: js.Array[Annotation]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: Annotation*): Self = StObject.set(x, "progress", js.Array(value :_*))
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
