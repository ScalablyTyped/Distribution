package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Environments")
@js.native
class ResourceDollarAccountsDollarContainersDollarEnvironments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.environments.create
    * @desc Creates a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Environment] = js.native
  def create(callback: BodyResponseCallback[Schema$Environment]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarCreate): GaxiosPromise[Schema$Environment] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarCreate,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarCreate,
    options: BodyResponseCallback[Schema$Environment],
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Environment] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.environments.delete
    * @desc Deletes a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.environments.get
    * @desc Gets a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Environment] = js.native
  def get(callback: BodyResponseCallback[Schema$Environment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarGet): GaxiosPromise[Schema$Environment] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarGet,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarGet,
    options: BodyResponseCallback[Schema$Environment],
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Environment] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.environments.list
    * @desc Lists all GTM Environments of a GTM Container.
    * @alias tagmanager.accounts.containers.environments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListEnvironmentsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListEnvironmentsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarList): GaxiosPromise[Schema$ListEnvironmentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarList,
    callback: BodyResponseCallback[Schema$ListEnvironmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarList,
    options: BodyResponseCallback[Schema$ListEnvironmentsResponse],
    callback: BodyResponseCallback[Schema$ListEnvironmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListEnvironmentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListEnvironmentsResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.environments.reauthorize
    * @desc Re-generates the authorization code for a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.reauthorize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reauthorize(): GaxiosPromise[Schema$Environment] = js.native
  def reauthorize(callback: BodyResponseCallback[Schema$Environment]): Unit = js.native
  def reauthorize(params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarReauthorize): GaxiosPromise[Schema$Environment] = js.native
  def reauthorize(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarReauthorize,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def reauthorize(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarReauthorize,
    options: BodyResponseCallback[Schema$Environment],
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def reauthorize(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarReauthorize,
    options: MethodOptions
  ): GaxiosPromise[Schema$Environment] = js.native
  def reauthorize(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarReauthorize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.environments.update
    * @desc Updates a GTM Environment.
    * @alias tagmanager.accounts.containers.environments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the environment in storage.
    * @param {string} params.path GTM Environment's API relative path. Example: accounts/{account_id}/containers/{container_id}/environments/{environment_id}
    * @param {().Environment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Environment] = js.native
  def update(callback: BodyResponseCallback[Schema$Environment]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarUpdate): GaxiosPromise[Schema$Environment] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarUpdate,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarUpdate,
    options: BodyResponseCallback[Schema$Environment],
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Environment] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarEnvironmentsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Environment]
  ): Unit = js.native
}

