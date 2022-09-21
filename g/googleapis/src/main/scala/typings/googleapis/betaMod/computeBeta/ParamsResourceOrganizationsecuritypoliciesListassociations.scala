package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsecuritypoliciesListassociations
  extends StObject
     with StandardParameters {
  
  /**
    * The target resource to list associations. It is an organization, or a folder.
    */
  var targetResource: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsecuritypoliciesListassociations {
  
  inline def apply(): ParamsResourceOrganizationsecuritypoliciesListassociations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesListassociations]
  }
  
  extension [Self <: ParamsResourceOrganizationsecuritypoliciesListassociations](x: Self) {
    
    inline def setTargetResource(value: String): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
  }
}
