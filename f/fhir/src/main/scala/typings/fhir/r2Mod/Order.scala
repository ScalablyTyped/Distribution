package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * When the order was made.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * What action is being ordered.
    */
  var detail: js.Array[Reference]
  
  /**
    * Identifiers assigned to this order by the orderer or by the receiver.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Text - why the order was made.
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Text - why the order was made.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Order: typings.fhir.fhirStrings.Order
  
  /**
    * Who initiated the order.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * Patient this order is about.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who is intended to fulfill the order.
    */
  var target: js.UndefOr[Reference] = js.undefined
  
  /**
    * When order should be fulfilled.
    */
  var when: js.UndefOr[OrderWhen] = js.undefined
}
object Order {
  
  inline def apply(detail: js.Array[Reference]): Order = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], resourceType = "Order")
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Order): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setWhen(value: OrderWhen): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
