package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.appended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.partial
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.unknown
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
    * Note: Usually there is one test request for each result, however in some circumstances multiple test requests may be represented using a single test result resource. Note that there are also cases where one request leads to multiple reports.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The level of granularity is defined by the category concepts in the value set. More fine-grained filtering can be performed using the metadata and/or terminology hierarchy in DiagnosticReport.code.
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
    * Concise and clinically contextualized impression / summary of the diagnostic report.
    */
  var conclusion: js.UndefOr[String] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some events may be initiated prior to or after the official completion of an encounter or episode but still be tied to the context of the encounter or episode (e.g. pre-admission lab tests).
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * If the diagnostic procedure was performed on the patient, this is the time it was performed. If there are specimens, the diagnostically relevant time can be derived from the specimen collection times, but the specimen information is not always available, and the exact relationship between the specimens and the diagnostically relevant time is not always automatic.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * If the diagnostic procedure was performed on the patient, this is the time it was performed. If there are specimens, the diagnostically relevant time can be derived from the specimen collection times, but the specimen information is not always available, and the exact relationship between the specimens and the diagnostically relevant time is not always automatic.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Usually assigned by the Information System of the diagnostic service provider (filler id).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
    */
  var image: js.UndefOr[js.Array[DiagnosticReportImage]] = js.undefined
  
  /**
    * ImagingStudy and ImageManifest and the image element are somewhat overlapping - typically, the list of image references in the image element will also be found in one of the imaging study resources. However each caters to different types of displays for different types of purposes. Neither, either, or both may be provided.
    */
  var imagingStudy: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * May be different from the update time of the resource itself, because that is the status of the record (potentially a secondary copy), not the actual release time of the report.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates who or what participated in producing the report.
    */
  var performer: js.UndefOr[js.Array[DiagnosticReportPerformer]] = js.undefined
  
  /**
    * "application/pdf" is recommended as the most reliable and interoperable in this context.
    */
  var presentedForm: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DiagnosticReport: typings.fhir.fhirStrings.DiagnosticReport
  
  /**
    * Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").
    */
  var result: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If the specimen is sufficiently specified with a code in the test result name, then this additional data may be redundant. If there are multiple specimens, these may be represented per observation or group.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This is labeled as "Is Modifier" because applications need to take appropriate action if a report is withdrawn.
    */
  var status: registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | unknown
  
  /**
    * The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object DiagnosticReport {
  
  inline def apply(
    code: CodeableConcept,
    status: registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | unknown
  ): DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "DiagnosticReport", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticReport] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodedDiagnosis(value: js.Array[CodeableConcept]): Self = StObject.set(x, "codedDiagnosis", value.asInstanceOf[js.Any])
    
    inline def setCodedDiagnosisUndefined: Self = StObject.set(x, "codedDiagnosis", js.undefined)
    
    inline def setCodedDiagnosisVarargs(value: CodeableConcept*): Self = StObject.set(x, "codedDiagnosis", js.Array(value*))
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
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
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setPerformer(value: js.Array[DiagnosticReportPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: DiagnosticReportPerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPresentedForm(value: js.Array[Attachment]): Self = StObject.set(x, "presentedForm", value.asInstanceOf[js.Any])
    
    inline def setPresentedFormUndefined: Self = StObject.set(x, "presentedForm", js.undefined)
    
    inline def setPresentedFormVarargs(value: Attachment*): Self = StObject.set(x, "presentedForm", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DiagnosticReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[Reference]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResultVarargs(value: Reference*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setStatus(
      value: registered | partial | preliminary | `final` | amended | corrected | appended | cancelled | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
