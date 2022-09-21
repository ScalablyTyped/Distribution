package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Request for additional supporting or authorizing information, such as: documents, images or resources.
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date when the enclosed suite of services were performed or completed.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the status of the adjudication or processing.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Processing errors.
    */
  var error: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The form to be used for printing the content.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The Response business identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The organization who produced this adjudicated response.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Transaction status: error, complete, held.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Suite of processing notes or additional requirements if the processing has been held.
    */
  var processNote: js.UndefOr[js.Array[ProcessResponseProcessNote]] = js.undefined
  
  /**
    * Original request resource reference.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * The organization which is responsible for the services rendered to the patient.
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The practitioner who is responsible for the services rendered to the patient.
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ProcessResponse: typings.fhir.fhirStrings.ProcessResponse
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[active | cancelled | draft | `entered-in-error`] = js.undefined
}
object ProcessResponse {
  
  inline def apply(): ProcessResponse = {
    val __obj = js.Dynamic.literal(resourceType = "ProcessResponse")
    __obj.asInstanceOf[ProcessResponse]
  }
  
  extension [Self <: ProcessResponse](x: Self) {
    
    inline def setCommunicationRequest(value: js.Array[Reference]): Self = StObject.set(x, "communicationRequest", value.asInstanceOf[js.Any])
    
    inline def setCommunicationRequestUndefined: Self = StObject.set(x, "communicationRequest", js.undefined)
    
    inline def setCommunicationRequestVarargs(value: Reference*): Self = StObject.set(x, "communicationRequest", js.Array(value*))
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setError(value: js.Array[CodeableConcept]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: CodeableConcept*): Self = StObject.set(x, "error", js.Array(value*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setProcessNote(value: js.Array[ProcessResponseProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: ProcessResponseProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    inline def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    inline def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ProcessResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
