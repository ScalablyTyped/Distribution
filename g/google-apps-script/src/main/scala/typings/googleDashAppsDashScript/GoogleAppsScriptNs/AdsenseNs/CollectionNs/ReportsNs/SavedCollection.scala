package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.ReportsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdsenseReportsGenerateResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.SavedReports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedCollection extends js.Object {
  // Generate an AdSense report based on the saved report ID sent in the query parameters.
  def generate(savedReportId: String): AdsenseReportsGenerateResponse = js.native
  // Generate an AdSense report based on the saved report ID sent in the query parameters.
  def generate(savedReportId: String, optionalArgs: js.Object): AdsenseReportsGenerateResponse = js.native
  // List all saved reports in this AdSense account.
  def list(): SavedReports = js.native
  // List all saved reports in this AdSense account.
  def list(optionalArgs: js.Object): SavedReports = js.native
}

