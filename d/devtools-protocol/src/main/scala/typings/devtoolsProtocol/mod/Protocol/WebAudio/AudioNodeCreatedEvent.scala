package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioNodeCreatedEvent extends StObject {
  
  var node: AudioNode = js.native
}
object AudioNodeCreatedEvent {
  
  @scala.inline
  def apply(node: AudioNode): AudioNodeCreatedEvent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioNodeCreatedEvent]
  }
  
  @scala.inline
  implicit class AudioNodeCreatedEventMutableBuilder[Self <: AudioNodeCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: AudioNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
