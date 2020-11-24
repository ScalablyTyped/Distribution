package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait DiagnosticReport extends DomainResource {
  
  /**
    * Contains extended information for property 'conclusion'.
    */
  var _conclusion: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * What was requested
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Service category
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Name/Code for this diagnostic report
    */
  var code: CodeableConcept = js.native
  
  /**
    * Codes for the conclusion
    */
  var codedDiagnosis: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Clinical Interpretation of test results
    */
  var conclusion: js.UndefOr[String] = js.native
  
  /**
    * Health care event when test ordered
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Clinically relevant time/time-period for report
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Clinically relevant time/time-period for report
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Business identifier for report
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Key images associated with this report
    */
  var image: js.UndefOr[js.Array[DiagnosticReportImage]] = js.native
  
  /**
    * Reference to full details of imaging associated with the diagnostic report
    */
  var imagingStudy: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * DateTime this version was released
    */
  var issued: js.UndefOr[instant] = js.native
  
  /**
    * Participants in producing the report
    */
  var performer: js.UndefOr[js.Array[DiagnosticReportPerformer]] = js.native
  
  /**
    * Entire report as issued
    */
  var presentedForm: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**
    * Observations - simple, or complex nested groups
    */
  var result: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Specimens this report is based on
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * registered | partial | preliminary | final +
    */
  var status: code = js.native
  
  /**
    * The subject of the report - usually, but not always, the patient
    */
  var subject: js.UndefOr[Reference] = js.native
}
object DiagnosticReport {
  
  @scala.inline
  def apply(code: CodeableConcept, status: code): DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReport]
  }
  
  @scala.inline
  implicit class DiagnosticReportOps[Self <: DiagnosticReport] (val x: Self) extends AnyVal {
    
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conclusion(value: Element): Self = this.set("_conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_conclusion: Self = this.set("_conclusion", js.undefined)
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = this.set("_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_effectiveDateTime: Self = this.set("_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_issued(value: Element): Self = this.set("_issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_issued: Self = this.set("_issued", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCodedDiagnosisVarargs(value: CodeableConcept*): Self = this.set("codedDiagnosis", js.Array(value :_*))
    
    @scala.inline
    def setCodedDiagnosis(value: js.Array[CodeableConcept]): Self = this.set("codedDiagnosis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodedDiagnosis: Self = this.set("codedDiagnosis", js.undefined)
    
    @scala.inline
    def setConclusion(value: String): Self = this.set("conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConclusion: Self = this.set("conclusion", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = this.set("effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDateTime: Self = this.set("effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: DiagnosticReportImage*): Self = this.set("image", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: js.Array[DiagnosticReportImage]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImagingStudyVarargs(value: Reference*): Self = this.set("imagingStudy", js.Array(value :_*))
    
    @scala.inline
    def setImagingStudy(value: js.Array[Reference]): Self = this.set("imagingStudy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagingStudy: Self = this.set("imagingStudy", js.undefined)
    
    @scala.inline
    def setIssued(value: instant): Self = this.set("issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssued: Self = this.set("issued", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: DiagnosticReportPerformer*): Self = this.set("performer", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[DiagnosticReportPerformer]): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setPresentedFormVarargs(value: Attachment*): Self = this.set("presentedForm", js.Array(value :_*))
    
    @scala.inline
    def setPresentedForm(value: js.Array[Attachment]): Self = this.set("presentedForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentedForm: Self = this.set("presentedForm", js.undefined)
    
    @scala.inline
    def setResultVarargs(value: Reference*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Reference]): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setSpecimenVarargs(value: Reference*): Self = this.set("specimen", js.Array(value :_*))
    
    @scala.inline
    def setSpecimen(value: js.Array[Reference]): Self = this.set("specimen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecimen: Self = this.set("specimen", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
