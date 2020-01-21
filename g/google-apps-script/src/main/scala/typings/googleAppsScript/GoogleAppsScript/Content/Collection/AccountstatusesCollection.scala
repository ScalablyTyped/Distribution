package typings.googleAppsScript.GoogleAppsScript.Content.Collection

import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountStatus
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountstatusesCustomBatchRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountstatusesCustomBatchResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.AccountstatusesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountstatusesCollection extends js.Object {
  // Retrieves multiple Merchant Center account statuses in a single request.
  def custombatch(resource: AccountstatusesCustomBatchRequest): AccountstatusesCustomBatchResponse = js.native
  // Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts.
  def get(merchantId: String, accountId: String): AccountStatus = js.native
  // Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts.
  def get(merchantId: String, accountId: String, optionalArgs: js.Object): AccountStatus = js.native
  // Lists the statuses of the sub-accounts in your Merchant Center account.
  def list(merchantId: String): AccountstatusesListResponse = js.native
  // Lists the statuses of the sub-accounts in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): AccountstatusesListResponse = js.native
}

