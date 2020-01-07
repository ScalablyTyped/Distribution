package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firestore/v1", "firestore_v1.Resource$Projects$Databases$Collectiongroups$Indexes")
@js.native
class ResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firestore.projects.databases.collectionGroups.indexes.create
    * @desc Creates a composite index. This returns a
    * google.longrunning.Operation which may be used to track the status of the
    * creation. The metadata for the operation will be the type
    * IndexOperationMetadata.
    * @alias firestore.projects.databases.collectionGroups.indexes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    * @param {().GoogleFirestoreAdminV1Index} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarCreate
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * firestore.projects.databases.collectionGroups.indexes.delete
    * @desc Deletes a composite index.
    * @alias firestore.projects.databases.collectionGroups.indexes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarDelete
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * firestore.projects.databases.collectionGroups.indexes.get
    * @desc Gets a composite index.
    * @alias firestore.projects.databases.collectionGroups.indexes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleFirestoreAdminV1Index] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1Index]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarGet
  ): GaxiosPromise[Schema$GoogleFirestoreAdminV1Index] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1Index]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarGet,
    options: BodyResponseCallback[Schema$GoogleFirestoreAdminV1Index],
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1Index]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleFirestoreAdminV1Index] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1Index]
  ): Unit = js.native
  /**
    * firestore.projects.databases.collectionGroups.indexes.list
    * @desc Lists composite indexes.
    * @alias firestore.projects.databases.collectionGroups.indexes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter to apply to list results.
    * @param {integer=} params.pageSize The number of results to return.
    * @param {string=} params.pageToken A page token, returned from a previous call to FirestoreAdmin.ListIndexes, that may be used to get the next page of results.
    * @param {string} params.parent A parent name of the form `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1ListIndexesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarList
  ): GaxiosPromise[Schema$GoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarList,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarList,
    options: BodyResponseCallback[Schema$GoogleFirestoreAdminV1ListIndexesResponse],
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleFirestoreAdminV1ListIndexesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarDatabasesDollarCollectiongroupsDollarIndexesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleFirestoreAdminV1ListIndexesResponse]
  ): Unit = js.native
}

