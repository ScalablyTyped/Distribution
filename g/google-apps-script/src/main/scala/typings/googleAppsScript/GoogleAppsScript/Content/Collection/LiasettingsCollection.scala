package typings.googleAppsScript.GoogleAppsScript.Content.Collection

import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiaSettings
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsCustomBatchRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsCustomBatchResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsGetAccessibleGmbAccountsResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsListPosDataProvidersResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsListResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsRequestGmbAccessResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsRequestInventoryVerificationResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsSetInventoryVerificationContactResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.LiasettingsSetPosDataProviderResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiasettingsCollection extends js.Object {
  // Retrieves and/or updates the LIA settings of multiple accounts in a single request.
  def custombatch(resource: LiasettingsCustomBatchRequest): LiasettingsCustomBatchResponse = js.native
  // Retrieves and/or updates the LIA settings of multiple accounts in a single request.
  def custombatch(resource: LiasettingsCustomBatchRequest, optionalArgs: js.Object): LiasettingsCustomBatchResponse = js.native
  // Retrieves the LIA settings of the account.
  def get(merchantId: String, accountId: String): LiaSettings = js.native
  // Retrieves the list of accessible Google My Business accounts.
  def getaccessiblegmbaccounts(merchantId: String, accountId: String): LiasettingsGetAccessibleGmbAccountsResponse = js.native
  // Lists the LIA settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: String): LiasettingsListResponse = js.native
  // Lists the LIA settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): LiasettingsListResponse = js.native
  // Retrieves the list of POS data providers that have active settings for the all eiligible countries.
  def listposdataproviders(): LiasettingsListPosDataProvidersResponse = js.native
  // Updates the LIA settings of the account. This method supports patch semantics.
  def patch(resource: LiaSettings, merchantId: String, accountId: String): LiaSettings = js.native
  // Updates the LIA settings of the account. This method supports patch semantics.
  def patch(resource: LiaSettings, merchantId: String, accountId: String, optionalArgs: js.Object): LiaSettings = js.native
  // Requests access to a specified Google My Business account.
  def requestgmbaccess(merchantId: String, accountId: String, gmbEmail: String): LiasettingsRequestGmbAccessResponse = js.native
  // Requests inventory validation for the specified country.
  def requestinventoryverification(merchantId: String, accountId: String, country: String): LiasettingsRequestInventoryVerificationResponse = js.native
  // Sets the inventory verification contract for the specified country.
  def setinventoryverificationcontact(
    merchantId: String,
    accountId: String,
    contactEmail: String,
    contactName: String,
    country: String,
    language: String
  ): LiasettingsSetInventoryVerificationContactResponse = js.native
  // Sets the POS data provider for the specified country.
  def setposdataprovider(merchantId: String, accountId: String, country: String): LiasettingsSetPosDataProviderResponse = js.native
  // Sets the POS data provider for the specified country.
  def setposdataprovider(merchantId: String, accountId: String, country: String, optionalArgs: js.Object): LiasettingsSetPosDataProviderResponse = js.native
  // Updates the LIA settings of the account.
  def update(resource: LiaSettings, merchantId: String, accountId: String): LiaSettings = js.native
  // Updates the LIA settings of the account.
  def update(resource: LiaSettings, merchantId: String, accountId: String, optionalArgs: js.Object): LiaSettings = js.native
}

