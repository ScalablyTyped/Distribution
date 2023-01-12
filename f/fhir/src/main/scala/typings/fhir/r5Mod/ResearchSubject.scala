package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchSubject
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _actualArm: js.UndefOr[Element] = js.undefined
  
  var _assignedArm: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The name of the arm in the study the subject actually followed as part of this study.
    */
  var actualArm: js.UndefOr[String] = js.undefined
  
  /**
    * Maybe this is really PlanDefinition.
    */
  var assignedArm: js.UndefOr[String] = js.undefined
  
  /**
    * A record of the patient's informed agreement to participate in the study.
    */
  var consent: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifiers assigned to this research subject for a study.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The dates the subject began and ended their participation in the study.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * This is intended to deal with the confusion routinely created by haing two conflated concepts of being in a particular state and having achieved a particular milestone.  In strict terms a milestone is a point of time event that results in a change from one state to another.  The state before the milestone is achieved is often given the same name as the milestone, and sometimes the state may have the same description.  For instance "Randomised" and "Visit 1" may be different milestones but the state remains at "on study" after each of them.
    * It is likely that more than one "state" pattern will be recorded for a subject and a type has been introduced to allow this simultaneous recording.
    */
  var progress: js.UndefOr[js.Array[ResearchSubjectProgress]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ResearchSubject: typings.fhir.fhirStrings.ResearchSubject
  
  /**
    * The publication state of the resource (not of the subject).
    */
  var status: draft | active | retired | unknown
  
  /**
    * Reference to the study the subject is participating in.
    */
  var study: Reference
  
  /**
    * The record of the person, animal or other entity involved in the study.
    */
  var subject: Reference
}
object ResearchSubject {
  
  inline def apply(status: draft | active | retired | unknown, study: Reference, subject: Reference): ResearchSubject = {
    val __obj = js.Dynamic.literal(resourceType = "ResearchSubject", status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchSubject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchSubject] (val x: Self) extends AnyVal {
    
    inline def setActualArm(value: String): Self = StObject.set(x, "actualArm", value.asInstanceOf[js.Any])
    
    inline def setActualArmUndefined: Self = StObject.set(x, "actualArm", js.undefined)
    
    inline def setAssignedArm(value: String): Self = StObject.set(x, "assignedArm", value.asInstanceOf[js.Any])
    
    inline def setAssignedArmUndefined: Self = StObject.set(x, "assignedArm", js.undefined)
    
    inline def setConsent(value: Reference): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    inline def setConsentUndefined: Self = StObject.set(x, "consent", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProgress(value: js.Array[ResearchSubjectProgress]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressVarargs(value: ResearchSubjectProgress*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ResearchSubject): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStudy(value: Reference): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def set_actualArm(value: Element): Self = StObject.set(x, "_actualArm", value.asInstanceOf[js.Any])
    
    inline def set_actualArmUndefined: Self = StObject.set(x, "_actualArm", js.undefined)
    
    inline def set_assignedArm(value: Element): Self = StObject.set(x, "_assignedArm", value.asInstanceOf[js.Any])
    
    inline def set_assignedArmUndefined: Self = StObject.set(x, "_assignedArm", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
