package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productSet". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The list of product IDs making up the set of products. */
  var productId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The interpretation of this product set. "unknown" should never be sent and is ignored if received. "whitelist" means that the user is entitled to
    * access the product set. "includeAll" means that all products are accessible, including products that are approved, products with revoked approval, and
    * products that have never been approved. "allApproved" means that the user is entitled to access all products that are approved for the enterprise. If
    * the value is "allApproved" or "includeAll", the productId field is ignored. If no value is provided, it is interpreted as "whitelist" for backwards
    * compatibility. Further "allApproved" or "includeAll" does not enable automatic visibility of "alpha" or "beta" tracks for Android app. Use
    * ProductVisibility to enable "alpha" or "beta" tracks per user.
    */
  var productSetBehavior: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Other products that are part of the set, in addition to those specified in the productId array. The only difference between this field and the
    * productId array is that it's possible to specify additional information about this product visibility, see ProductVisibility and its fields for more
    * information. Specifying the same product ID both here and in the productId array is not allowed and it will result in an error.
    */
  var productVisibility: js.UndefOr[js.Array[ProductVisibility]] = js.undefined
}

object ProductSet {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    productId: js.Array[java.lang.String] = null,
    productSetBehavior: java.lang.String = null,
    productVisibility: js.Array[ProductVisibility] = null
  ): ProductSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (productSetBehavior != null) __obj.updateDynamic("productSetBehavior")(productSetBehavior)
    if (productVisibility != null) __obj.updateDynamic("productVisibility")(productVisibility)
    __obj.asInstanceOf[ProductSet]
  }
}

