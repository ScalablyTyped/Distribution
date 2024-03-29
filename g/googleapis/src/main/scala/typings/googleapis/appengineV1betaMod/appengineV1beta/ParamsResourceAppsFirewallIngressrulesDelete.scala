package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsFirewallIngressrulesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the Firewall resource to delete. Example: apps/myapp/firewall/ingressRules/100.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var ingressRulesId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsFirewallIngressrulesDelete {
  
  inline def apply(): ParamsResourceAppsFirewallIngressrulesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsFirewallIngressrulesDelete]
  }
  
  extension [Self <: ParamsResourceAppsFirewallIngressrulesDelete](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setIngressRulesId(value: String): Self = StObject.set(x, "ingressRulesId", value.asInstanceOf[js.Any])
    
    inline def setIngressRulesIdUndefined: Self = StObject.set(x, "ingressRulesId", js.undefined)
  }
}
