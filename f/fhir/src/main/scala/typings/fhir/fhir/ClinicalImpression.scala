package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A clinical assessment performed when planning treatments and management strategies for a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ClinicalImpression extends DomainResource {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'protocol'.
    */
  var _protocol: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'summary'.
    */
  var _summary: js.UndefOr[Element] = js.native
  
  /**
    * Action taken as part of assessment procedure
    */
  var action: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * The clinician performing the assessment
    */
  var assessor: js.UndefOr[Reference] = js.native
  
  /**
    * Kind of assessment performed
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Encounter or Episode created from
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * When the assessment was documented
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Why/how the assessment was performed
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Time of assessment
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Time of assessment
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Possible or likely findings and diagnoses
    */
  var finding: js.UndefOr[js.Array[ClinicalImpressionFinding]] = js.native
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * One or more sets of investigations (signs, symptions, etc.)
    */
  var investigation: js.UndefOr[js.Array[ClinicalImpressionInvestigation]] = js.native
  
  /**
    * Comments made about the ClinicalImpression
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Reference to last assessment
    */
  var previous: js.UndefOr[Reference] = js.native
  
  /**
    * Relevant impressions of patient state
    */
  var problem: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Estimate of likely outcome
    */
  var prognosisCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * RiskAssessment expressing likely outcome
    */
  var prognosisReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Clinical Protocol followed
    */
  var protocol: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * draft | completed | entered-in-error
    */
  var status: code = js.native
  
  /**
    * Patient or group assessed
    */
  var subject: Reference = js.native
  
  /**
    * Summary of the assessment
    */
  var summary: js.UndefOr[String] = js.native
}
object ClinicalImpression {
  
  @scala.inline
  def apply(status: code, subject: Reference): ClinicalImpression = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpression]
  }
  
  @scala.inline
  implicit class ClinicalImpressionMutableBuilder[Self <: ClinicalImpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[Reference]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: Reference*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setAssessor(value: Reference): Self = StObject.set(x, "assessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessorUndefined: Self = StObject.set(x, "assessor", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    @scala.inline
    def setFinding(value: js.Array[ClinicalImpressionFinding]): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    @scala.inline
    def setFindingVarargs(value: ClinicalImpressionFinding*): Self = StObject.set(x, "finding", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInvestigation(value: js.Array[ClinicalImpressionInvestigation]): Self = StObject.set(x, "investigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvestigationUndefined: Self = StObject.set(x, "investigation", js.undefined)
    
    @scala.inline
    def setInvestigationVarargs(value: ClinicalImpressionInvestigation*): Self = StObject.set(x, "investigation", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPrevious(value: Reference): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    @scala.inline
    def setProblem(value: js.Array[Reference]): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemUndefined: Self = StObject.set(x, "problem", js.undefined)
    
    @scala.inline
    def setProblemVarargs(value: Reference*): Self = StObject.set(x, "problem", js.Array(value :_*))
    
    @scala.inline
    def setPrognosisCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "prognosisCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosisCodeableConceptUndefined: Self = StObject.set(x, "prognosisCodeableConcept", js.undefined)
    
    @scala.inline
    def setPrognosisCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "prognosisCodeableConcept", js.Array(value :_*))
    
    @scala.inline
    def setPrognosisReference(value: js.Array[Reference]): Self = StObject.set(x, "prognosisReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosisReferenceUndefined: Self = StObject.set(x, "prognosisReference", js.undefined)
    
    @scala.inline
    def setPrognosisReferenceVarargs(value: Reference*): Self = StObject.set(x, "prognosisReference", js.Array(value :_*))
    
    @scala.inline
    def setProtocol(value: js.Array[uri]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setProtocolVarargs(value: uri*): Self = StObject.set(x, "protocol", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_protocol(value: js.Array[Element]): Self = StObject.set(x, "_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_protocolUndefined: Self = StObject.set(x, "_protocol", js.undefined)
    
    @scala.inline
    def set_protocolVarargs(value: Element*): Self = StObject.set(x, "_protocol", js.Array(value :_*))
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_summary(value: Element): Self = StObject.set(x, "_summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_summaryUndefined: Self = StObject.set(x, "_summary", js.undefined)
  }
}
