package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ProcessResponse resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ProcessResponse
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Request for additional information
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Error code
    */
  var error: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Authoring Organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Processing outcome
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Processing comments or additional requirements
    */
  var processNote: js.UndefOr[js.Array[ProcessResponseProcessNote]] = js.undefined
  
  /**
    * Request reference
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Responsible Practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}
object ProcessResponse {
  
  inline def apply(): ProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessResponse]
  }
  
  extension [Self <: ProcessResponse](x: Self) {
    
    inline def setCommunicationRequest(value: js.Array[Reference]): Self = StObject.set(x, "communicationRequest", value.asInstanceOf[js.Any])
    
    inline def setCommunicationRequestUndefined: Self = StObject.set(x, "communicationRequest", js.undefined)
    
    inline def setCommunicationRequestVarargs(value: Reference*): Self = StObject.set(x, "communicationRequest", js.Array(value :_*))
    
    inline def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setError(value: js.Array[CodeableConcept]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setErrorVarargs(value: CodeableConcept*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setProcessNote(value: js.Array[ProcessResponseProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: ProcessResponseProcessNote*): Self = StObject.set(x, "processNote", js.Array(value :_*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    inline def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    inline def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
