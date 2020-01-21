package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import typings.googleGax.streamingMod.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/streamingCalls/streamDescriptor", JSImport.Namespace)
@js.native
object streamDescriptorMod extends js.Object {
  @js.native
  class StreamDescriptor protected () extends Descriptor {
    def this(streamType: StreamType) = this()
    var streaming: Boolean = js.native
    var `type`: StreamType = js.native
    /* CompleteClass */
    override def getApiCaller(settings: CallSettings): APICaller = js.native
  }
  
}

