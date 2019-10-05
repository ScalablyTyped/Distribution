package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ShippingSettings
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ShippingsettingsCustomBatchRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ShippingsettingsCustomBatchResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ShippingsettingsGetSupportedCarriersResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ShippingsettingsGetSupportedHolidaysResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.ShippingsettingsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingsettingsCollection extends js.Object {
  // Retrieves and updates the shipping settings of multiple accounts in a single request.
  def custombatch(resource: ShippingsettingsCustomBatchRequest): ShippingsettingsCustomBatchResponse = js.native
  // Retrieves and updates the shipping settings of multiple accounts in a single request.
  def custombatch(resource: ShippingsettingsCustomBatchRequest, optionalArgs: js.Object): ShippingsettingsCustomBatchResponse = js.native
  // Retrieves the shipping settings of the account.
  def get(merchantId: String, accountId: String): ShippingSettings = js.native
  // Retrieves supported carriers and carrier services for an account.
  def getsupportedcarriers(merchantId: String): ShippingsettingsGetSupportedCarriersResponse = js.native
  // Retrieves supported holidays for an account.
  def getsupportedholidays(merchantId: String): ShippingsettingsGetSupportedHolidaysResponse = js.native
  // Lists the shipping settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: String): ShippingsettingsListResponse = js.native
  // Lists the shipping settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): ShippingsettingsListResponse = js.native
  // Updates the shipping settings of the account. This method supports patch semantics.
  def patch(resource: ShippingSettings, merchantId: String, accountId: String): ShippingSettings = js.native
  // Updates the shipping settings of the account. This method supports patch semantics.
  def patch(resource: ShippingSettings, merchantId: String, accountId: String, optionalArgs: js.Object): ShippingSettings = js.native
  // Updates the shipping settings of the account.
  def update(resource: ShippingSettings, merchantId: String, accountId: String): ShippingSettings = js.native
  // Updates the shipping settings of the account.
  def update(resource: ShippingSettings, merchantId: String, accountId: String, optionalArgs: js.Object): ShippingSettings = js.native
}

