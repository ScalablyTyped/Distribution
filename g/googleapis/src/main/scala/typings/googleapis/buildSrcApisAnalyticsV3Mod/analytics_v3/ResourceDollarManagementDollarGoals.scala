package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Goals")
@js.native
class ResourceDollarManagementDollarGoals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.goals.get
    * @desc Gets a goal to which the user has access.
    * @alias analytics.management.goals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the goal for.
    * @param {string} params.goalId Goal ID to retrieve the goal for.
    * @param {string} params.profileId View (Profile) ID to retrieve the goal for.
    * @param {string} params.webPropertyId Web property ID to retrieve the goal for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Goal] = js.native
  def get(callback: BodyResponseCallback[Schema$Goal]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarGoalsDollarGet): GaxiosPromise[Schema$Goal] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarGet,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarGet,
    options: BodyResponseCallback[Schema$Goal],
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarGoalsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Goal] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  /**
    * analytics.management.goals.insert
    * @desc Create a new goal.
    * @alias analytics.management.goals.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the goal for.
    * @param {string} params.profileId View (Profile) ID to create the goal for.
    * @param {string} params.webPropertyId Web property ID to create the goal for.
    * @param {().Goal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Goal] = js.native
  def insert(callback: BodyResponseCallback[Schema$Goal]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarGoalsDollarInsert): GaxiosPromise[Schema$Goal] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarInsert,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarInsert,
    options: BodyResponseCallback[Schema$Goal],
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarGoalsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Goal] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  /**
    * analytics.management.goals.list
    * @desc Lists goals to which the user has access.
    * @alias analytics.management.goals.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve goals for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    * @param {integer=} params.max-results The maximum number of goals to include in this response.
    * @param {string} params.profileId View (Profile) ID to retrieve goals for. Can either be a specific view (profile) ID or '~all', which refers to all the views (profiles) that user has access to.
    * @param {integer=} params.start-index An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve goals for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Goals] = js.native
  def list(callback: BodyResponseCallback[Schema$Goals]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarGoalsDollarList): GaxiosPromise[Schema$Goals] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarList,
    callback: BodyResponseCallback[Schema$Goals]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarList,
    options: BodyResponseCallback[Schema$Goals],
    callback: BodyResponseCallback[Schema$Goals]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarGoalsDollarList, options: MethodOptions): GaxiosPromise[Schema$Goals] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Goals]
  ): Unit = js.native
  /**
    * analytics.management.goals.patch
    * @desc Updates an existing goal. This method supports patch semantics.
    * @alias analytics.management.goals.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the goal.
    * @param {string} params.goalId Index of the goal to be updated.
    * @param {string} params.profileId View (Profile) ID to update the goal.
    * @param {string} params.webPropertyId Web property ID to update the goal.
    * @param {().Goal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Goal] = js.native
  def patch(callback: BodyResponseCallback[Schema$Goal]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarGoalsDollarPatch): GaxiosPromise[Schema$Goal] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarPatch,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarPatch,
    options: BodyResponseCallback[Schema$Goal],
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarGoalsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Goal] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  /**
    * analytics.management.goals.update
    * @desc Updates an existing goal.
    * @alias analytics.management.goals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the goal.
    * @param {string} params.goalId Index of the goal to be updated.
    * @param {string} params.profileId View (Profile) ID to update the goal.
    * @param {string} params.webPropertyId Web property ID to update the goal.
    * @param {().Goal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Goal] = js.native
  def update(callback: BodyResponseCallback[Schema$Goal]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarGoalsDollarUpdate): GaxiosPromise[Schema$Goal] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarUpdate,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarUpdate,
    options: BodyResponseCallback[Schema$Goal],
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarGoalsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Goal] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarGoalsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Goal]
  ): Unit = js.native
}

