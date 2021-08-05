package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The available logging options for a firewall rule.
  */
trait SchemaFirewallLogConfig extends StObject {
  
  /**
    * This field denotes whether to enable logging for a particular firewall
    * rule.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
}
object SchemaFirewallLogConfig {
  
  inline def apply(): SchemaFirewallLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallLogConfig]
  }
  
  extension [Self <: SchemaFirewallLogConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
