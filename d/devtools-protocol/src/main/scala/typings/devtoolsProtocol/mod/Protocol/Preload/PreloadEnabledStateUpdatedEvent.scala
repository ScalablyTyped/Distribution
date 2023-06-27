package typings.devtoolsProtocol.mod.Protocol.Preload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadEnabledStateUpdatedEvent extends StObject {
  
  var disabledByBatterySaver: Boolean
  
  var disabledByDataSaver: Boolean
  
  var disabledByPreference: Boolean
}
object PreloadEnabledStateUpdatedEvent {
  
  inline def apply(disabledByBatterySaver: Boolean, disabledByDataSaver: Boolean, disabledByPreference: Boolean): PreloadEnabledStateUpdatedEvent = {
    val __obj = js.Dynamic.literal(disabledByBatterySaver = disabledByBatterySaver.asInstanceOf[js.Any], disabledByDataSaver = disabledByDataSaver.asInstanceOf[js.Any], disabledByPreference = disabledByPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadEnabledStateUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadEnabledStateUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setDisabledByBatterySaver(value: Boolean): Self = StObject.set(x, "disabledByBatterySaver", value.asInstanceOf[js.Any])
    
    inline def setDisabledByDataSaver(value: Boolean): Self = StObject.set(x, "disabledByDataSaver", value.asInstanceOf[js.Any])
    
    inline def setDisabledByPreference(value: Boolean): Self = StObject.set(x, "disabledByPreference", value.asInstanceOf[js.Any])
  }
}
