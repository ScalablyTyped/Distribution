package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.AdsenseReportsGenerateResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.SavedReports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Adsense.Collection.Accounts.Reports")
@js.native
object Reports extends js.Object {
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
  
}

