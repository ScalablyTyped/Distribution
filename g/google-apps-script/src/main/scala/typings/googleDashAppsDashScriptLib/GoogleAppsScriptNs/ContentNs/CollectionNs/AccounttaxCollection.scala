package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccounttaxCollection extends js.Object {
  // Retrieves and updates tax settings of multiple accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxCustomBatchResponse = js.native
  // Retrieves and updates tax settings of multiple accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxCustomBatchResponse = js.native
  // Retrieves the tax settings of the account.
  def get(merchantId: java.lang.String, accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax = js.native
  // Lists the tax settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxListResponse = js.native
  // Lists the tax settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxListResponse = js.native
  // Updates the tax settings of the account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax = js.native
  // Updates the tax settings of the account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax = js.native
  // Updates the tax settings of the account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax = js.native
  // Updates the tax settings of the account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax = js.native
}

