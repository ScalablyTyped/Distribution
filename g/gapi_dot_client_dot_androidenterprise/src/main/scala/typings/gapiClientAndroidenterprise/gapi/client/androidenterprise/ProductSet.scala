package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productSet". */
  var kind: js.UndefOr[String] = js.native
  /** The list of product IDs making up the set of products. */
  var productId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The interpretation of this product set. "unknown" should never be sent and is ignored if received. "whitelist" means that the user is entitled to
    * access the product set. "includeAll" means that all products are accessible, including products that are approved, products with revoked approval, and
    * products that have never been approved. "allApproved" means that the user is entitled to access all products that are approved for the enterprise. If
    * the value is "allApproved" or "includeAll", the productId field is ignored. If no value is provided, it is interpreted as "whitelist" for backwards
    * compatibility. Further "allApproved" or "includeAll" does not enable automatic visibility of "alpha" or "beta" tracks for Android app. Use
    * ProductVisibility to enable "alpha" or "beta" tracks per user.
    */
  var productSetBehavior: js.UndefOr[String] = js.native
  /**
    * Other products that are part of the set, in addition to those specified in the productId array. The only difference between this field and the
    * productId array is that it's possible to specify additional information about this product visibility, see ProductVisibility and its fields for more
    * information. Specifying the same product ID both here and in the productId array is not allowed and it will result in an error.
    */
  var productVisibility: js.UndefOr[js.Array[ProductVisibility]] = js.native
}

object ProductSet {
  @scala.inline
  def apply(): ProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSet]
  }
  @scala.inline
  implicit class ProductSetOps[Self <: ProductSet] (val x: Self) extends AnyVal {
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
    def setProductVisibilityVarargs(value: ProductVisibility*): Self = this.set("productVisibility", js.Array(value :_*))
    @scala.inline
    def setProductVisibility(value: js.Array[ProductVisibility]): Self = this.set("productVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductVisibility: Self = this.set("productVisibility", js.undefined)
  }
  
}

