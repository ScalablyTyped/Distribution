package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Folders$Entities")
@js.native
class ResourceDollarAccountsDollarContainersDollarFoldersDollarEntities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.folders.entities.list
    * @desc List all entities in a GTM Folder.
    * @alias tagmanager.accounts.containers.folders.entities.list
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
  def list(): GaxiosPromise[Schema$FolderEntities] = js.native
  def list(callback: BodyResponseCallback[Schema$FolderEntities]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarEntitiesDollarList): GaxiosPromise[Schema$FolderEntities] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarEntitiesDollarList,
    callback: BodyResponseCallback[Schema$FolderEntities]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarEntitiesDollarList,
    options: BodyResponseCallback[Schema$FolderEntities],
    callback: BodyResponseCallback[Schema$FolderEntities]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarEntitiesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$FolderEntities] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarFoldersDollarEntitiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FolderEntities]
  ): Unit = js.native
}

