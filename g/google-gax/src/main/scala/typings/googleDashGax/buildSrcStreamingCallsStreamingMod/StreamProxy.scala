package typings.googleDashGax.buildSrcStreamingCallsStreamingMod

import typings.googleDashGax.buildSrcApitypesMod.APICallback
import typings.googleDashGax.buildSrcApitypesMod.CancellableStream
import typings.googleDashGax.buildSrcApitypesMod.GRPCCallResult
import typings.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streamingCalls/streaming", "StreamProxy")
@js.native
class StreamProxy protected ()
  extends DuplexifyConstructor
     with GRPCCallResult {
  /**
    * StreamProxy is a proxy to gRPC-streaming method.
    *
    * @private
    * @constructor
    * @param {StreamType} type - the type of gRPC stream.
    * @param {ApiCallback} callback - the callback for further API call.
    */
  def this(`type`: StreamType, callback: APICallback) = this()
  var _callback: js.Any = js.native
  var _isCancelCalled: js.Any = js.native
  var stream: js.UndefOr[CancellableStream] = js.native
  var `type`: StreamType = js.native
  /* CompleteClass */
  override def cancel(): Unit = js.native
  /**
    * Forward events from an API request stream to the user's stream.
    * @param {Stream} stream - The API request stream.
    */
  def forwardEvents(stream: Stream): Unit = js.native
  /**
    * Specifies the target stream.
    * @param {ApiCall} apiCall - the API function to be called.
    * @param {Object} argument - the argument to be passed to the apiCall.
    */
  def setStream(apiCall: SimpleCallbackFunction, argument: js.Object): Unit = js.native
}

