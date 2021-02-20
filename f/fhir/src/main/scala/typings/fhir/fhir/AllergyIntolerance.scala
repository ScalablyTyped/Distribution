package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class AllergyIntoleranceMutableBuilder[Self <: AllergyIntolerance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssertedDate(value: dateTime): Self = StObject.set(x, "assertedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertedDateUndefined: Self = StObject.set(x, "assertedDate", js.undefined)
    
    @scala.inline
    def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    @scala.inline
    def setCategory(value: js.Array[code]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: code*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setClinicalStatus(value: code): Self = StObject.set(x, "clinicalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClinicalStatusUndefined: Self = StObject.set(x, "clinicalStatus", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCriticality(value: code): Self = StObject.set(x, "criticality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalityUndefined: Self = StObject.set(x, "criticality", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setLastOccurrence(value: dateTime): Self = StObject.set(x, "lastOccurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastOccurrenceUndefined: Self = StObject.set(x, "lastOccurrence", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOnsetAge(value: Age): Self = StObject.set(x, "onsetAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetAgeUndefined: Self = StObject.set(x, "onsetAge", js.undefined)
    
    @scala.inline
    def setOnsetDateTime(value: dateTime): Self = StObject.set(x, "onsetDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetDateTimeUndefined: Self = StObject.set(x, "onsetDateTime", js.undefined)
    
    @scala.inline
    def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    @scala.inline
    def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    @scala.inline
    def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaction(value: js.Array[AllergyIntoleranceReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    @scala.inline
    def setReactionVarargs(value: AllergyIntoleranceReaction*): Self = StObject.set(x, "reaction", js.Array(value :_*))
    
    @scala.inline
    def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerificationStatus(value: code): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_assertedDate(value: Element): Self = StObject.set(x, "_assertedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_assertedDateUndefined: Self = StObject.set(x, "_assertedDate", js.undefined)
    
    @scala.inline
    def set_category(value: js.Array[Element]): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    @scala.inline
    def set_categoryVarargs(value: Element*): Self = StObject.set(x, "_category", js.Array(value :_*))
    
    @scala.inline
    def set_clinicalStatus(value: Element): Self = StObject.set(x, "_clinicalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_clinicalStatusUndefined: Self = StObject.set(x, "_clinicalStatus", js.undefined)
    
    @scala.inline
    def set_criticality(value: Element): Self = StObject.set(x, "_criticality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_criticalityUndefined: Self = StObject.set(x, "_criticality", js.undefined)
    
    @scala.inline
    def set_lastOccurrence(value: Element): Self = StObject.set(x, "_lastOccurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastOccurrenceUndefined: Self = StObject.set(x, "_lastOccurrence", js.undefined)
    
    @scala.inline
    def set_onsetDateTime(value: Element): Self = StObject.set(x, "_onsetDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onsetDateTimeUndefined: Self = StObject.set(x, "_onsetDateTime", js.undefined)
    
    @scala.inline
    def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_verificationStatus(value: Element): Self = StObject.set(x, "_verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_verificationStatusUndefined: Self = StObject.set(x, "_verificationStatus", js.undefined)
  }
}
