package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about patient's relatives, relevant for patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait FamilyMemberHistory
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'ageString'.
    */
  var _ageString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'bornDate'.
    */
  var _bornDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'bornString'.
    */
  var _bornString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'deceasedBoolean'.
    */
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'deceasedDate'.
    */
  var _deceasedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'deceasedString'.
    */
  var _deceasedString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'estimatedAge'.
    */
  var _estimatedAge: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * (approximate) age
    */
  var ageAge: js.UndefOr[Age] = js.undefined
  
  /**
    * (approximate) age
    */
  var ageRange: js.UndefOr[Range] = js.undefined
  
  /**
    * (approximate) age
    */
  var ageString: js.UndefOr[String] = js.undefined
  
  /**
    * (approximate) date of birth
    */
  var bornDate: js.UndefOr[date] = js.undefined
  
  /**
    * (approximate) date of birth
    */
  var bornPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * (approximate) date of birth
    */
  var bornString: js.UndefOr[String] = js.undefined
  
  /**
    * Condition that the related person had
    */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.undefined
  
  /**
    * When history was captured/updated
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Dead? How old/when?
    */
  var deceasedAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Dead? How old/when?
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dead? How old/when?
    */
  var deceasedDate: js.UndefOr[date] = js.undefined
  
  /**
    * Dead? How old/when?
    */
  var deceasedRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Dead? How old/when?
    */
  var deceasedString: js.UndefOr[String] = js.undefined
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Age is estimated?
    */
  var estimatedAge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  
  /**
    * External Id(s) for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The family member described
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The taking of a family member's history did not occur
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * subject-unknown | withheld | unable-to-obtain | deferred
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * General note about related person
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Patient history is about
    */
  var patient: Reference
  
  /**
    * Why was family member history performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Why was family member history performed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Relationship to the subject
    */
  var relationship: CodeableConcept
  
  /**
    * partial | completed | entered-in-error | health-unknown
    */
  var status: code
}
object FamilyMemberHistory {
  
  inline def apply(patient: Reference, relationship: CodeableConcept, status: code): FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistory]
  }
  
  extension [Self <: FamilyMemberHistory](x: Self) {
    
    inline def setAgeAge(value: Age): Self = StObject.set(x, "ageAge", value.asInstanceOf[js.Any])
    
    inline def setAgeAgeUndefined: Self = StObject.set(x, "ageAge", js.undefined)
    
    inline def setAgeRange(value: Range): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setAgeString(value: String): Self = StObject.set(x, "ageString", value.asInstanceOf[js.Any])
    
    inline def setAgeStringUndefined: Self = StObject.set(x, "ageString", js.undefined)
    
    inline def setBornDate(value: date): Self = StObject.set(x, "bornDate", value.asInstanceOf[js.Any])
    
    inline def setBornDateUndefined: Self = StObject.set(x, "bornDate", js.undefined)
    
    inline def setBornPeriod(value: Period): Self = StObject.set(x, "bornPeriod", value.asInstanceOf[js.Any])
    
    inline def setBornPeriodUndefined: Self = StObject.set(x, "bornPeriod", js.undefined)
    
    inline def setBornString(value: String): Self = StObject.set(x, "bornString", value.asInstanceOf[js.Any])
    
    inline def setBornStringUndefined: Self = StObject.set(x, "bornString", js.undefined)
    
    inline def setCondition(value: js.Array[FamilyMemberHistoryCondition]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: FamilyMemberHistoryCondition*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDeceasedAge(value: Age): Self = StObject.set(x, "deceasedAge", value.asInstanceOf[js.Any])
    
    inline def setDeceasedAgeUndefined: Self = StObject.set(x, "deceasedAge", js.undefined)
    
    inline def setDeceasedBoolean(value: Boolean): Self = StObject.set(x, "deceasedBoolean", value.asInstanceOf[js.Any])
    
    inline def setDeceasedBooleanUndefined: Self = StObject.set(x, "deceasedBoolean", js.undefined)
    
    inline def setDeceasedDate(value: date): Self = StObject.set(x, "deceasedDate", value.asInstanceOf[js.Any])
    
    inline def setDeceasedDateUndefined: Self = StObject.set(x, "deceasedDate", js.undefined)
    
    inline def setDeceasedRange(value: Range): Self = StObject.set(x, "deceasedRange", value.asInstanceOf[js.Any])
    
    inline def setDeceasedRangeUndefined: Self = StObject.set(x, "deceasedRange", js.undefined)
    
    inline def setDeceasedString(value: String): Self = StObject.set(x, "deceasedString", value.asInstanceOf[js.Any])
    
    inline def setDeceasedStringUndefined: Self = StObject.set(x, "deceasedString", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    inline def setEstimatedAge(value: Boolean): Self = StObject.set(x, "estimatedAge", value.asInstanceOf[js.Any])
    
    inline def setEstimatedAgeUndefined: Self = StObject.set(x, "estimatedAge", js.undefined)
    
    inline def setGender(value: code): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReason(value: CodeableConcept): Self = StObject.set(x, "notDoneReason", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonUndefined: Self = StObject.set(x, "notDoneReason", js.undefined)
    
    inline def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
