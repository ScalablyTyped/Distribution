package typings.googleGax

import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.streamingMod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamDescriptorMod {
  
  @JSImport("google-gax/build/src/streamingCalls/streamDescriptor", "StreamDescriptor")
  @js.native
  class StreamDescriptor protected () extends Descriptor {
    def this(streamType: StreamType) = this()
    
    var streaming: Boolean = js.native
    
    var `type`: StreamType = js.native
  }
}
