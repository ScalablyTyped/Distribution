package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.Datafeed
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.DatafeedsCustomBatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.DatafeedsCustomBatchResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.DatafeedsFetchNowResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.DatafeedsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedsCollection extends js.Object {
  // Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request.
  def custombatch(resource: DatafeedsCustomBatchRequest): DatafeedsCustomBatchResponse = js.native
  // Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request.
  def custombatch(resource: DatafeedsCustomBatchRequest, optionalArgs: js.Object): DatafeedsCustomBatchResponse = js.native
  // Invokes a fetch for the datafeed in your Merchant Center account.
  def fetchnow(merchantId: String, datafeedId: String): DatafeedsFetchNowResponse = js.native
  // Invokes a fetch for the datafeed in your Merchant Center account.
  def fetchnow(merchantId: String, datafeedId: String, optionalArgs: js.Object): DatafeedsFetchNowResponse = js.native
  // Retrieves a datafeed configuration from your Merchant Center account.
  def get(merchantId: String, datafeedId: String): Datafeed = js.native
  // Registers a datafeed configuration with your Merchant Center account.
  def insert(resource: Datafeed, merchantId: String): Datafeed = js.native
  // Registers a datafeed configuration with your Merchant Center account.
  def insert(resource: Datafeed, merchantId: String, optionalArgs: js.Object): Datafeed = js.native
  // Lists the configurations for datafeeds in your Merchant Center account.
  def list(merchantId: String): DatafeedsListResponse = js.native
  // Lists the configurations for datafeeds in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): DatafeedsListResponse = js.native
  // Updates a datafeed configuration of your Merchant Center account. This method supports patch semantics.
  def patch(resource: Datafeed, merchantId: String, datafeedId: String): Datafeed = js.native
  // Updates a datafeed configuration of your Merchant Center account. This method supports patch semantics.
  def patch(resource: Datafeed, merchantId: String, datafeedId: String, optionalArgs: js.Object): Datafeed = js.native
  // Deletes a datafeed configuration from your Merchant Center account.
  def remove(merchantId: String, datafeedId: String): Unit = js.native
  // Deletes a datafeed configuration from your Merchant Center account.
  def remove(merchantId: String, datafeedId: String, optionalArgs: js.Object): Unit = js.native
  // Updates a datafeed configuration of your Merchant Center account.
  def update(resource: Datafeed, merchantId: String, datafeedId: String): Datafeed = js.native
  // Updates a datafeed configuration of your Merchant Center account.
  def update(resource: Datafeed, merchantId: String, datafeedId: String, optionalArgs: js.Object): Datafeed = js.native
}

