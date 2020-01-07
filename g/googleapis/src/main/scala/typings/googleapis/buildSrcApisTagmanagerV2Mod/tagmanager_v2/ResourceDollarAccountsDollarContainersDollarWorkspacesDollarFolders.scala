package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Folders")
@js.native
class ResourceDollarAccountsDollarContainersDollarWorkspacesDollarFolders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.create
    * @desc Creates a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Folder] = js.native
  def create(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarCreate
  ): GaxiosPromise[Schema$Folder] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarCreate,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarCreate,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Folder] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.delete
    * @desc Deletes a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarDelete
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.entities
    * @desc List all entities in a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.entities
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def entities(): GaxiosPromise[Schema$FolderEntities] = js.native
  def entities(callback: BodyResponseCallback[Schema$FolderEntities]): Unit = js.native
  def entities(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarEntities
  ): GaxiosPromise[Schema$FolderEntities] = js.native
  def entities(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarEntities,
    callback: BodyResponseCallback[Schema$FolderEntities]
  ): Unit = js.native
  def entities(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarEntities,
    options: BodyResponseCallback[Schema$FolderEntities],
    callback: BodyResponseCallback[Schema$FolderEntities]
  ): Unit = js.native
  def entities(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarEntities,
    options: MethodOptions
  ): GaxiosPromise[Schema$FolderEntities] = js.native
  def entities(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarEntities,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FolderEntities]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.get
    * @desc Gets a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Folder] = js.native
  def get(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarGet): GaxiosPromise[Schema$Folder] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarGet,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarGet,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Folder] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.list
    * @desc Lists all GTM Folders of a Container.
    * @alias tagmanager.accounts.containers.workspaces.folders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFoldersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarList): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarList,
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarList,
    options: BodyResponseCallback[Schema$ListFoldersResponse],
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.move_entities_to_folder
    * @desc Moves entities to a GTM Folder.
    * @alias
    * tagmanager.accounts.containers.workspaces.folders.move_entities_to_folder
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {string=} params.tagId The tags to be moved to the folder.
    * @param {string=} params.triggerId The triggers to be moved to the folder.
    * @param {string=} params.variableId The variables to be moved to the folder.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def move_entities_to_folder(): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(callback: BodyResponseCallback[Unit]): Unit = js.native
  def move_entities_to_folder(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder
  ): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def move_entities_to_folder(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def move_entities_to_folder(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def move_entities_to_folder(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarMove_entities_to_folder,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.revert
    * @desc Reverts changes to a GTM Folder in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.folders.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the tag in storage.
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[Schema$RevertFolderResponse] = js.native
  def revert(callback: BodyResponseCallback[Schema$RevertFolderResponse]): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarRevert
  ): GaxiosPromise[Schema$RevertFolderResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarRevert,
    callback: BodyResponseCallback[Schema$RevertFolderResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarRevert,
    options: BodyResponseCallback[Schema$RevertFolderResponse],
    callback: BodyResponseCallback[Schema$RevertFolderResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarRevert,
    options: MethodOptions
  ): GaxiosPromise[Schema$RevertFolderResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevertFolderResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.folders.update
    * @desc Updates a GTM Folder.
    * @alias tagmanager.accounts.containers.workspaces.folders.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the folder in storage.
    * @param {string} params.path GTM Folder's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Folder] = js.native
  def update(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarUpdate
  ): GaxiosPromise[Schema$Folder] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarUpdate,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarUpdate,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Folder] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarFoldersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
}

