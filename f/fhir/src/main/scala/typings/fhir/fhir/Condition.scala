package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information about conditions, problems or diagnoses
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Condition
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'abatementBoolean'.
    */
  var _abatementBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'abatementDateTime'.
    */
  var _abatementDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'abatementString'.
    */
  var _abatementString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * If/when in resolution/remission
    */
  var abatementAge: js.UndefOr[Age] = js.undefined
  
  /**
    * If/when in resolution/remission
    */
  var abatementBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If/when in resolution/remission
    */
  var abatementDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * If/when in resolution/remission
    */
  var abatementPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * If/when in resolution/remission
    */
  var abatementRange: js.UndefOr[Range] = js.undefined
  
  /**
    * If/when in resolution/remission
    */
  var abatementString: js.UndefOr[String] = js.undefined
  
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Person who asserts this condition
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Anatomical location, if relevant
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * problem-list-item | encounter-diagnosis
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * active | recurrence | inactive | remission | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.undefined
  
  /**
    * Identification of the condition, problem or diagnosis
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Encounter or episode when condition first asserted
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Supporting evidence
    */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.undefined
  
  /**
    * External Ids for this condition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information about the Condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /**
    * Subjective severity of condition
    */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Stage/grade, usually assessed formally
    */
  var stage: js.UndefOr[ConditionStage] = js.undefined
  
  /**
    * Who has the condition?
    */
  var subject: Reference
  
  /**
    * provisional | differential | confirmed | refuted | entered-in-error | unknown
    */
  var verificationStatus: js.UndefOr[code] = js.undefined
}
object Condition {
  
  inline def apply(subject: Reference): Condition = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setAbatementAge(value: Age): Self = StObject.set(x, "abatementAge", value.asInstanceOf[js.Any])
    
    inline def setAbatementAgeUndefined: Self = StObject.set(x, "abatementAge", js.undefined)
    
    inline def setAbatementBoolean(value: Boolean): Self = StObject.set(x, "abatementBoolean", value.asInstanceOf[js.Any])
    
    inline def setAbatementBooleanUndefined: Self = StObject.set(x, "abatementBoolean", js.undefined)
    
    inline def setAbatementDateTime(value: dateTime): Self = StObject.set(x, "abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def setAbatementDateTimeUndefined: Self = StObject.set(x, "abatementDateTime", js.undefined)
    
    inline def setAbatementPeriod(value: Period): Self = StObject.set(x, "abatementPeriod", value.asInstanceOf[js.Any])
    
    inline def setAbatementPeriodUndefined: Self = StObject.set(x, "abatementPeriod", js.undefined)
    
    inline def setAbatementRange(value: Range): Self = StObject.set(x, "abatementRange", value.asInstanceOf[js.Any])
    
    inline def setAbatementRangeUndefined: Self = StObject.set(x, "abatementRange", js.undefined)
    
    inline def setAbatementString(value: String): Self = StObject.set(x, "abatementString", value.asInstanceOf[js.Any])
    
    inline def setAbatementStringUndefined: Self = StObject.set(x, "abatementString", js.undefined)
    
    inline def setAssertedDate(value: dateTime): Self = StObject.set(x, "assertedDate", value.asInstanceOf[js.Any])
    
    inline def setAssertedDateUndefined: Self = StObject.set(x, "assertedDate", js.undefined)
    
    inline def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    inline def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value :_*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    inline def setClinicalStatus(value: code): Self = StObject.set(x, "clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def setClinicalStatusUndefined: Self = StObject.set(x, "clinicalStatus", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEvidence(value: js.Array[ConditionEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: ConditionEvidence*): Self = StObject.set(x, "evidence", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setOnsetAge(value: Age): Self = StObject.set(x, "onsetAge", value.asInstanceOf[js.Any])
    
    inline def setOnsetAgeUndefined: Self = StObject.set(x, "onsetAge", js.undefined)
    
    inline def setOnsetDateTime(value: dateTime): Self = StObject.set(x, "onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnsetDateTimeUndefined: Self = StObject.set(x, "onsetDateTime", js.undefined)
    
    inline def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    inline def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    inline def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    inline def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    inline def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    inline def setSeverity(value: CodeableConcept): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStage(value: ConditionStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatus(value: code): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
    
    inline def set_abatementBoolean(value: Element): Self = StObject.set(x, "_abatementBoolean", value.asInstanceOf[js.Any])
    
    inline def set_abatementBooleanUndefined: Self = StObject.set(x, "_abatementBoolean", js.undefined)
    
    inline def set_abatementDateTime(value: Element): Self = StObject.set(x, "_abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def set_abatementDateTimeUndefined: Self = StObject.set(x, "_abatementDateTime", js.undefined)
    
    inline def set_abatementString(value: Element): Self = StObject.set(x, "_abatementString", value.asInstanceOf[js.Any])
    
    inline def set_abatementStringUndefined: Self = StObject.set(x, "_abatementString", js.undefined)
    
    inline def set_assertedDate(value: Element): Self = StObject.set(x, "_assertedDate", value.asInstanceOf[js.Any])
    
    inline def set_assertedDateUndefined: Self = StObject.set(x, "_assertedDate", js.undefined)
    
    inline def set_clinicalStatus(value: Element): Self = StObject.set(x, "_clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def set_clinicalStatusUndefined: Self = StObject.set(x, "_clinicalStatus", js.undefined)
    
    inline def set_onsetDateTime(value: Element): Self = StObject.set(x, "_onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def set_onsetDateTimeUndefined: Self = StObject.set(x, "_onsetDateTime", js.undefined)
    
    inline def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    inline def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
    
    inline def set_verificationStatus(value: Element): Self = StObject.set(x, "_verificationStatus", value.asInstanceOf[js.Any])
    
    inline def set_verificationStatusUndefined: Self = StObject.set(x, "_verificationStatus", js.undefined)
  }
}
