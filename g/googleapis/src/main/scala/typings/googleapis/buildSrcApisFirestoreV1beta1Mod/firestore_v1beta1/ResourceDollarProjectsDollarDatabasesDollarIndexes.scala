package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firestore/v1beta1", "firestore_v1beta1.Resource$Projects$Databases$Indexes")
@js.native
class ResourceDollarProjectsDollarDatabasesDollarIndexes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firestore.projects.databases.indexes.create
    * @desc Creates the specified index. A newly created index's initial state
    * is `CREATING`. On completion of the returned
    * google.longrunning.Operation, the state will be `READY`. If the index
    * already exists, the call will return an `ALREADY_EXISTS` status.  During
    * creation, the process could result in an error, in which case the index
    * will move to the `ERROR` state. The process can be recovered by fixing
    * the data that caused the error, removing the index with delete, then
    * re-creating the index with create.  Indexes with a single field cannot be
    * created.
    * @alias firestore.projects.databases.indexes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the database this index will apply to. For example: `projects/{project_id}/databases/{database_id}`
    * @param {().GoogleFirestoreAdminV1beta1Index} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarCreate): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * firestore.projects.databases.indexes.delete
    * @desc Deletes an index.
    * @alias firestore.projects.databases.indexes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The index name. For example: `projects/{project_id}/databases/{database_id}/indexes/{index_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * firestore.projects.databases.indexes.get
    * @desc Gets an index.
    * @alias firestore.projects.databases.indexes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the index. For example: `projects/{project_id}/databases/{database_id}/indexes/{index_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleFirestoreAdminV1beta1Index] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1Index]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarGet): GaxiosPromise[Schema$GoogleFirestoreAdminV1beta1Index] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1Index]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarGet,
    options: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1Index],
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1Index]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleFirestoreAdminV1beta1Index] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1Index]
  ): Unit = js.native
  /**
    * firestore.projects.databases.indexes.list
    * @desc Lists the indexes that match the specified filters.
    * @alias firestore.projects.databases.indexes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter
    * @param {integer=} params.pageSize The standard List page size.
    * @param {string=} params.pageToken The standard List page token.
    * @param {string} params.parent The database name. For example: `projects/{project_id}/databases/{database_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarList): GaxiosPromise[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarList,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarList,
    options: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse],
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarIndexesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse]
  ): Unit = js.native
}

