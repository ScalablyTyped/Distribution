package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The exact primary domain name of the enterprise to look up.
    */
  var domain: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesList {
  
  inline def apply(): ParamsResourceEnterprisesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesList]
  }
  
  extension [Self <: ParamsResourceEnterprisesList](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
