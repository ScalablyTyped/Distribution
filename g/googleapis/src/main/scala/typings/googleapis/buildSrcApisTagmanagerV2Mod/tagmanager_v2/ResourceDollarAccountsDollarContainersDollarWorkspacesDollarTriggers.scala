package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Triggers")
@js.native
class ResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.triggers.create
    * @desc Creates a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspaces's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Trigger] = js.native
  def create(callback: BodyResponseCallback[Schema$Trigger]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarCreate
  ): GaxiosPromise[Schema$Trigger] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarCreate,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarCreate,
    options: BodyResponseCallback[Schema$Trigger],
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Trigger] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.triggers.delete
    * @desc Deletes a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarDelete
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.triggers.get
    * @desc Gets a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Trigger] = js.native
  def get(callback: BodyResponseCallback[Schema$Trigger]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarGet): GaxiosPromise[Schema$Trigger] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarGet,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarGet,
    options: BodyResponseCallback[Schema$Trigger],
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Trigger] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.triggers.list
    * @desc Lists all GTM Triggers of a Container.
    * @alias tagmanager.accounts.containers.workspaces.triggers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspaces's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTriggersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarList): GaxiosPromise[Schema$ListTriggersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarList,
    callback: BodyResponseCallback[Schema$ListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarList,
    options: BodyResponseCallback[Schema$ListTriggersResponse],
    callback: BodyResponseCallback[Schema$ListTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTriggersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTriggersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.triggers.revert
    * @desc Reverts changes to a GTM Trigger in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.triggers.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the trigger in storage.
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[Schema$RevertTriggerResponse] = js.native
  def revert(callback: BodyResponseCallback[Schema$RevertTriggerResponse]): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarRevert
  ): GaxiosPromise[Schema$RevertTriggerResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarRevert,
    callback: BodyResponseCallback[Schema$RevertTriggerResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarRevert,
    options: BodyResponseCallback[Schema$RevertTriggerResponse],
    callback: BodyResponseCallback[Schema$RevertTriggerResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarRevert,
    options: MethodOptions
  ): GaxiosPromise[Schema$RevertTriggerResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevertTriggerResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.triggers.update
    * @desc Updates a GTM Trigger.
    * @alias tagmanager.accounts.containers.workspaces.triggers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the trigger in storage.
    * @param {string} params.path GTM Trigger's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/triggers/{trigger_id}
    * @param {().Trigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Trigger] = js.native
  def update(callback: BodyResponseCallback[Schema$Trigger]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarUpdate
  ): GaxiosPromise[Schema$Trigger] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarUpdate,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarUpdate,
    options: BodyResponseCallback[Schema$Trigger],
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Trigger] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarTriggersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Trigger]
  ): Unit = js.native
}

