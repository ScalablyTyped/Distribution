package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.anon.Notifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarListInput extends StObject {
  
  // Optional Properties
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var colorId: js.UndefOr[String] = js.undefined
  
  var defaultReminders: js.UndefOr[js.Array[Method]] = js.undefined
  
  var foregroundColor: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  // Required Properties
  var id: String
  
  var notificationSettings: js.UndefOr[Notifications] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var summaryOverride: js.UndefOr[String] = js.undefined
}
object CalendarListInput {
  
  inline def apply(id: String): CalendarListInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInput]
  }
  
  extension [Self <: CalendarListInput](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    inline def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    inline def setDefaultReminders(value: js.Array[Method]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    inline def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
    
    inline def setDefaultRemindersVarargs(value: Method*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
    
    inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNotificationSettings(value: Notifications): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
    
    inline def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSummaryOverride(value: String): Self = StObject.set(x, "summaryOverride", value.asInstanceOf[js.Any])
    
    inline def setSummaryOverrideUndefined: Self = StObject.set(x, "summaryOverride", js.undefined)
  }
}
