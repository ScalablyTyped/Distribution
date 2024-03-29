package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColors extends StObject {
  
  /**
    * A global palette of calendar colors, mapping from the color ID to its definition. A calendarListEntry resource refers to one of these color IDs in its colorId field. Read-only.
    */
  var calendar: js.UndefOr[StringDictionary[SchemaColorDefinition] | Null] = js.undefined
  
  /**
    * A global palette of event colors, mapping from the color ID to its definition. An event resource may refer to one of these color IDs in its colorId field. Read-only.
    */
  var event: js.UndefOr[StringDictionary[SchemaColorDefinition] | Null] = js.undefined
  
  /**
    * Type of the resource ("calendar#colors").
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last modification time of the color palette (as a RFC3339 timestamp). Read-only.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
}
object SchemaColors {
  
  inline def apply(): SchemaColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColors]
  }
  
  extension [Self <: SchemaColors](x: Self) {
    
    inline def setCalendar(value: StringDictionary[SchemaColorDefinition]): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarNull: Self = StObject.set(x, "calendar", null)
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setEvent(value: StringDictionary[SchemaColorDefinition]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
