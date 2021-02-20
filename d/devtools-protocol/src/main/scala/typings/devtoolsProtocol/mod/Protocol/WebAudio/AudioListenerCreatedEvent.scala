package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioListenerCreatedEvent extends StObject {
  
  var listener: AudioListener = js.native
}
object AudioListenerCreatedEvent {
  
  @scala.inline
  def apply(listener: AudioListener): AudioListenerCreatedEvent = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListenerCreatedEvent]
  }
  
  @scala.inline
  implicit class AudioListenerCreatedEventMutableBuilder[Self <: AudioListenerCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListener(value: AudioListener): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
  }
}
