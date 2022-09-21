package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.high
import typings.fhir.fhirStrings.low
import typings.fhir.fhirStrings.moderate
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedIssue
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _detail: js.UndefOr[Element] = js.undefined
  
  var _identifiedDateTime: js.UndefOr[Element] = js.undefined
  
  var _reference: js.UndefOr[Element] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the general type of issue identified.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Should focus on information not covered elsewhere as discrete data - no need to duplicate the narrative.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * Supporting evidence or manifestations that provide the basis for identifying the detected issue such as a GuidanceResponse or MeasureReport.
    */
  var evidence: js.UndefOr[js.Array[DetectedIssueEvidence]] = js.undefined
  
  /**
    * The date or period when the detected issue was initially identified.
    */
  var identifiedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date or period when the detected issue was initially identified.
    */
  var identifiedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Business identifier associated with the detected issue record.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * There's an implicit constraint on the number of implicated resources based on DetectedIssue.type; e.g. For drug-drug, there would be more than one.  For timing, there would typically only be one.
    */
  var implicated: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
    */
  var mitigation: js.UndefOr[js.Array[DetectedIssueMitigation]] = js.undefined
  
  /**
    * Indicates the patient whose record the detected issue is associated with.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The literature, knowledge-base or similar reference that describes the propensity for the detected issue identified.
    */
  var reference: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DetectedIssue: typings.fhir.fhirStrings.DetectedIssue
  
  /**
    * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
    */
  var severity: js.UndefOr[high | moderate | low] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains the codes cancelled and entered-in-error that mark the issue as not currently valid.
    */
  var status: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
}
object DetectedIssue {
  
  inline def apply(
    status: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
  ): DetectedIssue = {
    val __obj = js.Dynamic.literal(resourceType = "DetectedIssue", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedIssue]
  }
  
  extension [Self <: DetectedIssue](x: Self) {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setEvidence(value: js.Array[DetectedIssueEvidence]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: DetectedIssueEvidence*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setIdentifiedDateTime(value: String): Self = StObject.set(x, "identifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setIdentifiedDateTimeUndefined: Self = StObject.set(x, "identifiedDateTime", js.undefined)
    
    inline def setIdentifiedPeriod(value: Period): Self = StObject.set(x, "identifiedPeriod", value.asInstanceOf[js.Any])
    
    inline def setIdentifiedPeriodUndefined: Self = StObject.set(x, "identifiedPeriod", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setImplicated(value: js.Array[Reference]): Self = StObject.set(x, "implicated", value.asInstanceOf[js.Any])
    
    inline def setImplicatedUndefined: Self = StObject.set(x, "implicated", js.undefined)
    
    inline def setImplicatedVarargs(value: Reference*): Self = StObject.set(x, "implicated", js.Array(value*))
    
    inline def setMitigation(value: js.Array[DetectedIssueMitigation]): Self = StObject.set(x, "mitigation", value.asInstanceOf[js.Any])
    
    inline def setMitigationUndefined: Self = StObject.set(x, "mitigation", js.undefined)
    
    inline def setMitigationVarargs(value: DetectedIssueMitigation*): Self = StObject.set(x, "mitigation", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DetectedIssue): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: high | moderate | low): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(
      value: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_detail(value: Element): Self = StObject.set(x, "_detail", value.asInstanceOf[js.Any])
    
    inline def set_detailUndefined: Self = StObject.set(x, "_detail", js.undefined)
    
    inline def set_identifiedDateTime(value: Element): Self = StObject.set(x, "_identifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_identifiedDateTimeUndefined: Self = StObject.set(x, "_identifiedDateTime", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
