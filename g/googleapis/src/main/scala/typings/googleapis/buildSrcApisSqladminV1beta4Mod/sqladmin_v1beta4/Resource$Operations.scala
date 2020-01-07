package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Operations")
@js.native
class Resource$Operations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.operations.get
    * @desc Retrieves an instance operation that has been performed on an
    * instance.
    * @alias sql.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.operation Instance operation ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOperationsDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarOperationsDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOperationsDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarOperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.operations.list
    * @desc Lists all instance operations that have been performed on the given
    * Cloud SQL instance in the reverse chronological order of the start time.
    * @alias sql.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {integer=} params.maxResults Maximum number of operations per response.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$OperationsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$OperationsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperationsDollarList): GaxiosPromise[Schema$OperationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarList,
    callback: BodyResponseCallback[Schema$OperationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarList,
    options: BodyResponseCallback[Schema$OperationsListResponse],
    callback: BodyResponseCallback[Schema$OperationsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$OperationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OperationsListResponse]
  ): Unit = js.native
}

