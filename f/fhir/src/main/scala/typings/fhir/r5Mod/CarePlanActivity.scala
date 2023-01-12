package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarePlanActivity
  extends StObject
     with BackboneElement {
  
  /**
    * Note that this should not duplicate the activity status (e.g. completed or in progress). The activity performed is independent of the outcome of the related goal(s). For example, if the goal is to achieve a target body weight of 150 lbs and an activity is defined to exercise, then the activity performed could be amount and intensity of exercise performed whereas the goal outcome is an observation for the actual body weight measured.
    */
  var performedActivity: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
    */
  var plannedActivityDetail: js.UndefOr[CarePlanActivityPlannedActivityDetail] = js.undefined
  
  /**
    * Standard extension exists ([resource-pertainsToGoal](extension-resource-pertainstogoal.html)) that allows goals to be referenced from any of the referenced resources in CarePlan.activity.plannedActivityReference.
    * The goal should be visible when the resource referenced by CarePlan.activity.plannedActivityReference is viewed independently from the CarePlan.  Requests that are pointed to by a CarePlan using this element should *not* point to this CarePlan using the "basedOn" element.  i.e. Requests that are part of a CarePlan are not "based on" the CarePlan.
    */
  var plannedActivityReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element should NOT be used to describe the activity to be performed - that occurs either within the resource pointed to by activity.detail.reference or in activity.detail.description.
    */
  var progress: js.UndefOr[js.Array[Annotation]] = js.undefined
}
object CarePlanActivity {
  
  inline def apply(): CarePlanActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarePlanActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CarePlanActivity] (val x: Self) extends AnyVal {
    
    inline def setPerformedActivity(value: js.Array[CodeableReference]): Self = StObject.set(x, "performedActivity", value.asInstanceOf[js.Any])
    
    inline def setPerformedActivityUndefined: Self = StObject.set(x, "performedActivity", js.undefined)
    
    inline def setPerformedActivityVarargs(value: CodeableReference*): Self = StObject.set(x, "performedActivity", js.Array(value*))
    
    inline def setPlannedActivityDetail(value: CarePlanActivityPlannedActivityDetail): Self = StObject.set(x, "plannedActivityDetail", value.asInstanceOf[js.Any])
    
    inline def setPlannedActivityDetailUndefined: Self = StObject.set(x, "plannedActivityDetail", js.undefined)
    
    inline def setPlannedActivityReference(value: Reference): Self = StObject.set(x, "plannedActivityReference", value.asInstanceOf[js.Any])
    
    inline def setPlannedActivityReferenceUndefined: Self = StObject.set(x, "plannedActivityReference", js.undefined)
    
    inline def setProgress(value: js.Array[Annotation]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: Annotation*): Self = StObject.set(x, "progress", js.Array(value*))
  }
}
