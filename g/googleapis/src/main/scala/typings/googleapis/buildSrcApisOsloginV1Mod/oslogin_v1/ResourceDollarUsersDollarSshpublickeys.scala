package typings.googleapis.buildSrcApisOsloginV1Mod.oslogin_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/oslogin/v1", "oslogin_v1.Resource$Users$Sshpublickeys")
@js.native
class ResourceDollarUsersDollarSshpublickeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * oslogin.users.sshPublicKeys.delete
    * @desc Deletes an SSH public key.
    * @alias oslogin.users.sshPublicKeys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * oslogin.users.sshPublicKeys.get
    * @desc Retrieves an SSH public key.
    * @alias oslogin.users.sshPublicKeys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The fingerprint of the public key to retrieve. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SshPublicKey] = js.native
  def get(callback: BodyResponseCallback[Schema$SshPublicKey]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarGet): GaxiosPromise[Schema$SshPublicKey] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarGet,
    callback: BodyResponseCallback[Schema$SshPublicKey]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarGet,
    options: BodyResponseCallback[Schema$SshPublicKey],
    callback: BodyResponseCallback[Schema$SshPublicKey]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarGet, options: MethodOptions): GaxiosPromise[Schema$SshPublicKey] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SshPublicKey]
  ): Unit = js.native
  /**
    * oslogin.users.sshPublicKeys.patch
    * @desc Updates an SSH public key and returns the profile information. This
    * method supports patch semantics.
    * @alias oslogin.users.sshPublicKeys.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The fingerprint of the public key to update. Public keys are identified by their SHA-256 fingerprint. The fingerprint of the public key is in format `users/{user}/sshPublicKeys/{fingerprint}`.
    * @param {string=} params.updateMask Mask to control which fields get updated. Updates all if not present.
    * @param {().SshPublicKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$SshPublicKey] = js.native
  def patch(callback: BodyResponseCallback[Schema$SshPublicKey]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarPatch): GaxiosPromise[Schema$SshPublicKey] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarPatch,
    callback: BodyResponseCallback[Schema$SshPublicKey]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarPatch,
    options: BodyResponseCallback[Schema$SshPublicKey],
    callback: BodyResponseCallback[Schema$SshPublicKey]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarPatch, options: MethodOptions): GaxiosPromise[Schema$SshPublicKey] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarSshpublickeysDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SshPublicKey]
  ): Unit = js.native
}

