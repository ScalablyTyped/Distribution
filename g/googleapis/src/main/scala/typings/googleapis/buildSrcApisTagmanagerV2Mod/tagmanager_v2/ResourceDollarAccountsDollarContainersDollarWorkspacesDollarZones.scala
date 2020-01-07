package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$Containers$Workspaces$Zones")
@js.native
class ResourceDollarAccountsDollarContainersDollarWorkspacesDollarZones protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.containers.workspaces.zones.create
    * @desc Creates a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {().Zone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Zone] = js.native
  def create(callback: BodyResponseCallback[Schema$Zone]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarCreate): GaxiosPromise[Schema$Zone] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarCreate,
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarCreate,
    options: BodyResponseCallback[Schema$Zone],
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Zone] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.zones.delete
    * @desc Deletes a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.zones.get
    * @desc Gets a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Zone] = js.native
  def get(callback: BodyResponseCallback[Schema$Zone]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarGet): GaxiosPromise[Schema$Zone] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarGet,
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarGet,
    options: BodyResponseCallback[Schema$Zone],
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Zone] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.zones.list
    * @desc Lists all GTM Zones of a GTM container workspace.
    * @alias tagmanager.accounts.containers.workspaces.zones.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Workspace's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListZonesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListZonesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarList): GaxiosPromise[Schema$ListZonesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarList,
    callback: BodyResponseCallback[Schema$ListZonesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarList,
    options: BodyResponseCallback[Schema$ListZonesResponse],
    callback: BodyResponseCallback[Schema$ListZonesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListZonesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListZonesResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.zones.revert
    * @desc Reverts changes to a GTM Zone in a GTM Workspace.
    * @alias tagmanager.accounts.containers.workspaces.zones.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the zone in storage.
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[Schema$RevertZoneResponse] = js.native
  def revert(callback: BodyResponseCallback[Schema$RevertZoneResponse]): Unit = js.native
  def revert(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarRevert): GaxiosPromise[Schema$RevertZoneResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarRevert,
    callback: BodyResponseCallback[Schema$RevertZoneResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarRevert,
    options: BodyResponseCallback[Schema$RevertZoneResponse],
    callback: BodyResponseCallback[Schema$RevertZoneResponse]
  ): Unit = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarRevert,
    options: MethodOptions
  ): GaxiosPromise[Schema$RevertZoneResponse] = js.native
  def revert(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevertZoneResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.containers.workspaces.zones.update
    * @desc Updates a GTM Zone.
    * @alias tagmanager.accounts.containers.workspaces.zones.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.fingerprint When provided, this fingerprint must match the fingerprint of the zone in storage.
    * @param {string} params.path GTM Zone's API relative path. Example: accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/zones/{zone_id}
    * @param {().Zone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Zone] = js.native
  def update(callback: BodyResponseCallback[Schema$Zone]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarUpdate): GaxiosPromise[Schema$Zone] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarUpdate,
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarUpdate,
    options: BodyResponseCallback[Schema$Zone],
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Zone] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarContainersDollarWorkspacesDollarZonesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Zone]
  ): Unit = js.native
}

