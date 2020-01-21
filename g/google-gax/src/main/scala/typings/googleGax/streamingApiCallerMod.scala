package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.CancellableStream
import typings.googleGax.streamDescriptorMod.StreamDescriptor
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streamingCalls/streamingApiCaller", JSImport.Namespace)
@js.native
object streamingApiCallerMod extends js.Object {
  @js.native
  class StreamingApiCaller protected () extends APICaller {
    /**
      * An API caller for methods of gRPC streaming.
      * @private
      * @constructor
      * @param {StreamDescriptor} descriptor - the descriptor of the method structure.
      */
    def this(descriptor: StreamDescriptor) = this()
    var descriptor: StreamDescriptor = js.native
    def fail(stream: CancellableStream, err: Error): Unit = js.native
  }
  
}

