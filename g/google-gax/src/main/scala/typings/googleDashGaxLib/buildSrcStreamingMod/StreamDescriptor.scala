package typings
package googleDashGaxLib.buildSrcStreamingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streaming", "StreamDescriptor")
@js.native
class StreamDescriptor protected () extends js.Object {
  /**
    * Describes the structure of gRPC streaming call.
    * @constructor
    * @param {StreamType} streamType - the type of streaming.
    */
  def this(streamType: StreamType) = this()
  var `type`: StreamType = js.native
  def apiCaller(settings: googleDashGaxLib.Anon_Retry): GrpcStreamable = js.native
}

