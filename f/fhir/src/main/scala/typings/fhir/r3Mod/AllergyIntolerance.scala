package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`unable-to-assess`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.allergy
import typings.fhir.fhirStrings.biologic
import typings.fhir.fhirStrings.confirmed
import typings.fhir.fhirStrings.environment
import typings.fhir.fhirStrings.food
import typings.fhir.fhirStrings.high
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.intolerance
import typings.fhir.fhirStrings.low
import typings.fhir.fhirStrings.medication_
import typings.fhir.fhirStrings.refuted
import typings.fhir.fhirStrings.resolved
import typings.fhir.fhirStrings.unconfirmed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllergyIntolerance
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _assertedDate: js.UndefOr[Element] = js.undefined
  
  var _category: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  
  var _criticality: js.UndefOr[Element] = js.undefined
  
  var _lastOccurrence: js.UndefOr[Element] = js.undefined
  
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * The date on which the existance of the AllergyIntolerance was first asserted or acknowledged.
    */
  var assertedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The recorder takes repsonsibility for the content, but can reference the source from where they got it.
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This data element has been included because it is currently being captured in some clinical systems. This data can be derived from the substance where coding systems are used, and is effectively redundant in that situation.  When searching on category, consider the implications of AllergyIntolerance resources without a category.  For example, when searching on category = medication, medication allergies that don't have a category valued will not be returned.  Refer to [search](search.html) for more information on how to search category with a :missing modifier to get allergies that don't have a category.  Additionally, category should be used with caution because category can be subjective based on the sender.
    */
  var category: js.UndefOr[js.Array[food | medication_ | environment | biologic]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes inactive and resolved that mark the AllergyIntolerance as not currently valid.
    */
  var clinicalStatus: js.UndefOr[active | inactive | resolved] = js.undefined
  
  /**
    * It is strongly recommended that this element be populated using a terminology, where possible. For example, some terminologies used include RxNorm, SNOMED CT, DM+D, NDFRT, ICD-9, IDC-10, UNI, ATC and CPT. Plain text should only be used if there is no appropriate terminology available. Additional details can be specified in the text.
    * When a substance or product code is specified for the 'code' element, the "default" semantic context is that this is a positive statement of an allergy or intolerance (depending on the value of the 'type' element, if present) condition to the specified substance/product.  In the corresponding SNOMED CT allergy model, the specified substance/product is the target (destination) of the "Causative agent" relationship.
    * The 'substanceExposureRisk' extension is available as a structured and more flexible alternative to the 'code' element for making positive or negative allergy or intolerance statements.  This extension provides the capability to make "no known allergy" (or "no risk of adverse reaction") statements regarding any coded substance/product (including cases when a pre-coordinated "no allergy to x" concept for that substance/product does not exist).  If the 'substanceExposureRisk' extension is present, the AllergyIntolerance.code element SHALL be omitted.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The default criticality value for any propensity to an adverse reaction should be 'Low Risk', indicating at the very least a relative contraindication to deliberate or voluntary exposure to the substance. 'High Risk' is flagged if the clinician has identified a propensity for a more serious or potentially life-threatening reaction, such as anaphylaxis, and implies an absolute contraindication to deliberate or voluntary exposure to the substance. If this element is missing, the criticality is unknown (though it may be known elsewhere).
    * Systems that capture a severity at the condition level are actually representing the concept of criticality whereas the severity documented at the reaction level is representing the true reaction severity.  Existing systems that are capturing both condition criticality and reaction severity may use the term "severity" to represent both.  Criticality is the worst it could be in the future (i.e. situation-agnostic) whereas severity is situation-dependent.
    */
  var criticality: js.UndefOr[low | high | `unable-to-assess`] = js.undefined
  
  /**
    * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This date may be replicated by one of the Onset of Reaction dates. Where a textual representation of the date of last occurrence is required e.g. 'In Childhood, '10 years ago' the Comment element should be used.
    */
  var lastOccurrence: js.UndefOr[String] = js.undefined
  
  /**
    * For example: including reason for flagging a seriousness of 'High Risk'; and instructions related to future exposure or administration of the substance, such as administration within an Intensive Care Unit or under corticosteroid cover. The notes should be related to an allergy or intolerance as a condition in general and not related to any particular episode of it. For episode notes and descriptions, use AllergyIntolerance.event.description and  AllergyIntolerance.event.notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
    */
  var onsetDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age when allergy or intolerance was identified.
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /**
    * The patient who has the allergy or intolerance.
    */
  var patient: Reference
  
  /**
    * Details about each adverse reaction event linked to exposure to the identified substance.
    */
  var reaction: js.UndefOr[js.Array[AllergyIntoleranceReaction]] = js.undefined
  
  /**
    * Individual who recorded the record and takes responsibility for its content.
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AllergyIntolerance: typings.fhir.fhirStrings.AllergyIntolerance
  
  /**
    * Allergic (typically immune-mediated) reactions have been traditionally regarded as an indicator for potential escalation to significant future risk. Contemporary knowledge suggests that some reactions previously thought to be immune-mediated are, in fact, non-immune, but in some cases can still pose a life threatening risk. It is acknowledged that many clinicians may not be in a position to distinguish the mechanism of a particular reaction. Often the term "allergy" is used rather generically and may overlap with the use of "intolerance" - in practice the boundaries between these two concepts may not be well-defined or understood. This data element is included nevertheless, because many legacy systems have captured this attribute. Immunologic testing may provide supporting evidence for the basis of the reaction and the causative substance, but no tests are 100% sensitive or specific for sensitivity to a particular substance. If, as is commonly the case, it is unclear whether the reaction is due to an allergy or an intolerance, then the type element should be omitted from the resource.
    */
  var `type`: js.UndefOr[allergy | intolerance] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes refuted and entered-in-error that mark the AllergyIntolerance as not currently valid.
    */
  var verificationStatus: unconfirmed | confirmed | refuted | `entered-in-error`
}
object AllergyIntolerance {
  
  inline def apply(patient: Reference, verificationStatus: unconfirmed | confirmed | refuted | `entered-in-error`): AllergyIntolerance = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "AllergyIntolerance", verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntolerance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllergyIntolerance] (val x: Self) extends AnyVal {
    
    inline def setAssertedDate(value: String): Self = StObject.set(x, "assertedDate", value.asInstanceOf[js.Any])
    
    inline def setAssertedDateUndefined: Self = StObject.set(x, "assertedDate", js.undefined)
    
    inline def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    inline def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    inline def setCategory(value: js.Array[food | medication_ | environment | biologic]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: (food | medication_ | environment | biologic)*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setClinicalStatus(value: active | inactive | resolved): Self = StObject.set(x, "clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def setClinicalStatusUndefined: Self = StObject.set(x, "clinicalStatus", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCriticality(value: low | high | `unable-to-assess`): Self = StObject.set(x, "criticality", value.asInstanceOf[js.Any])
    
    inline def setCriticalityUndefined: Self = StObject.set(x, "criticality", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLastOccurrence(value: String): Self = StObject.set(x, "lastOccurrence", value.asInstanceOf[js.Any])
    
    inline def setLastOccurrenceUndefined: Self = StObject.set(x, "lastOccurrence", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOnsetAge(value: Age): Self = StObject.set(x, "onsetAge", value.asInstanceOf[js.Any])
    
    inline def setOnsetAgeUndefined: Self = StObject.set(x, "onsetAge", js.undefined)
    
    inline def setOnsetDateTime(value: String): Self = StObject.set(x, "onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnsetDateTimeUndefined: Self = StObject.set(x, "onsetDateTime", js.undefined)
    
    inline def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    inline def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    inline def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    inline def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    inline def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setReaction(value: js.Array[AllergyIntoleranceReaction]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionVarargs(value: AllergyIntoleranceReaction*): Self = StObject.set(x, "reaction", js.Array(value*))
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AllergyIntolerance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: allergy | intolerance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerificationStatus(value: unconfirmed | confirmed | refuted | `entered-in-error`): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def set_assertedDate(value: Element): Self = StObject.set(x, "_assertedDate", value.asInstanceOf[js.Any])
    
    inline def set_assertedDateUndefined: Self = StObject.set(x, "_assertedDate", js.undefined)
    
    inline def set_category(value: js.Array[Element]): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    inline def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    inline def set_categoryVarargs(value: Element*): Self = StObject.set(x, "_category", js.Array(value*))
    
    inline def set_clinicalStatus(value: Element): Self = StObject.set(x, "_clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def set_clinicalStatusUndefined: Self = StObject.set(x, "_clinicalStatus", js.undefined)
    
    inline def set_criticality(value: Element): Self = StObject.set(x, "_criticality", value.asInstanceOf[js.Any])
    
    inline def set_criticalityUndefined: Self = StObject.set(x, "_criticality", js.undefined)
    
    inline def set_lastOccurrence(value: Element): Self = StObject.set(x, "_lastOccurrence", value.asInstanceOf[js.Any])
    
    inline def set_lastOccurrenceUndefined: Self = StObject.set(x, "_lastOccurrence", js.undefined)
    
    inline def set_onsetDateTime(value: Element): Self = StObject.set(x, "_onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def set_onsetDateTimeUndefined: Self = StObject.set(x, "_onsetDateTime", js.undefined)
    
    inline def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    inline def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_verificationStatus(value: Element): Self = StObject.set(x, "_verificationStatus", value.asInstanceOf[js.Any])
    
    inline def set_verificationStatusUndefined: Self = StObject.set(x, "_verificationStatus", js.undefined)
  }
}
