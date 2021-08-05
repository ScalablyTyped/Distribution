package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for Firewall.UpdateAllIngressRules.
  */
trait SchemaBatchUpdateIngressRulesResponse extends StObject {
  
  /**
    * The full list of ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.undefined
}
object SchemaBatchUpdateIngressRulesResponse {
  
  inline def apply(): SchemaBatchUpdateIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesResponse]
  }
  
  extension [Self <: SchemaBatchUpdateIngressRulesResponse](x: Self) {
    
    inline def setIngressRules(value: js.Array[SchemaFirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    inline def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    inline def setIngressRulesVarargs(value: SchemaFirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
  }
}
