package typings.googleapis.buildSrcApisCloudshellV1alpha1Mod.cloudshell_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudshell/v1alpha1", "cloudshell_v1alpha1.Resource$Users$Environments")
@js.native
class ResourceDollarUsersDollarEnvironments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var publicKeys: ResourceDollarUsersDollarEnvironmentsDollarPublickeys = js.native
  /**
    * cloudshell.users.environments.authorize
    * @desc Sends OAuth credentials to a running environment on behalf of a
    * user. When this completes, the environment will be authorized to run
    * various Google Cloud command line tools without requiring the user to
    * manually authenticate.
    * @alias cloudshell.users.environments.authorize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource that should receive the credentials, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {().AuthorizeEnvironmentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def authorize(): GaxiosPromise[Schema$Empty] = js.native
  def authorize(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def authorize(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarAuthorize): GaxiosPromise[Schema$Empty] = js.native
  def authorize(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarAuthorize,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def authorize(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarAuthorize,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def authorize(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarAuthorize, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def authorize(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarAuthorize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudshell.users.environments.get
    * @desc Gets an environment. Returns NOT_FOUND if the environment does not
    * exist.
    * @alias cloudshell.users.environments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the requested resource, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Environment] = js.native
  def get(callback: BodyResponseCallback[Schema$Environment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarGet): GaxiosPromise[Schema$Environment] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarGet,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarGet,
    options: BodyResponseCallback[Schema$Environment],
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Environment] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  /**
    * cloudshell.users.environments.patch
    * @desc Updates an existing environment.
    * @alias cloudshell.users.environments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource to be updated, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {string=} params.updateMask Mask specifying which fields in the environment should be updated.
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Environment] = js.native
  def patch(callback: BodyResponseCallback[Schema$Environment]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPatch): GaxiosPromise[Schema$Environment] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPatch,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPatch,
    options: BodyResponseCallback[Schema$Environment],
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Environment] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  /**
    * cloudshell.users.environments.start
    * @desc Starts an existing environment, allowing clients to connect to it.
    * The returned operation will contain an instance of
    * StartEnvironmentMetadata in its metadata field. Users can wait for the
    * environment to start by polling this operation via GetOperation. Once the
    * environment has finished starting and is ready to accept connections, the
    * operation will contain a StartEnvironmentResponse in its response field.
    * @alias cloudshell.users.environments.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the resource that should be started, for example `users/me/environments/default` or `users/someone@example.com/environments/default`.
    * @param {().StartEnvironmentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[Schema$Operation] = js.native
  def start(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def start(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarStart): GaxiosPromise[Schema$Operation] = js.native
  def start(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarStart,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def start(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarStart,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def start(params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarStart, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def start(
    params: ParamsDollarResourceDollarUsersDollarEnvironmentsDollarStart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

