package typings.googleDashAppsDashScript.GoogleAppsScript.AdminLicenseManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignment extends js.Object {
  var etags: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var productName: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var skuId: js.UndefOr[String] = js.undefined
  var skuName: js.UndefOr[String] = js.undefined
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

