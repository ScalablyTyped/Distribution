package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatcherConfig extends StObject {
  
  var HeartbeatPeriod: js.UndefOr[Duration] = js.undefined
}
object DispatcherConfig {
  
  @scala.inline
  def apply(): DispatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatcherConfig]
  }
  
  @scala.inline
  implicit class DispatcherConfigMutableBuilder[Self <: DispatcherConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeartbeatPeriod(value: Duration): Self = StObject.set(x, "HeartbeatPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatPeriodUndefined: Self = StObject.set(x, "HeartbeatPeriod", js.undefined)
  }
}
