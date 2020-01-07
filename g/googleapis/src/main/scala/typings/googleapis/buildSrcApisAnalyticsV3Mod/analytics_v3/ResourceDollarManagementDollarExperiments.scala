package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Experiments")
@js.native
class ResourceDollarManagementDollarExperiments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.experiments.delete
    * @desc Delete an experiment.
    * @alias analytics.management.experiments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the experiment belongs
    * @param {string} params.experimentId ID of the experiment to delete
    * @param {string} params.profileId View (Profile) ID to which the experiment belongs
    * @param {string} params.webPropertyId Web property ID to which the experiment belongs
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.experiments.get
    * @desc Returns an experiment to which the user has access.
    * @alias analytics.management.experiments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the experiment for.
    * @param {string} params.experimentId Experiment ID to retrieve the experiment for.
    * @param {string} params.profileId View (Profile) ID to retrieve the experiment for.
    * @param {string} params.webPropertyId Web property ID to retrieve the experiment for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Experiment] = js.native
  def get(callback: BodyResponseCallback[Schema$Experiment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarGet): GaxiosPromise[Schema$Experiment] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarGet,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarGet,
    options: BodyResponseCallback[Schema$Experiment],
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Experiment] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  /**
    * analytics.management.experiments.insert
    * @desc Create a new experiment.
    * @alias analytics.management.experiments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the experiment for.
    * @param {string} params.profileId View (Profile) ID to create the experiment for.
    * @param {string} params.webPropertyId Web property ID to create the experiment for.
    * @param {().Experiment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Experiment] = js.native
  def insert(callback: BodyResponseCallback[Schema$Experiment]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarInsert): GaxiosPromise[Schema$Experiment] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarInsert,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarInsert,
    options: BodyResponseCallback[Schema$Experiment],
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Experiment] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  /**
    * analytics.management.experiments.list
    * @desc Lists experiments to which the user has access.
    * @alias analytics.management.experiments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve experiments for.
    * @param {integer=} params.max-results The maximum number of experiments to include in this response.
    * @param {string} params.profileId View (Profile) ID to retrieve experiments for.
    * @param {integer=} params.start-index An index of the first experiment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve experiments for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Experiments] = js.native
  def list(callback: BodyResponseCallback[Schema$Experiments]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarList): GaxiosPromise[Schema$Experiments] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarList,
    callback: BodyResponseCallback[Schema$Experiments]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarList,
    options: BodyResponseCallback[Schema$Experiments],
    callback: BodyResponseCallback[Schema$Experiments]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarList, options: MethodOptions): GaxiosPromise[Schema$Experiments] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Experiments]
  ): Unit = js.native
  /**
    * analytics.management.experiments.patch
    * @desc Update an existing experiment. This method supports patch
    * semantics.
    * @alias analytics.management.experiments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the experiment to update.
    * @param {string} params.experimentId Experiment ID of the experiment to update.
    * @param {string} params.profileId View (Profile) ID of the experiment to update.
    * @param {string} params.webPropertyId Web property ID of the experiment to update.
    * @param {().Experiment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Experiment] = js.native
  def patch(callback: BodyResponseCallback[Schema$Experiment]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarPatch): GaxiosPromise[Schema$Experiment] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarPatch,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarPatch,
    options: BodyResponseCallback[Schema$Experiment],
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Experiment] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  /**
    * analytics.management.experiments.update
    * @desc Update an existing experiment.
    * @alias analytics.management.experiments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the experiment to update.
    * @param {string} params.experimentId Experiment ID of the experiment to update.
    * @param {string} params.profileId View (Profile) ID of the experiment to update.
    * @param {string} params.webPropertyId Web property ID of the experiment to update.
    * @param {().Experiment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Experiment] = js.native
  def update(callback: BodyResponseCallback[Schema$Experiment]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarUpdate): GaxiosPromise[Schema$Experiment] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarUpdate,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarUpdate,
    options: BodyResponseCallback[Schema$Experiment],
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarExperimentsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Experiment] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarExperimentsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Experiment]
  ): Unit = js.native
}

