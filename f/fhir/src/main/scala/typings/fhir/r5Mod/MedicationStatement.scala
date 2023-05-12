package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.recorded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationStatement
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateAsserted: js.UndefOr[Element] = js.undefined
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _renderedDosageInstruction: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * This element can be used to indicate whether a patient is following a course of treatment as instructed/prescribed or whether they are taking medications of their own volition.  It can also be used to indicate that a patient is not taking a medication, either because they were told not to or because they decided on their own.
    */
  var adherence: js.UndefOr[MedicationStatementAdherence] = js.undefined
  
  /**
    * Type of medication statement (for example, drug classification like ATC, where meds would be administered, legal category of the medication.).
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The date when the Medication Statement was asserted by the information source.
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
    * This attribute reflects the period over which the patient consumed the medication and is expected to be populated on the majority of Medication Statements. If the medication is still being taken and is expected to continue indefinitely at the time the usage is recorded, the "end" date will be omitted.  If the end date is known, then it is included as the "end date".  The date/time attribute supports a variety of dates - year, year/month and exact date.  If something more than this is required, this should be conveyed as text.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * This attribute reflects the period over which the patient consumed the medication and is expected to be populated on the majority of Medication Statements. If the medication is still being taken and is expected to continue indefinitely at the time the usage is recorded, the "end" date will be omitted.  If the end date is known, then it is included as the "end date".  The date/time attribute supports a variety of dates - year, year/month and exact date.  If something more than this is required, this should be conveyed as text.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This attribute reflects the period over which the patient consumed the medication and is expected to be populated on the majority of Medication Statements. If the medication is still being taken and is expected to continue indefinitely at the time the usage is recorded, the "end" date will be omitted.  If the end date is known, then it is included as the "end date".  The date/time attribute supports a variety of dates - year, year/month and exact date.  If something more than this is required, this should be conveyed as text.
    */
  var effectiveTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The encounter that establishes the context for this MedicationStatement.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g. Claim or MedicationRequest.
    */
  var informationSource: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If only a code is specified, then it needs to be a code for a specific product. If more information is required, then the use of the medication resource is recommended.  For example, if you require form or lot number, then you must reference the Medication resource.
    */
  var medication: CodeableReference
  
  /**
    * Provides extra information about the Medication Statement that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A larger event of which this particular MedicationStatement is a component or step.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This could be a diagnosis code. If a full condition record exists or additional detail is needed, use reasonForUseReference.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Link to information that is relevant to a medication statement, for example, illicit drug use, gestational age, etc.
    */
  var relatedClinicalInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The full representation of the dose of the medication included in all dosage instructions.  To be used when multiple dosage instructions are included to represent complex dosing such as increasing or tapering doses.
    */
  var renderedDosageInstruction: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationStatement: typings.fhir.fhirStrings.MedicationStatement
  
  /**
    * This status concerns just the recording of the medication statement.  MedicationStatement.adherence should be used for indicating a patient's adherence to the information in this resource.  Note, the statuses are different than in previous releases for MedicationStatement or MedicationStatement.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: recorded | `entered-in-error` | draft
  
  /**
    * The person, animal or group who is/was taking the medication.
    */
  var subject: Reference
}
object MedicationStatement {
  
  inline def apply(medication: CodeableReference, status: recorded | `entered-in-error` | draft, subject: Reference): MedicationStatement = {
    val __obj = js.Dynamic.literal(medication = medication.asInstanceOf[js.Any], resourceType = "MedicationStatement", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationStatement] (val x: Self) extends AnyVal {
    
    inline def setAdherence(value: MedicationStatementAdherence): Self = StObject.set(x, "adherence", value.asInstanceOf[js.Any])
    
    inline def setAdherenceUndefined: Self = StObject.set(x, "adherence", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
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
    
    inline def setEffectiveTiming(value: Timing): Self = StObject.set(x, "effectiveTiming", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimingUndefined: Self = StObject.set(x, "effectiveTiming", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformationSource(value: js.Array[Reference]): Self = StObject.set(x, "informationSource", value.asInstanceOf[js.Any])
    
    inline def setInformationSourceUndefined: Self = StObject.set(x, "informationSource", js.undefined)
    
    inline def setInformationSourceVarargs(value: Reference*): Self = StObject.set(x, "informationSource", js.Array(value*))
    
    inline def setMedication(value: CodeableReference): Self = StObject.set(x, "medication", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRelatedClinicalInformation(value: js.Array[Reference]): Self = StObject.set(x, "relatedClinicalInformation", value.asInstanceOf[js.Any])
    
    inline def setRelatedClinicalInformationUndefined: Self = StObject.set(x, "relatedClinicalInformation", js.undefined)
    
    inline def setRelatedClinicalInformationVarargs(value: Reference*): Self = StObject.set(x, "relatedClinicalInformation", js.Array(value*))
    
    inline def setRenderedDosageInstruction(value: String): Self = StObject.set(x, "renderedDosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setRenderedDosageInstructionUndefined: Self = StObject.set(x, "renderedDosageInstruction", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: recorded | `entered-in-error` | draft): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def set_dateAsserted(value: Element): Self = StObject.set(x, "_dateAsserted", value.asInstanceOf[js.Any])
    
    inline def set_dateAssertedUndefined: Self = StObject.set(x, "_dateAsserted", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_renderedDosageInstruction(value: Element): Self = StObject.set(x, "_renderedDosageInstruction", value.asInstanceOf[js.Any])
    
    inline def set_renderedDosageInstructionUndefined: Self = StObject.set(x, "_renderedDosageInstruction", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
