package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetsOnChange
  extends StObject
     with AppsScriptEvent {
  
  var changeType: SheetsOnChangeChangeType
  
  var source: Spreadsheet
}
object SheetsOnChange {
  
  inline def apply(
    authMode: AuthMode,
    changeType: SheetsOnChangeChangeType,
    source: Spreadsheet,
    triggerUid: String,
    user: User
  ): SheetsOnChange = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetsOnChange] (val x: Self) extends AnyVal {
    
    inline def setChangeType(value: SheetsOnChangeChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Spreadsheet): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
