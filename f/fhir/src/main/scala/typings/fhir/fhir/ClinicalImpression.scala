package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A clinical assessment performed when planning treatments and management strategies for a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ClinicalImpression
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'protocol'.
    */
  var _protocol: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'summary'.
    */
  var _summary: js.UndefOr[Element] = js.undefined
  
  /**
    * Action taken as part of assessment procedure
    */
  var action: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The clinician performing the assessment
    */
  var assessor: js.UndefOr[Reference] = js.undefined
  
  /**
    * Kind of assessment performed
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Encounter or Episode created from
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * When the assessment was documented
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Why/how the assessment was performed
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Time of assessment
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Time of assessment
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Possible or likely findings and diagnoses
    */
  var finding: js.UndefOr[js.Array[ClinicalImpressionFinding]] = js.undefined
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * One or more sets of investigations (signs, symptions, etc.)
    */
  var investigation: js.UndefOr[js.Array[ClinicalImpressionInvestigation]] = js.undefined
  
  /**
    * Comments made about the ClinicalImpression
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Reference to last assessment
    */
  var previous: js.UndefOr[Reference] = js.undefined
  
  /**
    * Relevant impressions of patient state
    */
  var problem: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Estimate of likely outcome
    */
  var prognosisCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * RiskAssessment expressing likely outcome
    */
  var prognosisReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Clinical Protocol followed
    */
  var protocol: js.UndefOr[js.Array[uri]] = js.undefined
  
  /**
    * draft | completed | entered-in-error
    */
  var status: code
  
  /**
    * Patient or group assessed
    */
  var subject: Reference
  
  /**
    * Summary of the assessment
    */
  var summary: js.UndefOr[String] = js.undefined
}
object ClinicalImpression {
  
  inline def apply(status: code, subject: Reference): ClinicalImpression = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpression]
  }
  
  extension [Self <: ClinicalImpression](x: Self) {
    
    inline def setAction(value: js.Array[Reference]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: Reference*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    inline def setAssessor(value: Reference): Self = StObject.set(x, "assessor", value.asInstanceOf[js.Any])
    
    inline def setAssessorUndefined: Self = StObject.set(x, "assessor", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEffectiveDateTime(value: dateTime): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setFinding(value: js.Array[ClinicalImpressionFinding]): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setFindingVarargs(value: ClinicalImpressionFinding*): Self = StObject.set(x, "finding", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setInvestigation(value: js.Array[ClinicalImpressionInvestigation]): Self = StObject.set(x, "investigation", value.asInstanceOf[js.Any])
    
    inline def setInvestigationUndefined: Self = StObject.set(x, "investigation", js.undefined)
    
    inline def setInvestigationVarargs(value: ClinicalImpressionInvestigation*): Self = StObject.set(x, "investigation", js.Array(value :_*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setPrevious(value: Reference): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setProblem(value: js.Array[Reference]): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
    
    inline def setProblemUndefined: Self = StObject.set(x, "problem", js.undefined)
    
    inline def setProblemVarargs(value: Reference*): Self = StObject.set(x, "problem", js.Array(value :_*))
    
    inline def setPrognosisCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "prognosisCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setPrognosisCodeableConceptUndefined: Self = StObject.set(x, "prognosisCodeableConcept", js.undefined)
    
    inline def setPrognosisCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "prognosisCodeableConcept", js.Array(value :_*))
    
    inline def setPrognosisReference(value: js.Array[Reference]): Self = StObject.set(x, "prognosisReference", value.asInstanceOf[js.Any])
    
    inline def setPrognosisReferenceUndefined: Self = StObject.set(x, "prognosisReference", js.undefined)
    
    inline def setPrognosisReferenceVarargs(value: Reference*): Self = StObject.set(x, "prognosisReference", js.Array(value :_*))
    
    inline def setProtocol(value: js.Array[uri]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVarargs(value: uri*): Self = StObject.set(x, "protocol", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_protocol(value: js.Array[Element]): Self = StObject.set(x, "_protocol", value.asInstanceOf[js.Any])
    
    inline def set_protocolUndefined: Self = StObject.set(x, "_protocol", js.undefined)
    
    inline def set_protocolVarargs(value: Element*): Self = StObject.set(x, "_protocol", js.Array(value :_*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_summary(value: Element): Self = StObject.set(x, "_summary", value.asInstanceOf[js.Any])
    
    inline def set_summaryUndefined: Self = StObject.set(x, "_summary", js.undefined)
  }
}
