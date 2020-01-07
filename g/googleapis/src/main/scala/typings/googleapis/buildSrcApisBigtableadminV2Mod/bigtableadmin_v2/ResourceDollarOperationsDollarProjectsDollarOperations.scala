package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Operations$Projects$Operations")
@js.native
class ResourceDollarOperationsDollarProjectsDollarOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigtableadmin.operations.projects.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias bigtableadmin.operations.projects.operations.list
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
  def list(params: ParamsDollarResourceDollarOperationsDollarProjectsDollarOperationsDollarList): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarProjectsDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarProjectsDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$ListOperationsResponse],
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarProjectsDollarOperationsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarProjectsDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
}

