package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.abandoned
import typings.fhir.fhirStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupplyDelivery
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _time: js.UndefOr[Element] = js.undefined
  
  /**
    * Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifier assigned by the dispensing facility when the item(s) is dispensed.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A link to a resource representing the person whom the delivered item is for.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The amount of supply that has been dispensed. Includes unit of measure.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identifies the person who picked up the Supply.
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SupplyDelivery: typings.fhir.fhirStrings.SupplyDelivery
  
  /**
    * A code specifying the state of the dispense event.
    */
  var status: js.UndefOr[`in-progress` | completed | abandoned] = js.undefined
  
  /**
    * Identifies the medication, substance or device being dispensed. This is either a link to a resource representing the details of the item or a simple attribute carrying a code that identifies the item from a known list.
    */
  var suppliedItem: js.UndefOr[Reference] = js.undefined
  
  /**
    * The individual responsible for dispensing the medication, supplier or device.
    */
  var supplier: js.UndefOr[Reference] = js.undefined
  
  /**
    * The time the dispensed item was sent or handed to the patient (or agent).
    */
  var time: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The time the dispense event occurred.
    */
  var whenPrepared: js.UndefOr[Period] = js.undefined
}
object SupplyDelivery {
  
  inline def apply(): SupplyDelivery = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyDelivery")
    __obj.asInstanceOf[SupplyDelivery]
  }
  
  extension [Self <: SupplyDelivery](x: Self) {
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReceiver(value: js.Array[Reference]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setReceiverVarargs(value: Reference*): Self = StObject.set(x, "receiver", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SupplyDelivery): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `in-progress` | completed | abandoned): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuppliedItem(value: Reference): Self = StObject.set(x, "suppliedItem", value.asInstanceOf[js.Any])
    
    inline def setSuppliedItemUndefined: Self = StObject.set(x, "suppliedItem", js.undefined)
    
    inline def setSupplier(value: Reference): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWhenPrepared(value: Period): Self = StObject.set(x, "whenPrepared", value.asInstanceOf[js.Any])
    
    inline def setWhenPreparedUndefined: Self = StObject.set(x, "whenPrepared", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    inline def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
  }
}
