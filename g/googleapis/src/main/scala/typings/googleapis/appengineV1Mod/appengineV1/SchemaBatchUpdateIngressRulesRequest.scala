package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for Firewall.BatchUpdateIngressRules.
  */
trait SchemaBatchUpdateIngressRulesRequest extends StObject {
  
  /**
    * A list of FirewallRules to replace the existing set.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.undefined
}
object SchemaBatchUpdateIngressRulesRequest {
  
  inline def apply(): SchemaBatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesRequest]
  }
  
  extension [Self <: SchemaBatchUpdateIngressRulesRequest](x: Self) {
    
    inline def setIngressRules(value: js.Array[SchemaFirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    inline def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    inline def setIngressRulesVarargs(value: SchemaFirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
  }
}
