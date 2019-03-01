package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  /** Unique identifier of this alert. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adexchangeseller#alert. */
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

object Alert {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    message: java.lang.String = null,
    severity: java.lang.String = null,
    `type`: java.lang.String = null
  ): Alert = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (message != null) __obj.updateDynamic("message")(message)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Alert]
  }
}

