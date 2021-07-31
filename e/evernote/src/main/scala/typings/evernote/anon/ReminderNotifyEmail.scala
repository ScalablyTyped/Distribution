package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReminderNotifyEmail extends StObject {
  
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined
  
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined
}
object ReminderNotifyEmail {
  
  @scala.inline
  def apply(): ReminderNotifyEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReminderNotifyEmail]
  }
  
  @scala.inline
  implicit class ReminderNotifyEmailMutableBuilder[Self <: ReminderNotifyEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReminderNotifyEmail(value: Boolean): Self = StObject.set(x, "reminderNotifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderNotifyEmailUndefined: Self = StObject.set(x, "reminderNotifyEmail", js.undefined)
    
    @scala.inline
    def setReminderNotifyInApp(value: Boolean): Self = StObject.set(x, "reminderNotifyInApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderNotifyInAppUndefined: Self = StObject.set(x, "reminderNotifyInApp", js.undefined)
  }
}
