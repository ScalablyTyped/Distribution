package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/serviceusage/v1beta1", "serviceusage_v1beta1.Resource$Services")
@js.native
class Resource$Services protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * serviceusage.services.batchEnable
    * @desc Enable multiple services on a project. The operation is atomic: if
    * enabling any service fails, then the entire batch fails, and no state
    * changes occur.  Operation<response: google.protobuf.Empty>
    * @alias serviceusage.services.batchEnable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Parent to enable services on.  An example name would be: `projects/123` where `123` is the project number (not project ID).  The `BatchEnableServices` method currently only supports projects.
    * @param {().BatchEnableServicesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchEnable(): GaxiosPromise[Schema$Operation] = js.native
  def batchEnable(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def batchEnable(params: ParamsDollarResourceDollarServicesDollarBatchenable): GaxiosPromise[Schema$Operation] = js.native
  def batchEnable(
    params: ParamsDollarResourceDollarServicesDollarBatchenable,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def batchEnable(
    params: ParamsDollarResourceDollarServicesDollarBatchenable,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def batchEnable(params: ParamsDollarResourceDollarServicesDollarBatchenable, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def batchEnable(
    params: ParamsDollarResourceDollarServicesDollarBatchenable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceusage.services.disable
    * @desc Disable a service so that it can no longer be used with a project.
    * This prevents unintended usage that may cause unexpected billing charges
    * or security leaks.  It is not valid to call the disable method on a
    * service that is not currently enabled. Callers will receive a
    * `FAILED_PRECONDITION` status if the target service is not currently
    * enabled.  Operation<response: google.protobuf.Empty>
    * @alias serviceusage.services.disable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the consumer and service to disable the service on.  The enable and disable methods currently only support projects.  An example name would be: `projects/123/services/serviceusage.googleapis.com` where `123` is the project number (not project ID).
    * @param {().DisableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disable(): GaxiosPromise[Schema$Operation] = js.native
  def disable(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def disable(params: ParamsDollarResourceDollarServicesDollarDisable): GaxiosPromise[Schema$Operation] = js.native
  def disable(
    params: ParamsDollarResourceDollarServicesDollarDisable,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def disable(
    params: ParamsDollarResourceDollarServicesDollarDisable,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def disable(params: ParamsDollarResourceDollarServicesDollarDisable, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def disable(
    params: ParamsDollarResourceDollarServicesDollarDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceusage.services.enable
    * @desc Enable a service so that it can be used with a project.
    * Operation<response: google.protobuf.Empty>
    * @alias serviceusage.services.enable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the consumer and service to enable the service on.  The `EnableService` and `DisableService` methods currently only support projects.  Enabling a service requires that the service is public or is shared with the user enabling the service.  An example name would be: `projects/123/services/serviceusage.googleapis.com` where `123` is the project number (not project ID).
    * @param {().EnableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enable(): GaxiosPromise[Schema$Operation] = js.native
  def enable(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def enable(params: ParamsDollarResourceDollarServicesDollarEnable): GaxiosPromise[Schema$Operation] = js.native
  def enable(
    params: ParamsDollarResourceDollarServicesDollarEnable,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def enable(
    params: ParamsDollarResourceDollarServicesDollarEnable,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def enable(params: ParamsDollarResourceDollarServicesDollarEnable, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def enable(
    params: ParamsDollarResourceDollarServicesDollarEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * serviceusage.services.get
    * @desc Returns the service configuration and enabled state for a given
    * service.
    * @alias serviceusage.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the consumer and service to get the `ConsumerState` for.  An example name would be: `projects/123/services/serviceusage.googleapis.com` where `123` is the project number (not project ID).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Service] = js.native
  def get(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarGet): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarGet,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarGet,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarServicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarServicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * serviceusage.services.list
    * @desc List all services available to the specified project, and the
    * current state of those services with respect to the project. The list
    * includes all public services, all services for which the calling user has
    * the `servicemanagement.services.bind` permission, and all services that
    * have already been enabled on the project. The list can be filtered to
    * only include services in a specific state, for example to only include
    * services enabled on the project.
    * @alias serviceusage.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Only list services that conform to the given filter. The allowed filter strings are `state:ENABLED` and `state:DISABLED`.
    * @param {integer=} params.pageSize Requested size of the next page of data. Requested page size cannot exceed 200.  If not set, the default page size is 50.
    * @param {string=} params.pageToken Token identifying which result to start with, which is returned by a previous list call.
    * @param {string} params.parent Parent to search for services on.  An example name would be: `projects/123` where `123` is the project number (not project ID).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarList): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarList,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarList,
    options: BodyResponseCallback[Schema$ListServicesResponse],
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarServicesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarServicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
}

