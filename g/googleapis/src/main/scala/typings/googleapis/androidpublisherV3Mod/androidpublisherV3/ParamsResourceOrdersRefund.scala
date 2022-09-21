package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrdersRefund
  extends StObject
     with StandardParameters {
  
  /**
    * The order ID provided to the user when the subscription or in-app order was purchased.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * The package name of the application for which this subscription or in-app item was purchased (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to revoke the purchased item. If set to true, access to the subscription or in-app item will be terminated immediately. If the item is a recurring subscription, all future payments will also be terminated. Consumed in-app items need to be handled by developer's app. (optional).
    */
  var revoke: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceOrdersRefund {
  
  inline def apply(): ParamsResourceOrdersRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersRefund]
  }
  
  extension [Self <: ParamsResourceOrdersRefund](x: Self) {
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRevoke(value: Boolean): Self = StObject.set(x, "revoke", value.asInstanceOf[js.Any])
    
    inline def setRevokeUndefined: Self = StObject.set(x, "revoke", js.undefined)
  }
}
