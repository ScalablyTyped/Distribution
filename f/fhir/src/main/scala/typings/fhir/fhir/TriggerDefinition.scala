package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an expected trigger for a module
  */
@js.native
trait TriggerDefinition extends Element {
  
  /**
    * Contains extended information for property 'eventName'.
    */
  var _eventName: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'eventTimingDate'.
    */
  var _eventTimingDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'eventTimingDateTime'.
    */
  var _eventTimingDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Triggering data of the event
    */
  var eventData: js.UndefOr[DataRequirement] = js.native
  
  /**
    * Triggering event name
    */
  var eventName: js.UndefOr[String] = js.native
  
  /**
    * Timing of the event
    */
  var eventTimingDate: js.UndefOr[date] = js.native
  
  /**
    * Timing of the event
    */
  var eventTimingDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Timing of the event
    */
  var eventTimingReference: js.UndefOr[Reference] = js.native
  
  /**
    * Timing of the event
    */
  var eventTimingTiming: js.UndefOr[Timing] = js.native
  
  /**
    * named-event | periodic | data-added | data-modified | data-removed | data-accessed | data-access-ended
    */
  var `type`: code = js.native
}
object TriggerDefinition {
  
  @scala.inline
  def apply(`type`: code): TriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerDefinition]
  }
  
  @scala.inline
  implicit class TriggerDefinitionMutableBuilder[Self <: TriggerDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventData(value: DataRequirement): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDataUndefined: Self = StObject.set(x, "eventData", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    @scala.inline
    def setEventTimingDate(value: date): Self = StObject.set(x, "eventTimingDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimingDateTime(value: dateTime): Self = StObject.set(x, "eventTimingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimingDateTimeUndefined: Self = StObject.set(x, "eventTimingDateTime", js.undefined)
    
    @scala.inline
    def setEventTimingDateUndefined: Self = StObject.set(x, "eventTimingDate", js.undefined)
    
    @scala.inline
    def setEventTimingReference(value: Reference): Self = StObject.set(x, "eventTimingReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimingReferenceUndefined: Self = StObject.set(x, "eventTimingReference", js.undefined)
    
    @scala.inline
    def setEventTimingTiming(value: Timing): Self = StObject.set(x, "eventTimingTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimingTimingUndefined: Self = StObject.set(x, "eventTimingTiming", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventName(value: Element): Self = StObject.set(x, "_eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventNameUndefined: Self = StObject.set(x, "_eventName", js.undefined)
    
    @scala.inline
    def set_eventTimingDate(value: Element): Self = StObject.set(x, "_eventTimingDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventTimingDateTime(value: Element): Self = StObject.set(x, "_eventTimingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventTimingDateTimeUndefined: Self = StObject.set(x, "_eventTimingDateTime", js.undefined)
    
    @scala.inline
    def set_eventTimingDateUndefined: Self = StObject.set(x, "_eventTimingDate", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
