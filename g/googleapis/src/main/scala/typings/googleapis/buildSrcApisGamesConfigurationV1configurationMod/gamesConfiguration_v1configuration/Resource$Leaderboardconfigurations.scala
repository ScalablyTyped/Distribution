package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Leaderboardconfigurations")
@js.native
class Resource$Leaderboardconfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesConfiguration.leaderboardConfigurations.delete
    * @desc Delete the leaderboard configuration with the given ID.
    * @alias gamesConfiguration.leaderboardConfigurations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesConfiguration.leaderboardConfigurations.get
    * @desc Retrieves the metadata of the leaderboard configuration with the
    * given ID.
    * @alias gamesConfiguration.leaderboardConfigurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def get(callback: BodyResponseCallback[Schema$LeaderboardConfiguration]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarGet): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarGet,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarGet,
    options: BodyResponseCallback[Schema$LeaderboardConfiguration],
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  /**
    * gamesConfiguration.leaderboardConfigurations.insert
    * @desc Insert a new leaderboard configuration in this application.
    * @alias gamesConfiguration.leaderboardConfigurations.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {().LeaderboardConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def insert(callback: BodyResponseCallback[Schema$LeaderboardConfiguration]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarInsert): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def insert(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarInsert,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarInsert,
    options: BodyResponseCallback[Schema$LeaderboardConfiguration],
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def insert(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  /**
    * gamesConfiguration.leaderboardConfigurations.list
    * @desc Returns a list of the leaderboard configurations in this
    * application.
    * @alias gamesConfiguration.leaderboardConfigurations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {integer=} params.maxResults The maximum number of resource configurations to return in the response, used for paging. For any response, the actual number of resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LeaderboardConfigurationListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$LeaderboardConfigurationListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarList): GaxiosPromise[Schema$LeaderboardConfigurationListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarList,
    callback: BodyResponseCallback[Schema$LeaderboardConfigurationListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarList,
    options: BodyResponseCallback[Schema$LeaderboardConfigurationListResponse],
    callback: BodyResponseCallback[Schema$LeaderboardConfigurationListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarList, options: MethodOptions): GaxiosPromise[Schema$LeaderboardConfigurationListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaderboardConfigurationListResponse]
  ): Unit = js.native
  /**
    * gamesConfiguration.leaderboardConfigurations.patch
    * @desc Update the metadata of the leaderboard configuration with the given
    * ID. This method supports patch semantics.
    * @alias gamesConfiguration.leaderboardConfigurations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {().LeaderboardConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def patch(callback: BodyResponseCallback[Schema$LeaderboardConfiguration]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarPatch): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarPatch,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarPatch,
    options: BodyResponseCallback[Schema$LeaderboardConfiguration],
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  /**
    * gamesConfiguration.leaderboardConfigurations.update
    * @desc Update the metadata of the leaderboard configuration with the given
    * ID.
    * @alias gamesConfiguration.leaderboardConfigurations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {().LeaderboardConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def update(callback: BodyResponseCallback[Schema$LeaderboardConfiguration]): Unit = js.native
  def update(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarUpdate): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarUpdate,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarUpdate,
    options: BodyResponseCallback[Schema$LeaderboardConfiguration],
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$LeaderboardConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarLeaderboardconfigurationsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaderboardConfiguration]
  ): Unit = js.native
}

