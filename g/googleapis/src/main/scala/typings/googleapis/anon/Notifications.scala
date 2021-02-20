package typings.googleapis.anon

import typings.googleapis.calendarV3Mod.calendarV3.SchemaCalendarNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notifications extends StObject {
  
  var notifications: js.UndefOr[js.Array[SchemaCalendarNotification]] = js.native
}
object Notifications {
  
  @scala.inline
  def apply(): Notifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notifications]
  }
  
  @scala.inline
  implicit class NotificationsMutableBuilder[Self <: Notifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifications(value: js.Array[SchemaCalendarNotification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: SchemaCalendarNotification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
  }
}
