package typings.fhir.r2Mod

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
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * While age can be calculated from date of birth, sometimes recording age directly is more natureal for clinicians.
    */
  var ageQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * While age can be calculated from date of birth, sometimes recording age directly is more natureal for clinicians.
    */
  var ageRange: js.UndefOr[Range] = js.undefined
  
  /**
    * While age can be calculated from date of birth, sometimes recording age directly is more natureal for clinicians.
    */
  var ageString: js.UndefOr[String] = js.undefined
  
  /**
    * Allows calculation of the relative's age.
    */
  var bornDate: js.UndefOr[String] = js.undefined
  
  /**
    * Allows calculation of the relative's age.
    */
  var bornPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Allows calculation of the relative's age.
    */
  var bornString: js.UndefOr[String] = js.undefined
  
  /**
    * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
    */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.undefined
  
  /**
    * Allows determination of how current the summary is.
    */
  var date: js.UndefOr[String] = js.undefined
  
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
  var deceasedQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
    */
  var deceasedRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record.
    */
  var deceasedString: js.UndefOr[String] = js.undefined
  
  /**
    * Not all relationship codes imply gender and the relative's gender can be relevant for risk assessments.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * Need to allow connection to a wider workflow.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Allows greater ease in ensuring the same person is being talked about.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
    */
  var note: js.UndefOr[Annotation] = js.undefined
  
  /**
    * The person who this history concerns.
    */
  var patient: Reference
  
  /**
    * The type of relationship this person has to the patient (father, mother, brother etc.).
    */
  var relationship: CodeableConcept
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_FamilyMemberHistory: typings.fhir.fhirStrings.FamilyMemberHistory
  
  /**
    * A code specifying a state of a Family Member History record.
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
    
    inline def setAgeQuantity(value: Quantity): Self = StObject.set(x, "ageQuantity", value.asInstanceOf[js.Any])
    
    inline def setAgeQuantityUndefined: Self = StObject.set(x, "ageQuantity", js.undefined)
    
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
    
    inline def setDeceasedBoolean(value: Boolean): Self = StObject.set(x, "deceasedBoolean", value.asInstanceOf[js.Any])
    
    inline def setDeceasedBooleanUndefined: Self = StObject.set(x, "deceasedBoolean", js.undefined)
    
    inline def setDeceasedDate(value: String): Self = StObject.set(x, "deceasedDate", value.asInstanceOf[js.Any])
    
    inline def setDeceasedDateUndefined: Self = StObject.set(x, "deceasedDate", js.undefined)
    
    inline def setDeceasedQuantity(value: Quantity): Self = StObject.set(x, "deceasedQuantity", value.asInstanceOf[js.Any])
    
    inline def setDeceasedQuantityUndefined: Self = StObject.set(x, "deceasedQuantity", js.undefined)
    
    inline def setDeceasedRange(value: Range): Self = StObject.set(x, "deceasedRange", value.asInstanceOf[js.Any])
    
    inline def setDeceasedRangeUndefined: Self = StObject.set(x, "deceasedRange", js.undefined)
    
    inline def setDeceasedString(value: String): Self = StObject.set(x, "deceasedString", value.asInstanceOf[js.Any])
    
    inline def setDeceasedStringUndefined: Self = StObject.set(x, "deceasedString", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: Annotation): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
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
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
