package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.anon.Notifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListInput extends StObject {
  
  // Optional Properties
  var backgroundColor: js.UndefOr[String] = js.native
  
  var colorId: js.UndefOr[String] = js.native
  
  var defaultReminders: js.UndefOr[js.Array[Method]] = js.native
  
  var foregroundColor: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  // Required Properties
  var id: String = js.native
  
  var notificationSettings: js.UndefOr[Notifications] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var summaryOverride: js.UndefOr[String] = js.native
}
object CalendarListInput {
  
  @scala.inline
  def apply(id: String): CalendarListInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInput]
  }
  
  @scala.inline
  implicit class CalendarListInputMutableBuilder[Self <: CalendarListInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    @scala.inline
    def setDefaultReminders(value: js.Array[Method]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
    
    @scala.inline
    def setDefaultRemindersVarargs(value: Method*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
    
    @scala.inline
    def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSettings(value: Notifications): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSummaryOverride(value: String): Self = StObject.set(x, "summaryOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryOverrideUndefined: Self = StObject.set(x, "summaryOverride", js.undefined)
  }
}
