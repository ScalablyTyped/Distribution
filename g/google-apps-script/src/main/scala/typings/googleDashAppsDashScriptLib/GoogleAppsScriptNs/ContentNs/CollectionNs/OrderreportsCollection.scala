package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderreportsCollection extends js.Object {
  // Retrieves a report for disbursements from your Merchant Center account.
  def listdisbursements(merchantId: java.lang.String, disbursementStartDate: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrderreportsListDisbursementsResponse = js.native
  // Retrieves a report for disbursements from your Merchant Center account.
  def listdisbursements(merchantId: java.lang.String, disbursementStartDate: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrderreportsListDisbursementsResponse = js.native
  // Retrieves a list of transactions for a disbursement from your Merchant Center account.
  def listtransactions(
    merchantId: java.lang.String,
    disbursementId: java.lang.String,
    transactionStartDate: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrderreportsListTransactionsResponse = js.native
  // Retrieves a list of transactions for a disbursement from your Merchant Center account.
  def listtransactions(
    merchantId: java.lang.String,
    disbursementId: java.lang.String,
    transactionStartDate: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.OrderreportsListTransactionsResponse = js.native
}

