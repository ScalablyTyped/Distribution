package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.confirmed
import typings.fhir.fhirStrings.differential
import typings.fhir.fhirStrings.provisional
import typings.fhir.fhirStrings.refuted
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _abatementBoolean: js.UndefOr[Element] = js.undefined
  
  var _abatementDateTime: js.UndefOr[Element] = js.undefined
  
  var _abatementString: js.UndefOr[Element] = js.undefined
  
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  
  var _dateRecorded: js.UndefOr[Element] = js.undefined
  
  var _notes: js.UndefOr[Element] = js.undefined
  
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
    */
  var abatementBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
    */
  var abatementDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
    */
  var abatementPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
    */
  var abatementQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
    */
  var abatementRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The date or estimated date that the condition resolved or went into remission. This is called "abatement" because of the many overloaded connotations associated with "remission" or "resolution" - Conditions are never really resolved, but they can abate.
    */
  var abatementString: js.UndefOr[String] = js.undefined
  
  /**
    * Individual who is making the condition statement.
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  
  /**
    * The anatomical location where this condition manifests itself.
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A category assigned to the condition.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The clinical status of the condition.
    */
  var clinicalStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Identification of the condition, problem or diagnosis.
    */
  var code: CodeableConcept
  
  /**
    * A date, when  the Condition statement was documented.
    */
  var dateRecorded: js.UndefOr[String] = js.undefined
  
  /**
    * Encounter during which the condition was first asserted.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed.
    */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.undefined
  
  /**
    * Need to allow connection to a wider workflow.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
    */
  var onsetDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
    */
  var onsetQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Estimated or actual date or date-time  the condition began, in the opinion of the clinician.
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the patient who the condition record is associated with.
    */
  var patient: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Condition: typings.fhir.fhirStrings.Condition
  
  /**
    * A subjective assessment of the severity of the condition as evaluated by the clinician.
    */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Clinical stage or grade of a condition. May include formal severity assessments.
    */
  var stage: js.UndefOr[ConditionStage] = js.undefined
  
  /**
    * The verification status to support the clinical status of the condition.
    */
  var verificationStatus: provisional | differential | confirmed | refuted | `entered-in-error` | unknown
}
object Condition {
  
  inline def apply(
    code: CodeableConcept,
    patient: Reference,
    verificationStatus: provisional | differential | confirmed | refuted | `entered-in-error` | unknown
  ): Condition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], resourceType = "Condition", verificationStatus = verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setAbatementBoolean(value: Boolean): Self = StObject.set(x, "abatementBoolean", value.asInstanceOf[js.Any])
    
    inline def setAbatementBooleanUndefined: Self = StObject.set(x, "abatementBoolean", js.undefined)
    
    inline def setAbatementDateTime(value: String): Self = StObject.set(x, "abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def setAbatementDateTimeUndefined: Self = StObject.set(x, "abatementDateTime", js.undefined)
    
    inline def setAbatementPeriod(value: Period): Self = StObject.set(x, "abatementPeriod", value.asInstanceOf[js.Any])
    
    inline def setAbatementPeriodUndefined: Self = StObject.set(x, "abatementPeriod", js.undefined)
    
    inline def setAbatementQuantity(value: Quantity): Self = StObject.set(x, "abatementQuantity", value.asInstanceOf[js.Any])
    
    inline def setAbatementQuantityUndefined: Self = StObject.set(x, "abatementQuantity", js.undefined)
    
    inline def setAbatementRange(value: Range): Self = StObject.set(x, "abatementRange", value.asInstanceOf[js.Any])
    
    inline def setAbatementRangeUndefined: Self = StObject.set(x, "abatementRange", js.undefined)
    
    inline def setAbatementString(value: String): Self = StObject.set(x, "abatementString", value.asInstanceOf[js.Any])
    
    inline def setAbatementStringUndefined: Self = StObject.set(x, "abatementString", js.undefined)
    
    inline def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    inline def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setClinicalStatus(value: String): Self = StObject.set(x, "clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def setClinicalStatusUndefined: Self = StObject.set(x, "clinicalStatus", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDateRecorded(value: String): Self = StObject.set(x, "dateRecorded", value.asInstanceOf[js.Any])
    
    inline def setDateRecordedUndefined: Self = StObject.set(x, "dateRecorded", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvidence(value: js.Array[ConditionEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: ConditionEvidence*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOnsetDateTime(value: String): Self = StObject.set(x, "onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnsetDateTimeUndefined: Self = StObject.set(x, "onsetDateTime", js.undefined)
    
    inline def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    inline def setOnsetQuantity(value: Quantity): Self = StObject.set(x, "onsetQuantity", value.asInstanceOf[js.Any])
    
    inline def setOnsetQuantityUndefined: Self = StObject.set(x, "onsetQuantity", js.undefined)
    
    inline def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    inline def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    inline def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    inline def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Condition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: CodeableConcept): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStage(value: ConditionStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setVerificationStatus(value: provisional | differential | confirmed | refuted | `entered-in-error` | unknown): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def set_abatementBoolean(value: Element): Self = StObject.set(x, "_abatementBoolean", value.asInstanceOf[js.Any])
    
    inline def set_abatementBooleanUndefined: Self = StObject.set(x, "_abatementBoolean", js.undefined)
    
    inline def set_abatementDateTime(value: Element): Self = StObject.set(x, "_abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def set_abatementDateTimeUndefined: Self = StObject.set(x, "_abatementDateTime", js.undefined)
    
    inline def set_abatementString(value: Element): Self = StObject.set(x, "_abatementString", value.asInstanceOf[js.Any])
    
    inline def set_abatementStringUndefined: Self = StObject.set(x, "_abatementString", js.undefined)
    
    inline def set_clinicalStatus(value: Element): Self = StObject.set(x, "_clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def set_clinicalStatusUndefined: Self = StObject.set(x, "_clinicalStatus", js.undefined)
    
    inline def set_dateRecorded(value: Element): Self = StObject.set(x, "_dateRecorded", value.asInstanceOf[js.Any])
    
    inline def set_dateRecordedUndefined: Self = StObject.set(x, "_dateRecorded", js.undefined)
    
    inline def set_notes(value: Element): Self = StObject.set(x, "_notes", value.asInstanceOf[js.Any])
    
    inline def set_notesUndefined: Self = StObject.set(x, "_notes", js.undefined)
    
    inline def set_onsetDateTime(value: Element): Self = StObject.set(x, "_onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def set_onsetDateTimeUndefined: Self = StObject.set(x, "_onsetDateTime", js.undefined)
    
    inline def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    inline def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
    
    inline def set_verificationStatus(value: Element): Self = StObject.set(x, "_verificationStatus", value.asInstanceOf[js.Any])
    
    inline def set_verificationStatusUndefined: Self = StObject.set(x, "_verificationStatus", js.undefined)
  }
}
