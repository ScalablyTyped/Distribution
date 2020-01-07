package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot2Mod.adexchangebuyer_v1_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.2", "adexchangebuyer_v1_2.Resource$Accounts")
@js.native
class Resource$Accounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.accounts.get
    * @desc Gets one account by ID.
    * @alias adexchangebuyer.accounts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id The account id
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
    * adexchangebuyer.accounts.list
    * @desc Retrieves the authenticated user's list of accounts.
    * @alias adexchangebuyer.accounts.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccountsList] = js.native
  def list(callback: BodyResponseCallback[Schema$AccountsList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList): GaxiosPromise[Schema$AccountsList] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    callback: BodyResponseCallback[Schema$AccountsList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: BodyResponseCallback[Schema$AccountsList],
    callback: BodyResponseCallback[Schema$AccountsList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarList, options: MethodOptions): GaxiosPromise[Schema$AccountsList] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountsList]
  ): Unit = js.native
  /**
    * adexchangebuyer.accounts.patch
    * @desc Updates an existing account. This method supports patch semantics.
    * @alias adexchangebuyer.accounts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id The account id
    * @param {().Account} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Account] = js.native
  def patch(callback: BodyResponseCallback[Schema$Account]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountsDollarPatch): GaxiosPromise[Schema$Account] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarPatch,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarPatch,
    options: BodyResponseCallback[Schema$Account],
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Account] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Account]
  ): Unit = js.native
  /**
    * adexchangebuyer.accounts.update
    * @desc Updates an existing account.
    * @alias adexchangebuyer.accounts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id The account id
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

