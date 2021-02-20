package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.ProjectIdCallback
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleGax.apitypesMod.ResultTuple
import typings.googleGax.callMod.CancellablePromise
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.descriptorMod.PageDescriptor
import typings.googleGax.fallbackMod.GrpcClient
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.operationsMod.google.longrunning.CancelOperationRequest
import typings.googleGax.operationsMod.google.longrunning.DeleteOperationRequest
import typings.googleGax.operationsMod.google.longrunning.GetOperationRequest
import typings.googleGax.operationsMod.google.longrunning.ListOperationsRequest
import typings.googleGax.operationsMod.google.longrunning.ListOperationsResponse
import typings.googleGax.operationsMod.google.longrunning.Operation
import typings.googleGax.operationsMod.google.protobuf.Empty
import typings.node.streamMod.Transform
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationsClientMod {
  
  @JSImport("google-gax/build/src/operationsClient", "ALL_SCOPES")
  @js.native
  val ALL_SCOPES: js.Array[String] = js.native
  
  @JSImport("google-gax/build/src/operationsClient", "OperationsClient")
  @js.native
  class OperationsClient protected () extends StObject {
    def this(gaxGrpc: GrpcClient, operationsProtos: js.Any, options: ClientOptions) = this()
    def this(gaxGrpc: typings.googleGax.grpcMod.GrpcClient, operationsProtos: js.Any, options: ClientOptions) = this()
    
    var auth: js.UndefOr[GoogleAuth | OAuth2Client] = js.native
    
    /**
      * Starts asynchronous cancellation on a long-running operation.  The server
      * makes a best effort to cancel the operation, but success is not
      * guaranteed.  If the server doesn't support this method, it returns
      * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use
      * {@link Operations.GetOperation} or
      * other methods to check whether the cancellation succeeded or whether the
      * operation completed despite cancellation. On successful cancellation,
      * the operation is not deleted; instead, it becomes an operation with
      * an {@link Operation.error} value with a {@link google.rpc.Status.code} of
      * 1, corresponding to `Code.CANCELLED`.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource to be cancelled.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      * e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      * https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      * details.
      * @param {function(?Error)=} callback
      *   The function which will be called with the result of the API call.
      * @return {Promise} - The promise which resolves when API call finishes.
      *   The promise has a method named "cancel" which cancels the ongoing API
      * call.
      *
      * @example
      *
      * const client = longrunning.operationsClient();
      * await client.cancelOperation({name: ''});
      */
    def cancelOperation(request: CancelOperationRequest): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      optionsOrCallback: js.UndefOr[scala.Nothing],
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      optionsOrCallback: Callback[Empty, CancelOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      optionsOrCallback: Callback[Empty, CancelOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(request: CancelOperationRequest, optionsOrCallback: CallOptions): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      optionsOrCallback: CallOptions,
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    
    /**
      * Deletes a long-running operation. This method indicates that the client is
      * no longer interested in the operation result. It does not cancel the
      * operation. If the server doesn't support this method, it returns
      * `google.rpc.Code.UNIMPLEMENTED`.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource to be deleted.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      * e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      * https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      * details.
      * @param {function(?Error)=} callback
      *   The function which will be called with the result of the API call.
      * @return {Promise} - The promise which resolves when API call finishes.
      *   The promise has a method named "cancel" which cancels the ongoing API
      * call.
      *
      * @example
      *
      * const client = longrunning.operationsClient();
      * await client.deleteOperation({name: ''});
      */
    def deleteOperation(request: DeleteOperationRequest): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      optionsOrCallback: js.UndefOr[scala.Nothing],
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      optionsOrCallback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      optionsOrCallback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(request: DeleteOperationRequest, optionsOrCallback: CallOptions): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      optionsOrCallback: CallOptions,
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    
    var descriptor: StringDictionary[PageDescriptor] = js.native
    
    /**
      * Gets the latest state of a long-running operation.  Clients can use this
      * method to poll the operation result at intervals as recommended by the API
      * service.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      *   e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      *   https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      *   details.
      * @param {function(?Error, ?Object)=} callback
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing
      * [google.longrunning.Operation]{@link
      * external:"google.longrunning.Operation"}.
      * @return {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      * [google.longrunning.Operation]{@link
      * external:"google.longrunning.Operation"}. The promise has a method named
      * "cancel" which cancels the ongoing API call.
      *
      * @example
      *
      * const client = longrunning.operationsClient();
      * const name = '';
      * const [response] = await client.getOperation({name});
      * // doThingsWith(response)
      */
    def getOperation(request: GetOperationRequest): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      optionsOrCallback: js.UndefOr[scala.Nothing],
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      optionsOrCallback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      optionsOrCallback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(request: GetOperationRequest, optionsOrCallback: CallOptions): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      optionsOrCallback: CallOptions,
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    
    def getOperationInternal(request: GetOperationRequest): CancellablePromise[ResultTuple] = js.native
    def getOperationInternal(
      request: GetOperationRequest,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): CancellablePromise[ResultTuple] = js.native
    def getOperationInternal(request: GetOperationRequest, options: CallOptions): CancellablePromise[ResultTuple] = js.native
    def getOperationInternal(
      request: GetOperationRequest,
      options: CallOptions,
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): CancellablePromise[ResultTuple] = js.native
    
    /**
      * Get the project ID used by this class.
      * @param {function(Error, string)} callback - the callback to be called with
      *   the current project Id.
      */
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: ProjectIdCallback): Unit = js.native
    
    var innerApiCalls: StringDictionary[js.Function] = js.native
    
    /**
      * Lists operations that match the specified filter in the request. If the
      * server doesn't support this method, it returns `UNIMPLEMENTED`.
      *
      * NOTE: the `name` binding below allows API services to override the binding
      * to use different resource name schemes.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation collection.
      * @param {string} request.filter - The standard list filter.
      * @param {number=} request.pageSize
      *   The maximum number of resources contained in the underlying API
      *   response. If page streaming is performed per-resource, this
      *   parameter does not affect the return value. If page streaming is
      *   performed per-page, this determines the maximum number of
      *   resources in a page.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      * e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      * https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      * details.
      * @param {function(?Error, ?Array, ?Object, ?Object)=} callback
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is Array of
      * [google.longrunning.Operation]{@link
      * external:"google.longrunning.Operation"}.
      *
      *   When autoPaginate: false is specified through options, it contains the
      * result in a single response. If the response indicates the next page
      * exists, the third parameter is set to be used for the next request object.
      * The fourth parameter keeps the raw response object of an object
      * representing [google.longrunning.ListOperationsResponse]{@link
      * external:"google.longrunning.ListOperationsResponse"}.
      * @return {Promise} - The promise which resolves to an array.
      *   The first element of the array is Array of
      * [google.longrunning.Operation]{@link
      * external:"google.longrunning.Operation"}.
      *
      *   When autoPaginate: false is specified through options, the array has
      * three elements. The first element is Array of
      * [google.longrunning.Operation]{@link
      * external:"google.longrunning.Operation"} in a single response. The second
      * element is the next request object if the response indicates the next page
      * exists, or null. The third element is an object representing
      * [google.longrunning.ListOperationsResponse]{@link
      * external:"google.longrunning.ListOperationsResponse"}.
      *
      *   The promise has a method named "cancel" which cancels the ongoing API
      * call.
      *
      * @example
      *
      * const client = longrunning.operationsClient();
      * const request = {
      *     name: '',
      *     filter: ''
      * };
      * // Iterate over all elements.
      * const [resources] = await client.listOperations(request);
      * for (const resource of resources) {
      *   console.log(resources);
      * }
      *
      * // Or obtain the paged response.
      * const options = {autoPaginate: false};
      * let nextRequest = request;
      * while(nextRequest) {
      *   const response = await client.listOperations(nextRequest, options);
      *   const resources = response[0];
      *   nextRequest = response[1];
      *   const rawResponse = response[2];
      *   for (const resource of resources) {
      *     // doThingsWith(resource);
      *   }
      * };
      */
    def listOperations(request: ListOperationsRequest): js.Promise[ListOperationsResponse] = js.native
    def listOperations(
      request: ListOperationsRequest,
      optionsOrCallback: js.UndefOr[scala.Nothing],
      callback: Callback[ListOperationsResponse, ListOperationsRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[ListOperationsResponse] = js.native
    def listOperations(
      request: ListOperationsRequest,
      optionsOrCallback: Callback[ListOperationsResponse, ListOperationsRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[ListOperationsResponse] = js.native
    def listOperations(
      request: ListOperationsRequest,
      optionsOrCallback: Callback[ListOperationsResponse, ListOperationsRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[ListOperationsResponse, ListOperationsRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[ListOperationsResponse] = js.native
    def listOperations(request: ListOperationsRequest, optionsOrCallback: CallOptions): js.Promise[ListOperationsResponse] = js.native
    def listOperations(
      request: ListOperationsRequest,
      optionsOrCallback: CallOptions,
      callback: Callback[ListOperationsResponse, ListOperationsRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[ListOperationsResponse] = js.native
    
    /**
      * Equivalent to {@link listOperations}, but returns an iterable object.
      *
      * for-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation collection.
      * @param {string} request.filter - The standard list filter.
      * @param {number=} request.pageSize -
      *   The maximum number of resources contained in the underlying API
      *   response. If page streaming is performed per-resource, this
      *   parameter does not affect the return value. If page streaming is
      *   performed per-page, this determines the maximum number of
      *   resources in a page.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      *   e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      *   https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      *   details.
      * @returns {Object}
      *   An iterable Object that conforms to @link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols.
      */
    def listOperationsAsync(request: ListOperationsRequest): AsyncIterable[ListOperationsResponse] = js.native
    def listOperationsAsync(request: ListOperationsRequest, options: CallOptions): AsyncIterable[ListOperationsResponse] = js.native
    
    /**
      * Equivalent to {@link listOperations}, but returns a NodeJS Stream object.
      *
      * This fetches the paged responses for {@link listOperations} continuously
      * and invokes the callback registered for 'data' event for each element in
      * the responses.
      *
      * The returned object has 'end' method when no more elements are required.
      *
      * autoPaginate option will be ignored.
      *
      * @see {@link https://nodejs.org/api/stream.html}
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation collection.
      * @param {string} request.filter - The standard list filter.
      * @param {number=} request.pageSize -
      *   The maximum number of resources contained in the underlying API
      *   response. If page streaming is performed per-resource, this
      *   parameter does not affect the return value. If page streaming is
      *   performed per-page, this determines the maximum number of
      *   resources in a page.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      *   e.g, timeout, retries, paginations, etc. See [gax.CallOptions]{@link
      *   https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the
      *   details.
      * @return {Stream} - An object stream which emits an object representing [google.longrunning.Operation]{@link external:"google.longrunning.Operation"} on 'data' event.
      *
      * @example
      *
      * const client = longrunning.operationsClient();
      * const request = {
      *   name: '',
      *   filter: ''
      * };
      * client.listOperationsStream(request)
      *   .on('data', element => {
      *     // doThingsWith(element)
      *   })
      *   .on('error', err => {
      *     console.error(err);
      *   });
      */
    def listOperationsStream(request: ListOperationsRequest): Transform = js.native
    def listOperationsStream(request: ListOperationsRequest, options: CallOptions): Transform = js.native
  }
  
  @JSImport("google-gax/build/src/operationsClient", "OperationsClientBuilder")
  @js.native
  class OperationsClientBuilder protected () extends StObject {
    def this(gaxGrpc: GrpcClient) = this()
    /**
      * Builds a new Operations Client
      * @param gaxGrpc {GrpcClient}
      */
    def this(gaxGrpc: typings.googleGax.grpcMod.GrpcClient) = this()
    
    def operationsClient(opts: ClientOptions): OperationsClient = js.native
  }
  
  @JSImport("google-gax/build/src/operationsClient", "SERVICE_ADDRESS")
  @js.native
  val SERVICE_ADDRESS: /* "longrunning.googleapis.com" */ String = js.native
}
