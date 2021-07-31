package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PaymentReconciliation resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait PaymentReconciliation
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
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * List of settlements
    */
  var detail: js.UndefOr[js.Array[PaymentReconciliationDetail]] = js.undefined
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.undefined
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Insurer
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Period covered
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Processing comments
    */
  var processNote: js.UndefOr[js.Array[PaymentReconciliationProcessNote]] = js.undefined
  
  /**
    * Claim reference
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Total amount of Payment
    */
  var total: js.UndefOr[Money] = js.undefined
}
object PaymentReconciliation {
  
  @scala.inline
  def apply(): PaymentReconciliation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentReconciliation]
  }
  
  @scala.inline
  implicit class PaymentReconciliationMutableBuilder[Self <: PaymentReconciliation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDetail(value: js.Array[PaymentReconciliationDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDetailVarargs(value: PaymentReconciliationDetail*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    @scala.inline
    def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setProcessNote(value: js.Array[PaymentReconciliationProcessNote]): Self = StObject.set(x, "processNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessNoteUndefined: Self = StObject.set(x, "processNote", js.undefined)
    
    @scala.inline
    def setProcessNoteVarargs(value: PaymentReconciliationProcessNote*): Self = StObject.set(x, "processNote", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOrganization(value: Reference): Self = StObject.set(x, "requestOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestOrganizationUndefined: Self = StObject.set(x, "requestOrganization", js.undefined)
    
    @scala.inline
    def setRequestProvider(value: Reference): Self = StObject.set(x, "requestProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestProviderUndefined: Self = StObject.set(x, "requestProvider", js.undefined)
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTotal(value: Money): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = StObject.set(x, "_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dispositionUndefined: Self = StObject.set(x, "_disposition", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
