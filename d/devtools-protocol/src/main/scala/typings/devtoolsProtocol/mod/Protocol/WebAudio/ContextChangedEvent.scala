package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextChangedEvent extends StObject {
  
  var context: BaseAudioContext
}
object ContextChangedEvent {
  
  inline def apply(context: BaseAudioContext): ContextChangedEvent = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextChangedEvent]
  }
  
  extension [Self <: ContextChangedEvent](x: Self) {
    
    inline def setContext(value: BaseAudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
