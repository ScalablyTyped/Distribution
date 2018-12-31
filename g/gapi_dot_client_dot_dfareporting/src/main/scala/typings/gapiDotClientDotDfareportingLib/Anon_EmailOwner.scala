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

