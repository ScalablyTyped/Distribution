package typings
package gapiDotClientDotResellerLib.gapiNs.clientNs.resellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RenewalSettings extends js.Object {
  /** Identifies the resource as a subscription renewal setting. Value: subscriptions#renewalSettings */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Renewal settings for the annual commitment plan. For more detailed information, see renewal options in the administrator help center. When renewing a
               * subscription, the renewalType is a required property.
               */
  var renewalType: js.UndefOr[java.lang.String] = js.undefined
}

