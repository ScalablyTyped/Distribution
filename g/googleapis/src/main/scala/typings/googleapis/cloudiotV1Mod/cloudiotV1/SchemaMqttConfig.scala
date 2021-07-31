package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration of MQTT for a device registry.
  */
trait SchemaMqttConfig extends StObject {
  
  /**
    * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
    * connections to this registry will fail.
    */
  var mqttEnabledState: js.UndefOr[String] = js.undefined
}
object SchemaMqttConfig {
  
  @scala.inline
  def apply(): SchemaMqttConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMqttConfig]
  }
  
  @scala.inline
  implicit class SchemaMqttConfigMutableBuilder[Self <: SchemaMqttConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMqttEnabledState(value: String): Self = StObject.set(x, "mqttEnabledState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMqttEnabledStateUndefined: Self = StObject.set(x, "mqttEnabledState", js.undefined)
  }
}
