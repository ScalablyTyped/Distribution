package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A billing info feed lists Billing Info the Ad Exchange buyer account has
  * access to. Each entry in the feed corresponds to a single billing info.
  */
@js.native
trait Schema$BillingInfoList extends js.Object {
  /**
    * A list of billing info relevant for your account.
    */
  var items: js.UndefOr[js.Array[Schema$BillingInfo]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$BillingInfoList {
  @scala.inline
  def apply(items: js.Array[Schema$BillingInfo] = null, kind: String = null): Schema$BillingInfoList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BillingInfoList]
  }
}

