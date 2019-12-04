package typings.googleDashGax.buildSrcOperationsClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashAuthDashLibrary.buildSrcAuthGoogleauthMod.ProjectIdCallback
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashGax.buildSrcApitypesMod.CancellableStream
import typings.googleDashGax.buildSrcApitypesMod.ResponseType
import typings.googleDashGax.buildSrcCallMod.CancellablePromise
import typings.googleDashGax.buildSrcFallbackMod.GrpcClient
import typings.googleDashGax.buildSrcGaxMod.CallSettings
import typings.googleDashGax.googleDashGaxMod.Operation
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/operationsClient", "OperationsClient")
@js.native
class OperationsClient protected () extends js.Object {
  def this(gaxGrpc: GrpcClient, operationsProtos: js.Any, options: OperationsClientOptions) = this()
  def this(
    gaxGrpc: typings.googleDashGax.buildSrcGrpcMod.GrpcClient,
    operationsProtos: js.Any,
    options: OperationsClientOptions
  ) = this()
  var _innerApiCalls: js.Any = js.native
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
  def cancelOperation(request: js.Any): (CancellablePromise[
    js.Tuple3[
      ResponseType, 
      js.UndefOr[StringDictionary[String] | Null], 
      js.UndefOr[js.Object | Operation]
    ]
  ]) | CancellableStream = js.native
  def cancelOperation(request: js.Any, options: js.Any): (CancellablePromise[
    js.Tuple3[
      ResponseType, 
      js.UndefOr[StringDictionary[String] | Null], 
      js.UndefOr[js.Object | Operation]
    ]
  ]) | CancellableStream = js.native
  def cancelOperation(request: js.Any, options: js.Any, callback: js.Any): (CancellablePromise[
    js.Tuple3[
      ResponseType, 
      js.UndefOr[StringDictionary[String] | Null], 
      js.UndefOr[js.Object | Operation]
    ]
  ]) | CancellableStream = js.native
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
  def deleteOperation(request: js.Any, options: js.Any, callback: js.Any): (CancellablePromise[
    js.Tuple3[
      ResponseType, 
      js.UndefOr[StringDictionary[String] | Null], 
      js.UndefOr[js.Object | Operation]
    ]
  ]) | CancellableStream = js.native
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
  def getOperation(request: js.Object, options: js.Object): (CancellablePromise[
    js.Tuple3[
      ResponseType, 
      js.UndefOr[StringDictionary[String] | Null], 
      js.UndefOr[js.Object | Operation]
    ]
  ]) | CancellableStream = js.native
  def getOperation(request: js.Object, options: js.Object, callback: js.Any): (CancellablePromise[
    js.Tuple3[
      ResponseType, 
      js.UndefOr[StringDictionary[String] | Null], 
      js.UndefOr[js.Object | Operation]
    ]
  ]) | CancellableStream = js.native
  /**
    * Get the project ID used by this class.
    * @param {function(Error, string)} callback - the callback to be called with
    *   the current project Id.
    */
  def getProjectId(): js.Promise[String] = js.native
  def getProjectId(callback: ProjectIdCallback): Unit = js.native
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
  def listOperations(request: js.Any, options: js.Any, callback: js.Any): (CancellablePromise[
    js.Tuple3[
      ResponseType, 
      js.UndefOr[StringDictionary[String] | Null], 
      js.UndefOr[js.Object | Operation]
    ]
  ]) | CancellableStream = js.native
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
  def listOperationsStream(request: js.Object, options: CallSettings): Transform = js.native
}

