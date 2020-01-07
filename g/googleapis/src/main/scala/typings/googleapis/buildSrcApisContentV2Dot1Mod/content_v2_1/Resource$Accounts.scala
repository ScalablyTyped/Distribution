package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounts")
@js.native
class Resource$Accounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.accounts.authinfo
    * @desc Returns information about the authenticated user.
    * @alias content.accounts.authinfo
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def authinfo(): GaxiosPromise[Schema$AccountsAuthInfoResponse] = js.native
  def authinfo(callback: BodyResponseCallback[Schema$AccountsAuthInfoResponse]): Unit = js.native
  def authinfo(params: ParamsDollarResourceDollarAccountsDollarAuthinfo): GaxiosPromise[Schema$AccountsAuthInfoResponse] = js.native
  def authinfo(
    params: ParamsDollarResourceDollarAccountsDollarAuthinfo,
    callback: BodyResponseCallback[Schema$AccountsAuthInfoResponse]
  ): Unit = js.native
  def authinfo(
    params: ParamsDollarResourceDollarAccountsDollarAuthinfo,
    options: BodyResponseCallback[Schema$AccountsAuthInfoResponse],
    callback: BodyResponseCallback[Schema$AccountsAuthInfoResponse]
  ): Unit = js.native
  def authinfo(params: ParamsDollarResourceDollarAccountsDollarAuthinfo, options: MethodOptions): GaxiosPromise[Schema$AccountsAuthInfoResponse] = js.native
  def authinfo(
    params: ParamsDollarResourceDollarAccountsDollarAuthinfo,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountsAuthInfoResponse]
  ): Unit = js.native
  /**
    * content.accounts.claimwebsite
    * @desc Claims the website of a Merchant Center sub-account.
    * @alias content.accounts.claimwebsite
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account whose website is claimed.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {boolean=} params.overwrite Only available to selected merchants. When set to True, this flag removes any existing claim on the requested website by another account and replaces it with a claim from this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def claimwebsite(): GaxiosPromise[Schema$AccountsClaimWebsiteResponse] = js.native
  def claimwebsite(callback: BodyResponseCallback[Schema$AccountsClaimWebsiteResponse]): Unit = js.native
  def claimwebsite(params: ParamsDollarResourceDollarAccountsDollarClaimwebsite): GaxiosPromise[Schema$AccountsClaimWebsiteResponse] = js.native
  def claimwebsite(
    params: ParamsDollarResourceDollarAccountsDollarClaimwebsite,
    callback: BodyResponseCallback[Schema$AccountsClaimWebsiteResponse]
  ): Unit = js.native
  def claimwebsite(
    params: ParamsDollarResourceDollarAccountsDollarClaimwebsite,
    options: BodyResponseCallback[Schema$AccountsClaimWebsiteResponse],
    callback: BodyResponseCallback[Schema$AccountsClaimWebsiteResponse]
  ): Unit = js.native
  def claimwebsite(params: ParamsDollarResourceDollarAccountsDollarClaimwebsite, options: MethodOptions): GaxiosPromise[Schema$AccountsClaimWebsiteResponse] = js.native
  def claimwebsite(
    params: ParamsDollarResourceDollarAccountsDollarClaimwebsite,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountsClaimWebsiteResponse]
  ): Unit = js.native
  /**
    * content.accounts.custombatch
    * @desc Retrieves, inserts, updates, and deletes multiple Merchant Center
    * (sub-)accounts in a single request.
    * @alias content.accounts.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccountsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$AccountsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$AccountsCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarAccountsDollarCustombatch): GaxiosPromise[Schema$AccountsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccountsDollarCustombatch,
    callback: BodyResponseCallback[Schema$AccountsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccountsDollarCustombatch,
    options: BodyResponseCallback[Schema$AccountsCustomBatchResponse],
    callback: BodyResponseCallback[Schema$AccountsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarAccountsDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$AccountsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccountsDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountsCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.accounts.delete
    * @desc Deletes a Merchant Center sub-account.
    * @alias content.accounts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {boolean=} params.force Flag to delete sub-accounts with products. The default value is false.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account, and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * content.accounts.get
    * @desc Retrieves a Merchant Center account.
    * @alias content.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Account] = js.native
  def get(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarGet): GaxiosPromise[Schema$Account] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  /**
    * content.accounts.insert
    * @desc Creates a Merchant Center sub-account.
    * @alias content.accounts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Account] = js.native
  def insert(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAccountsDollarInsert): GaxiosPromise[Schema$Account] = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountsDollarInsert,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountsDollarInsert,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAccountsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  /**
    * content.accounts.link
    * @desc Performs an action on a link between a Merchant Center account and
    * another account.
    * @alias content.accounts.link
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account that should be linked.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().AccountsLinkRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def link(): GaxiosPromise[Schema$AccountsLinkResponse] = js.native
  def link(callback: BodyResponseCallback[Schema$AccountsLinkResponse]): Unit = js.native
  def link(params: ParamsDollarResourceDollarAccountsDollarLink): GaxiosPromise[Schema$AccountsLinkResponse] = js.native
  def link(
    params: ParamsDollarResourceDollarAccountsDollarLink,
    callback: BodyResponseCallback[Schema$AccountsLinkResponse]
  ): Unit = js.native
  def link(
    params: ParamsDollarResourceDollarAccountsDollarLink,
    options: BodyResponseCallback[Schema$AccountsLinkResponse],
    callback: BodyResponseCallback[Schema$AccountsLinkResponse]
  ): Unit = js.native
  def link(params: ParamsDollarResourceDollarAccountsDollarLink, options: MethodOptions): GaxiosPromise[Schema$AccountsLinkResponse] = js.native
  def link(
    params: ParamsDollarResourceDollarAccountsDollarLink,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountsLinkResponse]
  ): Unit = js.native
  /**
    * content.accounts.list
    * @desc Lists the sub-accounts in your Merchant Center account.
    * @alias content.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of accounts to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccountsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AccountsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList): GaxiosPromise[Schema$AccountsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    callback: BodyResponseCallback[Schema$AccountsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: BodyResponseCallback[Schema$AccountsListResponse],
    callback: BodyResponseCallback[Schema$AccountsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$AccountsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountsListResponse]
  ): Unit = js.native
  /**
    * content.accounts.update
    * @desc Updates a Merchant Center account.
    * @alias content.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Account] = js.native
  def update(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarUpdate): GaxiosPromise[Schema$Account] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUpdate,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUpdate,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
}

