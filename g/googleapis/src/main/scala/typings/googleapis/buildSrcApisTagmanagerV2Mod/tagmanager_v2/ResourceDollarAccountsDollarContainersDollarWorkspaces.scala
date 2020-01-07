package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces")
@js.native
class ResourceDollarAccountsDollarContainersDollarWorkspaces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var built_in_variables: ResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variables = js.native
  var context: APIRequestContext = js.native
  var folders: ResourceDollarAccountsDollarContainersDollarWorkspacesDollarFolders = js.native
  var tags: ResourceDollarAccountsDollarContainersDollarWorkspacesDollarTags = js.native
  var triggers: ResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggers = js.native
  var variables: ResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariables = js.native
  var zones: ResourceDollarAccountsDollarContainersDollarWorkspacesDollarZones = js.native
  /**
    * tagmanager.accounts.containers.workspaces.create
    * @desc Creates a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM parent Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {().Workspace} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Workspace] = js.native
  def create(callback: BodyResponseCallback[Schema$Workspace]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate): GaxiosPromise[Schema$Workspace] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate,
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate,
    options: BodyResponseCallback[Schema$Workspace],
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Workspace] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.create_version
    * @desc Creates a Container Version from the entities present in the
    * workspace, deletes the workspace, and sets the base container version to
    * the newly created version.
    * @alias tagmanager.accounts.containers.workspaces.create_version
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().CreateContainerVersionRequestVersionOptions} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create_version(): GaxiosPromise[Schema$CreateContainerVersionResponse] = js.native
  def create_version(callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]): Unit = js.native
  def create_version(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate_version): GaxiosPromise[Schema$CreateContainerVersionResponse] = js.native
  def create_version(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate_version,
    callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]
  ): Unit = js.native
  def create_version(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate_version,
    options: BodyResponseCallback[Schema$CreateContainerVersionResponse],
    callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]
  ): Unit = js.native
  def create_version(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate_version,
    options: MethodOptions
  ): GaxiosPromise[Schema$CreateContainerVersionResponse] = js.native
  def create_version(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarCreate_version,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreateContainerVersionResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.delete
    * @desc Deletes a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.get
    * @desc Gets a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Workspace] = js.native
  def get(callback: BodyResponseCallback[Schema$Workspace]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGet): GaxiosPromise[Schema$Workspace] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGet,
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGet,
    options: BodyResponseCallback[Schema$Workspace],
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Workspace] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.getStatus
    * @desc Finds conflicting and modified entities in the workspace.
    * @alias tagmanager.accounts.containers.workspaces.getStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getStatus(): GaxiosPromise[Schema$GetWorkspaceStatusResponse] = js.native
  def getStatus(callback: BodyResponseCallback[Schema$GetWorkspaceStatusResponse]): Unit = js.native
  def getStatus(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGetstatus): GaxiosPromise[Schema$GetWorkspaceStatusResponse] = js.native
  def getStatus(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGetstatus,
    callback: BodyResponseCallback[Schema$GetWorkspaceStatusResponse]
  ): Unit = js.native
  def getStatus(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGetstatus,
    options: BodyResponseCallback[Schema$GetWorkspaceStatusResponse],
    callback: BodyResponseCallback[Schema$GetWorkspaceStatusResponse]
  ): Unit = js.native
  def getStatus(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGetstatus,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetWorkspaceStatusResponse] = js.native
  def getStatus(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarGetstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetWorkspaceStatusResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.list
    * @desc Lists all Workspaces that belong to a GTM Container.
    * @alias tagmanager.accounts.containers.workspaces.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM parent Container's API relative path. Example: accounts/{account_id}/containers/{container_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListWorkspacesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListWorkspacesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarList): GaxiosPromise[Schema$ListWorkspacesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarList,
    callback: BodyResponseCallback[Schema$ListWorkspacesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarList,
    options: BodyResponseCallback[Schema$ListWorkspacesResponse],
    callback: BodyResponseCallback[Schema$ListWorkspacesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListWorkspacesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListWorkspacesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.quick_preview
    * @desc Quick previews a workspace by creating a fake container version
    * from all entities in the provided workspace.
    * @alias tagmanager.accounts.containers.workspaces.quick_preview
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def quick_preview(): GaxiosPromise[Schema$QuickPreviewResponse] = js.native
  def quick_preview(callback: BodyResponseCallback[Schema$QuickPreviewResponse]): Unit = js.native
  def quick_preview(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarQuick_preview): GaxiosPromise[Schema$QuickPreviewResponse] = js.native
  def quick_preview(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarQuick_preview,
    callback: BodyResponseCallback[Schema$QuickPreviewResponse]
  ): Unit = js.native
  def quick_preview(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarQuick_preview,
    options: BodyResponseCallback[Schema$QuickPreviewResponse],
    callback: BodyResponseCallback[Schema$QuickPreviewResponse]
  ): Unit = js.native
  def quick_preview(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarQuick_preview,
    options: MethodOptions
  ): GaxiosPromise[Schema$QuickPreviewResponse] = js.native
  def quick_preview(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarQuick_preview,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$QuickPreviewResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.resolve_conflict
    * @desc Resolves a merge conflict for a workspace entity by updating it to
    * the resolved entity passed in the request.
    * @alias tagmanager.accounts.containers.workspaces.resolve_conflict
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the entity_in_workspace in the merge conflict.
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Entity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resolve_conflict(): GaxiosPromise[Unit] = js.native
  def resolve_conflict(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resolve_conflict(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarResolve_conflict): GaxiosPromise[Unit] = js.native
  def resolve_conflict(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarResolve_conflict,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resolve_conflict(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarResolve_conflict,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resolve_conflict(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarResolve_conflict,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def resolve_conflict(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarResolve_conflict,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.sync
    * @desc Syncs a workspace to the latest container version by updating all
    * unmodified workspace entities and displaying conflicts for modified
    * entities.
    * @alias tagmanager.accounts.containers.workspaces.sync
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sync(): GaxiosPromise[Schema$SyncWorkspaceResponse] = js.native
  def sync(callback: BodyResponseCallback[Schema$SyncWorkspaceResponse]): Unit = js.native
  def sync(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarSync): GaxiosPromise[Schema$SyncWorkspaceResponse] = js.native
  def sync(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarSync,
    callback: BodyResponseCallback[Schema$SyncWorkspaceResponse]
  ): Unit = js.native
  def sync(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarSync,
    options: BodyResponseCallback[Schema$SyncWorkspaceResponse],
    callback: BodyResponseCallback[Schema$SyncWorkspaceResponse]
  ): Unit = js.native
  def sync(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarSync,
    options: MethodOptions
  ): GaxiosPromise[Schema$SyncWorkspaceResponse] = js.native
  def sync(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarSync,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SyncWorkspaceResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.update
    * @desc Updates a Workspace.
    * @alias tagmanager.accounts.containers.workspaces.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the workspace in storage.
    * @param {string} params.path GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Workspace} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Workspace] = js.native
  def update(callback: BodyResponseCallback[Schema$Workspace]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarUpdate): GaxiosPromise[Schema$Workspace] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarUpdate,
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarUpdate,
    options: BodyResponseCallback[Schema$Workspace],
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Workspace] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Workspace]
  ): Unit = js.native
}

