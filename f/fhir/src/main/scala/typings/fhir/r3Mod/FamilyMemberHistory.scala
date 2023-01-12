package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`health-unknown`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.female
import typings.fhir.fhirStrings.male
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyMemberHistory
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _ageString: js.UndefOr[Element] = js.undefined
  
  var _bornDate: js.UndefOr[Element] = js.undefined
  
  var _bornString: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  
  var _deceasedDate: js.UndefOr[Element] = js.undefined
  
  var _deceasedString: js.UndefOr[Element] = js.undefined
  
  var _estimatedAge: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _notDone: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * use estimatedAge to indicate whether the age is actual or not.
    */
  var ageAge: js.UndefOr[Age] = js.undefined
  
  /**
    * use estimatedAge to indicate whether the age is actual or not.
    */
  var ageRange: js.UndefOr[Range] = js.undefined
  
  /**
    * use estimatedAge to indicate whether the age is actual or not.
    */
  var ageString: js.UndefOr[String] = js.undefined
  
  /**
    * The actual or approximate date of birth of the relative.
    */
  var bornDate: js.UndefOr[String] = js.undefined
  
  /**
    * The actual or approximate date of birth of the relative.
    */
  var bornPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The actual or approximate date of birth of the relative.
    */
  var bornString: js.UndefOr[String] = js.undefined
  
  /**
    * If none of the conditions listed have an outcome of "death" specified, that indicates that none of the specified conditions are known to have been the primary cause of death.
    */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.undefined
  
  /**
    * This should be captured even if the same as the date on the List aggregating the full family history.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
    */
  var deceasedAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
    */
  var deceasedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
    */
  var deceasedRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
    */
  var deceasedString: js.UndefOr[String] = js.undefined
  
  /**
    * A protocol or questionnaire that was adhered to in whole or in part by this event.
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the fact tha age is estimated can/should change the results of any algorithm that calculates based on the specified age.
    */
  var estimatedAge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This element is labeled as a modifier because it marks the family member history as a family member history that did not occur.  The more attributes are populated, the more constrained the negated statement is.  This notDone element is being evaluated and will likely be removed in a subsequent release.
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This notDoneReason element is being evaluated and will likely be replaced in a subsequent release (e.g. dataAbsentReason).
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The person who this history concerns.
    */
  var patient: Reference
  
  /**
    * Textual reasons can be caprued using reasonCode.text.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates a Condition, Observation, AllergyIntolerance, or QuestionnaireResponse that justifies this family member history event.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of relationship this person has to the patient (father, mother, brother etc.).
    */
  var relationship: CodeableConcept
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_FamilyMemberHistory: typings.fhir.fhirStrings.FamilyMemberHistory
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: partial | completed | `entered-in-error` | `health-unknown`
}
object FamilyMemberHistory {
  
  inline def apply(
    patient: Reference,
    relationship: CodeableConcept,
    status: partial | completed | `entered-in-error` | `health-unknown`
  ): FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceType = "FamilyMemberHistory", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FamilyMemberHistory] (val x: Self) extends AnyVal {
    
    inline def setAgeAge(value: Age): Self = StObject.set(x, "ageAge", value.asInstanceOf[js.Any])
    
    inline def setAgeAgeUndefined: Self = StObject.set(x, "ageAge", js.undefined)
    
    inline def setAgeRange(value: Range): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setAgeString(value: String): Self = StObject.set(x, "ageString", value.asInstanceOf[js.Any])
    
    inline def setAgeStringUndefined: Self = StObject.set(x, "ageString", js.undefined)
    
    inline def setBornDate(value: String): Self = StObject.set(x, "bornDate", value.asInstanceOf[js.Any])
    
    inline def setBornDateUndefined: Self = StObject.set(x, "bornDate", js.undefined)
    
    inline def setBornPeriod(value: Period): Self = StObject.set(x, "bornPeriod", value.asInstanceOf[js.Any])
    
    inline def setBornPeriodUndefined: Self = StObject.set(x, "bornPeriod", js.undefined)
    
    inline def setBornString(value: String): Self = StObject.set(x, "bornString", value.asInstanceOf[js.Any])
    
    inline def setBornStringUndefined: Self = StObject.set(x, "bornString", js.undefined)
    
    inline def setCondition(value: js.Array[FamilyMemberHistoryCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: FamilyMemberHistoryCondition*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDeceasedAge(value: Age): Self = StObject.set(x, "deceasedAge", value.asInstanceOf[js.Any])
    
    inline def setDeceasedAgeUndefined: Self = StObject.set(x, "deceasedAge", js.undefined)
    
    inline def setDeceasedBoolean(value: Boolean): Self = StObject.set(x, "deceasedBoolean", value.asInstanceOf[js.Any])
    
    inline def setDeceasedBooleanUndefined: Self = StObject.set(x, "deceasedBoolean", js.undefined)
    
    inline def setDeceasedDate(value: String): Self = StObject.set(x, "deceasedDate", value.asInstanceOf[js.Any])
    
    inline def setDeceasedDateUndefined: Self = StObject.set(x, "deceasedDate", js.undefined)
    
    inline def setDeceasedRange(value: Range): Self = StObject.set(x, "deceasedRange", value.asInstanceOf[js.Any])
    
    inline def setDeceasedRangeUndefined: Self = StObject.set(x, "deceasedRange", js.undefined)
    
    inline def setDeceasedString(value: String): Self = StObject.set(x, "deceasedString", value.asInstanceOf[js.Any])
    
    inline def setDeceasedStringUndefined: Self = StObject.set(x, "deceasedString", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setEstimatedAge(value: Boolean): Self = StObject.set(x, "estimatedAge", value.asInstanceOf[js.Any])
    
    inline def setEstimatedAgeUndefined: Self = StObject.set(x, "estimatedAge", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReason(value: CodeableConcept): Self = StObject.set(x, "notDoneReason", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonUndefined: Self = StObject.set(x, "notDoneReason", js.undefined)
    
    inline def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.FamilyMemberHistory): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: partial | completed | `entered-in-error` | `health-unknown`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_ageString(value: Element): Self = StObject.set(x, "_ageString", value.asInstanceOf[js.Any])
    
    inline def set_ageStringUndefined: Self = StObject.set(x, "_ageString", js.undefined)
    
    inline def set_bornDate(value: Element): Self = StObject.set(x, "_bornDate", value.asInstanceOf[js.Any])
    
    inline def set_bornDateUndefined: Self = StObject.set(x, "_bornDate", js.undefined)
    
    inline def set_bornString(value: Element): Self = StObject.set(x, "_bornString", value.asInstanceOf[js.Any])
    
    inline def set_bornStringUndefined: Self = StObject.set(x, "_bornString", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_deceasedBoolean(value: Element): Self = StObject.set(x, "_deceasedBoolean", value.asInstanceOf[js.Any])
    
    inline def set_deceasedBooleanUndefined: Self = StObject.set(x, "_deceasedBoolean", js.undefined)
    
    inline def set_deceasedDate(value: Element): Self = StObject.set(x, "_deceasedDate", value.asInstanceOf[js.Any])
    
    inline def set_deceasedDateUndefined: Self = StObject.set(x, "_deceasedDate", js.undefined)
    
    inline def set_deceasedString(value: Element): Self = StObject.set(x, "_deceasedString", value.asInstanceOf[js.Any])
    
    inline def set_deceasedStringUndefined: Self = StObject.set(x, "_deceasedString", js.undefined)
    
    inline def set_estimatedAge(value: Element): Self = StObject.set(x, "_estimatedAge", value.asInstanceOf[js.Any])
    
    inline def set_estimatedAgeUndefined: Self = StObject.set(x, "_estimatedAge", js.undefined)
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    inline def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
