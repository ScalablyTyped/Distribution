package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PaymentNotice request
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait PaymentNotice
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'statusDate'.
    */
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Whether payment has been sent or cleared
    */
  var paymentStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Request reference
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /**
    * Response reference
    */
  var response: js.UndefOr[Reference] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Payment or clearing date
    */
  var statusDate: js.UndefOr[date] = js.undefined
  
  /**
    * Insurer or Regulatory body
    */
  var target: js.UndefOr[Reference] = js.undefined
}
object PaymentNotice {
  
  inline def apply(): PaymentNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentNotice]
  }
  
  extension [Self <: PaymentNotice](x: Self) {
    
    inline def setCreated(value: dateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPaymentStatus(value: CodeableConcept): Self = StObject.set(x, "paymentStatus", value.asInstanceOf[js.Any])
    
    inline def setPaymentStatusUndefined: Self = StObject.set(x, "paymentStatus", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: Reference): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: date): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
