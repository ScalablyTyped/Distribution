package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Triggers")
@js.native
class ResourceDollarProjectsDollarTriggers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudbuild.projects.triggers.create
    * @desc Creates a new `BuildTrigger`.  This API is experimental.
    * @alias cloudbuild.projects.triggers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project for which to configure automatic builds.
    * @param {().BuildTrigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$BuildTrigger] = js.native
  def create(callback: BodyResponseCallback[Schema$BuildTrigger]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarCreate): GaxiosPromise[Schema$BuildTrigger] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarCreate,
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarCreate,
    options: BodyResponseCallback[Schema$BuildTrigger],
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarCreate, options: MethodOptions): GaxiosPromise[Schema$BuildTrigger] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  /**
    * cloudbuild.projects.triggers.delete
    * @desc Deletes a `BuildTrigger` by its project ID and trigger ID.  This
    * API is experimental.
    * @alias cloudbuild.projects.triggers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project that owns the trigger.
    * @param {string} params.triggerId ID of the `BuildTrigger` to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudbuild.projects.triggers.get
    * @desc Returns information about a `BuildTrigger`.  This API is
    * experimental.
    * @alias cloudbuild.projects.triggers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project that owns the trigger.
    * @param {string} params.triggerId ID of the `BuildTrigger` to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$BuildTrigger] = js.native
  def get(callback: BodyResponseCallback[Schema$BuildTrigger]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarGet): GaxiosPromise[Schema$BuildTrigger] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarGet,
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarGet,
    options: BodyResponseCallback[Schema$BuildTrigger],
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarGet, options: MethodOptions): GaxiosPromise[Schema$BuildTrigger] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  /**
    * cloudbuild.projects.triggers.list
    * @desc Lists existing `BuildTrigger`s.  This API is experimental.
    * @alias cloudbuild.projects.triggers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of results to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.projectId ID of the project for which to list BuildTriggers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListBuildTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListBuildTriggersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarList): GaxiosPromise[Schema$ListBuildTriggersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarList,
    callback: BodyResponseCallback[Schema$ListBuildTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarList,
    options: BodyResponseCallback[Schema$ListBuildTriggersResponse],
    callback: BodyResponseCallback[Schema$ListBuildTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarList, options: MethodOptions): GaxiosPromise[Schema$ListBuildTriggersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListBuildTriggersResponse]
  ): Unit = js.native
  /**
    * cloudbuild.projects.triggers.patch
    * @desc Updates a `BuildTrigger` by its project ID and trigger ID.  This
    * API is experimental.
    * @alias cloudbuild.projects.triggers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project that owns the trigger.
    * @param {string} params.triggerId ID of the `BuildTrigger` to update.
    * @param {().BuildTrigger} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$BuildTrigger] = js.native
  def patch(callback: BodyResponseCallback[Schema$BuildTrigger]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarPatch): GaxiosPromise[Schema$BuildTrigger] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarPatch,
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarPatch,
    options: BodyResponseCallback[Schema$BuildTrigger],
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$BuildTrigger] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildTrigger]
  ): Unit = js.native
  /**
    * cloudbuild.projects.triggers.run
    * @desc Runs a `BuildTrigger` at a particular source revision.
    * @alias cloudbuild.projects.triggers.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId ID of the project.
    * @param {string} params.triggerId ID of the trigger.
    * @param {().RepoSource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[Schema$Operation] = js.native
  def run(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def run(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarRun): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarRun,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarRun,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(params: ParamsDollarResourceDollarProjectsDollarTriggersDollarRun, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarProjectsDollarTriggersDollarRun,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

