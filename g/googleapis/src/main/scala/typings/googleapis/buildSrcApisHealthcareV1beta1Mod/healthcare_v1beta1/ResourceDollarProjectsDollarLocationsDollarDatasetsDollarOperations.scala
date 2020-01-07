package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Operations")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias healthcare.projects.locations.datasets.operations.get
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
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.operations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
    * @alias healthcare.projects.locations.datasets.operations.list
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
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarList): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$ListOperationsResponse],
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
}

