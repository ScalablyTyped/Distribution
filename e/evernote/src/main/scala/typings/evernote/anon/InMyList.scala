package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InMyList extends StObject {
  
  var inMyList: js.UndefOr[Boolean] = js.undefined
  
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined
  
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
}
object InMyList {
  
  inline def apply(): InMyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InMyList]
  }
  
  extension [Self <: InMyList](x: Self) {
    
    inline def setInMyList(value: Boolean): Self = StObject.set(x, "inMyList", value.asInstanceOf[js.Any])
    
    inline def setInMyListUndefined: Self = StObject.set(x, "inMyList", js.undefined)
    
    inline def setReminderNotifyEmail(value: Boolean): Self = StObject.set(x, "reminderNotifyEmail", value.asInstanceOf[js.Any])
    
    inline def setReminderNotifyEmailUndefined: Self = StObject.set(x, "reminderNotifyEmail", js.undefined)
    
    inline def setReminderNotifyInApp(value: Boolean): Self = StObject.set(x, "reminderNotifyInApp", value.asInstanceOf[js.Any])
    
    inline def setReminderNotifyInAppUndefined: Self = StObject.set(x, "reminderNotifyInApp", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
