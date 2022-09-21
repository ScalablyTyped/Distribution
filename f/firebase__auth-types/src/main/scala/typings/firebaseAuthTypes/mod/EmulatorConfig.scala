package typings.firebaseAuthTypes.mod

import typings.firebaseAuthTypes.anon.DisableWarnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulatorConfig extends StObject {
  
  val host: String
  
  val options: DisableWarnings
  
  val port: Double | Null
  
  val protocol: String
}
object EmulatorConfig {
  
  inline def apply(host: String, options: DisableWarnings, protocol: String): EmulatorConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], port = null)
    __obj.asInstanceOf[EmulatorConfig]
  }
  
  extension [Self <: EmulatorConfig](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: DisableWarnings): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
