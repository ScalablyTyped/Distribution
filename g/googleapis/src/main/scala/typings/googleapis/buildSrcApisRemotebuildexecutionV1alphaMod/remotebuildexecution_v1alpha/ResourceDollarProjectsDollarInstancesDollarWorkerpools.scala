package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1alpha", "remotebuildexecution_v1alpha.Resource$Projects$Instances$Workerpools")
@js.native
class ResourceDollarProjectsDollarInstancesDollarWorkerpools protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * remotebuildexecution.projects.instances.workerpools.create
    * @desc Creates a new worker pool with a specified size and configuration.
    * Returns a long running operation which contains a worker pool on
    * completion. While the long running operation is in progress, any call to
    * `GetWorkerPool` returns a worker pool in state `CREATING`.
    * @alias remotebuildexecution.projects.instances.workerpools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the instance in which to create the new worker pool. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {().GoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarCreate): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.workerpools.delete
    * @desc Deletes the specified worker pool. Returns a long running
    * operation, which contains a `google.protobuf.Empty` response on
    * completion. While the long running operation is in progress, any call to
    * `GetWorkerPool` returns a worker pool in state `DELETING`.
    * @alias remotebuildexecution.projects.instances.workerpools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the worker pool to delete. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarDelete): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.workerpools.get
    * @desc Returns the specified worker pool.
    * @alias remotebuildexecution.projects.instances.workerpools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the worker pool to retrieve. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarGet): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarGet,
    options: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool],
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.workerpools.list
    * @desc Lists worker pools in an instance.
    * @alias remotebuildexecution.projects.instances.workerpools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] = js.native
  def list(
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarList): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarList,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarList,
    options: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse],
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.workerpools.patch
    * @desc Updates an existing worker pool with a specified size and/or
    * configuration. Returns a long running operation, which contains a worker
    * pool on completion. While the long running operation is in progress, any
    * call to `GetWorkerPool` returns a worker pool in state `UPDATING`.
    * @alias remotebuildexecution.projects.instances.workerpools.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name WorkerPool resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be populated when creating a worker pool since it is provided in the `poolId` field.
    * @param {().GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarPatch): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarPatch,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarInstancesDollarWorkerpoolsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

