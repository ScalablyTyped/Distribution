package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record of medication being taken by a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MedicationStatement
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'dateAsserted'.
    */
  var _dateAsserted: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'taken'.
    */
  var _taken: js.UndefOr[Element] = js.undefined
  
  /**
    * Fulfils plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Encounter / Episode associated with MedicationStatement
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * When the statement was asserted?
    */
  var dateAsserted: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Additional supporting information
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Details of how medication is/was taken or should be taken
    */
  var dosage: js.UndefOr[js.Array[Dosage]] = js.undefined
  
  /**
    * The date/time or interval when the medication was taken
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * The date/time or interval when the medication was taken
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Person or organization that provided the information about the taking of this medication
    */
  var informationSource: js.UndefOr[Reference] = js.undefined
  
  /**
    * What medication was taken
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What medication was taken
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Further information about the statement
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Reason for why the medication is being/was taken
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * True if asserting medication was not given
    */
  var reasonNotTaken: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Condition or observation that supports why the medication is being/was taken
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * active | completed | entered-in-error | intended | stopped | on-hold
    */
  var status: code
  
  /**
    * Who is/was taking  the medication
    */
  var subject: Reference
  
  /**
    * y | n | unk | na
    */
  var taken: code
}
object MedicationStatement {
  
  @scala.inline
  def apply(status: code, subject: Reference, taken: code): MedicationStatement = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationStatement]
  }
  
  @scala.inline
  implicit class MedicationStatementMutableBuilder[Self <: MedicationStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDateAsserted(value: dateTime): Self = StObject.set(x, "dateAsserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateAssertedUndefined: Self = StObject.set(x, "dateAsserted", js.undefined)
    
    @scala.inline
    def setDerivedFrom(value: js.Array[Reference]): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    @scala.inline
    def setDerivedFromVarargs(value: Reference*): Self = StObject.set(x, "derivedFrom", js.Array(value :_*))
    
    @scala.inline
    def setDosage(value: js.Array[Dosage]): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    @scala.inline
    def setDosageVarargs(value: Dosage*): Self = StObject.set(x, "dosage", js.Array(value :_*))
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInformationSource(value: Reference): Self = StObject.set(x, "informationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformationSourceUndefined: Self = StObject.set(x, "informationSource", js.undefined)
    
    @scala.inline
    def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    @scala.inline
    def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonNotTaken(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotTaken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNotTakenUndefined: Self = StObject.set(x, "reasonNotTaken", js.undefined)
    
    @scala.inline
    def setReasonNotTakenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotTaken", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken(value: code): Self = StObject.set(x, "taken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateAsserted(value: Element): Self = StObject.set(x, "_dateAsserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateAssertedUndefined: Self = StObject.set(x, "_dateAsserted", js.undefined)
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_taken(value: Element): Self = StObject.set(x, "_taken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_takenUndefined: Self = StObject.set(x, "_taken", js.undefined)
  }
}
