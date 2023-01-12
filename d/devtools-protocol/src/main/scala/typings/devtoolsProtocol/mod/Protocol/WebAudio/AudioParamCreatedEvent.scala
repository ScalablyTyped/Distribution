package typings.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioParamCreatedEvent extends StObject {
  
  var param: AudioParam
}
object AudioParamCreatedEvent {
  
  inline def apply(param: AudioParam): AudioParamCreatedEvent = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamCreatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioParamCreatedEvent] (val x: Self) extends AnyVal {
    
    inline def setParam(value: AudioParam): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
  }
}
