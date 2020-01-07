package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore/v1", "datastore_v1.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var indexes: ResourceDollarProjectsDollarIndexes = js.native
  var operations: ResourceDollarProjectsDollarOperations = js.native
  /**
    * datastore.projects.allocateIds
    * @desc Allocates IDs for the given keys, which is useful for referencing
    * an entity before it is inserted.
    * @alias datastore.projects.allocateIds
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().AllocateIdsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def allocateIds(): GaxiosPromise[Schema$AllocateIdsResponse] = js.native
  def allocateIds(callback: BodyResponseCallback[Schema$AllocateIdsResponse]): Unit = js.native
  def allocateIds(params: ParamsDollarResourceDollarProjectsDollarAllocateids): GaxiosPromise[Schema$AllocateIdsResponse] = js.native
  def allocateIds(
    params: ParamsDollarResourceDollarProjectsDollarAllocateids,
    callback: BodyResponseCallback[Schema$AllocateIdsResponse]
  ): Unit = js.native
  def allocateIds(
    params: ParamsDollarResourceDollarProjectsDollarAllocateids,
    options: BodyResponseCallback[Schema$AllocateIdsResponse],
    callback: BodyResponseCallback[Schema$AllocateIdsResponse]
  ): Unit = js.native
  def allocateIds(params: ParamsDollarResourceDollarProjectsDollarAllocateids, options: MethodOptions): GaxiosPromise[Schema$AllocateIdsResponse] = js.native
  def allocateIds(
    params: ParamsDollarResourceDollarProjectsDollarAllocateids,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AllocateIdsResponse]
  ): Unit = js.native
  /**
    * datastore.projects.beginTransaction
    * @desc Begins a new transaction.
    * @alias datastore.projects.beginTransaction
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().BeginTransactionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def beginTransaction(): GaxiosPromise[Schema$BeginTransactionResponse] = js.native
  def beginTransaction(callback: BodyResponseCallback[Schema$BeginTransactionResponse]): Unit = js.native
  def beginTransaction(params: ParamsDollarResourceDollarProjectsDollarBegintransaction): GaxiosPromise[Schema$BeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsDollarResourceDollarProjectsDollarBegintransaction,
    callback: BodyResponseCallback[Schema$BeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(
    params: ParamsDollarResourceDollarProjectsDollarBegintransaction,
    options: BodyResponseCallback[Schema$BeginTransactionResponse],
    callback: BodyResponseCallback[Schema$BeginTransactionResponse]
  ): Unit = js.native
  def beginTransaction(params: ParamsDollarResourceDollarProjectsDollarBegintransaction, options: MethodOptions): GaxiosPromise[Schema$BeginTransactionResponse] = js.native
  def beginTransaction(
    params: ParamsDollarResourceDollarProjectsDollarBegintransaction,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BeginTransactionResponse]
  ): Unit = js.native
  /**
    * datastore.projects.commit
    * @desc Commits a transaction, optionally creating, deleting or modifying
    * some entities.
    * @alias datastore.projects.commit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().CommitRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def commit(): GaxiosPromise[Schema$CommitResponse] = js.native
  def commit(callback: BodyResponseCallback[Schema$CommitResponse]): Unit = js.native
  def commit(params: ParamsDollarResourceDollarProjectsDollarCommit): GaxiosPromise[Schema$CommitResponse] = js.native
  def commit(
    params: ParamsDollarResourceDollarProjectsDollarCommit,
    callback: BodyResponseCallback[Schema$CommitResponse]
  ): Unit = js.native
  def commit(
    params: ParamsDollarResourceDollarProjectsDollarCommit,
    options: BodyResponseCallback[Schema$CommitResponse],
    callback: BodyResponseCallback[Schema$CommitResponse]
  ): Unit = js.native
  def commit(params: ParamsDollarResourceDollarProjectsDollarCommit, options: MethodOptions): GaxiosPromise[Schema$CommitResponse] = js.native
  def commit(
    params: ParamsDollarResourceDollarProjectsDollarCommit,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommitResponse]
  ): Unit = js.native
  /**
    * datastore.projects.export
    * @desc Exports a copy of all or a subset of entities from Google Cloud
    * Datastore to another storage system, such as Google Cloud Storage. Recent
    * updates to entities may not be reflected in the export. The export occurs
    * in the background and its progress can be monitored and managed via the
    * Operation resource that is created. The output of an export may only be
    * used once the associated operation is done. If an export operation is
    * cancelled before completion it may leave partial data behind in Google
    * Cloud Storage.
    * @alias datastore.projects.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1ExportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def export(params: ParamsDollarResourceDollarProjectsDollarExport): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarExport,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarExport,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def export(params: ParamsDollarResourceDollarProjectsDollarExport, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarExport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * datastore.projects.import
    * @desc Imports entities into Google Cloud Datastore. Existing entities with
    * the same key are overwritten. The import occurs in the background and its
    * progress can be monitored and managed via the Operation resource that is
    * created. If an ImportEntities operation is cancelled, it is possible that a
    * subset of the data has already been imported to Cloud Datastore.
    * @alias datastore.projects.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID against which to make the request.
    * @param {().GoogleDatastoreAdminV1ImportEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarProjectsDollarImport): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarImport,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarImport,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarProjectsDollarImport, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * datastore.projects.lookup
    * @desc Looks up entities by key.
    * @alias datastore.projects.lookup
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().LookupRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lookup(): GaxiosPromise[Schema$LookupResponse] = js.native
  def lookup(callback: BodyResponseCallback[Schema$LookupResponse]): Unit = js.native
  def lookup(params: ParamsDollarResourceDollarProjectsDollarLookup): GaxiosPromise[Schema$LookupResponse] = js.native
  def lookup(
    params: ParamsDollarResourceDollarProjectsDollarLookup,
    callback: BodyResponseCallback[Schema$LookupResponse]
  ): Unit = js.native
  def lookup(
    params: ParamsDollarResourceDollarProjectsDollarLookup,
    options: BodyResponseCallback[Schema$LookupResponse],
    callback: BodyResponseCallback[Schema$LookupResponse]
  ): Unit = js.native
  def lookup(params: ParamsDollarResourceDollarProjectsDollarLookup, options: MethodOptions): GaxiosPromise[Schema$LookupResponse] = js.native
  def lookup(
    params: ParamsDollarResourceDollarProjectsDollarLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LookupResponse]
  ): Unit = js.native
  /**
    * datastore.projects.reserveIds
    * @desc Prevents the supplied keys' IDs from being auto-allocated by Cloud
    * Datastore.
    * @alias datastore.projects.reserveIds
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().ReserveIdsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reserveIds(): GaxiosPromise[Schema$ReserveIdsResponse] = js.native
  def reserveIds(callback: BodyResponseCallback[Schema$ReserveIdsResponse]): Unit = js.native
  def reserveIds(params: ParamsDollarResourceDollarProjectsDollarReserveids): GaxiosPromise[Schema$ReserveIdsResponse] = js.native
  def reserveIds(
    params: ParamsDollarResourceDollarProjectsDollarReserveids,
    callback: BodyResponseCallback[Schema$ReserveIdsResponse]
  ): Unit = js.native
  def reserveIds(
    params: ParamsDollarResourceDollarProjectsDollarReserveids,
    options: BodyResponseCallback[Schema$ReserveIdsResponse],
    callback: BodyResponseCallback[Schema$ReserveIdsResponse]
  ): Unit = js.native
  def reserveIds(params: ParamsDollarResourceDollarProjectsDollarReserveids, options: MethodOptions): GaxiosPromise[Schema$ReserveIdsResponse] = js.native
  def reserveIds(
    params: ParamsDollarResourceDollarProjectsDollarReserveids,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReserveIdsResponse]
  ): Unit = js.native
  /**
    * datastore.projects.rollback
    * @desc Rolls back a transaction.
    * @alias datastore.projects.rollback
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().RollbackRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rollback(): GaxiosPromise[Schema$RollbackResponse] = js.native
  def rollback(callback: BodyResponseCallback[Schema$RollbackResponse]): Unit = js.native
  def rollback(params: ParamsDollarResourceDollarProjectsDollarRollback): GaxiosPromise[Schema$RollbackResponse] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarRollback,
    callback: BodyResponseCallback[Schema$RollbackResponse]
  ): Unit = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarRollback,
    options: BodyResponseCallback[Schema$RollbackResponse],
    callback: BodyResponseCallback[Schema$RollbackResponse]
  ): Unit = js.native
  def rollback(params: ParamsDollarResourceDollarProjectsDollarRollback, options: MethodOptions): GaxiosPromise[Schema$RollbackResponse] = js.native
  def rollback(
    params: ParamsDollarResourceDollarProjectsDollarRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RollbackResponse]
  ): Unit = js.native
  /**
    * datastore.projects.runQuery
    * @desc Queries for entities.
    * @alias datastore.projects.runQuery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId The ID of the project against which to make the request.
    * @param {().RunQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runQuery(): GaxiosPromise[Schema$RunQueryResponse] = js.native
  def runQuery(callback: BodyResponseCallback[Schema$RunQueryResponse]): Unit = js.native
  def runQuery(params: ParamsDollarResourceDollarProjectsDollarRunquery): GaxiosPromise[Schema$RunQueryResponse] = js.native
  def runQuery(
    params: ParamsDollarResourceDollarProjectsDollarRunquery,
    callback: BodyResponseCallback[Schema$RunQueryResponse]
  ): Unit = js.native
  def runQuery(
    params: ParamsDollarResourceDollarProjectsDollarRunquery,
    options: BodyResponseCallback[Schema$RunQueryResponse],
    callback: BodyResponseCallback[Schema$RunQueryResponse]
  ): Unit = js.native
  def runQuery(params: ParamsDollarResourceDollarProjectsDollarRunquery, options: MethodOptions): GaxiosPromise[Schema$RunQueryResponse] = js.native
  def runQuery(
    params: ParamsDollarResourceDollarProjectsDollarRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RunQueryResponse]
  ): Unit = js.native
}

