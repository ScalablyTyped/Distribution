package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.intended
import typings.fhir.fhirStrings.n
import typings.fhir.fhirStrings.na
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.unk
import typings.fhir.fhirStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationStatement
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateAsserted: js.UndefOr[Element] = js.undefined
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _taken: js.UndefOr[Element] = js.undefined
  
  /**
    * A plan, proposal or order that is fulfilled in whole or in part by this event.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates where type of medication statement and where the medication is expected to be consumed or administered.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The encounter or episode of care that establishes the context for this MedicationStatement.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * The date when the medication statement was asserted by the information source.
    */
  var dateAsserted: js.UndefOr[String] = js.undefined
  
  /**
    * Likely references would be to MedicationRequest, MedicationDispense, Claim, Observation or QuestionnaireAnswers.  The most common use cases for deriving a MedicationStatement comes from creating a MedicationStatement from a MedicationRequest or from a lab observation or a claim.  it should be noted that the amount of information that is available varies from the type resource that you derive the MedicationStatement from.
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The dates included in the dosage on a Medication Statement reflect the dates for a given dose.  For example, "from November 1, 2016 to November 3, 2016, take one tablet daily and from November 4, 2016 to November 7, 2016, take two tablets daily."  It is expected that this specificity may only be populated where the patient brings in their labeled container or where the Medication Statement is derived from a MedicationRequest.
    */
  var dosage: js.UndefOr[js.Array[Dosage]] = js.undefined
  
  /**
    * This attribute reflects the period over which the patient consumed the medication and is expected to be populated on the majority of Medication Statements. If the medication is still being taken at the time the statement is recorded, the "end" date will be omitted.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute reflects the period over which the patient consumed the medication and is expected to be populated on the majority of Medication Statements. If the medication is still being taken at the time the statement is recorded, the "end" date will be omitted.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g Claim or MedicationRequest.
    */
  var informationSource: js.UndefOr[Reference] = js.undefined
  
  /**
    * If only a code is specified, then it needs to be a code for a specific product. If more information is required, then the use of the medication resource is recommended.  For example if you require form or lot number, then you must reference the Medication resource. .
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If only a code is specified, then it needs to be a code for a specific product. If more information is required, then the use of the medication resource is recommended.  For example if you require form or lot number, then you must reference the Medication resource. .
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Provides extra information about the medication statement that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A larger event of which this particular event is a component or step.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This could be a diagnosis code. If a full condition record exists or additional detail is needed, use reasonForUseReference.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A code indicating why the medication was not taken.
    */
  var reasonNotTaken: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This is a reference to a condition that is the reason why the medication is being/was taken.  If only a code exists, use reasonForUseCode.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationStatement: typings.fhir.fhirStrings.MedicationStatement
  
  /**
    * MedicationStatement is a statement at a point in time.  The status is only representative at the point when it was asserted.  The value set for MedicationStatement.status contains codes that assert the status of the use of the medication by the patient (for example, stopped or on hold) as well as codes that assert the status of the medication statement itself (for example, entered in error).
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | completed | `entered-in-error` | intended | stopped | `on-hold`
  
  /**
    * The person, animal or group who is/was taking the medication.
    */
  var subject: Reference
  
  /**
    * This element is labeled as a modifier because it indicates that the medication was not taken.
    */
  var taken: y | n | unk | na
}
object MedicationStatement {
  
  inline def apply(
    status: active | completed | `entered-in-error` | intended | stopped | `on-hold`,
    subject: Reference,
    taken: y | n | unk | na
  ): MedicationStatement = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationStatement", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationStatement]
  }
  
  extension [Self <: MedicationStatement](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDateAsserted(value: String): Self = StObject.set(x, "dateAsserted", value.asInstanceOf[js.Any])
    
    inline def setDateAssertedUndefined: Self = StObject.set(x, "dateAsserted", js.undefined)
    
    inline def setDerivedFrom(value: js.Array[Reference]): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setDerivedFromVarargs(value: Reference*): Self = StObject.set(x, "derivedFrom", js.Array(value*))
    
    inline def setDosage(value: js.Array[Dosage]): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    inline def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    inline def setDosageVarargs(value: Dosage*): Self = StObject.set(x, "dosage", js.Array(value*))
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformationSource(value: Reference): Self = StObject.set(x, "informationSource", value.asInstanceOf[js.Any])
    
    inline def setInformationSourceUndefined: Self = StObject.set(x, "informationSource", js.undefined)
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonNotTaken(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotTaken", value.asInstanceOf[js.Any])
    
    inline def setReasonNotTakenUndefined: Self = StObject.set(x, "reasonNotTaken", js.undefined)
    
    inline def setReasonNotTakenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotTaken", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | completed | `entered-in-error` | intended | stopped | `on-hold`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTaken(value: y | n | unk | na): Self = StObject.set(x, "taken", value.asInstanceOf[js.Any])
    
    inline def set_dateAsserted(value: Element): Self = StObject.set(x, "_dateAsserted", value.asInstanceOf[js.Any])
    
    inline def set_dateAssertedUndefined: Self = StObject.set(x, "_dateAsserted", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_taken(value: Element): Self = StObject.set(x, "_taken", value.asInstanceOf[js.Any])
    
    inline def set_takenUndefined: Self = StObject.set(x, "_taken", js.undefined)
  }
}
