package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.ReportsNs.SavedCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdsenseReportsGenerateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsCollection extends js.Object {
  var Saved: js.UndefOr[SavedCollection] = js.native
  // Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
  def generate(startDate: String, endDate: String): AdsenseReportsGenerateResponse = js.native
  // Generate an AdSense report based on the report request sent in the query parameters. Returns the result as JSON; to retrieve output in CSV format specify "alt=csv" as a query parameter.
  def generate(startDate: String, endDate: String, optionalArgs: js.Object): AdsenseReportsGenerateResponse = js.native
}

