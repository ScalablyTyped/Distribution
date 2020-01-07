package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Databases")
@js.native
class Resource$Databases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.databases.delete
    * @desc Deletes a database from a Cloud SQL instance.
    * @alias sql.databases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database to be deleted in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDatabasesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarDatabasesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDatabasesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDatabasesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarDatabasesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.databases.get
    * @desc Retrieves a resource containing information about a database inside
    * a Cloud SQL instance.
    * @alias sql.databases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Database] = js.native
  def get(callback: BodyResponseCallback[Schema$Database]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDatabasesDollarGet): GaxiosPromise[Schema$Database] = js.native
  def get(
    params: ParamsDollarResourceDollarDatabasesDollarGet,
    callback: BodyResponseCallback[Schema$Database]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDatabasesDollarGet,
    options: BodyResponseCallback[Schema$Database],
    callback: BodyResponseCallback[Schema$Database]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDatabasesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Database] = js.native
  def get(
    params: ParamsDollarResourceDollarDatabasesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Database]
  ): Unit = js.native
  /**
    * sql.databases.insert
    * @desc Inserts a resource containing information about a database inside a
    * Cloud SQL instance.
    * @alias sql.databases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().Database} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDatabasesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarDatabasesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarDatabasesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarDatabasesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarDatabasesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.databases.list
    * @desc Lists databases in the specified Cloud SQL instance.
    * @alias sql.databases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DatabasesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$DatabasesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDatabasesDollarList): GaxiosPromise[Schema$DatabasesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDatabasesDollarList,
    callback: BodyResponseCallback[Schema$DatabasesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDatabasesDollarList,
    options: BodyResponseCallback[Schema$DatabasesListResponse],
    callback: BodyResponseCallback[Schema$DatabasesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDatabasesDollarList, options: MethodOptions): GaxiosPromise[Schema$DatabasesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDatabasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatabasesListResponse]
  ): Unit = js.native
  /**
    * sql.databases.patch
    * @desc Updates a resource containing information about a database inside a
    * Cloud SQL instance. This method supports patch semantics.
    * @alias sql.databases.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database to be updated in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().Database} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDatabasesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarDatabasesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarDatabasesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarDatabasesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarDatabasesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.databases.update
    * @desc Updates a resource containing information about a database inside a
    * Cloud SQL instance.
    * @alias sql.databases.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.database Name of the database to be updated in the instance.
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().Database} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarDatabasesDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarDatabasesDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarDatabasesDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarDatabasesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarDatabasesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

