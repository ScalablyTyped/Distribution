package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about conditions, problems or diagnoses
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Condition extends DomainResource {
  /**
    * Contains extended information for property 'abatementBoolean'.
    */
  var _abatementBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'abatementDateTime'.
    */
  var _abatementDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'abatementString'.
    */
  var _abatementString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementAge: js.UndefOr[Age] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementBoolean: js.UndefOr[Boolean] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementDateTime: js.UndefOr[dateTime] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementPeriod: js.UndefOr[Period] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementRange: js.UndefOr[Range] = js.native
  /**
    * If/when in resolution/remission
    */
  var abatementString: js.UndefOr[String] = js.native
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.native
  /**
    * Person who asserts this condition
    */
  var asserter: js.UndefOr[Reference] = js.native
  /**
    * Anatomical location, if relevant
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * problem-list-item | encounter-diagnosis
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * active | recurrence | inactive | remission | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.native
  /**
    * Identification of the condition, problem or diagnosis
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * Encounter or episode when condition first asserted
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Supporting evidence
    */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.native
  /**
    * External Ids for this condition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Additional information about the Condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetAge: js.UndefOr[Age] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetPeriod: js.UndefOr[Period] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetRange: js.UndefOr[Range] = js.native
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetString: js.UndefOr[String] = js.native
  /**
    * Subjective severity of condition
    */
  var severity: js.UndefOr[CodeableConcept] = js.native
  /**
    * Stage/grade, usually assessed formally
    */
  var stage: js.UndefOr[ConditionStage] = js.native
  /**
    * Who has the condition?
    */
  var subject: Reference = js.native
  /**
    * provisional | differential | confirmed | refuted | entered-in-error | unknown
    */
  var verificationStatus: js.UndefOr[code] = js.native
}

object Condition {
  @scala.inline
  def apply(subject: Reference): Condition = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
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
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def set_abatementBoolean(value: Element): Self = this.set("_abatementBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_abatementBoolean: Self = this.set("_abatementBoolean", js.undefined)
    @scala.inline
    def set_abatementDateTime(value: Element): Self = this.set("_abatementDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_abatementDateTime: Self = this.set("_abatementDateTime", js.undefined)
    @scala.inline
    def set_abatementString(value: Element): Self = this.set("_abatementString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_abatementString: Self = this.set("_abatementString", js.undefined)
    @scala.inline
    def set_assertedDate(value: Element): Self = this.set("_assertedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_assertedDate: Self = this.set("_assertedDate", js.undefined)
    @scala.inline
    def set_clinicalStatus(value: Element): Self = this.set("_clinicalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_clinicalStatus: Self = this.set("_clinicalStatus", js.undefined)
    @scala.inline
    def set_onsetDateTime(value: Element): Self = this.set("_onsetDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_onsetDateTime: Self = this.set("_onsetDateTime", js.undefined)
    @scala.inline
    def set_onsetString(value: Element): Self = this.set("_onsetString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_onsetString: Self = this.set("_onsetString", js.undefined)
    @scala.inline
    def set_verificationStatus(value: Element): Self = this.set("_verificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_verificationStatus: Self = this.set("_verificationStatus", js.undefined)
    @scala.inline
    def setAbatementAge(value: Age): Self = this.set("abatementAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbatementAge: Self = this.set("abatementAge", js.undefined)
    @scala.inline
    def setAbatementBoolean(value: Boolean): Self = this.set("abatementBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbatementBoolean: Self = this.set("abatementBoolean", js.undefined)
    @scala.inline
    def setAbatementDateTime(value: dateTime): Self = this.set("abatementDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbatementDateTime: Self = this.set("abatementDateTime", js.undefined)
    @scala.inline
    def setAbatementPeriod(value: Period): Self = this.set("abatementPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbatementPeriod: Self = this.set("abatementPeriod", js.undefined)
    @scala.inline
    def setAbatementRange(value: Range): Self = this.set("abatementRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbatementRange: Self = this.set("abatementRange", js.undefined)
    @scala.inline
    def setAbatementString(value: String): Self = this.set("abatementString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbatementString: Self = this.set("abatementString", js.undefined)
    @scala.inline
    def setAssertedDate(value: dateTime): Self = this.set("assertedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssertedDate: Self = this.set("assertedDate", js.undefined)
    @scala.inline
    def setAsserter(value: Reference): Self = this.set("asserter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsserter: Self = this.set("asserter", js.undefined)
    @scala.inline
    def setBodySiteVarargs(value: CodeableConcept*): Self = this.set("bodySite", js.Array(value :_*))
    @scala.inline
    def setBodySite(value: js.Array[CodeableConcept]): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setClinicalStatus(value: code): Self = this.set("clinicalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClinicalStatus: Self = this.set("clinicalStatus", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEvidenceVarargs(value: ConditionEvidence*): Self = this.set("evidence", js.Array(value :_*))
    @scala.inline
    def setEvidence(value: js.Array[ConditionEvidence]): Self = this.set("evidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvidence: Self = this.set("evidence", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOnsetAge(value: Age): Self = this.set("onsetAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetAge: Self = this.set("onsetAge", js.undefined)
    @scala.inline
    def setOnsetDateTime(value: dateTime): Self = this.set("onsetDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetDateTime: Self = this.set("onsetDateTime", js.undefined)
    @scala.inline
    def setOnsetPeriod(value: Period): Self = this.set("onsetPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetPeriod: Self = this.set("onsetPeriod", js.undefined)
    @scala.inline
    def setOnsetRange(value: Range): Self = this.set("onsetRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetRange: Self = this.set("onsetRange", js.undefined)
    @scala.inline
    def setOnsetString(value: String): Self = this.set("onsetString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetString: Self = this.set("onsetString", js.undefined)
    @scala.inline
    def setSeverity(value: CodeableConcept): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setStage(value: ConditionStage): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    @scala.inline
    def setVerificationStatus(value: code): Self = this.set("verificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerificationStatus: Self = this.set("verificationStatus", js.undefined)
  }
  
}

