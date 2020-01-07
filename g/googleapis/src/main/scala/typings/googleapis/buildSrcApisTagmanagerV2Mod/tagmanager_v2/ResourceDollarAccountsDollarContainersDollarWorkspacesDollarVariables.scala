package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Variables")
@js.native
class ResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariables protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.create
    * @desc Creates a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Variable] = js.native
  def create(callback: BodyResponseCallback[Schema$Variable]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarCreate
  ): GaxiosPromise[Schema$Variable] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarCreate,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarCreate,
    options: BodyResponseCallback[Schema$Variable],
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Variable] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.delete
    * @desc Deletes a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarDelete
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.get
    * @desc Gets a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Variable] = js.native
  def get(callback: BodyResponseCallback[Schema$Variable]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarGet): GaxiosPromise[Schema$Variable] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarGet,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarGet,
    options: BodyResponseCallback[Schema$Variable],
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Variable] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.list
    * @desc Lists all GTM Variables of a Container.
    * @alias tagmanager.accounts.containers.workspaces.variables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListVariablesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarList
  ): GaxiosPromise[Schema$ListVariablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarList,
    callback: BodyResponseCallback[Schema$ListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarList,
    options: BodyResponseCallback[Schema$ListVariablesResponse],
    callback: BodyResponseCallback[Schema$ListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListVariablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListVariablesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.revert
    * @desc Reverts changes to a GTM Variable in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.variables.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the variable in storage.
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[Schema$RevertVariableResponse] = js.native
  def revert(callback: BodyResponseCallback[Schema$RevertVariableResponse]): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarRevert
  ): GaxiosPromise[Schema$RevertVariableResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarRevert,
    callback: BodyResponseCallback[Schema$RevertVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarRevert,
    options: BodyResponseCallback[Schema$RevertVariableResponse],
    callback: BodyResponseCallback[Schema$RevertVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarRevert,
    options: MethodOptions
  ): GaxiosPromise[Schema$RevertVariableResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevertVariableResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.variables.update
    * @desc Updates a GTM Variable.
    * @alias tagmanager.accounts.containers.workspaces.variables.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the variable in storage.
    * @param {string} params.path GTM Variable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/variables/{variable_id}
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Variable] = js.native
  def update(callback: BodyResponseCallback[Schema$Variable]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarUpdate
  ): GaxiosPromise[Schema$Variable] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarUpdate,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarUpdate,
    options: BodyResponseCallback[Schema$Variable],
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Variable] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarVariablesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Variable]
  ): Unit = js.native
}

