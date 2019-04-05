package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.undefined
}

object MobileCarriersListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, mobileCarriers: js.Array[MobileCarrier] = null): MobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mobileCarriers != null) __obj.updateDynamic("mobileCarriers")(mobileCarriers)
    __obj.asInstanceOf[MobileCarriersListResponse]
  }
}

