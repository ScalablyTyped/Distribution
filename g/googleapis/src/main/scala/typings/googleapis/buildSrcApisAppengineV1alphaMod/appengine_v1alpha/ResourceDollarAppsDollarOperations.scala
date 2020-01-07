package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Resource$Apps$Operations")
@js.native
class ResourceDollarAppsDollarOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appengine.apps.operations.get
    * @desc Gets the latest state of a long-running operation. Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias appengine.apps.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. The name of the operation resource.
    * @param {string} params.operationsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarOperationsDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarOperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * appengine.apps.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns UNIMPLEMENTED.NOTE:
    * the name binding allows API services to override the binding to use
    * different resource name schemes, such as users/x/operations. To override
    * the binding, API services can add a binding such as
    * "/v1/{name=users/x}/operations" to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias appengine.apps.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. The name of the operation's parent resource.
    * @param {string=} params.filter The standard list filter.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListOperationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarOperationsDollarList): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$ListOperationsResponse],
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarOperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
}

