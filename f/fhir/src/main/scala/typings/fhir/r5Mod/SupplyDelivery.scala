package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
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
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A plan, proposal or order that is fulfilled in whole or in part by this event.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identification of the facility/location where the Supply was shipped to, as part of the dispense event.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * This identifier is typically assigned by the dispenser, and may be used to reference the delivery when exchanging information about it with other systems.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * [The list of types may be constrained as appropriate for the type of event].
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * [The list of types may be constrained as appropriate for the type of event].
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * [The list of types may be constrained as appropriate for the type of event].
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Not to be used to link an event to an Encounter - use Event.context for that.
    * [The allowed reference resources may be adjusted as appropriate for the event resource].
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A link to a resource representing the person whom the delivered item is for.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the person who picked up the Supply.
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SupplyDelivery: typings.fhir.fhirStrings.SupplyDelivery
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[`in-progress` | completed | abandoned | `entered-in-error`] = js.undefined
  
  /**
    * The item that is being delivered or has been supplied.
    */
  var suppliedItem: js.UndefOr[SupplyDeliverySuppliedItem] = js.undefined
  
  /**
    * The individual responsible for dispensing the medication, supplier or device.
    */
  var supplier: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SupplyDelivery {
  
  inline def apply(): SupplyDelivery = {
    val __obj = js.Dynamic.literal(resourceType = "SupplyDelivery")
    __obj.asInstanceOf[SupplyDelivery]
  }
  
  extension [Self <: SupplyDelivery](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setReceiver(value: js.Array[Reference]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setReceiverVarargs(value: Reference*): Self = StObject.set(x, "receiver", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SupplyDelivery): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `in-progress` | completed | abandoned | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuppliedItem(value: SupplyDeliverySuppliedItem): Self = StObject.set(x, "suppliedItem", value.asInstanceOf[js.Any])
    
    inline def setSuppliedItemUndefined: Self = StObject.set(x, "suppliedItem", js.undefined)
    
    inline def setSupplier(value: Reference): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
