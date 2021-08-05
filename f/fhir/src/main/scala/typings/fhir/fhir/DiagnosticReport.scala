package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DiagnosticReport
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'conclusion'.
    */
  var _conclusion: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * What was requested
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Service category
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Name/Code for this diagnostic report
    */
  var code: CodeableConcept
  
  /**
    * Codes for the conclusion
    */
  var codedDiagnosis: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Clinical Interpretation of test results
    */
  var conclusion: js.UndefOr[String] = js.undefined
  
  /**
    * Health care event when test ordered
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Clinically relevant time/time-period for report
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Clinically relevant time/time-period for report
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Business identifier for report
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Key images associated with this report
    */
  var image: js.UndefOr[js.Array[DiagnosticReportImage]] = js.undefined
  
  /**
    * Reference to full details of imaging associated with the diagnostic report
    */
  var imagingStudy: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * DateTime this version was released
    */
  var issued: js.UndefOr[instant] = js.undefined
  
  /**
    * Participants in producing the report
    */
  var performer: js.UndefOr[js.Array[DiagnosticReportPerformer]] = js.undefined
  
  /**
    * Entire report as issued
    */
  var presentedForm: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * Observations - simple, or complex nested groups
    */
  var result: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Specimens this report is based on
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * registered | partial | preliminary | final +
    */
  var status: code
  
  /**
    * The subject of the report - usually, but not always, the patient
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object DiagnosticReport {
  
  inline def apply(code: CodeableConcept, status: code): DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReport]
  }
  
  extension [Self <: DiagnosticReport](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodedDiagnosis(value: js.Array[CodeableConcept]): Self = StObject.set(x, "codedDiagnosis", value.asInstanceOf[js.Any])
    
    inline def setCodedDiagnosisUndefined: Self = StObject.set(x, "codedDiagnosis", js.undefined)
    
    inline def setCodedDiagnosisVarargs(value: CodeableConcept*): Self = StObject.set(x, "codedDiagnosis", js.Array(value :_*))
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEffectiveDateTime(value: dateTime): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setImage(value: js.Array[DiagnosticReportImage]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: DiagnosticReportImage*): Self = StObject.set(x, "image", js.Array(value :_*))
    
    inline def setImagingStudy(value: js.Array[Reference]): Self = StObject.set(x, "imagingStudy", value.asInstanceOf[js.Any])
    
    inline def setImagingStudyUndefined: Self = StObject.set(x, "imagingStudy", js.undefined)
    
    inline def setImagingStudyVarargs(value: Reference*): Self = StObject.set(x, "imagingStudy", js.Array(value :_*))
    
    inline def setIssued(value: instant): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setPerformer(value: js.Array[DiagnosticReportPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: DiagnosticReportPerformer*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    inline def setPresentedForm(value: js.Array[Attachment]): Self = StObject.set(x, "presentedForm", value.asInstanceOf[js.Any])
    
    inline def setPresentedFormUndefined: Self = StObject.set(x, "presentedForm", js.undefined)
    
    inline def setPresentedFormVarargs(value: Attachment*): Self = StObject.set(x, "presentedForm", js.Array(value :_*))
    
    inline def setResult(value: js.Array[Reference]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResultVarargs(value: Reference*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_conclusion(value: Element): Self = StObject.set(x, "_conclusion", value.asInstanceOf[js.Any])
    
    inline def set_conclusionUndefined: Self = StObject.set(x, "_conclusion", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
