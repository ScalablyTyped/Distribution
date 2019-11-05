package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic builder for script triggers.
  */
@js.native
trait TriggerBuilder extends js.Object {
  def forDocument(document: typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document): DocumentTriggerBuilder = js.native
  def forDocument(key: String): DocumentTriggerBuilder = js.native
  def forForm(form: Form): FormTriggerBuilder = js.native
  def forForm(key: String): FormTriggerBuilder = js.native
  def forSpreadsheet(key: String): SpreadsheetTriggerBuilder = js.native
  def forSpreadsheet(sheet: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Spreadsheet): SpreadsheetTriggerBuilder = js.native
  def forUserCalendar(emailId: String): CalendarTriggerBuilder = js.native
  def timeBased(): ClockTriggerBuilder = js.native
}

