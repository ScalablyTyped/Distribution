package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedstatusesCollection extends js.Object {
  // Gets multiple Merchant Center datafeed statuses in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedstatusesCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedstatusesCustomBatchResponse = js.native
  // Retrieves the status of a datafeed from your Merchant Center account.
  def get(merchantId: java.lang.String, datafeedId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedStatus = js.native
  // Retrieves the status of a datafeed from your Merchant Center account.
  def get(merchantId: java.lang.String, datafeedId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedStatus = js.native
  // Lists the statuses of the datafeeds in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedstatusesListResponse = js.native
  // Lists the statuses of the datafeeds in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedstatusesListResponse = js.native
}

