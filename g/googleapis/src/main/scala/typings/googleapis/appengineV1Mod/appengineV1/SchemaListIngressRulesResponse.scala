package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for Firewall.ListIngressRules.
  */
trait SchemaListIngressRulesResponse extends StObject {
  
  /**
    * The ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListIngressRulesResponse {
  
  inline def apply(): SchemaListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListIngressRulesResponse]
  }
  
  extension [Self <: SchemaListIngressRulesResponse](x: Self) {
    
    inline def setIngressRules(value: js.Array[SchemaFirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    inline def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    inline def setIngressRulesVarargs(value: SchemaFirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
