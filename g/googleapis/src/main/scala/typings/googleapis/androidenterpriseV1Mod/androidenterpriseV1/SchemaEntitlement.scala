package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntitlement extends StObject {
  
  /**
    * The ID of the product that the entitlement is for. For example, "app:com.google.android.gm".
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason for the entitlement. For example, "free" for free apps. This property is temporary: it will be replaced by the acquisition kind field of group licenses.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntitlement {
  
  inline def apply(): SchemaEntitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntitlement]
  }
  
  extension [Self <: SchemaEntitlement](x: Self) {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
