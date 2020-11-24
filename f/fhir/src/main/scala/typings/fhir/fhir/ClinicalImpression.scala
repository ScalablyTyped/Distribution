package typings.fhir.fhir

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
  implicit class ClinicalImpressionOps[Self <: ClinicalImpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = this.set("_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_effectiveDateTime: Self = this.set("_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_protocolVarargs(value: Element*): Self = this.set("_protocol", js.Array(value :_*))
    
    @scala.inline
    def set_protocol(value: js.Array[Element]): Self = this.set("_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_protocol: Self = this.set("_protocol", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_summary(value: Element): Self = this.set("_summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_summary: Self = this.set("_summary", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: Reference*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: js.Array[Reference]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAssessor(value: Reference): Self = this.set("assessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssessor: Self = this.set("assessor", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = this.set("effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDateTime: Self = this.set("effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    
    @scala.inline
    def setFindingVarargs(value: ClinicalImpressionFinding*): Self = this.set("finding", js.Array(value :_*))
    
    @scala.inline
    def setFinding(value: js.Array[ClinicalImpressionFinding]): Self = this.set("finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinding: Self = this.set("finding", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setInvestigationVarargs(value: ClinicalImpressionInvestigation*): Self = this.set("investigation", js.Array(value :_*))
    
    @scala.inline
    def setInvestigation(value: js.Array[ClinicalImpressionInvestigation]): Self = this.set("investigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvestigation: Self = this.set("investigation", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setPrevious(value: Reference): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setProblemVarargs(value: Reference*): Self = this.set("problem", js.Array(value :_*))
    
    @scala.inline
    def setProblem(value: js.Array[Reference]): Self = this.set("problem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProblem: Self = this.set("problem", js.undefined)
    
    @scala.inline
    def setPrognosisCodeableConceptVarargs(value: CodeableConcept*): Self = this.set("prognosisCodeableConcept", js.Array(value :_*))
    
    @scala.inline
    def setPrognosisCodeableConcept(value: js.Array[CodeableConcept]): Self = this.set("prognosisCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosisCodeableConcept: Self = this.set("prognosisCodeableConcept", js.undefined)
    
    @scala.inline
    def setPrognosisReferenceVarargs(value: Reference*): Self = this.set("prognosisReference", js.Array(value :_*))
    
    @scala.inline
    def setPrognosisReference(value: js.Array[Reference]): Self = this.set("prognosisReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosisReference: Self = this.set("prognosisReference", js.undefined)
    
    @scala.inline
    def setProtocolVarargs(value: uri*): Self = this.set("protocol", js.Array(value :_*))
    
    @scala.inline
    def setProtocol(value: js.Array[uri]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
