package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudbuild/v1alpha1", "cloudbuild_v1alpha1.Resource$Projects$Workerpools")
@js.native
class ResourceDollarProjectsDollarWorkerpools protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudbuild.projects.workerPools.create
    * @desc Creates a `WorkerPool` to run the builds, and returns the new
    * worker pool.  This API is experimental.
    * @alias cloudbuild.projects.workerPools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent ID of the parent project.
    * @param {().WorkerPool} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$WorkerPool] = js.native
  def create(callback: BodyResponseCallback[Schema$WorkerPool]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarCreate): GaxiosPromise[Schema$WorkerPool] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarCreate,
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarCreate,
    options: BodyResponseCallback[Schema$WorkerPool],
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$WorkerPool] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  /**
    * cloudbuild.projects.workerPools.delete
    * @desc Deletes a `WorkerPool` by its project ID and WorkerPool name.  This
    * API is experimental.
    * @alias cloudbuild.projects.workerPools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * cloudbuild.projects.workerPools.get
    * @desc Returns information about a `WorkerPool`.  This API is
    * experimental.
    * @alias cloudbuild.projects.workerPools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$WorkerPool] = js.native
  def get(callback: BodyResponseCallback[Schema$WorkerPool]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarGet): GaxiosPromise[Schema$WorkerPool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarGet,
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarGet,
    options: BodyResponseCallback[Schema$WorkerPool],
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarGet, options: MethodOptions): GaxiosPromise[Schema$WorkerPool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  /**
    * cloudbuild.projects.workerPools.list
    * @desc List project's `WorkerPool`s.  This API is experimental.
    * @alias cloudbuild.projects.workerPools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent ID of the parent project.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListWorkerPoolsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListWorkerPoolsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarList): GaxiosPromise[Schema$ListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarList,
    callback: BodyResponseCallback[Schema$ListWorkerPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarList,
    options: BodyResponseCallback[Schema$ListWorkerPoolsResponse],
    callback: BodyResponseCallback[Schema$ListWorkerPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListWorkerPoolsResponse]
  ): Unit = js.native
  /**
    * cloudbuild.projects.workerPools.patch
    * @desc Update a `WorkerPool`.  This API is experimental.
    * @alias cloudbuild.projects.workerPools.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    * @param {().WorkerPool} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$WorkerPool] = js.native
  def patch(callback: BodyResponseCallback[Schema$WorkerPool]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarPatch): GaxiosPromise[Schema$WorkerPool] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarPatch,
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarPatch,
    options: BodyResponseCallback[Schema$WorkerPool],
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$WorkerPool] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarWorkerpoolsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$WorkerPool]
  ): Unit = js.native
}

