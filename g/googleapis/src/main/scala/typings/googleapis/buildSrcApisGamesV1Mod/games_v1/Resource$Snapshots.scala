package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Snapshots")
@js.native
class Resource$Snapshots protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.snapshots.get
    * @desc Retrieves the metadata for a given snapshot ID.
    * @alias games.snapshots.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.snapshotId The ID of the snapshot.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Snapshot] = js.native
  def get(callback: BodyResponseCallback[Schema$Snapshot]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSnapshotsDollarGet): GaxiosPromise[Schema$Snapshot] = js.native
  def get(
    params: ParamsDollarResourceDollarSnapshotsDollarGet,
    callback: BodyResponseCallback[Schema$Snapshot]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSnapshotsDollarGet,
    options: BodyResponseCallback[Schema$Snapshot],
    callback: BodyResponseCallback[Schema$Snapshot]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSnapshotsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Snapshot] = js.native
  def get(
    params: ParamsDollarResourceDollarSnapshotsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Snapshot]
  ): Unit = js.native
  /**
    * games.snapshots.list
    * @desc Retrieves a list of snapshots created by your application for the
    * player corresponding to the player ID.
    * @alias games.snapshots.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of snapshot resources to return in the response, used for paging. For any response, the actual number of snapshot resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SnapshotListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SnapshotListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSnapshotsDollarList): GaxiosPromise[Schema$SnapshotListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSnapshotsDollarList,
    callback: BodyResponseCallback[Schema$SnapshotListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSnapshotsDollarList,
    options: BodyResponseCallback[Schema$SnapshotListResponse],
    callback: BodyResponseCallback[Schema$SnapshotListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSnapshotsDollarList, options: MethodOptions): GaxiosPromise[Schema$SnapshotListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSnapshotsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SnapshotListResponse]
  ): Unit = js.native
}

