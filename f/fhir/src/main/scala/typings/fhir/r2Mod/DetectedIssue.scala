package typings.fhir.r2Mod

import typings.fhir.fhirStrings.high
import typings.fhir.fhirStrings.low
import typings.fhir.fhirStrings.moderate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedIssue
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _detail: js.UndefOr[Element] = js.undefined
  
  var _reference: js.UndefOr[Element] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  /**
    * Individual or device responsible for the issue being raised.  For example, a decision support application or a pharmacist conducting a medication review.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the general type of issue identified.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * No-one can be responsible for mitigation prior to the issue being identified.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A textual explanation of the detected issue.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * Allows linking instances of the same detected issue found on different servers.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Indicates the resource representing the current activity or proposed activity that is potentially problematic.
    */
  var implicated: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the detected issue from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
    */
  var mitigation: js.UndefOr[js.Array[DetectedIssueMitigation]] = js.undefined
  
  /**
    * While the subject could be inferred by tracing the subject of the implicated resources, it's useful to have a direct link for query purposes.
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
}
object DetectedIssue {
  
  inline def apply(): DetectedIssue = {
    val __obj = js.Dynamic.literal(resourceType = "DetectedIssue")
    __obj.asInstanceOf[DetectedIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectedIssue] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
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
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_detail(value: Element): Self = StObject.set(x, "_detail", value.asInstanceOf[js.Any])
    
    inline def set_detailUndefined: Self = StObject.set(x, "_detail", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
  }
}
