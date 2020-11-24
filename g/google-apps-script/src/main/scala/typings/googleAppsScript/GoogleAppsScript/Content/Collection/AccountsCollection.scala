package typings.googleAppsScript.GoogleAppsScript.Content.Collection

import typings.googleAppsScript.GoogleAppsScript.Content.Schema.Account
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsAuthInfoResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsClaimWebsiteResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsCustomBatchResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsLinkRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsLinkResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsCollection extends js.Object {
  
  // Returns information about the authenticated user.
  def authinfo(): AccountsAuthInfoResponse = js.native
  
  // Claims the website of a Merchant Center sub-account.
  def claimwebsite(merchantId: String, accountId: String): AccountsClaimWebsiteResponse = js.native
  // Claims the website of a Merchant Center sub-account.
  def claimwebsite(merchantId: String, accountId: String, optionalArgs: js.Object): AccountsClaimWebsiteResponse = js.native
  
  // Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request.
  def custombatch(resource: AccountsCustomBatchRequest): AccountsCustomBatchResponse = js.native
  // Retrieves, inserts, updates, and deletes multiple Merchant Center (sub-)accounts in a single request.
  def custombatch(resource: AccountsCustomBatchRequest, optionalArgs: js.Object): AccountsCustomBatchResponse = js.native
  
  // Retrieves a Merchant Center account.
  def get(merchantId: String, accountId: String): Account = js.native
  
  // Creates a Merchant Center sub-account.
  def insert(resource: Account, merchantId: String): Account = js.native
  // Creates a Merchant Center sub-account.
  def insert(resource: Account, merchantId: String, optionalArgs: js.Object): Account = js.native
  
  // Performs an action on a link between a Merchant Center account and another account.
  def link(resource: AccountsLinkRequest, merchantId: String, accountId: String): AccountsLinkResponse = js.native
  
  // Lists the sub-accounts in your Merchant Center account.
  def list(merchantId: String): AccountsListResponse = js.native
  // Lists the sub-accounts in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): AccountsListResponse = js.native
  
  // Updates a Merchant Center account. This method supports patch semantics.
  def patch(resource: Account, merchantId: String, accountId: String): Account = js.native
  // Updates a Merchant Center account. This method supports patch semantics.
  def patch(resource: Account, merchantId: String, accountId: String, optionalArgs: js.Object): Account = js.native
  
  // Deletes a Merchant Center sub-account.
  def remove(merchantId: String, accountId: String): Unit = js.native
  // Deletes a Merchant Center sub-account.
  def remove(merchantId: String, accountId: String, optionalArgs: js.Object): Unit = js.native
  
  // Updates a Merchant Center account.
  def update(resource: Account, merchantId: String, accountId: String): Account = js.native
  // Updates a Merchant Center account.
  def update(resource: Account, merchantId: String, accountId: String, optionalArgs: js.Object): Account = js.native
}
