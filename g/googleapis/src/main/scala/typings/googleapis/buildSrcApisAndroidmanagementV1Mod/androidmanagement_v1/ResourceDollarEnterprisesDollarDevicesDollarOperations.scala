package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Devices$Operations")
@js.native
class ResourceDollarEnterprisesDollarDevicesDollarOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.enterprises.devices.operations.cancel
    * @desc Starts asynchronous cancellation on a long-running operation. The
    * server makes a best effort to cancel the operation, but success is not
    * guaranteed. If the server doesn't support this method, it returns
    * google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or
    * other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation, the
    * operation is not deleted; instead, it becomes an operation with an
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to Code.CANCELLED.
    * @alias androidmanagement.enterprises.devices.operations.cancel
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
  def cancel(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarCancel): GaxiosPromise[Schema$Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarCancel,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarCancel,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarCancel,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.devices.operations.delete
    * @desc Deletes a long-running operation. This method indicates that the
    * client is no longer interested in the operation result. It does not
    * cancel the operation. If the server doesn't support this method, it
    * returns google.rpc.Code.UNIMPLEMENTED.
    * @alias androidmanagement.enterprises.devices.operations.delete
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
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.devices.operations.get
    * @desc Gets the latest state of a long-running operation. Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias androidmanagement.enterprises.devices.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.devices.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns UNIMPLEMENTED.NOTE:
    * the name binding allows API services to override the binding to use
    * different resource name schemes, such as users/x/operations. To override
    * the binding, API services can add a binding such as
    * "/v1/{name=users/x}/operations" to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias androidmanagement.enterprises.devices.operations.list
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
  def list(): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListOperationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarList): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$ListOperationsResponse],
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarDevicesDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
}

