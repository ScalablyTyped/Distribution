package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.ReportsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedCollection extends js.Object {
  // Generate an AdSense report based on the saved report ID sent in the query parameters.
  def generate(savedReportId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdsenseReportsGenerateResponse = js.native
  // Generate an AdSense report based on the saved report ID sent in the query parameters.
  def generate(savedReportId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdsenseReportsGenerateResponse = js.native
  // List all saved reports in this AdSense account.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.SavedReports = js.native
  // List all saved reports in this AdSense account.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.SavedReports = js.native
}

