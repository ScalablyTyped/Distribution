package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.appended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.registered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticReport
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _conclusion: js.UndefOr[Element] = js.undefined
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A code or name that describes this diagnostic report.
    */
  var code: CodeableConcept
  
  /**
    * Codes for the conclusion.
    */
  var codedDiagnosis: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Need to be able to provide a conclusion that is not lost among the basic result data.
    */
  var conclusion: js.UndefOr[String] = js.undefined
  
  /**
    * Need to know where in the patient history to file/present this report.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Need to know where in the patient history to file/present this report.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The link to the health care event (encounter) when the order was made.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Need to know what identifier to use when making queries about this report from the source laboratory, and for linking to the report outside FHIR context.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Many diagnostic services include images in the report as part of their service.
    */
  var image: js.UndefOr[js.Array[DiagnosticReportImage]] = js.undefined
  
  /**
    * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
    */
  var imagingStudy: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Clinicians need to be able to check the date that the report was released.
    */
  var issued: String
  
  /**
    * Need to know whom to contact if there are queries about the results. Also may need to track the source of reports for secondary data analysis.
    */
  var performer: Reference
  
  /**
    * Gives Laboratory the ability to provide its own fully formatted report for clinical fidelity.
    */
  var presentedForm: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * Need to be able to track completion of requests based on reports issued and also to report what diagnostic tests were requested (not always the same as what is delivered).
    */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DiagnosticReport: typings.fhir.fhirStrings.DiagnosticReport
  
  /**
    * Need to support individual results, or report groups of results, where the result grouping is arbitrary, but meaningful. This structure is recursive - observations can contain observations.
    */
  var result: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Need to be able to report information about the collected specimens on which the report is based.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Diagnostic services routinely issue provisional/incomplete reports, and sometimes withdraw previously released reports.
    */
  var status: registered | partial | `final` | corrected | appended | cancelled | `entered-in-error`
  
  /**
    * SHALL know the subject context.
    */
  var subject: Reference
}
object DiagnosticReport {
  
  inline def apply(
    code: CodeableConcept,
    issued: String,
    performer: Reference,
    status: registered | partial | `final` | corrected | appended | cancelled | `entered-in-error`,
    subject: Reference
  ): DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], performer = performer.asInstanceOf[js.Any], resourceType = "DiagnosticReport", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReport]
  }
  
  extension [Self <: DiagnosticReport](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodedDiagnosis(value: js.Array[CodeableConcept]): Self = StObject.set(x, "codedDiagnosis", value.asInstanceOf[js.Any])
    
    inline def setCodedDiagnosisUndefined: Self = StObject.set(x, "codedDiagnosis", js.undefined)
    
    inline def setCodedDiagnosisVarargs(value: CodeableConcept*): Self = StObject.set(x, "codedDiagnosis", js.Array(value*))
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setImage(value: js.Array[DiagnosticReportImage]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: DiagnosticReportImage*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setImagingStudy(value: js.Array[Reference]): Self = StObject.set(x, "imagingStudy", value.asInstanceOf[js.Any])
    
    inline def setImagingStudyUndefined: Self = StObject.set(x, "imagingStudy", js.undefined)
    
    inline def setImagingStudyVarargs(value: Reference*): Self = StObject.set(x, "imagingStudy", js.Array(value*))
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPresentedForm(value: js.Array[Attachment]): Self = StObject.set(x, "presentedForm", value.asInstanceOf[js.Any])
    
    inline def setPresentedFormUndefined: Self = StObject.set(x, "presentedForm", js.undefined)
    
    inline def setPresentedFormVarargs(value: Attachment*): Self = StObject.set(x, "presentedForm", js.Array(value*))
    
    inline def setRequest(value: js.Array[Reference]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: Reference*): Self = StObject.set(x, "request", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DiagnosticReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[Reference]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResultVarargs(value: Reference*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setStatus(value: registered | partial | `final` | corrected | appended | cancelled | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
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
