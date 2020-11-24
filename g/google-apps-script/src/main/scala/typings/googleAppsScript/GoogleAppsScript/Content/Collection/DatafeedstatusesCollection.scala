package typings.googleAppsScript.GoogleAppsScript.Content.Collection

import typings.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedStatus
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedstatusesCustomBatchRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedstatusesCustomBatchResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.DatafeedstatusesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
