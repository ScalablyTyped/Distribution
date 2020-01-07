package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Operations")
@js.native
class ResourceDollarProjectsDollarOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * ml.projects.operations.cancel
    * @desc Starts asynchronous cancellation on a long-running operation.  The
    * server makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use Operations.GetOperation
    * or other methods to check whether the cancellation succeeded or whether
    * the operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with an
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to `Code.CANCELLED`.
    * @alias ml.projects.operations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be cancelled.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def cancel(callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel,
    options: BodyResponseCallback[Schema$GoogleProtobuf__Empty],
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  /**
    * ml.projects.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias ml.projects.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$GoogleLongrunning__Operation],
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunning__Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__Operation]
  ): Unit = js.native
  /**
    * ml.projects.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias ml.projects.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string} params.name The name of the operation's parent resource.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleLongrunning__ListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleLongrunning__ListOperationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList): GaxiosPromise[Schema$GoogleLongrunning__ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$GoogleLongrunning__ListOperationsResponse],
    callback: BodyResponseCallback[Schema$GoogleLongrunning__ListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunning__ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunning__ListOperationsResponse]
  ): Unit = js.native
}

