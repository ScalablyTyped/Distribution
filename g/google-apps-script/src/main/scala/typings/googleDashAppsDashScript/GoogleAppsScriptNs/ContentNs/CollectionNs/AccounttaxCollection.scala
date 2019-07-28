package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountTax
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxCustomBatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxCustomBatchResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs.AccounttaxListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccounttaxCollection extends js.Object {
  // Retrieves and updates tax settings of multiple accounts in a single request.
  def custombatch(resource: AccounttaxCustomBatchRequest): AccounttaxCustomBatchResponse = js.native
  // Retrieves and updates tax settings of multiple accounts in a single request.
  def custombatch(resource: AccounttaxCustomBatchRequest, optionalArgs: js.Object): AccounttaxCustomBatchResponse = js.native
  // Retrieves the tax settings of the account.
  def get(merchantId: String, accountId: String): AccountTax = js.native
  // Lists the tax settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: String): AccounttaxListResponse = js.native
  // Lists the tax settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): AccounttaxListResponse = js.native
  // Updates the tax settings of the account. This method supports patch semantics.
  def patch(resource: AccountTax, merchantId: String, accountId: String): AccountTax = js.native
  // Updates the tax settings of the account. This method supports patch semantics.
  def patch(resource: AccountTax, merchantId: String, accountId: String, optionalArgs: js.Object): AccountTax = js.native
  // Updates the tax settings of the account.
  def update(resource: AccountTax, merchantId: String, accountId: String): AccountTax = js.native
  // Updates the tax settings of the account.
  def update(resource: AccountTax, merchantId: String, accountId: String, optionalArgs: js.Object): AccountTax = js.native
}

