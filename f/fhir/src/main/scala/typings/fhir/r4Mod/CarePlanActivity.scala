package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlanActivity
  extends StObject
     with BackboneElement {
  
  /**
    * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
    */
  var detail: js.UndefOr[CarePlanActivityDetail] = js.undefined
  
  /**
    * Note that this should not duplicate the activity status (e.g. completed or in progress).
    */
  var outcomeCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The activity outcome is independent of the outcome of the related goal(s).  For example, if the goal is to achieve a target body weight of 150 lbs and an activity is defined to diet, then the activity outcome could be calories consumed whereas the goal outcome is an observation for the actual body weight measured.
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element should NOT be used to describe the activity to be performed - that occurs either within the resource pointed to by activity.detail.reference or in activity.detail.description.
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Standard extension exists ([resource-pertainsToGoal](extension-resource-pertainstogoal.html)) that allows goals to be referenced from any of the referenced resources in CarePlan.activity.reference.
    * The goal should be visible when the resource referenced by CarePlan.activity.reference is viewed independently from the CarePlan.  Requests that are pointed to by a CarePlan using this element should *not* point to this CarePlan using the "basedOn" element.  i.e. Requests that are part of a CarePlan are not "based on" the CarePlan.
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
    
    inline def setOutcomeCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "outcomeCodeableConcept", js.Array(value*))
    
    inline def setOutcomeReference(value: js.Array[Reference]): Self = StObject.set(x, "outcomeReference", value.asInstanceOf[js.Any])
    
    inline def setOutcomeReferenceUndefined: Self = StObject.set(x, "outcomeReference", js.undefined)
    
    inline def setOutcomeReferenceVarargs(value: Reference*): Self = StObject.set(x, "outcomeReference", js.Array(value*))
    
    inline def setProgress(value: js.Array[Annotation]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: Annotation*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
