package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Liasettings")
@js.native
class Resource$Liasettings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.liasettings.custombatch
    * @desc Retrieves and/or updates the LIA settings of multiple accounts in a
    * single request.
    * @alias content.liasettings.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {().LiasettingsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$LiasettingsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$LiasettingsCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarLiasettingsDollarCustombatch): GaxiosPromise[Schema$LiasettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarLiasettingsDollarCustombatch,
    callback: BodyResponseCallback[Schema$LiasettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarLiasettingsDollarCustombatch,
    options: BodyResponseCallback[Schema$LiasettingsCustomBatchResponse],
    callback: BodyResponseCallback[Schema$LiasettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarLiasettingsDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$LiasettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarLiasettingsDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.liasettings.get
    * @desc Retrieves the LIA settings of the account.
    * @alias content.liasettings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get or update LIA settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$LiaSettings] = js.native
  def get(callback: BodyResponseCallback[Schema$LiaSettings]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLiasettingsDollarGet): GaxiosPromise[Schema$LiaSettings] = js.native
  def get(
    params: ParamsDollarResourceDollarLiasettingsDollarGet,
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLiasettingsDollarGet,
    options: BodyResponseCallback[Schema$LiaSettings],
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLiasettingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$LiaSettings] = js.native
  def get(
    params: ParamsDollarResourceDollarLiasettingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  /**
    * content.liasettings.getaccessiblegmbaccounts
    * @desc Retrieves the list of accessible Google My Business accounts.
    * @alias content.liasettings.getaccessiblegmbaccounts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to retrieve accessible Google My Business accounts.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getaccessiblegmbaccounts(): GaxiosPromise[Schema$LiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(callback: BodyResponseCallback[Schema$LiasettingsGetAccessibleGmbAccountsResponse]): Unit = js.native
  def getaccessiblegmbaccounts(params: ParamsDollarResourceDollarLiasettingsDollarGetaccessiblegmbaccounts): GaxiosPromise[Schema$LiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(
    params: ParamsDollarResourceDollarLiasettingsDollarGetaccessiblegmbaccounts,
    callback: BodyResponseCallback[Schema$LiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  def getaccessiblegmbaccounts(
    params: ParamsDollarResourceDollarLiasettingsDollarGetaccessiblegmbaccounts,
    options: BodyResponseCallback[Schema$LiasettingsGetAccessibleGmbAccountsResponse],
    callback: BodyResponseCallback[Schema$LiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  def getaccessiblegmbaccounts(
    params: ParamsDollarResourceDollarLiasettingsDollarGetaccessiblegmbaccounts,
    options: MethodOptions
  ): GaxiosPromise[Schema$LiasettingsGetAccessibleGmbAccountsResponse] = js.native
  def getaccessiblegmbaccounts(
    params: ParamsDollarResourceDollarLiasettingsDollarGetaccessiblegmbaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsGetAccessibleGmbAccountsResponse]
  ): Unit = js.native
  /**
    * content.liasettings.list
    * @desc Lists the LIA settings of the sub-accounts in your Merchant Center
    * account.
    * @alias content.liasettings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of LIA settings to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LiasettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$LiasettingsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLiasettingsDollarList): GaxiosPromise[Schema$LiasettingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLiasettingsDollarList,
    callback: BodyResponseCallback[Schema$LiasettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLiasettingsDollarList,
    options: BodyResponseCallback[Schema$LiasettingsListResponse],
    callback: BodyResponseCallback[Schema$LiasettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLiasettingsDollarList, options: MethodOptions): GaxiosPromise[Schema$LiasettingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLiasettingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsListResponse]
  ): Unit = js.native
  /**
    * content.liasettings.listposdataproviders
    * @desc Retrieves the list of POS data providers that have active settings
    * for the all eiligible countries.
    * @alias content.liasettings.listposdataproviders
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listposdataproviders(): GaxiosPromise[Schema$LiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(callback: BodyResponseCallback[Schema$LiasettingsListPosDataProvidersResponse]): Unit = js.native
  def listposdataproviders(params: ParamsDollarResourceDollarLiasettingsDollarListposdataproviders): GaxiosPromise[Schema$LiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(
    params: ParamsDollarResourceDollarLiasettingsDollarListposdataproviders,
    callback: BodyResponseCallback[Schema$LiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  def listposdataproviders(
    params: ParamsDollarResourceDollarLiasettingsDollarListposdataproviders,
    options: BodyResponseCallback[Schema$LiasettingsListPosDataProvidersResponse],
    callback: BodyResponseCallback[Schema$LiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  def listposdataproviders(params: ParamsDollarResourceDollarLiasettingsDollarListposdataproviders, options: MethodOptions): GaxiosPromise[Schema$LiasettingsListPosDataProvidersResponse] = js.native
  def listposdataproviders(
    params: ParamsDollarResourceDollarLiasettingsDollarListposdataproviders,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsListPosDataProvidersResponse]
  ): Unit = js.native
  /**
    * content.liasettings.patch
    * @desc Updates the LIA settings of the account. This method supports patch
    * semantics.
    * @alias content.liasettings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get or update LIA settings.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().LiaSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$LiaSettings] = js.native
  def patch(callback: BodyResponseCallback[Schema$LiaSettings]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarLiasettingsDollarPatch): GaxiosPromise[Schema$LiaSettings] = js.native
  def patch(
    params: ParamsDollarResourceDollarLiasettingsDollarPatch,
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarLiasettingsDollarPatch,
    options: BodyResponseCallback[Schema$LiaSettings],
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarLiasettingsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$LiaSettings] = js.native
  def patch(
    params: ParamsDollarResourceDollarLiasettingsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  /**
    * content.liasettings.requestgmbaccess
    * @desc Requests access to a specified Google My Business account.
    * @alias content.liasettings.requestgmbaccess
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which GMB access is requested.
    * @param {string} params.gmbEmail The email of the Google My Business account.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def requestgmbaccess(): GaxiosPromise[Schema$LiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(callback: BodyResponseCallback[Schema$LiasettingsRequestGmbAccessResponse]): Unit = js.native
  def requestgmbaccess(params: ParamsDollarResourceDollarLiasettingsDollarRequestgmbaccess): GaxiosPromise[Schema$LiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(
    params: ParamsDollarResourceDollarLiasettingsDollarRequestgmbaccess,
    callback: BodyResponseCallback[Schema$LiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  def requestgmbaccess(
    params: ParamsDollarResourceDollarLiasettingsDollarRequestgmbaccess,
    options: BodyResponseCallback[Schema$LiasettingsRequestGmbAccessResponse],
    callback: BodyResponseCallback[Schema$LiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  def requestgmbaccess(params: ParamsDollarResourceDollarLiasettingsDollarRequestgmbaccess, options: MethodOptions): GaxiosPromise[Schema$LiasettingsRequestGmbAccessResponse] = js.native
  def requestgmbaccess(
    params: ParamsDollarResourceDollarLiasettingsDollarRequestgmbaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsRequestGmbAccessResponse]
  ): Unit = js.native
  /**
    * content.liasettings.requestinventoryverification
    * @desc Requests inventory validation for the specified country.
    * @alias content.liasettings.requestinventoryverification
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.country The country for which inventory validation is requested.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def requestinventoryverification(): GaxiosPromise[Schema$LiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(callback: BodyResponseCallback[Schema$LiasettingsRequestInventoryVerificationResponse]): Unit = js.native
  def requestinventoryverification(params: ParamsDollarResourceDollarLiasettingsDollarRequestinventoryverification): GaxiosPromise[Schema$LiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(
    params: ParamsDollarResourceDollarLiasettingsDollarRequestinventoryverification,
    callback: BodyResponseCallback[Schema$LiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  def requestinventoryverification(
    params: ParamsDollarResourceDollarLiasettingsDollarRequestinventoryverification,
    options: BodyResponseCallback[Schema$LiasettingsRequestInventoryVerificationResponse],
    callback: BodyResponseCallback[Schema$LiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  def requestinventoryverification(
    params: ParamsDollarResourceDollarLiasettingsDollarRequestinventoryverification,
    options: MethodOptions
  ): GaxiosPromise[Schema$LiasettingsRequestInventoryVerificationResponse] = js.native
  def requestinventoryverification(
    params: ParamsDollarResourceDollarLiasettingsDollarRequestinventoryverification,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsRequestInventoryVerificationResponse]
  ): Unit = js.native
  /**
    * content.liasettings.setinventoryverificationcontact
    * @desc Sets the inventory verification contract for the specified country.
    * @alias content.liasettings.setinventoryverificationcontact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.contactEmail The email of the inventory verification contact.
    * @param {string} params.contactName The name of the inventory verification contact.
    * @param {string} params.country The country for which inventory verification is requested.
    * @param {string} params.language The language for which inventory verification is requested.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setinventoryverificationcontact(): GaxiosPromise[Schema$LiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(callback: BodyResponseCallback[Schema$LiasettingsSetInventoryVerificationContactResponse]): Unit = js.native
  def setinventoryverificationcontact(params: ParamsDollarResourceDollarLiasettingsDollarSetinventoryverificationcontact): GaxiosPromise[Schema$LiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(
    params: ParamsDollarResourceDollarLiasettingsDollarSetinventoryverificationcontact,
    callback: BodyResponseCallback[Schema$LiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  def setinventoryverificationcontact(
    params: ParamsDollarResourceDollarLiasettingsDollarSetinventoryverificationcontact,
    options: BodyResponseCallback[Schema$LiasettingsSetInventoryVerificationContactResponse],
    callback: BodyResponseCallback[Schema$LiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  def setinventoryverificationcontact(
    params: ParamsDollarResourceDollarLiasettingsDollarSetinventoryverificationcontact,
    options: MethodOptions
  ): GaxiosPromise[Schema$LiasettingsSetInventoryVerificationContactResponse] = js.native
  def setinventoryverificationcontact(
    params: ParamsDollarResourceDollarLiasettingsDollarSetinventoryverificationcontact,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsSetInventoryVerificationContactResponse]
  ): Unit = js.native
  /**
    * content.liasettings.setposdataprovider
    * @desc Sets the POS data provider for the specified country.
    * @alias content.liasettings.setposdataprovider
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to retrieve accessible Google My Business accounts.
    * @param {string} params.country The country for which the POS data provider is selected.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {string=} params.posDataProviderId The ID of POS data provider.
    * @param {string=} params.posExternalAccountId The account ID by which this merchant is known to the POS data provider.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setposdataprovider(): GaxiosPromise[Schema$LiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(callback: BodyResponseCallback[Schema$LiasettingsSetPosDataProviderResponse]): Unit = js.native
  def setposdataprovider(params: ParamsDollarResourceDollarLiasettingsDollarSetposdataprovider): GaxiosPromise[Schema$LiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(
    params: ParamsDollarResourceDollarLiasettingsDollarSetposdataprovider,
    callback: BodyResponseCallback[Schema$LiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  def setposdataprovider(
    params: ParamsDollarResourceDollarLiasettingsDollarSetposdataprovider,
    options: BodyResponseCallback[Schema$LiasettingsSetPosDataProviderResponse],
    callback: BodyResponseCallback[Schema$LiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  def setposdataprovider(params: ParamsDollarResourceDollarLiasettingsDollarSetposdataprovider, options: MethodOptions): GaxiosPromise[Schema$LiasettingsSetPosDataProviderResponse] = js.native
  def setposdataprovider(
    params: ParamsDollarResourceDollarLiasettingsDollarSetposdataprovider,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiasettingsSetPosDataProviderResponse]
  ): Unit = js.native
  /**
    * content.liasettings.update
    * @desc Updates the LIA settings of the account.
    * @alias content.liasettings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get or update LIA settings.
    * @param {boolean=} params.dryRun Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().LiaSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$LiaSettings] = js.native
  def update(callback: BodyResponseCallback[Schema$LiaSettings]): Unit = js.native
  def update(params: ParamsDollarResourceDollarLiasettingsDollarUpdate): GaxiosPromise[Schema$LiaSettings] = js.native
  def update(
    params: ParamsDollarResourceDollarLiasettingsDollarUpdate,
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarLiasettingsDollarUpdate,
    options: BodyResponseCallback[Schema$LiaSettings],
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarLiasettingsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$LiaSettings] = js.native
  def update(
    params: ParamsDollarResourceDollarLiasettingsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiaSettings]
  ): Unit = js.native
}

