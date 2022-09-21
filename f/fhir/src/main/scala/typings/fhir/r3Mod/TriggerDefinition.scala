package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`data-access-ended`
import typings.fhir.fhirStrings.`data-accessed`
import typings.fhir.fhirStrings.`data-added`
import typings.fhir.fhirStrings.`data-modified`
import typings.fhir.fhirStrings.`data-removed`
import typings.fhir.fhirStrings.`named-event`
import typings.fhir.fhirStrings.periodic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerDefinition
  extends StObject
     with Element {
  
  var _eventName: js.UndefOr[Element] = js.undefined
  
  var _eventTimingDate: js.UndefOr[Element] = js.undefined
  
  var _eventTimingDateTime: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The triggering data of the event (if this is a data trigger).
    */
  var eventData: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * The name of the event (if this is a named-event trigger).
    */
  var eventName: js.UndefOr[String] = js.undefined
  
  /**
    * The timing of the event (if this is a period trigger).
    */
  var eventTimingDate: js.UndefOr[String] = js.undefined
  
  /**
    * The timing of the event (if this is a period trigger).
    */
  var eventTimingDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The timing of the event (if this is a period trigger).
    */
  var eventTimingReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The timing of the event (if this is a period trigger).
    */
  var eventTimingTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The type of triggering event.
    */
  var `type`: `named-event` | periodic | `data-added` | `data-modified` | `data-removed` | `data-accessed` | `data-access-ended`
}
object TriggerDefinition {
  
  inline def apply(
    `type`: `named-event` | periodic | `data-added` | `data-modified` | `data-removed` | `data-accessed` | `data-access-ended`
  ): TriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerDefinition]
  }
  
  extension [Self <: TriggerDefinition](x: Self) {
    
    inline def setEventData(value: DataRequirement): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setEventTimingDate(value: String): Self = StObject.set(x, "eventTimingDate", value.asInstanceOf[js.Any])
    
    inline def setEventTimingDateTime(value: String): Self = StObject.set(x, "eventTimingDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimingDateTimeUndefined: Self = StObject.set(x, "eventTimingDateTime", js.undefined)
    
    inline def setEventTimingDateUndefined: Self = StObject.set(x, "eventTimingDate", js.undefined)
    
    inline def setEventTimingReference(value: Reference): Self = StObject.set(x, "eventTimingReference", value.asInstanceOf[js.Any])
    
    inline def setEventTimingReferenceUndefined: Self = StObject.set(x, "eventTimingReference", js.undefined)
    
    inline def setEventTimingTiming(value: Timing): Self = StObject.set(x, "eventTimingTiming", value.asInstanceOf[js.Any])
    
    inline def setEventTimingTimingUndefined: Self = StObject.set(x, "eventTimingTiming", js.undefined)
    
    inline def setType(
      value: `named-event` | periodic | `data-added` | `data-modified` | `data-removed` | `data-accessed` | `data-access-ended`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_eventName(value: Element): Self = StObject.set(x, "_eventName", value.asInstanceOf[js.Any])
    
    inline def set_eventNameUndefined: Self = StObject.set(x, "_eventName", js.undefined)
    
    inline def set_eventTimingDate(value: Element): Self = StObject.set(x, "_eventTimingDate", value.asInstanceOf[js.Any])
    
    inline def set_eventTimingDateTime(value: Element): Self = StObject.set(x, "_eventTimingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_eventTimingDateTimeUndefined: Self = StObject.set(x, "_eventTimingDateTime", js.undefined)
    
    inline def set_eventTimingDateUndefined: Self = StObject.set(x, "_eventTimingDate", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
