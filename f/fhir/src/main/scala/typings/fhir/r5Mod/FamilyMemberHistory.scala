package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`health-unknown`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.partial
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
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
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
    * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
    */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.undefined
  
  /**
    * Describes why the family member's history is not available.
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  
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
    * This element is labeled as a modifier because the fact that age is estimated can/should change the results of any algorithm that calculates based on the specified age.
    */
  var estimatedAge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The URL pointing to a FHIR-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this FamilyMemberHistory.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This will either be a name or a description; e.g. "Aunt Susan", "my cousin with the red hair".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * This is not the family member.
    */
  var patient: Reference
  
  /**
    * The significant Procedures (or procedure) that the family member had. This is a repeating section to allow a system to represent more than one procedure per resource, though there is nothing stopping multiple resources - one per procedure.
    */
  var procedure: js.UndefOr[js.Array[FamilyMemberHistoryProcedure]] = js.undefined
  
  /**
    * Textual reasons can be captured using reasonCode.text.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The type of relationship this person has to the patient (father, mother, brother etc.).
    */
  var relationship: CodeableConcept
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_FamilyMemberHistory: typings.fhir.fhirStrings.FamilyMemberHistory
  
  /**
    * This element should ideally reflect whether the individual is genetically male or female.  However, as reported information based on the knowledge of the patient or reporting friend/relative, there may be situations where the reported sex might not be totally accurate.  E.g. 'Aunt Sue' might be XY rather than XX.  Questions soliciting this information should be phrased to encourage capture of genetic sex where known.  However, systems performing analysis should also allow for the possibility of imprecision with this element.
    */
  var sex: js.UndefOr[CodeableConcept] = js.undefined
  
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
  
  extension [Self <: FamilyMemberHistory](x: Self) {
    
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
    
    inline def setDataAbsentReason(value: CodeableConcept): Self = StObject.set(x, "dataAbsentReason", value.asInstanceOf[js.Any])
    
    inline def setDataAbsentReasonUndefined: Self = StObject.set(x, "dataAbsentReason", js.undefined)
    
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
    
    inline def setEstimatedAge(value: Boolean): Self = StObject.set(x, "estimatedAge", value.asInstanceOf[js.Any])
    
    inline def setEstimatedAgeUndefined: Self = StObject.set(x, "estimatedAge", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setProcedure(value: js.Array[FamilyMemberHistoryProcedure]): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setProcedureVarargs(value: FamilyMemberHistoryProcedure*): Self = StObject.set(x, "procedure", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.FamilyMemberHistory): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSex(value: CodeableConcept): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
    
    inline def setSexUndefined: Self = StObject.set(x, "sex", js.undefined)
    
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
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
