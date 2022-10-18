package typings.googleGax

import typings.googleGax.buildSrcApitypesMod.APICallback
import typings.googleGax.buildSrcApitypesMod.NextPageRequestType
import typings.googleGax.buildSrcApitypesMod.RawResponseType
import typings.googleGax.buildSrcApitypesMod.RequestType
import typings.googleGax.buildSrcApitypesMod.ResponseType
import typings.googleGax.buildSrcApitypesMod.ResultTuple
import typings.googleGax.buildSrcApitypesMod.SimpleCallbackFunction
import typings.googleGax.buildSrcGoogleErrorMod.GoogleError
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCallMod {
  
  @JSImport("google-gax/build/src/call", "OngoingCall")
  @js.native
  open class OngoingCall protected () extends StObject {
    /**
      * OngoingCall manages callback, API calls, and cancellation
      * of the API calls.
      * @param {APICallback=} callback
      *   The callback to be called asynchronously when the API call
      *   finishes.
      * @constructor
      * @property {APICallback} callback
      *   The callback function to be called.
      * @private
      */
    def this(callback: APICallback) = this()
    
    /**
      * Call calls the specified function. Result will be used to fulfill
      * the promise.
      *
      * @param {SimpleCallbackFunction} func
      *   A function for an API call.
      * @param {Object} argument
      *   A request object.
      */
    def call(func: SimpleCallbackFunction, argument: RequestType): Unit = js.native
    
    def callback(): Unit = js.native
    def callback(err: Null, response: Unit, next: Unit, rawResponse: RawResponseType): Unit = js.native
    def callback(err: Null, response: Unit, next: NextPageRequestType): Unit = js.native
    def callback(err: Null, response: Unit, next: NextPageRequestType, rawResponse: RawResponseType): Unit = js.native
    def callback(err: Null, response: ResponseType): Unit = js.native
    def callback(err: Null, response: ResponseType, next: Unit, rawResponse: RawResponseType): Unit = js.native
    def callback(err: Null, response: ResponseType, next: NextPageRequestType): Unit = js.native
    def callback(err: Null, response: ResponseType, next: NextPageRequestType, rawResponse: RawResponseType): Unit = js.native
    def callback(err: GoogleError): Unit = js.native
    def callback(err: GoogleError, response: Unit, next: Unit, rawResponse: RawResponseType): Unit = js.native
    def callback(err: GoogleError, response: Unit, next: NextPageRequestType): Unit = js.native
    def callback(err: GoogleError, response: Unit, next: NextPageRequestType, rawResponse: RawResponseType): Unit = js.native
    def callback(err: GoogleError, response: ResponseType): Unit = js.native
    def callback(err: GoogleError, response: ResponseType, next: Unit, rawResponse: RawResponseType): Unit = js.native
    def callback(err: GoogleError, response: ResponseType, next: NextPageRequestType): Unit = js.native
    def callback(err: GoogleError, response: ResponseType, next: NextPageRequestType, rawResponse: RawResponseType): Unit = js.native
    @JSName("callback")
    var callback_Original: APICallback = js.native
    
    /**
      * Cancels the ongoing promise.
      */
    def cancel(): Unit = js.native
    
    var cancelFunc: js.UndefOr[js.Function0[Unit]] = js.native
    
    var completed: Boolean = js.native
  }
  
  @JSImport("google-gax/build/src/call", "OngoingCallPromise")
  @js.native
  /**
    * GaxPromise is GRPCCallbackWrapper, but it holds a promise when
    * the API call finishes.
    * @constructor
    * @private
    */
  open class OngoingCallPromise () extends OngoingCall {
    
    var promise: CancellablePromise[ResultTuple] = js.native
  }
  
  @js.native
  trait CancellablePromise[T]
    extends StObject
       with Promise[T] {
    
    def cancel(): Unit = js.native
  }
}
