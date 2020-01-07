package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Tags")
@js.native
class ResourceDollarAccountsDollarContainersDollarWorkspacesDollarTags protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.tags.create
    * @desc Creates a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Tag] = js.native
  def create(callback: BodyResponseCallback[Schema$Tag]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarCreate): GaxiosPromise[Schema$Tag] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarCreate,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarCreate,
    options: BodyResponseCallback[Schema$Tag],
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Tag] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.tags.delete
    * @desc Deletes a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.tags.get
    * @desc Gets a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Tag] = js.native
  def get(callback: BodyResponseCallback[Schema$Tag]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarGet): GaxiosPromise[Schema$Tag] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarGet,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarGet,
    options: BodyResponseCallback[Schema$Tag],
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Tag] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.tags.list
    * @desc Lists all GTM Tags of a Container.
    * @alias tagmanager.accounts.containers.workspaces.tags.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTagsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarList): GaxiosPromise[Schema$ListTagsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarList,
    callback: BodyResponseCallback[Schema$ListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarList,
    options: BodyResponseCallback[Schema$ListTagsResponse],
    callback: BodyResponseCallback[Schema$ListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTagsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTagsResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.tags.revert
    * @desc Reverts changes to a GTM Tag in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.tags.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of thetag in storage.
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[Schema$RevertTagResponse] = js.native
  def revert(callback: BodyResponseCallback[Schema$RevertTagResponse]): Unit = js.native
  def revert(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarRevert): GaxiosPromise[Schema$RevertTagResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarRevert,
    callback: BodyResponseCallback[Schema$RevertTagResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarRevert,
    options: BodyResponseCallback[Schema$RevertTagResponse],
    callback: BodyResponseCallback[Schema$RevertTagResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarRevert,
    options: MethodOptions
  ): GaxiosPromise[Schema$RevertTagResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevertTagResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.tags.update
    * @desc Updates a GTM Tag.
    * @alias tagmanager.accounts.containers.workspaces.tags.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the tag in storage.
    * @param {string} params.path GTM Tag's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/tags/{tag_id}
    * @param {().Tag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Tag] = js.native
  def update(callback: BodyResponseCallback[Schema$Tag]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarUpdate): GaxiosPromise[Schema$Tag] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarUpdate,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarUpdate,
    options: BodyResponseCallback[Schema$Tag],
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Tag] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTagsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Tag]
  ): Unit = js.native
}

