package typings.googleapis.buildSrcApisCloudshellV1alpha1Mod.cloudshell_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudshell/v1alpha1", "cloudshell_v1alpha1.Resource$Users$Environments$Publickeys")
@js.native
class ResourceDollarUsersDollarEnvironmentsDollarPublickeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudshell.users.environments.publicKeys.create
    * @desc Adds a public SSH key to an environment, allowing clients with the
    * corresponding private key to connect to that environment via SSH. If a
    * key with the same format and content already exists, this will return the
    * existing key.
    * @alias cloudshell.users.environments.publicKeys.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Parent resource name, e.g. `users/me/environments/default`.
    * @param {().CreatePublicKeyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$PublicKey] = js.native
  def create(callback: BodyResponseCallback[Schema$PublicKey]): Unit = js.native
  def create(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarCreate): GaxiosPromise[Schema$PublicKey] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarCreate,
    callback: BodyResponseCallback[Schema$PublicKey]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarCreate,
    options: BodyResponseCallback[Schema$PublicKey],
    callback: BodyResponseCallback[Schema$PublicKey]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$PublicKey] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PublicKey]
  ): Unit = js.native
  /**
    * cloudshell.users.environments.publicKeys.delete
    * @desc Removes a public SSH key from an environment. Clients will no
    * longer be able to connect to the environment using the corresponding
    * private key.
    * @alias cloudshell.users.environments.publicKeys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource to be deleted, e.g. `users/me/environments/default/publicKeys/my-key`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPublickeysDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

