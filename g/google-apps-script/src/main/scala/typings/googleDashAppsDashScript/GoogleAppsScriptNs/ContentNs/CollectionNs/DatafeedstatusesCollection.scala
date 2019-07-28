package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedStatus
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedstatusesCustomBatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedstatusesCustomBatchResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.DatafeedstatusesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedstatusesCollection extends js.Object {
  // Gets multiple Merchant Center datafeed statuses in a single request.
  def custombatch(resource: DatafeedstatusesCustomBatchRequest): DatafeedstatusesCustomBatchResponse = js.native
  // Retrieves the status of a datafeed from your Merchant Center account.
  def get(merchantId: String, datafeedId: String): DatafeedStatus = js.native
  // Retrieves the status of a datafeed from your Merchant Center account.
  def get(merchantId: String, datafeedId: String, optionalArgs: js.Object): DatafeedStatus = js.native
  // Lists the statuses of the datafeeds in your Merchant Center account.
  def list(merchantId: String): DatafeedstatusesListResponse = js.native
  // Lists the statuses of the datafeeds in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): DatafeedstatusesListResponse = js.native
}

