package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class DiagnosticReportMutableBuilder[Self <: DiagnosticReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodedDiagnosis(value: js.Array[CodeableConcept]): Self = StObject.set(x, "codedDiagnosis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodedDiagnosisUndefined: Self = StObject.set(x, "codedDiagnosis", js.undefined)
    
    @scala.inline
    def setCodedDiagnosisVarargs(value: CodeableConcept*): Self = StObject.set(x, "codedDiagnosis", js.Array(value :_*))
    
    @scala.inline
    def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: js.Array[DiagnosticReportImage]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setImageVarargs(value: DiagnosticReportImage*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    @scala.inline
    def setImagingStudy(value: js.Array[Reference]): Self = StObject.set(x, "imagingStudy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagingStudyUndefined: Self = StObject.set(x, "imagingStudy", js.undefined)
    
    @scala.inline
    def setImagingStudyVarargs(value: Reference*): Self = StObject.set(x, "imagingStudy", js.Array(value :_*))
    
    @scala.inline
    def setIssued(value: instant): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    @scala.inline
    def setPerformer(value: js.Array[DiagnosticReportPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: DiagnosticReportPerformer*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    @scala.inline
    def setPresentedForm(value: js.Array[Attachment]): Self = StObject.set(x, "presentedForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentedFormUndefined: Self = StObject.set(x, "presentedForm", js.undefined)
    
    @scala.inline
    def setPresentedFormVarargs(value: Attachment*): Self = StObject.set(x, "presentedForm", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Reference]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setResultVarargs(value: Reference*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    @scala.inline
    def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def set_conclusion(value: Element): Self = StObject.set(x, "_conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_conclusionUndefined: Self = StObject.set(x, "_conclusion", js.undefined)
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
