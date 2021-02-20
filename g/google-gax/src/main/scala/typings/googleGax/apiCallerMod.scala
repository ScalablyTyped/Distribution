package typings.googleGax

import typings.googleGax.apitypesMod.APICallback
import typings.googleGax.apitypesMod.CancellableStream
import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.ResultTuple
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.callMod.CancellablePromise
import typings.googleGax.callMod.OngoingCall
import typings.googleGax.callMod.OngoingCallPromise
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import typings.googleGax.googleErrorMod.GoogleError
import typings.googleGax.streamingMod.StreamProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiCallerMod {
  
  @JSImport("google-gax/build/src/apiCaller", "createAPICaller")
  @js.native
  def createAPICaller(settings: CallSettings): APICaller = js.native
  @JSImport("google-gax/build/src/apiCaller", "createAPICaller")
  @js.native
  def createAPICaller(settings: CallSettings, descriptor: Descriptor): APICaller = js.native
  
  @js.native
  trait APICaller extends StObject {
    
    def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: OngoingCall): Unit = js.native
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: js.Object,
      canceller: OngoingCallPromise
    ): Unit = js.native
    def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: StreamProxy): Unit = js.native
    
    def fail(canceller: CancellableStream, err: GoogleError): Unit = js.native
    def fail(canceller: OngoingCallPromise, err: GoogleError): Unit = js.native
    def fail(canceller: OngoingCall, err: GoogleError): Unit = js.native
    
    def init(): OngoingCallPromise | OngoingCall | StreamProxy = js.native
    def init(callback: APICallback): OngoingCallPromise | OngoingCall | StreamProxy = js.native
    
    def result(canceller: CancellableStream): CancellablePromise[ResultTuple] | CancellableStream = js.native
    def result(canceller: OngoingCall): CancellablePromise[ResultTuple] | CancellableStream = js.native
    def result(canceller: OngoingCallPromise): CancellablePromise[ResultTuple] | CancellableStream = js.native
    
    def wrap(func: GRPCCall): GRPCCall = js.native
  }
}
