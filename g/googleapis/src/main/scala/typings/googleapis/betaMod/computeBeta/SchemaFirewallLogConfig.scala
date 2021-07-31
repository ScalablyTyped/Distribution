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
  
  @scala.inline
  def apply(): SchemaFirewallLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallLogConfig]
  }
  
  @scala.inline
  implicit class SchemaFirewallLogConfigMutableBuilder[Self <: SchemaFirewallLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
  }
}
