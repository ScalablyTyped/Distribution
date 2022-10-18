package typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod

import typings.firebaseAuth.anon.DisableWarningsBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulatorConfig extends StObject {
  
  /**
    * The hostname of the emulator, which may be a domain ("localhost"), IPv4 address ("127.0.0.1")
    * or quoted IPv6 address ("[::1]").
    */
  val host: String
  
  /**
    * The emulator-specific options.
    */
  val options: DisableWarningsBoolean
  
  /**
    * The port of the emulator, or null if port isn't specified (i.e. protocol default).
    */
  val port: Double | Null
  
  /**
    * The protocol used to communicate with the emulator ("http"/"https").
    */
  val protocol: String
}
object EmulatorConfig {
  
  inline def apply(host: String, options: DisableWarningsBoolean, protocol: String): EmulatorConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], port = null)
    __obj.asInstanceOf[EmulatorConfig]
  }
  
  extension [Self <: EmulatorConfig](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: DisableWarningsBoolean): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
