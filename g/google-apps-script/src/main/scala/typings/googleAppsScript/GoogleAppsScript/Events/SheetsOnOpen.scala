package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// External interfaces
@js.native
trait SheetsOnOpen extends AppsScriptEvent {
  
  var source: Spreadsheet = js.native
}
object SheetsOnOpen {
  
  @scala.inline
  def apply(authMode: AuthMode, source: Spreadsheet, triggerUid: String, user: User): SheetsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnOpen]
  }
  
  @scala.inline
  implicit class SheetsOnOpenMutableBuilder[Self <: SheetsOnOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Spreadsheet): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
