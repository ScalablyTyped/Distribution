package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePurchasesSubscriptionsv2Get
  extends StObject
     with StandardParameters {
  
  /**
    * The package of the application for which this subscription was purchased (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The token provided to the user's device when the subscription was purchased.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourcePurchasesSubscriptionsv2Get {
  
  inline def apply(): ParamsResourcePurchasesSubscriptionsv2Get = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesSubscriptionsv2Get]
  }
  
  extension [Self <: ParamsResourcePurchasesSubscriptionsv2Get](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
