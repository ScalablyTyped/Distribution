package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Folders")
@js.native
class ResourceDollarAccountsDollarContainersDollarFolders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var entities: ResourceDollarAccountsDollarContainersDollarFoldersDollarEntities = js.native
  /**
    * tagmanager.accounts.containers.folders.create
    * @desc Creates a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Folder] = js.native
  def create(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarCreate): GaxiosPromise[Schema$Folder] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarCreate,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarCreate,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Folder] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.folders.delete
    * @desc Deletes a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.folderId The GTM Folder ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.folders.get
    * @desc Gets a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string} params.folderId The GTM Folder ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Folder] = js.native
  def get(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarGet): GaxiosPromise[Schema$Folder] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarGet,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarGet,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Folder] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.folders.list
    * @desc Lists all GTM Folders of a Container.
    * @alias tagmanager.accounts.containers.folders.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFoldersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarList): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarList,
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarList,
    options: BodyResponseCallback[Schema$ListFoldersResponse],
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFoldersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFoldersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.folders.update
    * @desc Updates a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.containerId The GTM Container ID.
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the folder in storage.
    * @param {string} params.folderId The GTM Folder ID.
    * @param {().Folder} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Folder] = js.native
  def update(callback: BodyResponseCallback[Schema$Folder]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarUpdate): GaxiosPromise[Schema$Folder] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarUpdate,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarUpdate,
    options: BodyResponseCallback[Schema$Folder],
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Folder] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Folder]
  ): Unit = js.native
}

