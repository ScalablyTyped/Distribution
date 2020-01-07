package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Asps")
@js.native
class Resource$Asps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.asps.delete
    * @desc Delete an ASP issued by a user.
    * @alias directory.asps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.codeId The unique ID of the ASP to be deleted.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAspsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarAspsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAspsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAspsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAspsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.asps.get
    * @desc Get information about an ASP issued by a user.
    * @alias directory.asps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.codeId The unique ID of the ASP.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Asp] = js.native
  def get(callback: BodyResponseCallback[Schema$Asp]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAspsDollarGet): GaxiosPromise[Schema$Asp] = js.native
  def get(params: ParamsDollarResourceDollarAspsDollarGet, callback: BodyResponseCallback[Schema$Asp]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAspsDollarGet,
    options: BodyResponseCallback[Schema$Asp],
    callback: BodyResponseCallback[Schema$Asp]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAspsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Asp] = js.native
  def get(
    params: ParamsDollarResourceDollarAspsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Asp]
  ): Unit = js.native
  /**
    * directory.asps.list
    * @desc List the ASPs issued by a user.
    * @alias directory.asps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Asps] = js.native
  def list(callback: BodyResponseCallback[Schema$Asps]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAspsDollarList): GaxiosPromise[Schema$Asps] = js.native
  def list(params: ParamsDollarResourceDollarAspsDollarList, callback: BodyResponseCallback[Schema$Asps]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAspsDollarList,
    options: BodyResponseCallback[Schema$Asps],
    callback: BodyResponseCallback[Schema$Asps]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAspsDollarList, options: MethodOptions): GaxiosPromise[Schema$Asps] = js.native
  def list(
    params: ParamsDollarResourceDollarAspsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Asps]
  ): Unit = js.native
}

