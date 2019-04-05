package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingsettingsCollection extends js.Object {
  // Retrieves and updates the shipping settings of multiple accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsCustomBatchResponse = js.native
  // Retrieves and updates the shipping settings of multiple accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsCustomBatchResponse = js.native
  // Retrieves the shipping settings of the account.
  def get(merchantId: java.lang.String, accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings = js.native
  // Retrieves supported carriers and carrier services for an account.
  def getsupportedcarriers(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsGetSupportedCarriersResponse = js.native
  // Retrieves supported holidays for an account.
  def getsupportedholidays(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsGetSupportedHolidaysResponse = js.native
  // Lists the shipping settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsListResponse = js.native
  // Lists the shipping settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingsettingsListResponse = js.native
  // Updates the shipping settings of the account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings = js.native
  // Updates the shipping settings of the account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings = js.native
  // Updates the shipping settings of the account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings = js.native
  // Updates the shipping settings of the account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs.ShippingSettings = js.native
}

