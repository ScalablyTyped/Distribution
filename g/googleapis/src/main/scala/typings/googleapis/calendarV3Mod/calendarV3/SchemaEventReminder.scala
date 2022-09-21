package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventReminder extends StObject {
  
  /**
    * The method used by this reminder. Possible values are:
    * - "email" - Reminders are sent via email.
    * - "popup" - Reminders are sent via a UI popup.
    * Required when adding a reminder.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of minutes before the start of the event when the reminder should trigger. Valid values are between 0 and 40320 (4 weeks in minutes).
    * Required when adding a reminder.
    */
  var minutes: js.UndefOr[Double | Null] = js.undefined
}
object SchemaEventReminder {
  
  inline def apply(): SchemaEventReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventReminder]
  }
  
  extension [Self <: SchemaEventReminder](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesNull: Self = StObject.set(x, "minutes", null)
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
  }
}
