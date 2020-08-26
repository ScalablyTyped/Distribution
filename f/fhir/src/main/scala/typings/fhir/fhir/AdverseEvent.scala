package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medical care, research study or other healthcare event causing physical injury
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait AdverseEvent extends DomainResource {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * AE | PAE
    * An adverse event is an event that caused harm to a patient,  an adverse reaction is a something that is a subject-specific event that is a result of an exposure to a medication, food, device or environmental substance, a potential adverse event is something that occurred and that could have caused harm to a patient but did not
    */
  var category: js.UndefOr[code] = js.native
  /**
    * When the event occurred
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Description of the adverse event
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Who  was involved in the adverse event or the potential adverse event
    */
  var eventParticipant: js.UndefOr[Reference] = js.native
  /**
    * Business identifier for the event
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Location where adverse event occurred
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  /**
    * Adverse Reaction Events linked to exposure to substance
    */
  var reaction: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who recorded the adverse event
    */
  var recorder: js.UndefOr[Reference] = js.native
  /**
    * AdverseEvent.referenceDocument
    */
  var referenceDocument: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Mild | Moderate | Severe
    */
  var seriousness: js.UndefOr[CodeableConcept] = js.native
  /**
    * AdverseEvent.study
    */
  var study: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Subject or group impacted by event
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * AdverseEvent.subjectMedicalHistory
    */
  var subjectMedicalHistory: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The suspected agent causing the adverse event
    */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.native
  /**
    * actual | potential
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object AdverseEvent {
  @scala.inline
  def apply(): AdverseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEvent]
  }
  @scala.inline
  implicit class AdverseEventOps[Self <: AdverseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_category(value: Element): Self = this.set("_category", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_category: Self = this.set("_category", js.undefined)
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def setCategory(value: code): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEventParticipant(value: Reference): Self = this.set("eventParticipant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventParticipant: Self = this.set("eventParticipant", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    @scala.inline
    def setReactionVarargs(value: Reference*): Self = this.set("reaction", js.Array(value :_*))
    @scala.inline
    def setReaction(value: js.Array[Reference]): Self = this.set("reaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaction: Self = this.set("reaction", js.undefined)
    @scala.inline
    def setRecorder(value: Reference): Self = this.set("recorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecorder: Self = this.set("recorder", js.undefined)
    @scala.inline
    def setReferenceDocumentVarargs(value: Reference*): Self = this.set("referenceDocument", js.Array(value :_*))
    @scala.inline
    def setReferenceDocument(value: js.Array[Reference]): Self = this.set("referenceDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceDocument: Self = this.set("referenceDocument", js.undefined)
    @scala.inline
    def setSeriousness(value: CodeableConcept): Self = this.set("seriousness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriousness: Self = this.set("seriousness", js.undefined)
    @scala.inline
    def setStudyVarargs(value: Reference*): Self = this.set("study", js.Array(value :_*))
    @scala.inline
    def setStudy(value: js.Array[Reference]): Self = this.set("study", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudy: Self = this.set("study", js.undefined)
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setSubjectMedicalHistoryVarargs(value: Reference*): Self = this.set("subjectMedicalHistory", js.Array(value :_*))
    @scala.inline
    def setSubjectMedicalHistory(value: js.Array[Reference]): Self = this.set("subjectMedicalHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectMedicalHistory: Self = this.set("subjectMedicalHistory", js.undefined)
    @scala.inline
    def setSuspectEntityVarargs(value: AdverseEventSuspectEntity*): Self = this.set("suspectEntity", js.Array(value :_*))
    @scala.inline
    def setSuspectEntity(value: js.Array[AdverseEventSuspectEntity]): Self = this.set("suspectEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspectEntity: Self = this.set("suspectEntity", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

