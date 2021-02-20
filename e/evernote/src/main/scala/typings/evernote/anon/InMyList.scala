package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InMyList extends StObject {
  
  var inMyList: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
  
  var stack: js.UndefOr[String] = js.native
}
object InMyList {
  
  @scala.inline
  def apply(): InMyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InMyList]
  }
  
  @scala.inline
  implicit class InMyListMutableBuilder[Self <: InMyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInMyList(value: Boolean): Self = StObject.set(x, "inMyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInMyListUndefined: Self = StObject.set(x, "inMyList", js.undefined)
    
    @scala.inline
    def setReminderNotifyEmail(value: Boolean): Self = StObject.set(x, "reminderNotifyEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderNotifyEmailUndefined: Self = StObject.set(x, "reminderNotifyEmail", js.undefined)
    
    @scala.inline
    def setReminderNotifyInApp(value: Boolean): Self = StObject.set(x, "reminderNotifyInApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderNotifyInAppUndefined: Self = StObject.set(x, "reminderNotifyInApp", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
