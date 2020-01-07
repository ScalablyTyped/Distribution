package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Built_in_variables")
@js.native
class ResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variables protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.create
    * @desc Creates one or more GTM Built-In Variables.
    * @alias
    * tagmanager.accounts.containers.workspaces.built_in_variables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {string=} params.type The types of built-in variables to enable.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$CreateBuiltInVariableResponse] = js.native
  def create(callback: BodyResponseCallback[Schema$CreateBuiltInVariableResponse]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarCreate
  ): GaxiosPromise[Schema$CreateBuiltInVariableResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarCreate,
    callback: BodyResponseCallback[Schema$CreateBuiltInVariableResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarCreate,
    options: BodyResponseCallback[Schema$CreateBuiltInVariableResponse],
    callback: BodyResponseCallback[Schema$CreateBuiltInVariableResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$CreateBuiltInVariableResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreateBuiltInVariableResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.delete
    * @desc Deletes one or more GTM Built-In Variables.
    * @alias
    * tagmanager.accounts.containers.workspaces.built_in_variables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM BuiltInVariable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/built_in_variables
    * @param {string=} params.type The types of built-in variables to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarDelete
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.list
    * @desc Lists all the enabled Built-In Variables of a GTM Container.
    * @alias tagmanager.accounts.containers.workspaces.built_in_variables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListEnabledBuiltInVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListEnabledBuiltInVariablesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarList
  ): GaxiosPromise[Schema$ListEnabledBuiltInVariablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarList,
    callback: BodyResponseCallback[Schema$ListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarList,
    options: BodyResponseCallback[Schema$ListEnabledBuiltInVariablesResponse],
    callback: BodyResponseCallback[Schema$ListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListEnabledBuiltInVariablesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListEnabledBuiltInVariablesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.built_in_variables.revert
    * @desc Reverts changes to a GTM Built-In Variables in a GTM Workspace.
    * @alias
    * tagmanager.accounts.containers.workspaces.built_in_variables.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM BuiltInVariable's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/built_in_variables
    * @param {string=} params.type The type of built-in variable to revert.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[Schema$RevertBuiltInVariableResponse] = js.native
  def revert(callback: BodyResponseCallback[Schema$RevertBuiltInVariableResponse]): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarRevert
  ): GaxiosPromise[Schema$RevertBuiltInVariableResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarRevert,
    callback: BodyResponseCallback[Schema$RevertBuiltInVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarRevert,
    options: BodyResponseCallback[Schema$RevertBuiltInVariableResponse],
    callback: BodyResponseCallback[Schema$RevertBuiltInVariableResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarRevert,
    options: MethodOptions
  ): GaxiosPromise[Schema$RevertBuiltInVariableResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarBuilt_in_variablesDollarRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevertBuiltInVariableResponse]
  ): Unit = js.native
}

