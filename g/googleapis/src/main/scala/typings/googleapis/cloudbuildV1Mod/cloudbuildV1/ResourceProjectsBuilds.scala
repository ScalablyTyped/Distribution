package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Builds")
@js.native
class ResourceProjectsBuilds protected () extends js.Object {
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
  def cancel(): GaxiosPromise[SchemaBuild] = js.native
  def cancel(callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def cancel(params: ParamsResourceProjectsBuildsCancel): GaxiosPromise[SchemaBuild] = js.native
  def cancel(params: ParamsResourceProjectsBuildsCancel, callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsBuildsCancel,
    options: BodyResponseCallback[SchemaBuild],
    callback: BodyResponseCallback[SchemaBuild]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsBuildsCancel, options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def cancel(
    params: ParamsResourceProjectsBuildsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuild]
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
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsBuildsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsBuildsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceProjectsBuildsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsBuildsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsBuildsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def get(): GaxiosPromise[SchemaBuild] = js.native
  def get(callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def get(params: ParamsResourceProjectsBuildsGet): GaxiosPromise[SchemaBuild] = js.native
  def get(params: ParamsResourceProjectsBuildsGet, callback: BodyResponseCallback[SchemaBuild]): Unit = js.native
  def get(
    params: ParamsResourceProjectsBuildsGet,
    options: BodyResponseCallback[SchemaBuild],
    callback: BodyResponseCallback[SchemaBuild]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsBuildsGet, options: MethodOptions): GaxiosPromise[SchemaBuild] = js.native
  def get(
    params: ParamsResourceProjectsBuildsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuild]
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
  def list(): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBuildsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(params: ParamsResourceProjectsBuildsList): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(params: ParamsResourceProjectsBuildsList, callback: BodyResponseCallback[SchemaListBuildsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsBuildsList,
    options: BodyResponseCallback[SchemaListBuildsResponse],
    callback: BodyResponseCallback[SchemaListBuildsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBuildsList, options: MethodOptions): GaxiosPromise[SchemaListBuildsResponse] = js.native
  def list(
    params: ParamsResourceProjectsBuildsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBuildsResponse]
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
  def retry(): GaxiosPromise[SchemaOperation] = js.native
  def retry(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def retry(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def retry(params: ParamsResourceProjectsBuildsRetry): GaxiosPromise[SchemaOperation] = js.native
  def retry(params: ParamsResourceProjectsBuildsRetry, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def retry(
    params: ParamsResourceProjectsBuildsRetry,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def retry(params: ParamsResourceProjectsBuildsRetry, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def retry(
    params: ParamsResourceProjectsBuildsRetry,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

