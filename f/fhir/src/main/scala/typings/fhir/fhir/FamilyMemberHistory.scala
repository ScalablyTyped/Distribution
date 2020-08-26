package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about patient's relatives, relevant for patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait FamilyMemberHistory extends DomainResource {
  /**
    * Contains extended information for property 'ageString'.
    */
  var _ageString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'bornDate'.
    */
  var _bornDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'bornString'.
    */
  var _bornString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedBoolean'.
    */
  var _deceasedBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedDate'.
    */
  var _deceasedDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'deceasedString'.
    */
  var _deceasedString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'estimatedAge'.
    */
  var _estimatedAge: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * (approximate) age
    */
  var ageAge: js.UndefOr[Age] = js.native
  /**
    * (approximate) age
    */
  var ageRange: js.UndefOr[Range] = js.native
  /**
    * (approximate) age
    */
  var ageString: js.UndefOr[String] = js.native
  /**
    * (approximate) date of birth
    */
  var bornDate: js.UndefOr[date] = js.native
  /**
    * (approximate) date of birth
    */
  var bornPeriod: js.UndefOr[Period] = js.native
  /**
    * (approximate) date of birth
    */
  var bornString: js.UndefOr[String] = js.native
  /**
    * Condition that the related person had
    */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.native
  /**
    * When history was captured/updated
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedAge: js.UndefOr[Age] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedDate: js.UndefOr[date] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedRange: js.UndefOr[Range] = js.native
  /**
    * Dead? How old/when?
    */
  var deceasedString: js.UndefOr[String] = js.native
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Age is estimated?
    */
  var estimatedAge: js.UndefOr[Boolean] = js.native
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  /**
    * External Id(s) for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * The family member described
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The taking of a family member's history did not occur
    */
  var notDone: js.UndefOr[Boolean] = js.native
  /**
    * subject-unknown | withheld | unable-to-obtain | deferred
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * General note about related person
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Patient history is about
    */
  var patient: Reference = js.native
  /**
    * Why was family member history performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Why was family member history performed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Relationship to the subject
    */
  var relationship: CodeableConcept = js.native
  /**
    * partial | completed | entered-in-error | health-unknown
    */
  var status: code = js.native
}

object FamilyMemberHistory {
  @scala.inline
  def apply(patient: Reference, relationship: CodeableConcept, status: code): FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistory]
  }
  @scala.inline
  implicit class FamilyMemberHistoryOps[Self <: FamilyMemberHistory] (val x: Self) extends AnyVal {
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
    def setRelationship(value: CodeableConcept): Self = this.set("relationship", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_ageString(value: Element): Self = this.set("_ageString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_ageString: Self = this.set("_ageString", js.undefined)
    @scala.inline
    def set_bornDate(value: Element): Self = this.set("_bornDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_bornDate: Self = this.set("_bornDate", js.undefined)
    @scala.inline
    def set_bornString(value: Element): Self = this.set("_bornString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_bornString: Self = this.set("_bornString", js.undefined)
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_deceasedBoolean(value: Element): Self = this.set("_deceasedBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_deceasedBoolean: Self = this.set("_deceasedBoolean", js.undefined)
    @scala.inline
    def set_deceasedDate(value: Element): Self = this.set("_deceasedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_deceasedDate: Self = this.set("_deceasedDate", js.undefined)
    @scala.inline
    def set_deceasedString(value: Element): Self = this.set("_deceasedString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_deceasedString: Self = this.set("_deceasedString", js.undefined)
    @scala.inline
    def set_estimatedAge(value: Element): Self = this.set("_estimatedAge", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_estimatedAge: Self = this.set("_estimatedAge", js.undefined)
    @scala.inline
    def set_gender(value: Element): Self = this.set("_gender", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gender: Self = this.set("_gender", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_notDone(value: Element): Self = this.set("_notDone", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_notDone: Self = this.set("_notDone", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAgeAge(value: Age): Self = this.set("ageAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeAge: Self = this.set("ageAge", js.undefined)
    @scala.inline
    def setAgeRange(value: Range): Self = this.set("ageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeRange: Self = this.set("ageRange", js.undefined)
    @scala.inline
    def setAgeString(value: String): Self = this.set("ageString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeString: Self = this.set("ageString", js.undefined)
    @scala.inline
    def setBornDate(value: date): Self = this.set("bornDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBornDate: Self = this.set("bornDate", js.undefined)
    @scala.inline
    def setBornPeriod(value: Period): Self = this.set("bornPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBornPeriod: Self = this.set("bornPeriod", js.undefined)
    @scala.inline
    def setBornString(value: String): Self = this.set("bornString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBornString: Self = this.set("bornString", js.undefined)
    @scala.inline
    def setConditionVarargs(value: FamilyMemberHistoryCondition*): Self = this.set("condition", js.Array(value :_*))
    @scala.inline
    def setCondition(value: js.Array[FamilyMemberHistoryCondition]): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDeceasedAge(value: Age): Self = this.set("deceasedAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeceasedAge: Self = this.set("deceasedAge", js.undefined)
    @scala.inline
    def setDeceasedBoolean(value: Boolean): Self = this.set("deceasedBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeceasedBoolean: Self = this.set("deceasedBoolean", js.undefined)
    @scala.inline
    def setDeceasedDate(value: date): Self = this.set("deceasedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeceasedDate: Self = this.set("deceasedDate", js.undefined)
    @scala.inline
    def setDeceasedRange(value: Range): Self = this.set("deceasedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeceasedRange: Self = this.set("deceasedRange", js.undefined)
    @scala.inline
    def setDeceasedString(value: String): Self = this.set("deceasedString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeceasedString: Self = this.set("deceasedString", js.undefined)
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = this.set("definition", js.Array(value :_*))
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setEstimatedAge(value: Boolean): Self = this.set("estimatedAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedAge: Self = this.set("estimatedAge", js.undefined)
    @scala.inline
    def setGender(value: code): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotDone(value: Boolean): Self = this.set("notDone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotDone: Self = this.set("notDone", js.undefined)
    @scala.inline
    def setNotDoneReason(value: CodeableConcept): Self = this.set("notDoneReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotDoneReason: Self = this.set("notDoneReason", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
  }
  
}

