package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextCreatedEvent extends StObject {
  
  var context: BaseAudioContext = js.native
}
object ContextCreatedEvent {
  
  @scala.inline
  def apply(context: BaseAudioContext): ContextCreatedEvent = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextCreatedEvent]
  }
  
  @scala.inline
  implicit class ContextCreatedEventMutableBuilder[Self <: ContextCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: BaseAudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
