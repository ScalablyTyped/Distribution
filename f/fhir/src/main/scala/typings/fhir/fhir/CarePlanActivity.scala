package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action to occur as part of plan
  */
@js.native
trait CarePlanActivity extends BackboneElement {
  
  /**
    * In-line definition of activity
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.native
  
  /**
    * Results of the activity
    */
  var outcomeCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Appointment, Encounter, Procedure, etc.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Comments about the activity status/progress
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Activity details defined in specific resource
    */
  var reference: js.UndefOr[Reference] = js.native
}
object CarePlanActivity {
  
  @scala.inline
  def apply(): CarePlanActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarePlanActivity]
  }
  
  @scala.inline
  implicit class CarePlanActivityMutableBuilder[Self <: CarePlanActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: CarePlanActivityDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setOutcomeCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "outcomeCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeCodeableConceptUndefined: Self = StObject.set(x, "outcomeCodeableConcept", js.undefined)
    
    @scala.inline
    def setOutcomeCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "outcomeCodeableConcept", js.Array(value :_*))
    
    @scala.inline
    def setOutcomeReference(value: js.Array[Reference]): Self = StObject.set(x, "outcomeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeReferenceUndefined: Self = StObject.set(x, "outcomeReference", js.undefined)
    
    @scala.inline
    def setOutcomeReferenceVarargs(value: Reference*): Self = StObject.set(x, "outcomeReference", js.Array(value :_*))
    
    @scala.inline
    def setProgress(value: js.Array[Annotation]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setProgressVarargs(value: Annotation*): Self = StObject.set(x, "progress", js.Array(value :_*))
    
    @scala.inline
    def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
