package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  // Returns information about the authenticated user.
  def authinfo(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsAuthInfoResponse = js.native
  // Claims the website of a Merchant Center sub-account.
  def claimwebsite(merchantId: java.lang.String, accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsClaimWebsiteResponse = js.native
  // Claims the website of a Merchant Center sub-account.
  def claimwebsite(merchantId: java.lang.String, accountId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsClaimWebsiteResponse = js.native
  // Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsCustomBatchResponse = js.native
  // Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsCustomBatchResponse = js.native
  // Retrieves a Merchant Center account.
  def get(merchantId: java.lang.String, accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account = js.native
  // Creates a Merchant Center sub-account.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account,
    merchantId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account = js.native
  // Creates a Merchant Center sub-account.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account,
    merchantId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account = js.native
  // Performs an action on a link between a Merchant Center account and another account.
  def link(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsLinkRequest,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsLinkResponse = js.native
  // Lists the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsListResponse = js.native
  // Lists the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.AccountsListResponse = js.native
  // Updates a Merchant Center account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account = js.native
  // Updates a Merchant Center account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account = js.native
  // Deletes a Merchant Center sub-account.
  def remove(merchantId: java.lang.String, accountId: java.lang.String): scala.Unit = js.native
  // Deletes a Merchant Center sub-account.
  def remove(merchantId: java.lang.String, accountId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Updates a Merchant Center account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account = js.native
  // Updates a Merchant Center account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.Account = js.native
}

