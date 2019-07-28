package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recipient extends js.Object {
  /** The delivery type for the recipient. */
  var deliveryType: js.UndefOr[String] = js.undefined
  /** The email address of the recipient. */
  var email: js.UndefOr[String] = js.undefined
  /** The kind of resource this is, in this case dfareporting#recipient. */
  var kind: js.UndefOr[String] = js.undefined
}

object Recipient {
  @scala.inline
  def apply(deliveryType: String = null, email: String = null, kind: String = null): Recipient = {
    val __obj = js.Dynamic.literal()
    if (deliveryType != null) __obj.updateDynamic("deliveryType")(deliveryType)
    if (email != null) __obj.updateDynamic("email")(email)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Recipient]
  }
}

