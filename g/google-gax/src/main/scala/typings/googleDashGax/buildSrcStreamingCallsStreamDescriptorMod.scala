package typings.googleDashGax

import typings.googleDashGax.buildSrcApiCallerMod.APICaller
import typings.googleDashGax.buildSrcDescriptorMod.Descriptor
import typings.googleDashGax.buildSrcGaxMod.CallSettings
import typings.googleDashGax.buildSrcStreamingCallsStreamingMod.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streamingCalls/streamDescriptor", JSImport.Namespace)
@js.native
object buildSrcStreamingCallsStreamDescriptorMod extends js.Object {
  @js.native
  class StreamDescriptor protected () extends Descriptor {
    def this(streamType: StreamType) = this()
    var streaming: Boolean = js.native
    var `type`: StreamType = js.native
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
  }
  
}

