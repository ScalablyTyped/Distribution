package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSpreadsheetsDollarSheetsDollarCopyto extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$CopySheetToAnotherSpreadsheetRequest] = js.native
  /**
    * The ID of the sheet to copy.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The ID of the spreadsheet containing the sheet to copy.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}

