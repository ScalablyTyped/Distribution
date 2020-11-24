package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of products.
  */
@js.native
trait SchemaProductSet extends js.Object {
  
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
  implicit class SchemaProductSetOps[Self <: SchemaProductSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProductIdVarargs(value: String*): Self = this.set("productId", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: js.Array[String]): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setProductSetBehavior(value: String): Self = this.set("productSetBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSetBehavior: Self = this.set("productSetBehavior", js.undefined)
    
    @scala.inline
    def setProductVisibilityVarargs(value: SchemaProductVisibility*): Self = this.set("productVisibility", js.Array(value :_*))
    
    @scala.inline
    def setProductVisibility(value: js.Array[SchemaProductVisibility]): Self = this.set("productVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductVisibility: Self = this.set("productVisibility", js.undefined)
  }
}
