package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountstatusesCollection extends js.Object {
  // Retrieves multiple Merchant Center account statuses in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountstatusesCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountstatusesCustomBatchResponse = js.native
  // Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts.
  def get(merchantId: java.lang.String, accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountStatus = js.native
  // Retrieves the status of a Merchant Center account. No itemLevelIssues are returned for multi-client accounts.
  def get(merchantId: java.lang.String, accountId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountStatus = js.native
  // Lists the statuses of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountstatusesListResponse = js.native
  // Lists the statuses of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.AccountstatusesListResponse = js.native
}

