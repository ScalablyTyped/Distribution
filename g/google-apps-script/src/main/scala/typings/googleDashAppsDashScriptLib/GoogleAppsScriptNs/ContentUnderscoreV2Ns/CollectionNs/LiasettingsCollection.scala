package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiasettingsCollection extends js.Object {
  // Retrieves and/or updates the LIA settings of multiple accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsCustomBatchRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsCustomBatchResponse = js.native
  // Retrieves and/or updates the LIA settings of multiple accounts in a single request.
  def custombatch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsCustomBatchRequest,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsCustomBatchResponse = js.native
  // Retrieves the LIA settings of the account.
  def get(merchantId: java.lang.String, accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings = js.native
  // Retrieves the list of accessible Google My Business accounts.
  def getaccessiblegmbaccounts(merchantId: java.lang.String, accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsGetAccessibleGmbAccountsResponse = js.native
  // Lists the LIA settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsListResponse = js.native
  // Lists the LIA settings of the sub-accounts in your Merchant Center account.
  def list(merchantId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsListResponse = js.native
  // Retrieves the list of POS data providers that have active settings for the all eiligible countries.
  def listposdataproviders(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsListPosDataProvidersResponse = js.native
  // Updates the LIA settings of the account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings = js.native
  // Updates the LIA settings of the account. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings = js.native
  // Requests access to a specified Google My Business account.
  def requestgmbaccess(merchantId: java.lang.String, accountId: java.lang.String, gmbEmail: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsRequestGmbAccessResponse = js.native
  // Requests inventory validation for the specified country.
  def requestinventoryverification(merchantId: java.lang.String, accountId: java.lang.String, country: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsRequestInventoryVerificationResponse = js.native
  // Sets the inventory verification contract for the specified country.
  def setinventoryverificationcontact(
    merchantId: java.lang.String,
    accountId: java.lang.String,
    contactEmail: java.lang.String,
    contactName: java.lang.String,
    country: java.lang.String,
    language: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsSetInventoryVerificationContactResponse = js.native
  // Sets the POS data provider for the specified country.
  def setposdataprovider(merchantId: java.lang.String, accountId: java.lang.String, country: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsSetPosDataProviderResponse = js.native
  // Sets the POS data provider for the specified country.
  def setposdataprovider(
    merchantId: java.lang.String,
    accountId: java.lang.String,
    country: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiasettingsSetPosDataProviderResponse = js.native
  // Updates the LIA settings of the account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings = js.native
  // Updates the LIA settings of the account.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings,
    merchantId: java.lang.String,
    accountId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.LiaSettings = js.native
}

