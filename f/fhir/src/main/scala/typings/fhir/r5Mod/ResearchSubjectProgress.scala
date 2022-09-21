package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchSubjectProgress
  extends StObject
     with BackboneElement {
  
  var _endDate: js.UndefOr[Element] = js.undefined
  
  var _startDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The date when the state ended.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * There can be multiple entries but it is also valid to just have the most recent.  This should npt be rlied upon as the full path the subject has taken.
    */
  var milestone: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The reason for the state change.  If coded it should follow the formal subject state model.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This is NOT the date the change in state was recorded.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the subject.
    */
  var subjectState: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the aspect of the subject's journey that the state refers to.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ResearchSubjectProgress {
  
  inline def apply(): ResearchSubjectProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResearchSubjectProgress]
  }
  
  extension [Self <: ResearchSubjectProgress](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setMilestone(value: CodeableConcept): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setSubjectState(value: CodeableConcept): Self = StObject.set(x, "subjectState", value.asInstanceOf[js.Any])
    
    inline def setSubjectStateUndefined: Self = StObject.set(x, "subjectState", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_endDate(value: Element): Self = StObject.set(x, "_endDate", value.asInstanceOf[js.Any])
    
    inline def set_endDateUndefined: Self = StObject.set(x, "_endDate", js.undefined)
    
    inline def set_startDate(value: Element): Self = StObject.set(x, "_startDate", value.asInstanceOf[js.Any])
    
    inline def set_startDateUndefined: Self = StObject.set(x, "_startDate", js.undefined)
  }
}
