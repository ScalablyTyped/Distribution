package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore/v1", "datastore_v1.Resource$Projects$Indexes")
@js.native
class ResourceDollarProjectsDollarIndexes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * datastore.projects.indexes.get
    * @desc Gets an index.
    * @alias datastore.projects.indexes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.indexId The resource ID of the index to get.
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleDatastoreAdminV1Index] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1Index]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarIndexesDollarGet): GaxiosPromise[Schema$GoogleDatastoreAdminV1Index] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarIndexesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1Index]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarIndexesDollarGet,
    options: BodyResponseCallback[Schema$GoogleDatastoreAdminV1Index],
    callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1Index]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarIndexesDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleDatastoreAdminV1Index] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarIndexesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1Index]
  ): Unit = js.native
  /**
    * datastore.projects.indexes.list
    * @desc Lists the indexes that match the specified filters.  Datastore uses
    * an eventually consistent query to fetch the list of indexes and may
    * occasionally return stale results.
    * @alias datastore.projects.indexes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter
    * @param {integer=} params.pageSize The maximum number of items to return.  If zero, then all results will be returned.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1ListIndexesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarIndexesDollarList): GaxiosPromise[Schema$GoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarIndexesDollarList,
    callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarIndexesDollarList,
    options: BodyResponseCallback[Schema$GoogleDatastoreAdminV1ListIndexesResponse],
    callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarIndexesDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleDatastoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarIndexesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleDatastoreAdminV1ListIndexesResponse]
  ): Unit = js.native
}

