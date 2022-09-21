package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetbillinginfo
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the project for which billing information is retrieved. For example, `projects/tokyo-rain-123`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetbillinginfo {
  
  inline def apply(): ParamsResourceProjectsGetbillinginfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetbillinginfo]
  }
  
  extension [Self <: ParamsResourceProjectsGetbillinginfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
