package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$Blobs")
@js.native
class Resource$Blobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * remotebuildexecution.blobs.batchRead
    * @desc Download many blobs at once.  The server may enforce a limit of the
    * combined total size of blobs to be downloaded using this API. This limit
    * may be obtained using the Capabilities API. Requests exceeding the limit
    * should either be split into smaller chunks or downloaded using the
    * ByteStream API, as appropriate.  This request is equivalent to calling a
    * Bytestream `Read` request on each individual blob, in parallel. The
    * requests may succeed or fail independently.  Errors:  *
    * `INVALID_ARGUMENT`: The client attempted to read more than the   server
    * supported limit.  Every error on individual read will be returned in the
    * corresponding digest status.
    * @alias remotebuildexecution.blobs.batchRead
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {().BuildBazelRemoteExecutionV2BatchReadBlobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchRead(): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  def batchRead(callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse]): Unit = js.native
  def batchRead(params: ParamsDollarResourceDollarBlobsDollarBatchread): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  def batchRead(
    params: ParamsDollarResourceDollarBlobsDollarBatchread,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  ): Unit = js.native
  def batchRead(
    params: ParamsDollarResourceDollarBlobsDollarBatchread,
    options: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse],
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  ): Unit = js.native
  def batchRead(params: ParamsDollarResourceDollarBlobsDollarBatchread, options: MethodOptions): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  def batchRead(
    params: ParamsDollarResourceDollarBlobsDollarBatchread,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchReadBlobsResponse]
  ): Unit = js.native
  /**
    * remotebuildexecution.blobs.batchUpdate
    * @desc Upload many blobs at once.  The server may enforce a limit of the
    * combined total size of blobs to be uploaded using this API. This limit
    * may be obtained using the Capabilities API. Requests exceeding the limit
    * should either be split into smaller chunks or uploaded using the
    * ByteStream API, as appropriate.  This request is equivalent to calling a
    * Bytestream `Write` request on each individual blob, in parallel. The
    * requests may succeed or fail independently.  Errors:  *
    * `INVALID_ARGUMENT`: The client attempted to upload more than the   server
    * supported limit.  Individual requests may return the following errors,
    * additionally:  * `RESOURCE_EXHAUSTED`: There is insufficient disk quota
    * to store the blob. * `INVALID_ARGUMENT`: The Digest does not match the
    * provided data.
    * @alias remotebuildexecution.blobs.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {().BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]): Unit = js.native
  def batchUpdate(params: ParamsDollarResourceDollarBlobsDollarBatchupdate): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarBlobsDollarBatchupdate,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarBlobsDollarBatchupdate,
    options: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse],
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsDollarResourceDollarBlobsDollarBatchupdate, options: MethodOptions): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarBlobsDollarBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse]
  ): Unit = js.native
  /**
    * remotebuildexecution.blobs.findMissing
    * @desc Determine if blobs are present in the CAS.  Clients can use this
    * API before uploading blobs to determine which ones are already present in
    * the CAS and do not need to be uploaded again.  There are no
    * method-specific errors.
    * @alias remotebuildexecution.blobs.findMissing
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {().BuildBazelRemoteExecutionV2FindMissingBlobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def findMissing(): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  def findMissing(callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse]): Unit = js.native
  def findMissing(params: ParamsDollarResourceDollarBlobsDollarFindmissing): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  def findMissing(
    params: ParamsDollarResourceDollarBlobsDollarFindmissing,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  ): Unit = js.native
  def findMissing(
    params: ParamsDollarResourceDollarBlobsDollarFindmissing,
    options: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse],
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  ): Unit = js.native
  def findMissing(params: ParamsDollarResourceDollarBlobsDollarFindmissing, options: MethodOptions): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  def findMissing(
    params: ParamsDollarResourceDollarBlobsDollarFindmissing,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2FindMissingBlobsResponse]
  ): Unit = js.native
  /**
    * remotebuildexecution.blobs.getTree
    * @desc Fetch the entire directory tree rooted at a node.  This request
    * must be targeted at a Directory stored in the ContentAddressableStorage
    * (CAS). The server will enumerate the `Directory` tree recursively and
    * return every node descended from the root.  The GetTreeRequest.page_token
    * parameter can be used to skip ahead in the stream (e.g. when retrying a
    * partially completed and aborted request), by setting it to a value taken
    * from GetTreeResponse.next_page_token of the last successfully processed
    * GetTreeResponse).  The exact traversal order is unspecified and, unless
    * retrieving subsequent pages from an earlier request, is not guaranteed to
    * be stable across multiple invocations of `GetTree`.  If part of the tree
    * is missing from the CAS, the server will return the portion present and
    * omit the rest.  * `NOT_FOUND`: The requested tree root is not present in
    * the CAS.
    * @alias remotebuildexecution.blobs.getTree
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.hash The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {integer=} params.pageSize A maximum page size to request. If present, the server will request no more than this many items. Regardless of whether a page size is specified, the server may place its own limit on the number of items to be returned and require the client to retrieve more items using a subsequent request.
    * @param {string=} params.pageToken A page token, which must be a value received in a previous GetTreeResponse. If present, the server will use it to return the following page of results.
    * @param {string} params.sizeBytes The size of the blob, in bytes.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getTree(): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2GetTreeResponse]): Unit = js.native
  def getTree(params: ParamsDollarResourceDollarBlobsDollarGettree): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(
    params: ParamsDollarResourceDollarBlobsDollarGettree,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2GetTreeResponse]
  ): Unit = js.native
  def getTree(
    params: ParamsDollarResourceDollarBlobsDollarGettree,
    options: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2GetTreeResponse],
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2GetTreeResponse]
  ): Unit = js.native
  def getTree(params: ParamsDollarResourceDollarBlobsDollarGettree, options: MethodOptions): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(
    params: ParamsDollarResourceDollarBlobsDollarGettree,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2GetTreeResponse]
  ): Unit = js.native
}

