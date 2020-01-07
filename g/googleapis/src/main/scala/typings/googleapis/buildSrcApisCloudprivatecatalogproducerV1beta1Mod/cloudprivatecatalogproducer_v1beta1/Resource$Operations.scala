package typings.googleapis.buildSrcApisCloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducer_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Resource$Operations")
@js.native
class Resource$Operations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudprivatecatalogproducer.operations.cancel
    * @desc Starts asynchronous cancellation on a long-running operation.  The
    * server makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use Operations.GetOperation
    * or other methods to check whether the cancellation succeeded or whether
    * the operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with an
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to `Code.CANCELLED`.
    * @alias cloudprivatecatalogproducer.operations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be cancelled.
    * @param {().GoogleLongrunningCancelOperationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def cancel(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarOperationsDollarCancel): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarOperationsDollarCancel,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarOperationsDollarCancel,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarOperationsDollarCancel, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarOperationsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.operations.delete
    * @desc Deletes a long-running operation. This method indicates that the
    * client is no longer interested in the operation result. It does not
    * cancel the operation. If the server doesn't support this method, it
    * returns `google.rpc.Code.UNIMPLEMENTED`.
    * @alias cloudprivatecatalogproducer.operations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOperationsDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOperationsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOperationsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOperationsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarOperationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias cloudprivatecatalogproducer.operations.get
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
  def get(params: ParamsDollarResourceDollarOperationsDollarGet): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(
    params: ParamsDollarResourceDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def get(
    params: ParamsDollarResourceDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * cloudprivatecatalogproducer.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias cloudprivatecatalogproducer.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The standard list filter.
    * @param {string=} params.name The name of the operation's parent resource.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleLongrunningListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperationsDollarList): GaxiosPromise[Schema$GoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse],
    callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningListOperationsResponse]
  ): Unit = js.native
}

