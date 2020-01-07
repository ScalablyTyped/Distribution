package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of products.
  */
@js.native
trait Schema$ProductSet extends js.Object {
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
  var productVisibility: js.UndefOr[js.Array[Schema$ProductVisibility]] = js.native
}

object Schema$ProductSet {
  @scala.inline
  def apply(
    kind: String = null,
    productId: js.Array[String] = null,
    productSetBehavior: String = null,
    productVisibility: js.Array[Schema$ProductVisibility] = null
  ): Schema$ProductSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productSetBehavior != null) __obj.updateDynamic("productSetBehavior")(productSetBehavior.asInstanceOf[js.Any])
    if (productVisibility != null) __obj.updateDynamic("productVisibility")(productVisibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductSet]
  }
}

