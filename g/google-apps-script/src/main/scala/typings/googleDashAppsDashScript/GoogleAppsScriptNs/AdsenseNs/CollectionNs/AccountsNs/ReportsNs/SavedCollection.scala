package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.ReportsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdsenseReportsGenerateResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.SavedReports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedCollection extends js.Object {
  // Generate an AdSense report based on the saved report ID sent in the query parameters.
  def generate(accountId: String, savedReportId: String): AdsenseReportsGenerateResponse = js.native
  // Generate an AdSense report based on the saved report ID sent in the query parameters.
  def generate(accountId: String, savedReportId: String, optionalArgs: js.Object): AdsenseReportsGenerateResponse = js.native
  // List all saved reports in the specified AdSense account.
  def list(accountId: String): SavedReports = js.native
  // List all saved reports in the specified AdSense account.
  def list(accountId: String, optionalArgs: js.Object): SavedReports = js.native
}

