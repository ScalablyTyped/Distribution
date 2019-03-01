package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailOwner extends js.Object {
  /** Whether the report should be emailed to the report owner. */
  var emailOwner: js.UndefOr[scala.Boolean] = js.undefined
  /** The type of delivery for the owner to receive, if enabled. */
  var emailOwnerDeliveryType: js.UndefOr[java.lang.String] = js.undefined
  /** The message to be sent with each email. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** The list of recipients to which to email the report. */
  var recipients: js.UndefOr[
    js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.Recipient]
  ] = js.undefined
}

object Anon_EmailOwner {
  @scala.inline
  def apply(
    emailOwner: js.UndefOr[scala.Boolean] = js.undefined,
    emailOwnerDeliveryType: java.lang.String = null,
    message: java.lang.String = null,
    recipients: js.Array[gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs.Recipient] = null
  ): Anon_EmailOwner = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emailOwner)) __obj.updateDynamic("emailOwner")(emailOwner)
    if (emailOwnerDeliveryType != null) __obj.updateDynamic("emailOwnerDeliveryType")(emailOwnerDeliveryType)
    if (message != null) __obj.updateDynamic("message")(message)
    if (recipients != null) __obj.updateDynamic("recipients")(recipients)
    __obj.asInstanceOf[Anon_EmailOwner]
  }
}

