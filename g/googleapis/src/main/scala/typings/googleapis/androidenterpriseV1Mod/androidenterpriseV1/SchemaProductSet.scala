package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of products.
  */
@js.native
trait SchemaProductSet extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productSet&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The list of product IDs making up the set of products.
    */
  var productId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The interpretation of this product set. &quot;unknown&quot; should never
    * be sent and is ignored if received. &quot;whitelist&quot; means that the
    * user is entitled to access the product set. &quot;includeAll&quot; means
    * that all products are accessible, including products that are approved,
    * products with revoked approval, and products that have never been
    * approved. &quot;allApproved&quot; means that the user is entitled to
    * access all products that are approved for the enterprise. If the value is
    * &quot;allApproved&quot; or &quot;includeAll&quot;, the productId field is
    * ignored. If no value is provided, it is interpreted as
    * &quot;whitelist&quot; for backwards compatibility. Further
    * &quot;allApproved&quot; or &quot;includeAll&quot; does not enable
    * automatic visibility of &quot;alpha&quot; or &quot;beta&quot; tracks for
    * Android app. Use ProductVisibility to enable &quot;alpha&quot; or
    * &quot;beta&quot; tracks per user.
    */
  var productSetBehavior: js.UndefOr[String] = js.native
  
  /**
    * Additional list of product IDs making up the product set. Unlike the
    * productID array, in this list It&#39;s possible to specify which tracks
    * (alpha, beta, production) of a product are visible to the user. See
    * ProductVisibility and its fields for more information. Specifying the
    * same product ID both here and in the productId array is not allowed and
    * it will result in an error.
    */
  var productVisibility: js.UndefOr[js.Array[SchemaProductVisibility]] = js.native
}
object SchemaProductSet {
  
  @scala.inline
  def apply(): SchemaProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSet]
  }
  
  @scala.inline
  implicit class SchemaProductSetMutableBuilder[Self <: SchemaProductSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProductId(value: js.Array[String]): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductIdVarargs(value: String*): Self = StObject.set(x, "productId", js.Array(value :_*))
    
    @scala.inline
    def setProductSetBehavior(value: String): Self = StObject.set(x, "productSetBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSetBehaviorUndefined: Self = StObject.set(x, "productSetBehavior", js.undefined)
    
    @scala.inline
    def setProductVisibility(value: js.Array[SchemaProductVisibility]): Self = StObject.set(x, "productVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVisibilityUndefined: Self = StObject.set(x, "productVisibility", js.undefined)
    
    @scala.inline
    def setProductVisibilityVarargs(value: SchemaProductVisibility*): Self = StObject.set(x, "productVisibility", js.Array(value :_*))
  }
}
