package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Instances")
@js.native
class Resource$Instances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.instances.addServerCa
    * @desc Add a new trusted Certificate Authority (CA) version for the
    * specified instance. Required to prepare for a certificate rotation. If a
    * CA version was previously added but never used in a certificate rotation,
    * this operation replaces that version. There cannot be more than one CA
    * version waiting to be rotated in.
    * @alias sql.instances.addServerCa
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addServerCa(): GaxiosPromise[Schema$Operation] = js.native
  def addServerCa(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addServerCa(params: ParamsDollarResourceDollarInstancesDollarAddserverca): GaxiosPromise[Schema$Operation] = js.native
  def addServerCa(
    params: ParamsDollarResourceDollarInstancesDollarAddserverca,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addServerCa(
    params: ParamsDollarResourceDollarInstancesDollarAddserverca,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addServerCa(params: ParamsDollarResourceDollarInstancesDollarAddserverca, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addServerCa(
    params: ParamsDollarResourceDollarInstancesDollarAddserverca,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def clone(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def clone(params: ParamsDollarResourceDollarInstancesDollarClone): GaxiosPromise[Schema$Operation] = js.native
  def clone(
    params: ParamsDollarResourceDollarInstancesDollarClone,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def clone(
    params: ParamsDollarResourceDollarInstancesDollarClone,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def clone(params: ParamsDollarResourceDollarInstancesDollarClone, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def clone(
    params: ParamsDollarResourceDollarInstancesDollarClone,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.delete
    * @desc Deletes a Cloud SQL instance.
    * @alias sql.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstancesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInstancesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInstancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.demoteMaster
    * @desc Demotes the stand-alone instance to be a Cloud SQL read replica for
    * an external database server.
    * @alias sql.instances.demoteMaster
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance name.
    * @param {string} params.project ID of the project that contains the instance.
    * @param {().InstancesDemoteMasterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def demoteMaster(): GaxiosPromise[Schema$Operation] = js.native
  def demoteMaster(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def demoteMaster(params: ParamsDollarResourceDollarInstancesDollarDemotemaster): GaxiosPromise[Schema$Operation] = js.native
  def demoteMaster(
    params: ParamsDollarResourceDollarInstancesDollarDemotemaster,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def demoteMaster(
    params: ParamsDollarResourceDollarInstancesDollarDemotemaster,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def demoteMaster(params: ParamsDollarResourceDollarInstancesDollarDemotemaster, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def demoteMaster(
    params: ParamsDollarResourceDollarInstancesDollarDemotemaster,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.export
    * @desc Exports data from a Cloud SQL instance to a Cloud Storage bucket as
    * a SQL dump or CSV file.
    * @alias sql.instances.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance to be exported.
    * @param {().InstancesExportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[Schema$Operation] = js.native
  def export(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def export(params: ParamsDollarResourceDollarInstancesDollarExport): GaxiosPromise[Schema$Operation] = js.native
  def export(
    params: ParamsDollarResourceDollarInstancesDollarExport,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarInstancesDollarExport,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def export(params: ParamsDollarResourceDollarInstancesDollarExport, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def export(
    params: ParamsDollarResourceDollarInstancesDollarExport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.failover
    * @desc Failover the instance to its failover replica instance.
    * @alias sql.instances.failover
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {().InstancesFailoverRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def failover(): GaxiosPromise[Schema$Operation] = js.native
  def failover(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def failover(params: ParamsDollarResourceDollarInstancesDollarFailover): GaxiosPromise[Schema$Operation] = js.native
  def failover(
    params: ParamsDollarResourceDollarInstancesDollarFailover,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def failover(
    params: ParamsDollarResourceDollarInstancesDollarFailover,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def failover(params: ParamsDollarResourceDollarInstancesDollarFailover, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def failover(
    params: ParamsDollarResourceDollarInstancesDollarFailover,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.get
    * @desc Retrieves a resource containing information about a Cloud SQL
    * instance.
    * @alias sql.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Database instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DatabaseInstance] = js.native
  def get(callback: BodyResponseCallback[Schema$DatabaseInstance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstancesDollarGet): GaxiosPromise[Schema$DatabaseInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarInstancesDollarGet,
    callback: BodyResponseCallback[Schema$DatabaseInstance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInstancesDollarGet,
    options: BodyResponseCallback[Schema$DatabaseInstance],
    callback: BodyResponseCallback[Schema$DatabaseInstance]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInstancesDollarGet, options: MethodOptions): GaxiosPromise[Schema$DatabaseInstance] = js.native
  def get(
    params: ParamsDollarResourceDollarInstancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DatabaseInstance]
  ): Unit = js.native
  /**
    * sql.instances.import
    * @desc Imports data into a Cloud SQL instance from a SQL dump or CSV file in
    * Cloud Storage.
    * @alias sql.instances.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().InstancesImportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$Operation] = js.native
  def `import`(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarInstancesDollarImport): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarInstancesDollarImport,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarInstancesDollarImport,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarInstancesDollarImport, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarInstancesDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.insert
    * @desc Creates a new Cloud SQL instance.
    * @alias sql.instances.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID of the project to which the newly created Cloud SQL instances should belong.
    * @param {().DatabaseInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInstancesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInstancesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInstancesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.list
    * @desc Lists instances under a given project in the alphabetical order of
    * the instance name.
    * @alias sql.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An expression for filtering the results of the request, such as by name or label.
    * @param {integer=} params.maxResults The maximum number of results to return per response.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string} params.project Project ID of the project for which to list Cloud SQL instances.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$InstancesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$InstancesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstancesDollarList): GaxiosPromise[Schema$InstancesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInstancesDollarList,
    callback: BodyResponseCallback[Schema$InstancesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInstancesDollarList,
    options: BodyResponseCallback[Schema$InstancesListResponse],
    callback: BodyResponseCallback[Schema$InstancesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInstancesDollarList, options: MethodOptions): GaxiosPromise[Schema$InstancesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarInstancesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstancesListResponse]
  ): Unit = js.native
  /**
    * sql.instances.listServerCas
    * @desc Lists all of the trusted Certificate Authorities (CAs) for the
    * specified instance. There can be up to three CAs listed: the CA that was
    * used to sign the certificate that is currently in use, a CA that has been
    * added but not yet used to sign a certificate, and a CA used to sign a
    * certificate that has previously rotated out.
    * @alias sql.instances.listServerCas
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listServerCas(): GaxiosPromise[Schema$InstancesListServerCasResponse] = js.native
  def listServerCas(callback: BodyResponseCallback[Schema$InstancesListServerCasResponse]): Unit = js.native
  def listServerCas(params: ParamsDollarResourceDollarInstancesDollarListservercas): GaxiosPromise[Schema$InstancesListServerCasResponse] = js.native
  def listServerCas(
    params: ParamsDollarResourceDollarInstancesDollarListservercas,
    callback: BodyResponseCallback[Schema$InstancesListServerCasResponse]
  ): Unit = js.native
  def listServerCas(
    params: ParamsDollarResourceDollarInstancesDollarListservercas,
    options: BodyResponseCallback[Schema$InstancesListServerCasResponse],
    callback: BodyResponseCallback[Schema$InstancesListServerCasResponse]
  ): Unit = js.native
  def listServerCas(params: ParamsDollarResourceDollarInstancesDollarListservercas, options: MethodOptions): GaxiosPromise[Schema$InstancesListServerCasResponse] = js.native
  def listServerCas(
    params: ParamsDollarResourceDollarInstancesDollarListservercas,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstancesListServerCasResponse]
  ): Unit = js.native
  /**
    * sql.instances.patch
    * @desc Updates settings of a Cloud SQL instance. Caution: This is not a
    * partial update, so you must include values for all the settings that you
    * want to retain. For partial updates, use patch.. This method supports
    * patch semantics.
    * @alias sql.instances.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().DatabaseInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInstancesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarInstancesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarInstancesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInstancesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarInstancesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.promoteReplica
    * @desc Promotes the read replica instance to be a stand-alone Cloud SQL
    * instance.
    * @alias sql.instances.promoteReplica
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL read replica instance name.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def promoteReplica(): GaxiosPromise[Schema$Operation] = js.native
  def promoteReplica(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def promoteReplica(params: ParamsDollarResourceDollarInstancesDollarPromotereplica): GaxiosPromise[Schema$Operation] = js.native
  def promoteReplica(
    params: ParamsDollarResourceDollarInstancesDollarPromotereplica,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def promoteReplica(
    params: ParamsDollarResourceDollarInstancesDollarPromotereplica,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def promoteReplica(params: ParamsDollarResourceDollarInstancesDollarPromotereplica, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def promoteReplica(
    params: ParamsDollarResourceDollarInstancesDollarPromotereplica,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.resetSslConfig
    * @desc Deletes all client certificates and generates a new server SSL
    * certificate for the instance.
    * @alias sql.instances.resetSslConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetSslConfig(): GaxiosPromise[Schema$Operation] = js.native
  def resetSslConfig(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def resetSslConfig(params: ParamsDollarResourceDollarInstancesDollarResetsslconfig): GaxiosPromise[Schema$Operation] = js.native
  def resetSslConfig(
    params: ParamsDollarResourceDollarInstancesDollarResetsslconfig,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resetSslConfig(
    params: ParamsDollarResourceDollarInstancesDollarResetsslconfig,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resetSslConfig(params: ParamsDollarResourceDollarInstancesDollarResetsslconfig, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def resetSslConfig(
    params: ParamsDollarResourceDollarInstancesDollarResetsslconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.restart
    * @desc Restarts a Cloud SQL instance.
    * @alias sql.instances.restart
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance to be restarted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restart(): GaxiosPromise[Schema$Operation] = js.native
  def restart(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def restart(params: ParamsDollarResourceDollarInstancesDollarRestart): GaxiosPromise[Schema$Operation] = js.native
  def restart(
    params: ParamsDollarResourceDollarInstancesDollarRestart,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def restart(
    params: ParamsDollarResourceDollarInstancesDollarRestart,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def restart(params: ParamsDollarResourceDollarInstancesDollarRestart, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def restart(
    params: ParamsDollarResourceDollarInstancesDollarRestart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.restoreBackup
    * @desc Restores a backup of a Cloud SQL instance.
    * @alias sql.instances.restoreBackup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().InstancesRestoreBackupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restoreBackup(): GaxiosPromise[Schema$Operation] = js.native
  def restoreBackup(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def restoreBackup(params: ParamsDollarResourceDollarInstancesDollarRestorebackup): GaxiosPromise[Schema$Operation] = js.native
  def restoreBackup(
    params: ParamsDollarResourceDollarInstancesDollarRestorebackup,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def restoreBackup(
    params: ParamsDollarResourceDollarInstancesDollarRestorebackup,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def restoreBackup(params: ParamsDollarResourceDollarInstancesDollarRestorebackup, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def restoreBackup(
    params: ParamsDollarResourceDollarInstancesDollarRestorebackup,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.rotateServerCa
    * @desc Rotates the server certificate to one signed by the Certificate
    * Authority (CA) version previously added with the addServerCA method.
    * @alias sql.instances.rotateServerCa
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().InstancesRotateServerCaRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rotateServerCa(): GaxiosPromise[Schema$Operation] = js.native
  def rotateServerCa(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def rotateServerCa(params: ParamsDollarResourceDollarInstancesDollarRotateserverca): GaxiosPromise[Schema$Operation] = js.native
  def rotateServerCa(
    params: ParamsDollarResourceDollarInstancesDollarRotateserverca,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def rotateServerCa(
    params: ParamsDollarResourceDollarInstancesDollarRotateserverca,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def rotateServerCa(params: ParamsDollarResourceDollarInstancesDollarRotateserverca, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def rotateServerCa(
    params: ParamsDollarResourceDollarInstancesDollarRotateserverca,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.startReplica
    * @desc Starts the replication in the read replica instance.
    * @alias sql.instances.startReplica
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL read replica instance name.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startReplica(): GaxiosPromise[Schema$Operation] = js.native
  def startReplica(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def startReplica(params: ParamsDollarResourceDollarInstancesDollarStartreplica): GaxiosPromise[Schema$Operation] = js.native
  def startReplica(
    params: ParamsDollarResourceDollarInstancesDollarStartreplica,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startReplica(
    params: ParamsDollarResourceDollarInstancesDollarStartreplica,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startReplica(params: ParamsDollarResourceDollarInstancesDollarStartreplica, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def startReplica(
    params: ParamsDollarResourceDollarInstancesDollarStartreplica,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.stopReplica
    * @desc Stops the replication in the read replica instance.
    * @alias sql.instances.stopReplica
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL read replica instance name.
    * @param {string} params.project ID of the project that contains the read replica.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stopReplica(): GaxiosPromise[Schema$Operation] = js.native
  def stopReplica(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def stopReplica(params: ParamsDollarResourceDollarInstancesDollarStopreplica): GaxiosPromise[Schema$Operation] = js.native
  def stopReplica(
    params: ParamsDollarResourceDollarInstancesDollarStopreplica,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stopReplica(
    params: ParamsDollarResourceDollarInstancesDollarStopreplica,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def stopReplica(params: ParamsDollarResourceDollarInstancesDollarStopreplica, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def stopReplica(
    params: ParamsDollarResourceDollarInstancesDollarStopreplica,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.truncateLog
    * @desc Truncate MySQL general and slow query log tables
    * @alias sql.instances.truncateLog
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the Cloud SQL project.
    * @param {().InstancesTruncateLogRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def truncateLog(): GaxiosPromise[Schema$Operation] = js.native
  def truncateLog(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def truncateLog(params: ParamsDollarResourceDollarInstancesDollarTruncatelog): GaxiosPromise[Schema$Operation] = js.native
  def truncateLog(
    params: ParamsDollarResourceDollarInstancesDollarTruncatelog,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def truncateLog(
    params: ParamsDollarResourceDollarInstancesDollarTruncatelog,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def truncateLog(params: ParamsDollarResourceDollarInstancesDollarTruncatelog, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def truncateLog(
    params: ParamsDollarResourceDollarInstancesDollarTruncatelog,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * sql.instances.update
    * @desc Updates settings of a Cloud SQL instance. Caution: This is not a
    * partial update, so you must include values for all the settings that you
    * want to retain. For partial updates, use patch.
    * @alias sql.instances.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Cloud SQL instance ID. This does not include the project ID.
    * @param {string} params.project Project ID of the project that contains the instance.
    * @param {().DatabaseInstance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarInstancesDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarInstancesDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarInstancesDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarInstancesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarInstancesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

