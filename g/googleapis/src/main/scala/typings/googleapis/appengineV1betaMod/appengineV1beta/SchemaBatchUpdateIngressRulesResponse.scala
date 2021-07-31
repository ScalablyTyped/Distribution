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
  
  @scala.inline
  def apply(): SchemaBatchUpdateIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdateIngressRulesResponseMutableBuilder[Self <: SchemaBatchUpdateIngressRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngressRules(value: js.Array[SchemaFirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    @scala.inline
    def setIngressRulesVarargs(value: SchemaFirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
  }
}
