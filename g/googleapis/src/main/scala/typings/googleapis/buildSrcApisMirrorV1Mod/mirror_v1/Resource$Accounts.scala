package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Accounts")
@js.native
class Resource$Accounts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.accounts.insert
    * @desc Inserts a new account for a user
    * @alias mirror.accounts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountName The name of the account to be passed to the Android Account Manager.
    * @param {string} params.accountType Account type to be passed to Android Account Manager.
    * @param {string} params.userToken The ID for the user.
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
}

