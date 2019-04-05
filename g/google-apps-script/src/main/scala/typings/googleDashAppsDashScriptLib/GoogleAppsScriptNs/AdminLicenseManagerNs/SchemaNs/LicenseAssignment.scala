package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminLicenseManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignment extends js.Object {
  var etags: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var productName: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var skuId: js.UndefOr[java.lang.String] = js.undefined
  var skuName: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object LicenseAssignment {
  @scala.inline
  def apply(
    etags: java.lang.String = null,
    kind: java.lang.String = null,
    productId: java.lang.String = null,
    productName: java.lang.String = null,
    selfLink: java.lang.String = null,
    skuId: java.lang.String = null,
    skuName: java.lang.String = null,
    userId: java.lang.String = null
  ): LicenseAssignment = {
    val __obj = js.Dynamic.literal()
    if (etags != null) __obj.updateDynamic("etags")(etags)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (skuId != null) __obj.updateDynamic("skuId")(skuId)
    if (skuName != null) __obj.updateDynamic("skuName")(skuName)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[LicenseAssignment]
  }
}

