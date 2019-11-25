package typings.gapiDotClientDotLicensing.gapi.client.licensing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignment extends js.Object {
  /** ETag of the resource. */
  var etags: js.UndefOr[String] = js.undefined
  /** Identifies the resource as a LicenseAssignment. */
  var kind: js.UndefOr[String] = js.undefined
  /** Id of the product. */
  var productId: js.UndefOr[String] = js.undefined
  /** Display Name of the product. */
  var productName: js.UndefOr[String] = js.undefined
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Id of the sku of the product. */
  var skuId: js.UndefOr[String] = js.undefined
  /** Display Name of the sku of the product. */
  var skuName: js.UndefOr[String] = js.undefined
  /** Email id of the user. */
  var userId: js.UndefOr[String] = js.undefined
}

object LicenseAssignment {
  @scala.inline
  def apply(
    etags: String = null,
    kind: String = null,
    productId: String = null,
    productName: String = null,
    selfLink: String = null,
    skuId: String = null,
    skuName: String = null,
    userId: String = null
  ): LicenseAssignment = {
    val __obj = js.Dynamic.literal()
    if (etags != null) __obj.updateDynamic("etags")(etags.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    if (skuName != null) __obj.updateDynamic("skuName")(skuName.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseAssignment]
  }
}

