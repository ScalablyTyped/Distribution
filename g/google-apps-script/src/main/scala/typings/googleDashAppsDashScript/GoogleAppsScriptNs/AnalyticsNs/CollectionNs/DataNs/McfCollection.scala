package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.McfData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait McfCollection extends js.Object {
  // Returns Analytics Multi-Channel Funnels data for a view (profile).
  def get(ids: String, start_date: String, end_date: String, metrics: String): McfData = js.native
  // Returns Analytics Multi-Channel Funnels data for a view (profile).
  def get(ids: String, start_date: String, end_date: String, metrics: String, optionalArgs: js.Object): McfData = js.native
}

