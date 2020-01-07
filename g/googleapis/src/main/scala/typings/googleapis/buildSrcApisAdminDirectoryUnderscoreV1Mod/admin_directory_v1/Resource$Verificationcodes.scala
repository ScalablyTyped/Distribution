package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Verificationcodes")
@js.native
class Resource$Verificationcodes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.verificationCodes.generate
    * @desc Generate new backup verification codes for the user.
    * @alias directory.verificationCodes.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[Unit] = js.native
  def generate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def generate(params: ParamsDollarResourceDollarVerificationcodesDollarGenerate): GaxiosPromise[Unit] = js.native
  def generate(
    params: ParamsDollarResourceDollarVerificationcodesDollarGenerate,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def generate(
    params: ParamsDollarResourceDollarVerificationcodesDollarGenerate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def generate(params: ParamsDollarResourceDollarVerificationcodesDollarGenerate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def generate(
    params: ParamsDollarResourceDollarVerificationcodesDollarGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.verificationCodes.invalidate
    * @desc Invalidate the current backup verification codes for the user.
    * @alias directory.verificationCodes.invalidate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def invalidate(): GaxiosPromise[Unit] = js.native
  def invalidate(callback: BodyResponseCallback[Unit]): Unit = js.native
  def invalidate(params: ParamsDollarResourceDollarVerificationcodesDollarInvalidate): GaxiosPromise[Unit] = js.native
  def invalidate(
    params: ParamsDollarResourceDollarVerificationcodesDollarInvalidate,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def invalidate(
    params: ParamsDollarResourceDollarVerificationcodesDollarInvalidate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def invalidate(params: ParamsDollarResourceDollarVerificationcodesDollarInvalidate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def invalidate(
    params: ParamsDollarResourceDollarVerificationcodesDollarInvalidate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.verificationCodes.list
    * @desc Returns the current set of valid backup verification codes for the
    * specified user.
    * @alias directory.verificationCodes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$VerificationCodes] = js.native
  def list(callback: BodyResponseCallback[Schema$VerificationCodes]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVerificationcodesDollarList): GaxiosPromise[Schema$VerificationCodes] = js.native
  def list(
    params: ParamsDollarResourceDollarVerificationcodesDollarList,
    callback: BodyResponseCallback[Schema$VerificationCodes]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVerificationcodesDollarList,
    options: BodyResponseCallback[Schema$VerificationCodes],
    callback: BodyResponseCallback[Schema$VerificationCodes]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVerificationcodesDollarList, options: MethodOptions): GaxiosPromise[Schema$VerificationCodes] = js.native
  def list(
    params: ParamsDollarResourceDollarVerificationcodesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VerificationCodes]
  ): Unit = js.native
}

