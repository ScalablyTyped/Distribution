package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextChangedEvent extends StObject {
  
  var context: BaseAudioContext
}
object ContextChangedEvent {
  
  @scala.inline
  def apply(context: BaseAudioContext): ContextChangedEvent = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextChangedEvent]
  }
  
  @scala.inline
  implicit class ContextChangedEventMutableBuilder[Self <: ContextChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: BaseAudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
