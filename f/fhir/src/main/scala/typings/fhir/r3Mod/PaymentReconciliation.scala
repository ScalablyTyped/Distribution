package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentReconciliation
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _disposition: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date when the enclosed suite of services were performed or completed.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * List of individual settlement amounts and the corresponding transaction.
    */
  var detail: js.UndefOr[js.Array[PaymentReconciliationDetail]] = js.undefined
  
  /**
    * A description of the status of the adjudication.
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * The form to be used for printing the content.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The Response business identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The Insurer who produced this adjudicated response.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Transaction status: error, complete.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The period of time for which payments have been gathered into this bulk payment for settlement.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Suite of notes.
    */
  var processNote: js.UndefOr[js.Array[PaymentReconciliationProcessNote]] = js.undefined
  
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
  val resourceType_PaymentReconciliation: typings.fhir.fhirStrings.PaymentReconciliation
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[active | cancelled | draft | `entered-in-error`] = js.undefined
  
  /**
    * Total payment amount.
    */
  var total: js.UndefOr[Money] = js.undefined
}
object PaymentReconciliation {
  
  inline def apply(): PaymentReconciliation = {
    val __obj = js.Dynamic.literal(resourceType = "PaymentReconciliation")
    __obj.asInstanceOf[PaymentReconciliation]
  }
  
  extension [Self <: PaymentReconciliation](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDetail(value: js.Array[PaymentReconciliationDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: PaymentReconciliationDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProcessNote(value: js.Array[PaymentReconciliationProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    inline def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    inline def setProcessNoteVarargs(value: PaymentReconciliationProcessNote*): Self = StObject.set(x, "processNote", js.Array(value*))
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    inline def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    inline def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    inline def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.PaymentReconciliation): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotal(value: Money): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    inline def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
