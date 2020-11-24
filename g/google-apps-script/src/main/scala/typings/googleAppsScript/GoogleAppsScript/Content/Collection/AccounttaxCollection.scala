package typings.googleAppsScript.GoogleAppsScript.Content.Collection

import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountTax
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccounttaxCustomBatchRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccounttaxCustomBatchResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccounttaxListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
