package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaOnDisplayToOrderSettings extends js.Object {
  var shippingCostPolicyUrl: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object LiaOnDisplayToOrderSettings {
  @scala.inline
  def apply(shippingCostPolicyUrl: String = null, status: String = null): LiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    if (shippingCostPolicyUrl != null) __obj.updateDynamic("shippingCostPolicyUrl")(shippingCostPolicyUrl)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiaOnDisplayToOrderSettings]
  }
}

