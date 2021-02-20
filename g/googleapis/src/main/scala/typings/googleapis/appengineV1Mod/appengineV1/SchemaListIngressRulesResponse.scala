package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for Firewall.ListIngressRules.
  */
@js.native
trait SchemaListIngressRulesResponse extends StObject {
  
  /**
    * The ingress FirewallRules for this application.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListIngressRulesResponse {
  
  @scala.inline
  def apply(): SchemaListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListIngressRulesResponse]
  }
  
  @scala.inline
  implicit class SchemaListIngressRulesResponseMutableBuilder[Self <: SchemaListIngressRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngressRules(value: js.Array[SchemaFirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    @scala.inline
    def setIngressRulesVarargs(value: SchemaFirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
