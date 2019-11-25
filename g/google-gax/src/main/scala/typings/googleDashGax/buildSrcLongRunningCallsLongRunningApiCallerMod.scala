package typings.googleDashGax

import typings.googleDashGax.buildSrcApiCallerMod.APICaller
import typings.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typings.googleDashGax.buildSrcCallMod.OngoingCallPromise
import typings.googleDashGax.buildSrcGaxMod.CallOptions
import typings.googleDashGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longRunningCalls/longRunningApiCaller", JSImport.Namespace)
@js.native
object buildSrcLongRunningCallsLongRunningApiCallerMod extends js.Object {
  @js.native
  class LongrunningApiCaller protected () extends APICaller {
    /**
      * Creates an API caller that performs polling on a long running operation.
      *
      * @private
      * @constructor
      * @param {LongRunningDescriptor} longrunningDescriptor - Holds the
      * decoders used for unpacking responses and the operationsClient
      * used for polling the operation.
      */
    def this(longrunningDescriptor: LongRunningDescriptor) = this()
    var _wrapOperation: js.Any = js.native
    var longrunningDescriptor: LongRunningDescriptor = js.native
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallOptions,
      canceller: OngoingCallPromise
    ): Unit = js.native
  }
  
}

