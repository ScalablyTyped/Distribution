package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Bulk Uploads
@js.native
trait BulkUploads extends js.Object {
  def newCsvUpload(columnNames: js.Array[java.lang.String], optArgs: FileUploadArguments): CsvUpload = js.native
  def newFileUpload(file: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(file: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.File, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(
    file: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Sheet,
    optArgs: FileUploadArguments
  ): FileUpload = js.native
}

