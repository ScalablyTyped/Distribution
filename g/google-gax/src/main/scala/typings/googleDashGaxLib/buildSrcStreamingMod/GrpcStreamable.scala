package typings
package googleDashGaxLib.buildSrcStreamingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streaming", "GrpcStreamable")
@js.native
class GrpcStreamable protected () extends js.Object {
  /**
    * An API caller for methods of gRPC streaming.
    * @private
    * @constructor
    * @param {StreamDescriptor} descriptor - the descriptor of the method structure.
    */
  def this(descriptor: StreamDescriptor) = this()
  var descriptor: StreamDescriptor = js.native
  def call(
    apiCall: googleDashGaxLib.buildSrcApiCallableMod.APICall,
    argument: js.Object,
    settings: js.Object,
    stream: StreamProxy
  ): scala.Unit = js.native
  def fail(stream: nodeLib.streamMod.Stream, err: stdLib.Error): scala.Unit = js.native
  def init(settings: js.Object, callback: googleDashGaxLib.buildSrcApiCallableMod.APICallback): StreamProxy = js.native
  def result(stream: nodeLib.streamMod.Stream): nodeLib.streamMod.Stream = js.native
  def wrap(func: js.Function): js.Function = js.native
}

