package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore/v1", "datastore_v1.Resource$Projects$Operations")
@js.native
class ResourceDollarProjectsDollarOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * datastore.projects.operations.cancel
    * @desc Starts asynchronous cancellation on a long-running operation.  The
    * server makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use Operations.GetOperation
    * or other methods to check whether the cancellation succeeded or whether
    * the operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with an
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to `Code.CANCELLED`.
    * @alias datastore.projects.operations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be cancelled.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$Empty] = js.native
  def cancel(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel): GaxiosPromise[Schema$Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * datastore.projects.operations.delete
    * @desc Deletes a long-running operation. This method indicates that the
    * client is no longer interested in the operation result. It does not
    * cancel the operation. If the server doesn't support this method, it
    * returns `google.rpc.Code.UNIMPLEMENTED`.
    * @alias datastore.projects.operations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * datastore.projects.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias datastore.projects.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * datastore.projects.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias datastore.projects.operations.list
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
  def list(): GaxiosPromise[Schema$GoogleLongrunningListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList): GaxiosPromise[Schema$GoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse],
    callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]
  ): Unit = js.native
}

