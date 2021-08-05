package typings.googleGax

import typings.googleGax.apitypesMod.ResultTuple
import typings.googleGax.callMod.CancellablePromise
import typings.googleGax.gaxMod.BackoffSettings
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.googleErrorMod.GoogleError
import typings.googleGax.grpcMod.Metadata
import typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.operationsMod.google.longrunning.Operation
import typings.googleGax.operationsMod.google.protobuf.Empty
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object longrunningMod {
  
  @JSImport("google-gax/build/src/longRunningCalls/longrunning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-gax/build/src/longRunningCalls/longrunning", "Operation")
  @js.native
  class Operation_ protected () extends EventEmitter {
    /**
      * Wrapper for a google.longrunnung.Operation.
      *
      * @constructor
      *
      * @param {google.longrunning.Operation} grpcOp - The operation to be wrapped.
      * @param {LongRunningDescriptor} longrunningDescriptor - This defines the
      * operations service client and unpacking mechanisms for the operation.
      * @param {BackoffSettings} backoffSettings - The backoff settings used in
      * in polling the operation.
      * @param {CallOptions} callOptions - CallOptions used in making get operation
      * requests.
      */
    def this(
      grpcOp: LROOperation,
      longrunningDescriptor: LongRunningDescriptor,
      backoffSettings: BackoffSettings
    ) = this()
    def this(
      grpcOp: LROOperation,
      longrunningDescriptor: LongRunningDescriptor,
      backoffSettings: BackoffSettings,
      callOptions: CallOptions
    ) = this()
    
    var _callOptions: js.UndefOr[CallOptions] = js.native
    
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
    def _listenForEvents(): Unit = js.native
    
    def _unpackResponse(op: LROOperation): Unit = js.native
    def _unpackResponse(op: LROOperation, callback: GetOperationCallback): Unit = js.native
    
    var backoffSettings: BackoffSettings = js.native
    
    /**
      * Cancels current polling api call and cancels the operation.
      *
      * @return {Promise} the promise of the OperationsClient#cancelOperation api
      * request.
      */
    def cancel(): js.Promise[Empty] = js.native
    
    var completeListeners: Double = js.native
    
    var currentCallPromise_ : js.UndefOr[CancellablePromise[ResultTuple]] = js.native
    
    var done: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[GoogleError] = js.native
    
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
    def getOperation(callback: GetOperationCallback): Unit = js.native
    
    var hasActiveListeners: Boolean = js.native
    
    var latestResponse: LROOperation = js.native
    
    var longrunningDescriptor: LongRunningDescriptor = js.native
    
    var metadata: Metadata | Null = js.native
    
    var name: js.UndefOr[String] = js.native
    
    /**
      * Wraps the `complete` and `error` events in a Promise.
      *
      * @return {promise} - Promise that resolves on operation completion and rejects
      * on operation error.
      */
    def promise(): js.Promise[js.Any] = js.native
    
    var response: js.UndefOr[js.Object] = js.native
    
    var result: js.Object | Null = js.native
    
    /**
      * Poll `getOperation` to check the operation's status. This runs a loop to
      * ping using the backoff strategy specified at initialization.
      *
      * Note: This method is automatically called once a "complete" event handler
      * is registered on the operation.
      *
      * @private
      */
    def startPolling_(): Unit = js.native
  }
  
  inline def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[Operation_]
  inline def operation(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[Operation_]
  
  type GetOperationCallback = js.Function4[
    /* err */ js.UndefOr[Error | Null], 
    /* result */ js.UndefOr[js.Object], 
    /* metadata */ js.UndefOr[js.Object], 
    /* rawResponse */ js.UndefOr[LROOperation], 
    Unit
  ]
  
  type LROOperation = Operation
}
