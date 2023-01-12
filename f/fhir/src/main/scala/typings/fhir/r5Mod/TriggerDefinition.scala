package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`data-access-ended`
import typings.fhir.fhirStrings.`data-accessed`
import typings.fhir.fhirStrings.`data-added`
import typings.fhir.fhirStrings.`data-changed`
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
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _timingDate: js.UndefOr[Element] = js.undefined
  
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * This element can be only be specified for data type triggers and provides additional semantics for the trigger. The context available within the condition is based on the type of data event. For all events, the current resource will be available as context. In addition, for modification events, the previous resource will also be available. The expression may be inlined, or may be a simple absolute URI, which is a reference to a named expression within a logic library referenced by a library element or extension within the containing resource. If the expression is a FHIR Path expression, it evaluates in the context of a resource of one of the type identified in the data requirement, and may also refer to the variable %previous for delta comparisons on events of type data-changed, data-modified, and data-deleted which will always have the same type.
    */
  var condition: js.UndefOr[Expression] = js.undefined
  
  /**
    * This element shall be present for any data type trigger.
    */
  var data: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  
  /**
    * An event name can be provided for all event types, but is required for named events. If a name is provided for a type other than named events, it is considered to be a shorthand for the semantics described by the formal description of the event.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The timing of the event (if this is a periodic trigger).
    */
  var timingDate: js.UndefOr[String] = js.undefined
  
  /**
    * The timing of the event (if this is a periodic trigger).
    */
  var timingDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The timing of the event (if this is a periodic trigger).
    */
  var timingReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The timing of the event (if this is a periodic trigger).
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The type of triggering event.
    */
  var `type`: `named-event` | periodic | `data-changed` | `data-added` | `data-modified` | `data-removed` | `data-accessed` | `data-access-ended`
}
object TriggerDefinition {
  
  inline def apply(
    `type`: `named-event` | periodic | `data-changed` | `data-added` | `data-modified` | `data-removed` | `data-accessed` | `data-access-ended`
  ): TriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerDefinition] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setData(value: js.Array[DataRequirement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: DataRequirement*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimingDate(value: String): Self = StObject.set(x, "timingDate", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTime(value: String): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    inline def setTimingDateUndefined: Self = StObject.set(x, "timingDate", js.undefined)
    
    inline def setTimingReference(value: Reference): Self = StObject.set(x, "timingReference", value.asInstanceOf[js.Any])
    
    inline def setTimingReferenceUndefined: Self = StObject.set(x, "timingReference", js.undefined)
    
    inline def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    inline def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    inline def setType(
      value: `named-event` | periodic | `data-changed` | `data-added` | `data-modified` | `data-removed` | `data-accessed` | `data-access-ended`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_timingDate(value: Element): Self = StObject.set(x, "_timingDate", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
    
    inline def set_timingDateUndefined: Self = StObject.set(x, "_timingDate", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
