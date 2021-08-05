package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatcherConfig extends StObject {
  
  var HeartbeatPeriod: js.UndefOr[Duration] = js.undefined
}
object DispatcherConfig {
  
  inline def apply(): DispatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherConfig]
  }
  
  extension [Self <: DispatcherConfig](x: Self) {
    
    inline def setHeartbeatPeriod(value: Duration): Self = StObject.set(x, "HeartbeatPeriod", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatPeriodUndefined: Self = StObject.set(x, "HeartbeatPeriod", js.undefined)
  }
}
