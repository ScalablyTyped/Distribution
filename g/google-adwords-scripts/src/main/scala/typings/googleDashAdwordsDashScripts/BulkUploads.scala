package typings.googleDashAdwordsDashScripts

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.File
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Bulk Uploads
@js.native
trait BulkUploads extends js.Object {
  def newCsvUpload(columnNames: js.Array[String], optArgs: FileUploadArguments): CsvUpload = js.native
  def newFileUpload(file: Blob, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(file: File, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(file: Sheet, optArgs: FileUploadArguments): FileUpload = js.native
}

