package typings.fhir.r2Mod

import typings.fhir.fhirStrings.aborted
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.pending
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.replaced
import typings.fhir.fhirStrings.review
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderResponse
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _orderStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * The date and time at which this order response was made (created/posted).
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Additional description about the response - e.g. a text description provided by a human user when making decisions about the order.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Links to resources that provide details of the outcome of performing the order; e.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order.
    */
  var fulfillment: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * What this response says about the status of the original order.
    */
  var orderStatus: pending | review | rejected | error | accepted | cancelled | replaced | aborted | completed
  
  /**
    * A reference to the order that this is in response to.
    */
  var request: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_OrderResponse: typings.fhir.fhirStrings.OrderResponse
  
  /**
    * The person, organization, or device credited with making the response.
    */
  var who: js.UndefOr[Reference] = js.undefined
}
object OrderResponse {
  
  inline def apply(
    orderStatus: pending | review | rejected | error | accepted | cancelled | replaced | aborted | completed,
    request: Reference
  ): OrderResponse = {
    val __obj = js.Dynamic.literal(orderStatus = orderStatus.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resourceType = "OrderResponse")
    __obj.asInstanceOf[OrderResponse]
  }
  
  extension [Self <: OrderResponse](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFulfillment(value: js.Array[Reference]): Self = StObject.set(x, "fulfillment", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentUndefined: Self = StObject.set(x, "fulfillment", js.undefined)
    
    inline def setFulfillmentVarargs(value: Reference*): Self = StObject.set(x, "fulfillment", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOrderStatus(value: pending | review | rejected | error | accepted | cancelled | replaced | aborted | completed): Self = StObject.set(x, "orderStatus", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.OrderResponse): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setWho(value: Reference): Self = StObject.set(x, "who", value.asInstanceOf[js.Any])
    
    inline def setWhoUndefined: Self = StObject.set(x, "who", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_orderStatus(value: Element): Self = StObject.set(x, "_orderStatus", value.asInstanceOf[js.Any])
    
    inline def set_orderStatusUndefined: Self = StObject.set(x, "_orderStatus", js.undefined)
  }
}
