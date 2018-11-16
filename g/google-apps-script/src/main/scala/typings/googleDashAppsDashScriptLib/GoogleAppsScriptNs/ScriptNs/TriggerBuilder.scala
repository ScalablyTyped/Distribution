package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerBuilder extends js.Object {
  def forDocument(document: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.Document): DocumentTriggerBuilder = js.native
  def forDocument(key: java.lang.String): DocumentTriggerBuilder = js.native
  def forForm(form: googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Form): FormTriggerBuilder = js.native
  def forForm(key: java.lang.String): FormTriggerBuilder = js.native
  def forSpreadsheet(key: java.lang.String): SpreadsheetTriggerBuilder = js.native
  def forSpreadsheet(sheet: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Spreadsheet): SpreadsheetTriggerBuilder = js.native
  def forUserCalendar(emailId: java.lang.String): CalendarTriggerBuilder = js.native
  def timeBased(): ClockTriggerBuilder = js.native
}

