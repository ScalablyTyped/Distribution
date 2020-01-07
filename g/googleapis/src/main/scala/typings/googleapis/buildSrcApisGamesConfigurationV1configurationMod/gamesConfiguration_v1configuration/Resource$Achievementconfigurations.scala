package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Achievementconfigurations")
@js.native
class Resource$Achievementconfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesConfiguration.achievementConfigurations.delete
    * @desc Delete the achievement configuration with the given ID.
    * @alias gamesConfiguration.achievementConfigurations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAchievementconfigurationsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAchievementconfigurationsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesConfiguration.achievementConfigurations.get
    * @desc Retrieves the metadata of the achievement configuration with the
    * given ID.
    * @alias gamesConfiguration.achievementConfigurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def get(callback: BodyResponseCallback[Schema$AchievementConfiguration]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAchievementconfigurationsDollarGet): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarGet,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarGet,
    options: BodyResponseCallback[Schema$AchievementConfiguration],
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAchievementconfigurationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  /**
    * gamesConfiguration.achievementConfigurations.insert
    * @desc Insert a new achievement configuration in this application.
    * @alias gamesConfiguration.achievementConfigurations.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {().AchievementConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def insert(callback: BodyResponseCallback[Schema$AchievementConfiguration]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAchievementconfigurationsDollarInsert): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def insert(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarInsert,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarInsert,
    options: BodyResponseCallback[Schema$AchievementConfiguration],
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAchievementconfigurationsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def insert(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  /**
    * gamesConfiguration.achievementConfigurations.list
    * @desc Returns a list of the achievement configurations in this
    * application.
    * @alias gamesConfiguration.achievementConfigurations.list
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
  def list(): GaxiosPromise[Schema$AchievementConfigurationListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AchievementConfigurationListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAchievementconfigurationsDollarList): GaxiosPromise[Schema$AchievementConfigurationListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarList,
    callback: BodyResponseCallback[Schema$AchievementConfigurationListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarList,
    options: BodyResponseCallback[Schema$AchievementConfigurationListResponse],
    callback: BodyResponseCallback[Schema$AchievementConfigurationListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAchievementconfigurationsDollarList, options: MethodOptions): GaxiosPromise[Schema$AchievementConfigurationListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementConfigurationListResponse]
  ): Unit = js.native
  /**
    * gamesConfiguration.achievementConfigurations.patch
    * @desc Update the metadata of the achievement configuration with the given
    * ID. This method supports patch semantics.
    * @alias gamesConfiguration.achievementConfigurations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {().AchievementConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def patch(callback: BodyResponseCallback[Schema$AchievementConfiguration]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAchievementconfigurationsDollarPatch): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarPatch,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarPatch,
    options: BodyResponseCallback[Schema$AchievementConfiguration],
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAchievementconfigurationsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  /**
    * gamesConfiguration.achievementConfigurations.update
    * @desc Update the metadata of the achievement configuration with the given
    * ID.
    * @alias gamesConfiguration.achievementConfigurations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {().AchievementConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def update(callback: BodyResponseCallback[Schema$AchievementConfiguration]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAchievementconfigurationsDollarUpdate): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarUpdate,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarUpdate,
    options: BodyResponseCallback[Schema$AchievementConfiguration],
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAchievementconfigurationsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$AchievementConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarAchievementconfigurationsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementConfiguration]
  ): Unit = js.native
}

