package typings.fhir.r2Mod

import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.failed
import typings.fhir.fhirStrings.requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplyRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When the request was made.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for this supply request.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
    */
  var kind: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The item that is requested to be supplied.
    */
  var orderedItem: js.UndefOr[Reference] = js.undefined
  
  /**
    * A link to a resource representing the person whom the ordered item is for.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Why the supply item was requested.
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Why the supply item was requested.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SupplyRequest: typings.fhir.fhirStrings.SupplyRequest
  
  /**
    * The Practitioner , Organization or Patient who initiated this order for the supply.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * Status of the supply request.
    */
  var status: js.UndefOr[requested | completed | failed | cancelled] = js.undefined
  
  /**
    * Who is intended to fulfill the request.
    */
  var supplier: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * When the request should be fulfilled.
    */
  var when: js.UndefOr[SupplyRequestWhen] = js.undefined
}
object SupplyRequest {
  
  inline def apply(): SupplyRequest = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyRequest")
    __obj.asInstanceOf[SupplyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupplyRequest] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setKind(value: CodeableConcept): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrderedItem(value: Reference): Self = StObject.set(x, "orderedItem", value.asInstanceOf[js.Any])
    
    inline def setOrderedItemUndefined: Self = StObject.set(x, "orderedItem", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SupplyRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: requested | completed | failed | cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupplier(value: js.Array[Reference]): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setSupplierVarargs(value: Reference*): Self = StObject.set(x, "supplier", js.Array(value*))
    
    inline def setWhen(value: SupplyRequestWhen): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
