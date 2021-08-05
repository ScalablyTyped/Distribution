package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Delivery of bulk Supplies
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait SupplyDelivery
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Fulfills plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Where the Supply was sent
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * External identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When event occurred
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When event occurred
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When event occurred
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Patient for whom the item is supplied
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who collected the Supply
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * in-progress | completed | abandoned | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * The item that is delivered or supplied
    */
  var suppliedItem: js.UndefOr[SupplyDeliverySuppliedItem] = js.undefined
  
  /**
    * Dispenser
    */
  var supplier: js.UndefOr[Reference] = js.undefined
  
  /**
    * Category of dispense event
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SupplyDelivery {
  
  inline def apply(): SupplyDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplyDelivery]
  }
  
  extension [Self <: SupplyDelivery](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setReceiver(value: js.Array[Reference]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setReceiverVarargs(value: Reference*): Self = StObject.set(x, "receiver", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
