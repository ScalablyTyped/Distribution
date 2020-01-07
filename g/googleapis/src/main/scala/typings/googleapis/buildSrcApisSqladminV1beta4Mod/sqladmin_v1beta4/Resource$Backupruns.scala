package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Backupruns")
@js.native
class Resource$Backupruns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.backupRuns.delete
    * @desc Deletes the backup taken by a backup run.
    * @alias sql.backupRuns.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the Backup Run to delete. To find a Backup Run ID, use the list method.
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBackuprunsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarBackuprunsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarBackuprunsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarBackuprunsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarBackuprunsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.backupRuns.get
    * @desc Retrieves a resource containing information about a backup run.
    * @alias sql.backupRuns.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of this Backup Run.
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$BackupRun] = js.native
  def get(callback: BodyResponseCallback[Schema$BackupRun]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBackuprunsDollarGet): GaxiosPromise[Schema$BackupRun] = js.native
  def get(
    params: ParamsDollarResourceDollarBackuprunsDollarGet,
    callback: BodyResponseCallback[Schema$BackupRun]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBackuprunsDollarGet,
    options: BodyResponseCallback[Schema$BackupRun],
    callback: BodyResponseCallback[Schema$BackupRun]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBackuprunsDollarGet, options: MethodOptions): GaxiosPromise[Schema$BackupRun] = js.native
  def get(
    params: ParamsDollarResourceDollarBackuprunsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BackupRun]
  ): Unit = js.native
  /**
    * sql.backupRuns.insert
    * @desc Creates a new backup run on demand. This method is applicable only
    * to Second Generation instances.
    * @alias sql.backupRuns.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().BackupRun} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBackuprunsDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarBackuprunsDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarBackuprunsDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarBackuprunsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarBackuprunsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.backupRuns.list
    * @desc Lists all backup runs associated with a given instance and
    * configuration in the reverse chronological order of the backup initiation
    * time.
    * @alias sql.backupRuns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {integer=} params.maxResults Maximum number of backup runs per response.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$BackupRunsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$BackupRunsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBackuprunsDollarList): GaxiosPromise[Schema$BackupRunsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBackuprunsDollarList,
    callback: BodyResponseCallback[Schema$BackupRunsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBackuprunsDollarList,
    options: BodyResponseCallback[Schema$BackupRunsListResponse],
    callback: BodyResponseCallback[Schema$BackupRunsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBackuprunsDollarList, options: MethodOptions): GaxiosPromise[Schema$BackupRunsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarBackuprunsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BackupRunsListResponse]
  ): Unit = js.native
}

