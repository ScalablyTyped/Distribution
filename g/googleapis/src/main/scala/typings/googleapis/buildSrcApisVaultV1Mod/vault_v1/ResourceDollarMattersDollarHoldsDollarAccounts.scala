package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters$Holds$Accounts")
@js.native
class ResourceDollarMattersDollarHoldsDollarAccounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vault.matters.holds.accounts.create
    * @desc Adds a HeldAccount to a hold. Accounts can only be added to a hold
    * that has no held_org_unit set. Attempting to add an account to an
    * OU-based hold will result in an error.
    * @alias vault.matters.holds.accounts.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {().HeldAccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$HeldAccount] = js.native
  def create(callback: BodyResponseCallback[Schema$HeldAccount]): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarCreate): GaxiosPromise[Schema$HeldAccount] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarCreate,
    callback: BodyResponseCallback[Schema$HeldAccount]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarCreate,
    options: BodyResponseCallback[Schema$HeldAccount],
    callback: BodyResponseCallback[Schema$HeldAccount]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$HeldAccount] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$HeldAccount]
  ): Unit = js.native
  /**
    * vault.matters.holds.accounts.delete
    * @desc Removes a HeldAccount from a hold. If this request leaves the hold
    * with no held accounts, the hold will not apply to any accounts.
    * @alias vault.matters.holds.accounts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account to remove from the hold.
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * vault.matters.holds.accounts.list
    * @desc Lists HeldAccounts for a hold. This will only list individually
    * specified held accounts. If the hold is on an OU, then use <a
    * href="https://developers.google.com/admin-sdk/">Admin SDK</a> to
    * enumerate its members.
    * @alias vault.matters.holds.accounts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.holdId The hold ID.
    * @param {string} params.matterId The matter ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListHeldAccountsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListHeldAccountsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarList): GaxiosPromise[Schema$ListHeldAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarList,
    callback: BodyResponseCallback[Schema$ListHeldAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarList,
    options: BodyResponseCallback[Schema$ListHeldAccountsResponse],
    callback: BodyResponseCallback[Schema$ListHeldAccountsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListHeldAccountsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarHoldsDollarAccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListHeldAccountsResponse]
  ): Unit = js.native
}

