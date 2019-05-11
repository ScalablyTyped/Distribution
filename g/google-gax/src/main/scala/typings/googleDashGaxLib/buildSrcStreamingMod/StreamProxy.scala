package typings
package googleDashGaxLib.buildSrcStreamingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streaming", "StreamProxy")
@js.native
class StreamProxy protected () extends DuplexifyConstructor {
  /**
    * StreamProxy is a proxy to gRPC-streaming method.
    *
    * @private
    * @constructor
    * @param {StreamType} type - the type of gRPC stream.
    * @param {ApiCallback} callback - the callback for further API call.
    */
  def this(`type`: StreamType, callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback) = this()
  var _callback: js.UndefOr[js.Any] = js.native
  var _isCancelCalled: js.Any = js.native
  var stream: js.UndefOr[nodeLib.streamMod.Duplex with googleDashGaxLib.Anon_Cancel] = js.native
  var `type`: StreamType = js.native
  def cancel(): scala.Unit = js.native
  /**
    * Forward events from an API request stream to the user's stream.
    * @param {Stream} stream - The API request stream.
    */
  def forwardEvents(stream: nodeLib.streamMod.Stream): scala.Unit = js.native
  /**
    * Specifies the target stream.
    * @param {ApiCall} apiCall - the API function to be called.
    * @param {Object} argument - the argument to be passed to the apiCall.
    */
  def setStream(apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall, argument: js.Object): scala.Unit = js.native
}

