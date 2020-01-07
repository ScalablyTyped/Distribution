package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/datastore/v1beta3", "datastore_v1beta3.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
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

