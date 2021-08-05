package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Internal interfaces
trait AppsScriptEvent extends StObject {
  
  var authMode: AuthMode
  
  var triggerUid: String
  
  var user: User
}
object AppsScriptEvent {
  
  inline def apply(authMode: AuthMode, triggerUid: String, user: User): AppsScriptEvent = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptEvent]
  }
  
  extension [Self <: AppsScriptEvent](x: Self) {
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setTriggerUid(value: String): Self = StObject.set(x, "triggerUid", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
