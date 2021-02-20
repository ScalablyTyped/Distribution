package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information about conditions, problems or diagnoses
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Condition extends DomainResource {
  
  /**
    * Contains extended information for property 'abatementBoolean'.
    */
  var _abatementBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'abatementDateTime'.
    */
  var _abatementDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'abatementString'.
    */
  var _abatementString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.native
  
  /**
    * If/when in resolution/remission
    */
  var abatementAge: js.UndefOr[Age] = js.native
  
  /**
    * If/when in resolution/remission
    */
  var abatementBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * If/when in resolution/remission
    */
  var abatementDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * If/when in resolution/remission
    */
  var abatementPeriod: js.UndefOr[Period] = js.native
  
  /**
    * If/when in resolution/remission
    */
  var abatementRange: js.UndefOr[Range] = js.native
  
  /**
    * If/when in resolution/remission
    */
  var abatementString: js.UndefOr[String] = js.native
  
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.native
  
  /**
    * Person who asserts this condition
    */
  var asserter: js.UndefOr[Reference] = js.native
  
  /**
    * Anatomical location, if relevant
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * problem-list-item | encounter-diagnosis
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * active | recurrence | inactive | remission | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.native
  
  /**
    * Identification of the condition, problem or diagnosis
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Encounter or episode when condition first asserted
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Supporting evidence
    */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.native
  
  /**
    * External Ids for this condition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Additional information about the Condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetAge: js.UndefOr[Age] = js.native
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetPeriod: js.UndefOr[Period] = js.native
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetRange: js.UndefOr[Range] = js.native
  
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetString: js.UndefOr[String] = js.native
  
  /**
    * Subjective severity of condition
    */
  var severity: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Stage/grade, usually assessed formally
    */
  var stage: js.UndefOr[ConditionStage] = js.native
  
  /**
    * Who has the condition?
    */
  var subject: Reference = js.native
  
  /**
    * provisional | differential | confirmed | refuted | entered-in-error | unknown
    */
  var verificationStatus: js.UndefOr[code] = js.native
}
object Condition {
  
  @scala.inline
  def apply(subject: Reference): Condition = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbatementAge(value: Age): Self = StObject.set(x, "abatementAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbatementAgeUndefined: Self = StObject.set(x, "abatementAge", js.undefined)
    
    @scala.inline
    def setAbatementBoolean(value: Boolean): Self = StObject.set(x, "abatementBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbatementBooleanUndefined: Self = StObject.set(x, "abatementBoolean", js.undefined)
    
    @scala.inline
    def setAbatementDateTime(value: dateTime): Self = StObject.set(x, "abatementDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbatementDateTimeUndefined: Self = StObject.set(x, "abatementDateTime", js.undefined)
    
    @scala.inline
    def setAbatementPeriod(value: Period): Self = StObject.set(x, "abatementPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbatementPeriodUndefined: Self = StObject.set(x, "abatementPeriod", js.undefined)
    
    @scala.inline
    def setAbatementRange(value: Range): Self = StObject.set(x, "abatementRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbatementRangeUndefined: Self = StObject.set(x, "abatementRange", js.undefined)
    
    @scala.inline
    def setAbatementString(value: String): Self = StObject.set(x, "abatementString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbatementStringUndefined: Self = StObject.set(x, "abatementString", js.undefined)
    
    @scala.inline
    def setAssertedDate(value: dateTime): Self = StObject.set(x, "assertedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertedDateUndefined: Self = StObject.set(x, "assertedDate", js.undefined)
    
    @scala.inline
    def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    @scala.inline
    def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setClinicalStatus(value: code): Self = StObject.set(x, "clinicalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClinicalStatusUndefined: Self = StObject.set(x, "clinicalStatus", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setEvidence(value: js.Array[ConditionEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    @scala.inline
    def setEvidenceVarargs(value: ConditionEvidence*): Self = StObject.set(x, "evidence", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
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
    def setSeverity(value: CodeableConcept): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setStage(value: ConditionStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStatus(value: code): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
    
    @scala.inline
    def set_abatementBoolean(value: Element): Self = StObject.set(x, "_abatementBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_abatementBooleanUndefined: Self = StObject.set(x, "_abatementBoolean", js.undefined)
    
    @scala.inline
    def set_abatementDateTime(value: Element): Self = StObject.set(x, "_abatementDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_abatementDateTimeUndefined: Self = StObject.set(x, "_abatementDateTime", js.undefined)
    
    @scala.inline
    def set_abatementString(value: Element): Self = StObject.set(x, "_abatementString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_abatementStringUndefined: Self = StObject.set(x, "_abatementString", js.undefined)
    
    @scala.inline
    def set_assertedDate(value: Element): Self = StObject.set(x, "_assertedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_assertedDateUndefined: Self = StObject.set(x, "_assertedDate", js.undefined)
    
    @scala.inline
    def set_clinicalStatus(value: Element): Self = StObject.set(x, "_clinicalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_clinicalStatusUndefined: Self = StObject.set(x, "_clinicalStatus", js.undefined)
    
    @scala.inline
    def set_onsetDateTime(value: Element): Self = StObject.set(x, "_onsetDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onsetDateTimeUndefined: Self = StObject.set(x, "_onsetDateTime", js.undefined)
    
    @scala.inline
    def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
    
    @scala.inline
    def set_verificationStatus(value: Element): Self = StObject.set(x, "_verificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_verificationStatusUndefined: Self = StObject.set(x, "_verificationStatus", js.undefined)
  }
}
