package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for Firewall.BatchUpdateIngressRules.
  */
@js.native
trait SchemaBatchUpdateIngressRulesRequest extends StObject {
  
  /**
    * A list of FirewallRules to replace the existing set.
    */
  var ingressRules: js.UndefOr[js.Array[SchemaFirewallRule]] = js.native
}
object SchemaBatchUpdateIngressRulesRequest {
  
  @scala.inline
  def apply(): SchemaBatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateIngressRulesRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdateIngressRulesRequestMutableBuilder[Self <: SchemaBatchUpdateIngressRulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngressRules(value: js.Array[SchemaFirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    @scala.inline
    def setIngressRulesVarargs(value: SchemaFirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
  }
}
