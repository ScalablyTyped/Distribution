package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedstatusesCollection extends js.Object {
  // Gets multiple Merchant Center datafeed statuses in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedstatusesCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedstatusesCustomBatchResponse = js.native
  // Retrieves the status of a datafeed from your Merchant Center account.
  def get(merchantId: java.lang.String, datafeedId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedStatus = js.native
  // Retrieves the status of a datafeed from your Merchant Center account.
  def get(merchantId: java.lang.String, datafeedId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedStatus = js.native
  // Lists the statuses of the datafeeds in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedstatusesListResponse = js.native
  // Lists the statuses of the datafeeds in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedstatusesListResponse = js.native
}

