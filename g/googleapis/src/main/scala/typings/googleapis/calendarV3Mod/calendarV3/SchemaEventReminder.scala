package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventReminder extends StObject {
  
  /**
    * The method used by this reminder. Possible values are:   -
    * &quot;email&quot; - Reminders are sent via email.  - &quot;sms&quot; -
    * Deprecated. Once this feature is shutdown, the API will no longer return
    * reminders using this method. Any newly added SMS reminders will be
    * ignored. See  Google Calendar SMS notifications to be removed for more
    * information. Reminders are sent via SMS. These are only available for G
    * Suite customers. Requests to set SMS reminders for other account types
    * are ignored.  - &quot;popup&quot; - Reminders are sent via a UI popup.
    * Required when adding a reminder.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Number of minutes before the start of the event when the reminder should
    * trigger. Valid values are between 0 and 40320 (4 weeks in minutes).
    * Required when adding a reminder.
    */
  var minutes: js.UndefOr[Double] = js.undefined
}
object SchemaEventReminder {
  
  @scala.inline
  def apply(): SchemaEventReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventReminder]
  }
  
  @scala.inline
  implicit class SchemaEventReminderMutableBuilder[Self <: SchemaEventReminder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
  }
}
