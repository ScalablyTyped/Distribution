package typings
package googleDashGaxLib.buildSrcLongrunningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longrunning", "Operation")
@js.native
class Operation protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Wrapper for a google.longrunnung.Operation.
    *
    * @constructor
    *
    * @param {google.longrunning.Operation} grpcOp - The operation to be wrapped.
    * @param {LongrunningDescriptor} longrunningDescriptor - This defines the
    * operations service client and unpacking mechanisms for the operation.
    * @param {BackoffSettings} backoffSettings - The backoff settings used in
    * in polling the operation.
    * @param {CallOptions=} callOptions - CallOptions used in making get operation
    * requests.
    */
  def this(grpcOp: Operation, longrunningDescriptor: LongrunningDescriptor, backoffSettings: googleDashGaxLib.buildSrcGaxMod.BackoffSettings) = this()
  def this(grpcOp: Operation, longrunningDescriptor: LongrunningDescriptor, backoffSettings: googleDashGaxLib.buildSrcGaxMod.BackoffSettings, callOptions: googleDashGaxLib.buildSrcGaxMod.CallOptions) = this()
  var _callOptions: js.UndefOr[googleDashGaxLib.buildSrcGaxMod.CallOptions] = js.native
  var backoffSettings: googleDashGaxLib.buildSrcGaxMod.BackoffSettings = js.native
  var completeListeners: scala.Double = js.native
  var currentCallPromise_ : js.UndefOr[googleDashGaxLib.buildSrcApiCallableMod.CancellablePromise[_]] = js.native
  var done: js.UndefOr[scala.Boolean] = js.native
  var error: js.UndefOr[googleDashGaxLib.buildSrcGoogleErrorMod.GoogleError] = js.native
  var hasActiveListeners: scala.Boolean = js.native
  var latestResponse: Operation = js.native
  var longrunningDescriptor: LongrunningDescriptor = js.native
  var metadata: googleDashGaxLib.buildSrcGrpcMod.Metadata | scala.Null = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var response: js.UndefOr[googleDashGaxLib.Anon_Value] = js.native
  var result: js.Object | scala.Null = js.native
  /**
    * Begin listening for events on the operation. This method keeps track of how
    * many "complete" listeners are registered and removed, making sure polling
    * is handled automatically.
    *
    * As long as there is one active "complete" listener, the connection is open.
    * When there are no more listeners, the polling stops.
    *
    * @private
    */
  def _listenForEvents(): scala.Unit = js.native
  def _unpackResponse(op: Operation): scala.Unit = js.native
  def _unpackResponse(op: Operation, callback: GetOperationCallback): scala.Unit = js.native
  /**
    * Cancels current polling api call and cancels the operation.
    *
    * @return {Promise} the promise of the OperationsClient#cancelOperation api
    * request.
    */
  def cancel(): js.Any = js.native
  /**
    * Get the updated status of the operation. If the Operation has previously
    * completed, this will use the status of the cached completed operation.
    *
    *   - callback(err): Operation failed
    *   - callback(null, result, metadata, rawResponse): Operation complete
    *   - callback(null, null, metadata, rawResponse): Operation incomplete
    *
    * @param {getOperationCallback} callback - Callback to handle the polled
    * operation result and metadata.
    * @return {Promise|undefined} - This returns a promise if a callback is not specified.
    * The promise resolves to an array where the first element is the unpacked
    * result, the second element is the metadata, and the third element is the
    * raw response of the api call. The promise rejects if the operation returns
    * an error.
    */
  def getOperation(): js.Promise[js.Object] = js.native
  def getOperation(callback: GetOperationCallback): scala.Unit = js.native
  /**
    * Wraps the `complete` and `error` events in a Promise.
    *
    * @return {promise} - Promise that resolves on operation completion and rejects
    * on operation error.
    */
  def promise(): js.Promise[js.Object] = js.native
  /**
    * Poll `getOperation` to check the operation's status. This runs a loop to
    * ping using the backoff strategy specified at initialization.
    *
    * Note: This method is automatically called once a "complete" event handler
    * is registered on the operation.
    *
    * @private
    */
  def startPolling_(): scala.Unit = js.native
}

