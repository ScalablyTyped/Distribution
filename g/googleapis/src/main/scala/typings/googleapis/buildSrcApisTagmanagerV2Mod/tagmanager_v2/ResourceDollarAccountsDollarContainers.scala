package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers")
@js.native
class ResourceDollarAccountsDollarContainers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var environments: ResourceDollarAccountsDollarContainersDollarEnvironments = js.native
  var version_headers: ResourceDollarAccountsDollarContainersDollarVersion_headers = js.native
  var versions: ResourceDollarAccountsDollarContainersDollarVersions = js.native
  var workspaces: ResourceDollarAccountsDollarContainersDollarWorkspaces = js.native
  /**
    * tagmanager.accounts.containers.create
    * @desc Creates a Container.
    * @alias tagmanager.accounts.containers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Account's API relative path. Example: accounts/{account_id}.
    * @param {().Container} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Container] = js.native
  def create(callback: BodyResponseCallback[Schema$Container]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarCreate): GaxiosPromise[Schema$Container] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarCreate,
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarCreate,
    options: BodyResponseCallback[Schema$Container],
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Container] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.delete
    * @desc Deletes a Container.
    * @alias tagmanager.accounts.containers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.get
    * @desc Gets a Container.
    * @alias tagmanager.accounts.containers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Container] = js.native
  def get(callback: BodyResponseCallback[Schema$Container]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarGet): GaxiosPromise[Schema$Container] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarGet,
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarGet,
    options: BodyResponseCallback[Schema$Container],
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Container] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.list
    * @desc Lists all Containers that belongs to a GTM Account.
    * @alias tagmanager.accounts.containers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Accounts's API relative path. Example: accounts/{account_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListContainersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListContainersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarList): GaxiosPromise[Schema$ListContainersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarList,
    callback: BodyResponseCallback[Schema$ListContainersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarList,
    options: BodyResponseCallback[Schema$ListContainersResponse],
    callback: BodyResponseCallback[Schema$ListContainersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarList, options: MethodOptions): GaxiosPromise[Schema$ListContainersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListContainersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.update
    * @desc Updates a Container.
    * @alias tagmanager.accounts.containers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the container in storage.
    * @param {string} params.path GTM Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {().Container} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Container] = js.native
  def update(callback: BodyResponseCallback[Schema$Container]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarUpdate): GaxiosPromise[Schema$Container] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarUpdate,
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarUpdate,
    options: BodyResponseCallback[Schema$Container],
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Container] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Container]
  ): Unit = js.native
}

