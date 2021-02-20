package typings.googleGax

import typings.googleGax.apitypesMod.APICallback
import typings.googleGax.apitypesMod.NextPageRequestType
import typings.googleGax.apitypesMod.RawResponseType
import typings.googleGax.apitypesMod.RequestType
import typings.googleGax.apitypesMod.ResponseType
import typings.googleGax.apitypesMod.ResultTuple
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.googleErrorMod.GoogleError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callMod {
  
  @JSImport("google-gax/build/src/call", "OngoingCall")
  @js.native
  class OngoingCall protected () extends StObject {
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
    def callback(
      err: Null,
      response: js.UndefOr[ResponseType],
      next: js.UndefOr[NextPageRequestType],
      rawResponse: RawResponseType
    ): Unit = js.native
    def callback(err: Null, response: js.UndefOr[ResponseType], next: NextPageRequestType): Unit = js.native
    def callback(err: Null, response: ResponseType): Unit = js.native
    def callback(err: GoogleError): Unit = js.native
    def callback(
      err: GoogleError,
      response: js.UndefOr[ResponseType],
      next: js.UndefOr[NextPageRequestType],
      rawResponse: RawResponseType
    ): Unit = js.native
    def callback(err: GoogleError, response: js.UndefOr[ResponseType], next: NextPageRequestType): Unit = js.native
    def callback(err: GoogleError, response: ResponseType): Unit = js.native
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
  class OngoingCallPromise () extends OngoingCall {
    
    var promise: CancellablePromise[ResultTuple] = js.native
  }
  
  @js.native
  trait CancellablePromise[T]
    extends js.Promise[T] {
    
    def cancel(): Unit = js.native
  }
}
