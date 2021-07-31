package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Resource$Apps$Operations")
@js.native
class ResourceAppsOperations protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceAppsOperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceAppsOperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceAppsOperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceAppsOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceAppsOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(params: ParamsResourceAppsOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceAppsOperationsList,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsOperationsList,
    options: BodyResponseCallback[SchemaListOperationsResponse],
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceAppsOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
}
