package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductSet extends StObject {
  
  /**
    * The list of product IDs making up the set of products.
    */
  var productId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The interpretation of this product set. "unknown" should never be sent and is ignored if received. "whitelist" means that the user is entitled to access the product set. "includeAll" means that all products are accessible, including products that are approved, products with revoked approval, and products that have never been approved. "allApproved" means that the user is entitled to access all products that are approved for the enterprise. If the value is "allApproved" or "includeAll", the productId field is ignored. If no value is provided, it is interpreted as "whitelist" for backwards compatibility. Further "allApproved" or "includeAll" does not enable automatic visibility of "alpha" or "beta" tracks for Android app. Use ProductVisibility to enable "alpha" or "beta" tracks per user.
    */
  var productSetBehavior: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional list of product IDs making up the product set. Unlike the productID array, in this list It's possible to specify which tracks (alpha, beta, production) of a product are visible to the user. See ProductVisibility and its fields for more information. Specifying the same product ID both here and in the productId array is not allowed and it will result in an error.
    */
  var productVisibility: js.UndefOr[js.Array[SchemaProductVisibility]] = js.undefined
}
object SchemaProductSet {
  
  inline def apply(): SchemaProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSet]
  }
  
  extension [Self <: SchemaProductSet](x: Self) {
    
    inline def setProductId(value: js.Array[String]): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductIdVarargs(value: String*): Self = StObject.set(x, "productId", js.Array(value*))
    
    inline def setProductSetBehavior(value: String): Self = StObject.set(x, "productSetBehavior", value.asInstanceOf[js.Any])
    
    inline def setProductSetBehaviorNull: Self = StObject.set(x, "productSetBehavior", null)
    
    inline def setProductSetBehaviorUndefined: Self = StObject.set(x, "productSetBehavior", js.undefined)
    
    inline def setProductVisibility(value: js.Array[SchemaProductVisibility]): Self = StObject.set(x, "productVisibility", value.asInstanceOf[js.Any])
    
    inline def setProductVisibilityUndefined: Self = StObject.set(x, "productVisibility", js.undefined)
    
    inline def setProductVisibilityVarargs(value: SchemaProductVisibility*): Self = StObject.set(x, "productVisibility", js.Array(value*))
  }
}
