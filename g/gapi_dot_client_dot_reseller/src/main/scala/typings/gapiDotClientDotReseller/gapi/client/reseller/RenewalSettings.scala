package typings.gapiDotClientDotReseller.gapi.client.reseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewalSettings extends js.Object {
  /** Identifies the resource as a subscription renewal setting. Value: subscriptions#renewalSettings */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. When renewing a
    * subscription, the renewalType is a required property.
    */
  var renewalType: js.UndefOr[String] = js.undefined
}

object RenewalSettings {
  @scala.inline
  def apply(kind: String = null, renewalType: String = null): RenewalSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (renewalType != null) __obj.updateDynamic("renewalType")(renewalType)
    __obj.asInstanceOf[RenewalSettings]
  }
}

