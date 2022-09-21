package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Drive.File
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to bulk uploads: `FileUpload`, `CsvUpload`.
  */
@js.native
trait BulkUploads extends StObject {
  
  /**
    * Creates a CsvUpload with the given column headers.
    *
    * Example usages:
    *
    *      // Creates a CsvUpload with 3 columns named 'columnA', 'columnB' and 'columnC', respectively.
    *      var upload1 = AdsApp.bulkUploads().newCsvUpload(
    *          ['columnA', 'columnB', 'columnC']);
    *
    *      // Creates a CsvUpload which represents money in currency (e.g. 1.37) instead of in micros
    *      // (e.g. 137000).
    *      var upload2 = AdsApp.bulkUploads().newCsvUpload(
    *          ['columnA', 'columnB', 'columnC'], {
    *            moneyInMicros: false
    *          });
    */
  def newCsvUpload(columnNames: js.Array[String]): CsvUpload = js.native
  def newCsvUpload(columnNames: js.Array[String], optArgs: NewUploadOptionalArgs): CsvUpload = js.native
  
  /** Creates a FileUpload with the content in the given Blob. */
  def newFileUpload(blob: Blob): FileUpload = js.native
  def newFileUpload(blob: Blob, optArgs: NewUploadOptionalArgs): FileUpload = js.native
  /** Creates a FileUpload with the content in the given File in Drive. */
  def newFileUpload(file: File): FileUpload = js.native
  def newFileUpload(file: File, optArgs: NewUploadOptionalArgs): FileUpload = js.native
  /** Creates a FileUpload with the given Google Sheet. */
  def newFileUpload(sheet: Sheet): FileUpload = js.native
  def newFileUpload(sheet: Sheet, optArgs: NewUploadOptionalArgs): FileUpload = js.native
}
