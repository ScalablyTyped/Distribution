package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Holds")
@js.native
class ResourceDollarMattersDollarHolds protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var accounts: ResourceDollarMattersDollarHoldsDollarAccounts = js.native
  var context: APIRequestContext = js.native
  /**
    * vault.matters.holds.addHeldAccounts
    * @desc Adds HeldAccounts to a hold. Returns a list of accounts that have
    * been successfully added. Accounts can only be added to an existing
    * account-based hold.
    * @alias vault.matters.holds.addHeldAccounts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {().AddHeldAccountsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addHeldAccounts(): GaxiosPromise[Schema$AddHeldAccountsResponse] = js.native
  def addHeldAccounts(callback: BodyResponseCallback[Schema$AddHeldAccountsResponse]): Unit = js.native
  def addHeldAccounts(params: ParamsDollarResourceDollarMattersDollarHoldsDollarAddheldaccounts): GaxiosPromise[Schema$AddHeldAccountsResponse] = js.native
  def addHeldAccounts(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAddheldaccounts,
    callback: BodyResponseCallback[Schema$AddHeldAccountsResponse]
  ): Unit = js.native
  def addHeldAccounts(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAddheldaccounts,
    options: BodyResponseCallback[Schema$AddHeldAccountsResponse],
    callback: BodyResponseCallback[Schema$AddHeldAccountsResponse]
  ): Unit = js.native
  def addHeldAccounts(params: ParamsDollarResourceDollarMattersDollarHoldsDollarAddheldaccounts, options: MethodOptions): GaxiosPromise[Schema$AddHeldAccountsResponse] = js.native
  def addHeldAccounts(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAddheldaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AddHeldAccountsResponse]
  ): Unit = js.native
  /**
    * vault.matters.holds.create
    * @desc Creates a hold in the given matter.
    * @alias vault.matters.holds.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().Hold} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Hold] = js.native
  def create(callback: BodyResponseCallback[Schema$Hold]): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarHoldsDollarCreate): GaxiosPromise[Schema$Hold] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarCreate,
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarCreate,
    options: BodyResponseCallback[Schema$Hold],
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarHoldsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Hold] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  /**
    * vault.matters.holds.delete
    * @desc Removes a hold by ID. This will release any HeldAccounts on this
    * Hold.
    * @alias vault.matters.holds.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarHoldsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarHoldsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * vault.matters.holds.get
    * @desc Gets a hold by ID.
    * @alias vault.matters.holds.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {string=} params.view Specifies which parts of the Hold to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Hold] = js.native
  def get(callback: BodyResponseCallback[Schema$Hold]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarHoldsDollarGet): GaxiosPromise[Schema$Hold] = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarGet,
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarGet,
    options: BodyResponseCallback[Schema$Hold],
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarHoldsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Hold] = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  /**
    * vault.matters.holds.list
    * @desc Lists holds within a matter. An empty page token in
    * ListHoldsResponse denotes no more holds to list.
    * @alias vault.matters.holds.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {integer=} params.pageSize The number of holds to return in the response, between 0 and 100 inclusive. Leaving this empty, or as 0, is the same as page_size = 100.
    * @param {string=} params.pageToken The pagination token as returned in the response. An empty token means start from the beginning.
    * @param {string=} params.view Specifies which parts of the Hold to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListHoldsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListHoldsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarHoldsDollarList): GaxiosPromise[Schema$ListHoldsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarList,
    callback: BodyResponseCallback[Schema$ListHoldsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarList,
    options: BodyResponseCallback[Schema$ListHoldsResponse],
    callback: BodyResponseCallback[Schema$ListHoldsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarHoldsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListHoldsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListHoldsResponse]
  ): Unit = js.native
  /**
    * vault.matters.holds.removeHeldAccounts
    * @desc Removes HeldAccounts from a hold. Returns a list of statuses in the
    * same order as the request. If this request leaves the hold with no held
    * accounts, the hold will not apply to any accounts.
    * @alias vault.matters.holds.removeHeldAccounts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {().RemoveHeldAccountsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeHeldAccounts(): GaxiosPromise[Schema$RemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(callback: BodyResponseCallback[Schema$RemoveHeldAccountsResponse]): Unit = js.native
  def removeHeldAccounts(params: ParamsDollarResourceDollarMattersDollarHoldsDollarRemoveheldaccounts): GaxiosPromise[Schema$RemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarRemoveheldaccounts,
    callback: BodyResponseCallback[Schema$RemoveHeldAccountsResponse]
  ): Unit = js.native
  def removeHeldAccounts(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarRemoveheldaccounts,
    options: BodyResponseCallback[Schema$RemoveHeldAccountsResponse],
    callback: BodyResponseCallback[Schema$RemoveHeldAccountsResponse]
  ): Unit = js.native
  def removeHeldAccounts(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarRemoveheldaccounts,
    options: MethodOptions
  ): GaxiosPromise[Schema$RemoveHeldAccountsResponse] = js.native
  def removeHeldAccounts(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarRemoveheldaccounts,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RemoveHeldAccountsResponse]
  ): Unit = js.native
  /**
    * vault.matters.holds.update
    * @desc Updates the OU and/or query parameters of a hold. You cannot add
    * accounts to a hold that covers an OU, nor can you add OUs to a hold that
    * covers individual accounts. Accounts listed in the hold will be ignored.
    * @alias vault.matters.holds.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The ID of the hold.
    * @param {string} params.matterId The matter ID.
    * @param {().Hold} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Hold] = js.native
  def update(callback: BodyResponseCallback[Schema$Hold]): Unit = js.native
  def update(params: ParamsDollarResourceDollarMattersDollarHoldsDollarUpdate): GaxiosPromise[Schema$Hold] = js.native
  def update(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarUpdate,
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarUpdate,
    options: BodyResponseCallback[Schema$Hold],
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarMattersDollarHoldsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Hold] = js.native
  def update(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Hold]
  ): Unit = js.native
}

