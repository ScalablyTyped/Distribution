package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class SheetsOnOpenOps[Self <: SheetsOnOpen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSource(value: Spreadsheet): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

