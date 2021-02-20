package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Range
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsOnEdit extends AppsScriptEvent {
  
  var oldValue: String = js.native
  
  var range: Range = js.native
  
  var source: Spreadsheet = js.native
  
  var value: String = js.native
}
object SheetsOnEdit {
  
  @scala.inline
  def apply(
    authMode: AuthMode,
    oldValue: String,
    range: Range,
    source: Spreadsheet,
    triggerUid: String,
    user: User,
    value: String
  ): SheetsOnEdit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnEdit]
  }
  
  @scala.inline
  implicit class SheetsOnEditMutableBuilder[Self <: SheetsOnEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Spreadsheet): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
