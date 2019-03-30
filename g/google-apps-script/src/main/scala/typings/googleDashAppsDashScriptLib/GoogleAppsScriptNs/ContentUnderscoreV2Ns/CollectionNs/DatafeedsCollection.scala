package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedsCollection extends js.Object {
  // Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsCustomBatchResponse = js.native
  // Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsCustomBatchResponse = js.native
  // Invokes a fetch for the datafeed in your Merchant Center account.
  def fetchnow(merchantId: java.lang.String, datafeedId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsFetchNowResponse = js.native
  // Invokes a fetch for the datafeed in your Merchant Center account.
  def fetchnow(merchantId: java.lang.String, datafeedId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsFetchNowResponse = js.native
  // Retrieves a datafeed configuration from your Merchant Center account.
  def get(merchantId: java.lang.String, datafeedId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed = js.native
  // Registers a datafeed configuration with your Merchant Center account.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed,
    merchantId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed = js.native
  // Registers a datafeed configuration with your Merchant Center account.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed,
    merchantId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed = js.native
  // Lists the configurations for datafeeds in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsListResponse = js.native
  // Lists the configurations for datafeeds in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.DatafeedsListResponse = js.native
  // Updates a datafeed configuration of your Merchant Center account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed,
    merchantId: java.lang.String,
    datafeedId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed = js.native
  // Updates a datafeed configuration of your Merchant Center account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed,
    merchantId: java.lang.String,
    datafeedId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed = js.native
  // Deletes a datafeed configuration from your Merchant Center account.
  def remove(merchantId: java.lang.String, datafeedId: java.lang.String): scala.Unit = js.native
  // Deletes a datafeed configuration from your Merchant Center account.
  def remove(merchantId: java.lang.String, datafeedId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Updates a datafeed configuration of your Merchant Center account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed,
    merchantId: java.lang.String,
    datafeedId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed = js.native
  // Updates a datafeed configuration of your Merchant Center account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed,
    merchantId: java.lang.String,
    datafeedId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Datafeed = js.native
}

