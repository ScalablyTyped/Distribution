package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait AllergyIntolerance extends DomainResource {
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'criticality'.
    */
  var _criticality: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lastOccurrence'.
    */
  var _lastOccurrence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.native
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.native
  /**
    * Source of the information about the allergy
    */
  var asserter: js.UndefOr[Reference] = js.native
  /**
    * food | medication | environment | biologic
    */
  var category: js.UndefOr[js.Array[code]] = js.native
  /**
    * active | inactive | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.native
  /**
    * Code that identifies the allergy or intolerance
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * low | high | unable-to-assess
    */
  var criticality: js.UndefOr[code] = js.native
  /**
    * External ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Date(/time) of last known occurrence of a reaction
    */
  var lastOccurrence: js.UndefOr[dateTime] = js.native
  /**
    * Additional text not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetAge: js.UndefOr[Age] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetPeriod: js.UndefOr[Period] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetRange: js.UndefOr[Range] = js.native
  /**
    * When allergy or intolerance was identified
    */
  var onsetString: js.UndefOr[String] = js.native
  /**
    * Who the sensitivity is for
    */
  var patient: Reference = js.native
  /**
    * Adverse Reaction Events linked to exposure to substance
    */
  var reaction: js.UndefOr[js.Array[AllergyIntoleranceReaction]] = js.native
  /**
    * Who recorded the sensitivity
    */
  var recorder: js.UndefOr[Reference] = js.native
  /**
    * allergy | intolerance - Underlying mechanism (if known)
    */
  var `type`: js.UndefOr[code] = js.native
  /**
    * unconfirmed | confirmed | refuted | entered-in-error
    */
  var verificationStatus: code = js.native
}

object AllergyIntolerance {
  @scala.inline
  def apply(patient: Reference, verificationStatus: code): AllergyIntolerance = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntolerance]
  }
  @scala.inline
  implicit class AllergyIntoleranceOps[Self <: AllergyIntolerance] (val x: Self) extends AnyVal {
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
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerificationStatus(value: code): Self = this.set("verificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def set_assertedDate(value: Element): Self = this.set("_assertedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_assertedDate: Self = this.set("_assertedDate", js.undefined)
    @scala.inline
    def set_categoryVarargs(value: Element*): Self = this.set("_category", js.Array(value :_*))
    @scala.inline
    def set_category(value: js.Array[Element]): Self = this.set("_category", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_category: Self = this.set("_category", js.undefined)
    @scala.inline
    def set_clinicalStatus(value: Element): Self = this.set("_clinicalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_clinicalStatus: Self = this.set("_clinicalStatus", js.undefined)
    @scala.inline
    def set_criticality(value: Element): Self = this.set("_criticality", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_criticality: Self = this.set("_criticality", js.undefined)
    @scala.inline
    def set_lastOccurrence(value: Element): Self = this.set("_lastOccurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_lastOccurrence: Self = this.set("_lastOccurrence", js.undefined)
    @scala.inline
    def set_onsetDateTime(value: Element): Self = this.set("_onsetDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_onsetDateTime: Self = this.set("_onsetDateTime", js.undefined)
    @scala.inline
    def set_onsetString(value: Element): Self = this.set("_onsetString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_onsetString: Self = this.set("_onsetString", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def set_verificationStatus(value: Element): Self = this.set("_verificationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_verificationStatus: Self = this.set("_verificationStatus", js.undefined)
    @scala.inline
    def setAssertedDate(value: dateTime): Self = this.set("assertedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssertedDate: Self = this.set("assertedDate", js.undefined)
    @scala.inline
    def setAsserter(value: Reference): Self = this.set("asserter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsserter: Self = this.set("asserter", js.undefined)
    @scala.inline
    def setCategoryVarargs(value: code*): Self = this.set("category", js.Array(value :_*))
    @scala.inline
    def setCategory(value: js.Array[code]): Self = this.set("category", value.asInstanceOf[js.Any])
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
    def setCriticality(value: code): Self = this.set("criticality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriticality: Self = this.set("criticality", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLastOccurrence(value: dateTime): Self = this.set("lastOccurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastOccurrence: Self = this.set("lastOccurrence", js.undefined)
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
    def setReactionVarargs(value: AllergyIntoleranceReaction*): Self = this.set("reaction", js.Array(value :_*))
    @scala.inline
    def setReaction(value: js.Array[AllergyIntoleranceReaction]): Self = this.set("reaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaction: Self = this.set("reaction", js.undefined)
    @scala.inline
    def setRecorder(value: Reference): Self = this.set("recorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecorder: Self = this.set("recorder", js.undefined)
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

