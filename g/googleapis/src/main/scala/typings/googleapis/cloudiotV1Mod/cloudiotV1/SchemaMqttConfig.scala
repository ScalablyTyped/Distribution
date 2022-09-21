package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMqttConfig extends StObject {
  
  /**
    * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail.
    */
  var mqttEnabledState: js.UndefOr[String | Null] = js.undefined
}
object SchemaMqttConfig {
  
  inline def apply(): SchemaMqttConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMqttConfig]
  }
  
  extension [Self <: SchemaMqttConfig](x: Self) {
    
    inline def setMqttEnabledState(value: String): Self = StObject.set(x, "mqttEnabledState", value.asInstanceOf[js.Any])
    
    inline def setMqttEnabledStateNull: Self = StObject.set(x, "mqttEnabledState", null)
    
    inline def setMqttEnabledStateUndefined: Self = StObject.set(x, "mqttEnabledState", js.undefined)
  }
}
