package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsOnChange extends AppsScriptEvent {
  
  var changeType: SheetsOnChangeChangeType = js.native
}
object SheetsOnChange {
  
  @scala.inline
  def apply(authMode: AuthMode, changeType: SheetsOnChangeChangeType, triggerUid: String, user: User): SheetsOnChange = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnChange]
  }
  
  @scala.inline
  implicit class SheetsOnChangeMutableBuilder[Self <: SheetsOnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: SheetsOnChangeChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
  }
}
