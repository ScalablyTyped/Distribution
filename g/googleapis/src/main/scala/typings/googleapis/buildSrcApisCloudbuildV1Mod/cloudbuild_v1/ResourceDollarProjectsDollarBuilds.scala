package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Builds")
@js.native
class ResourceDollarProjectsDollarBuilds protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudbuild.projects.builds.cancel
    * @desc Cancels a build in progress.
    * @alias cloudbuild.projects.builds.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id ID of the build.
    * @param {string} params.projectId ID of the project.
    * @param {().CancelBuildRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$Build] = js.native
  def cancel(callback: BodyResponseCallback[Schema$Build]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCancel): GaxiosPromise[Schema$Build] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCancel,
    callback: BodyResponseCallback[Schema$Build]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCancel,
    options: BodyResponseCallback[Schema$Build],
    callback: BodyResponseCallback[Schema$Build]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCancel, options: MethodOptions): GaxiosPromise[Schema$Build] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Build]
  ): Unit = js.native
  /**
    * cloudbuild.projects.builds.create
    * @desc Starts a build with the specified configuration.  This method
    * returns a long-running `Operation`, which includes the build ID. Pass the
    * build ID to `GetBuild` to determine the build status (such as `SUCCESS`
    * or `FAILURE`).
    * @alias cloudbuild.projects.builds.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project.
    * @param {().Build} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudbuild.projects.builds.get
    * @desc Returns information about a previously requested build.  The
    * `Build` that is returned includes its status (such as `SUCCESS`,
    * `FAILURE`, or `WORKING`), and timing information.
    * @alias cloudbuild.projects.builds.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id ID of the build.
    * @param {string} params.projectId ID of the project.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Build] = js.native
  def get(callback: BodyResponseCallback[Schema$Build]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarGet): GaxiosPromise[Schema$Build] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarGet,
    callback: BodyResponseCallback[Schema$Build]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarGet,
    options: BodyResponseCallback[Schema$Build],
    callback: BodyResponseCallback[Schema$Build]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Build] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Build]
  ): Unit = js.native
  /**
    * cloudbuild.projects.builds.list
    * @desc Lists previously requested builds.  Previously requested builds may
    * still be in-progress, or may have finished successfully or
    * unsuccessfully.
    * @alias cloudbuild.projects.builds.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The raw filter text to constrain the results.
    * @param {integer=} params.pageSize Number of results to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.projectId ID of the project.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListBuildsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListBuildsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarList): GaxiosPromise[Schema$ListBuildsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarList,
    callback: BodyResponseCallback[Schema$ListBuildsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarList,
    options: BodyResponseCallback[Schema$ListBuildsResponse],
    callback: BodyResponseCallback[Schema$ListBuildsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListBuildsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListBuildsResponse]
  ): Unit = js.native
  /**
    * cloudbuild.projects.builds.retry
    * @desc Creates a new build based on the specified build.  This method
    * creates a new build using the original build request, which may or may
    * not result in an identical build.  For triggered builds:  * Triggered
    * builds resolve to a precise revision; therefore a retry of a triggered
    * build will result in a build that uses the same revision.  For
    * non-triggered builds that specify `RepoSource`:  * If the original build
    * built from the tip of a branch, the retried build will build from the tip
    * of that branch, which may not be the same revision as the original build.
    * * If the original build specified a commit sha or revision ID, the
    * retried build will use the identical source.  For builds that specify
    * `StorageSource`:  * If the original build pulled source from Google Cloud
    * Storage without specifying the generation of the object, the new build
    * will use the current object, which may be different from the original
    * build source. * If the original build pulled source from Cloud Storage
    * and specified the generation of the object, the new build will attempt to
    * use the same object, which may or may not be available depending on the
    * bucket's lifecycle management settings.
    * @alias cloudbuild.projects.builds.retry
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Build ID of the original build.
    * @param {string} params.projectId ID of the project.
    * @param {().RetryBuildRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retry(): GaxiosPromise[Schema$Operation] = js.native
  def retry(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def retry(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarRetry): GaxiosPromise[Schema$Operation] = js.native
  def retry(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarRetry,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def retry(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarRetry,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def retry(params: ParamsDollarResourceDollarProjectsDollarBuildsDollarRetry, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def retry(
    params: ParamsDollarResourceDollarProjectsDollarBuildsDollarRetry,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

