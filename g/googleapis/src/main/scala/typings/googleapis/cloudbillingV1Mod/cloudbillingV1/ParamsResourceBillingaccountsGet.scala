package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingaccountsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the billing account to retrieve. For example, `billingAccounts/012345-567890-ABCDEF`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBillingaccountsGet {
  
  inline def apply(): ParamsResourceBillingaccountsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingaccountsGet]
  }
  
  extension [Self <: ParamsResourceBillingaccountsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
