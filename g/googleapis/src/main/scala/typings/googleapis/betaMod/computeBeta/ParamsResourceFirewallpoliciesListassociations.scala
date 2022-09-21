package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirewallpoliciesListassociations
  extends StObject
     with StandardParameters {
  
  /**
    * The target resource to list associations. It is an organization, or a folder.
    */
  var targetResource: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirewallpoliciesListassociations {
  
  inline def apply(): ParamsResourceFirewallpoliciesListassociations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirewallpoliciesListassociations]
  }
  
  extension [Self <: ParamsResourceFirewallpoliciesListassociations](x: Self) {
    
    inline def setTargetResource(value: String): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
  }
}
