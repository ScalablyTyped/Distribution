package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs.Document
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs.Form
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerBuilder extends js.Object {
  def forDocument(document: Document): DocumentTriggerBuilder = js.native
  def forDocument(key: String): DocumentTriggerBuilder = js.native
  def forForm(form: Form): FormTriggerBuilder = js.native
  def forForm(key: String): FormTriggerBuilder = js.native
  def forSpreadsheet(key: String): SpreadsheetTriggerBuilder = js.native
  def forSpreadsheet(sheet: Spreadsheet): SpreadsheetTriggerBuilder = js.native
  def forUserCalendar(emailId: String): CalendarTriggerBuilder = js.native
  def timeBased(): ClockTriggerBuilder = js.native
}

