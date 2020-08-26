package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record of medication being taken by a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait MedicationStatement extends DomainResource {
  /**
    * Contains extended information for property 'dateAsserted'.
    */
  var _dateAsserted: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'taken'.
    */
  var _taken: js.UndefOr[Element] = js.native
  /**
    * Fulfils plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Encounter / Episode associated with MedicationStatement
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * When the statement was asserted?
    */
  var dateAsserted: js.UndefOr[dateTime] = js.native
  /**
    * Additional supporting information
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Details of how medication is/was taken or should be taken
    */
  var dosage: js.UndefOr[js.Array[Dosage]] = js.native
  /**
    * The date/time or interval when the medication was taken
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  /**
    * The date/time or interval when the medication was taken
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Person or organization that provided the information about the taking of this medication
    */
  var informationSource: js.UndefOr[Reference] = js.native
  /**
    * What medication was taken
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * What medication was taken
    */
  var medicationReference: js.UndefOr[Reference] = js.native
  /**
    * Further information about the statement
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Reason for why the medication is being/was taken
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * True if asserting medication was not given
    */
  var reasonNotTaken: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Condition or observation that supports why the medication is being/was taken
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * active | completed | entered-in-error | intended | stopped | on-hold
    */
  var status: code = js.native
  /**
    * Who is/was taking  the medication
    */
  var subject: Reference = js.native
  /**
    * y | n | unk | na
    */
  var taken: code = js.native
}

object MedicationStatement {
  @scala.inline
  def apply(status: code, subject: Reference, taken: code): MedicationStatement = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationStatement]
  }
  @scala.inline
  implicit class MedicationStatementOps[Self <: MedicationStatement] (val x: Self) extends AnyVal {
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
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaken(value: code): Self = this.set("taken", value.asInstanceOf[js.Any])
    @scala.inline
    def set_dateAsserted(value: Element): Self = this.set("_dateAsserted", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_dateAsserted: Self = this.set("_dateAsserted", js.undefined)
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = this.set("_effectiveDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_effectiveDateTime: Self = this.set("_effectiveDateTime", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_taken(value: Element): Self = this.set("_taken", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_taken: Self = this.set("_taken", js.undefined)
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDateAsserted(value: dateTime): Self = this.set("dateAsserted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateAsserted: Self = this.set("dateAsserted", js.undefined)
    @scala.inline
    def setDerivedFromVarargs(value: Reference*): Self = this.set("derivedFrom", js.Array(value :_*))
    @scala.inline
    def setDerivedFrom(value: js.Array[Reference]): Self = this.set("derivedFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivedFrom: Self = this.set("derivedFrom", js.undefined)
    @scala.inline
    def setDosageVarargs(value: Dosage*): Self = this.set("dosage", js.Array(value :_*))
    @scala.inline
    def setDosage(value: js.Array[Dosage]): Self = this.set("dosage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDosage: Self = this.set("dosage", js.undefined)
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = this.set("effectiveDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveDateTime: Self = this.set("effectiveDateTime", js.undefined)
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setInformationSource(value: Reference): Self = this.set("informationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInformationSource: Self = this.set("informationSource", js.undefined)
    @scala.inline
    def setMedicationCodeableConcept(value: CodeableConcept): Self = this.set("medicationCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedicationCodeableConcept: Self = this.set("medicationCodeableConcept", js.undefined)
    @scala.inline
    def setMedicationReference(value: Reference): Self = this.set("medicationReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedicationReference: Self = this.set("medicationReference", js.undefined)
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
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    @scala.inline
    def setReasonNotTakenVarargs(value: CodeableConcept*): Self = this.set("reasonNotTaken", js.Array(value :_*))
    @scala.inline
    def setReasonNotTaken(value: js.Array[CodeableConcept]): Self = this.set("reasonNotTaken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonNotTaken: Self = this.set("reasonNotTaken", js.undefined)
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
  }
  
}

