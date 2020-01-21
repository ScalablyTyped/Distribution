package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.undefined
}

object MobileCarriersListResponse {
  @scala.inline
  def apply(kind: String = null, mobileCarriers: js.Array[MobileCarrier] = null): MobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobileCarriers != null) __obj.updateDynamic("mobileCarriers")(mobileCarriers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileCarriersListResponse]
  }
}

