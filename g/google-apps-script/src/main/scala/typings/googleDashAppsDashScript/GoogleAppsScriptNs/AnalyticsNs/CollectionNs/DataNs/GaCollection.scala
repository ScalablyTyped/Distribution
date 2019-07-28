package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.CollectionNs.DataNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.GaData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaCollection extends js.Object {
  // Returns Analytics data for a view (profile).
  def get(ids: String, start_date: String, end_date: String, metrics: String): GaData = js.native
  // Returns Analytics data for a view (profile).
  def get(ids: String, start_date: String, end_date: String, metrics: String, optionalArgs: js.Object): GaData = js.native
}

