package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.callMod.OngoingCallPromise
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object longRunningApiCallerMod {
  
  @JSImport("google-gax/build/src/longRunningCalls/longRunningApiCaller", "LongrunningApiCaller")
  @js.native
  class LongrunningApiCaller protected ()
    extends StObject
       with APICaller {
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
    
    /* private */ var _wrapOperation: js.Any = js.native
    
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallOptions,
      canceller: OngoingCallPromise
    ): Unit = js.native
    
    var longrunningDescriptor: LongRunningDescriptor = js.native
  }
}
