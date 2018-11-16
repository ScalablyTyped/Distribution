package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Alert extends js.Object {
  /** Unique identifier of this alert. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this alert can be dismissed. */
  var isDismissible: js.UndefOr[scala.Boolean] = js.undefined
  /** Kind of resource this is, in this case adsense#alert. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The localized alert message. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** Severity of this alert. Possible values: INFO, WARNING, SEVERE. */
  var severity: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Type of this alert. Possible values: SELF_HOLD, MIGRATED_TO_BILLING3, ADDRESS_PIN_VERIFICATION, PHONE_PIN_VERIFICATION, CORPORATE_ENTITY,
               * GRAYLISTED_PUBLISHER, API_HOLD.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

