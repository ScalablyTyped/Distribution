package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ResearchStudy extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Defined path through the study for a subject
    */
  var arm: js.UndefOr[js.Array[ResearchStudyArm]] = js.native
  /**
    * Classifications for the study
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Contact details for the study
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * What this is study doing
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * Inclusion & exclusion criteria
    */
  var enrollment: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Drugs, devices, conditions, etc. under study
    */
  var focus: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Business Identifier for study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Geographic region(s) for study
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Used to search for the study
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Comments made about the event
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Part of larger study
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * When the study began and ended
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * The individual responsible for the study
    */
  var principalInvestigator: js.UndefOr[Reference] = js.native
  /**
    * Steps followed in executing study
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Reason for terminating study early
    */
  var reasonStopped: js.UndefOr[CodeableConcept] = js.native
  /**
    * References and dependencies
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  /**
    * Location involved in study execution
    */
  var site: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Organization responsible for the study
    */
  var sponsor: js.UndefOr[Reference] = js.native
  /**
    * draft | in-progress | suspended | stopped | completed | entered-in-error
    */
  var status: code = js.native
  /**
    * Name for this study
    */
  var title: js.UndefOr[String] = js.native
}

object ResearchStudy {
  @scala.inline
  def apply(status: code): ResearchStudy = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudy]
  }
  @scala.inline
  implicit class ResearchStudyOps[Self <: ResearchStudy] (val x: Self) extends AnyVal {
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def setArmVarargs(value: ResearchStudyArm*): Self = this.set("arm", js.Array(value :_*))
    @scala.inline
    def setArm(value: js.Array[ResearchStudyArm]): Self = this.set("arm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArm: Self = this.set("arm", js.undefined)
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnrollmentVarargs(value: Reference*): Self = this.set("enrollment", js.Array(value :_*))
    @scala.inline
    def setEnrollment(value: js.Array[Reference]): Self = this.set("enrollment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollment: Self = this.set("enrollment", js.undefined)
    @scala.inline
    def setFocusVarargs(value: CodeableConcept*): Self = this.set("focus", js.Array(value :_*))
    @scala.inline
    def setFocus(value: js.Array[CodeableConcept]): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setKeywordVarargs(value: CodeableConcept*): Self = this.set("keyword", js.Array(value :_*))
    @scala.inline
    def setKeyword(value: js.Array[CodeableConcept]): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = this.set("partOf", js.Array(value :_*))
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = this.set("partOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setPrincipalInvestigator(value: Reference): Self = this.set("principalInvestigator", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalInvestigator: Self = this.set("principalInvestigator", js.undefined)
    @scala.inline
    def setProtocolVarargs(value: Reference*): Self = this.set("protocol", js.Array(value :_*))
    @scala.inline
    def setProtocol(value: js.Array[Reference]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setReasonStopped(value: CodeableConcept): Self = this.set("reasonStopped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonStopped: Self = this.set("reasonStopped", js.undefined)
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = this.set("relatedArtifact", js.Array(value :_*))
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = this.set("relatedArtifact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedArtifact: Self = this.set("relatedArtifact", js.undefined)
    @scala.inline
    def setSiteVarargs(value: Reference*): Self = this.set("site", js.Array(value :_*))
    @scala.inline
    def setSite(value: js.Array[Reference]): Self = this.set("site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    @scala.inline
    def setSponsor(value: Reference): Self = this.set("sponsor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSponsor: Self = this.set("sponsor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

