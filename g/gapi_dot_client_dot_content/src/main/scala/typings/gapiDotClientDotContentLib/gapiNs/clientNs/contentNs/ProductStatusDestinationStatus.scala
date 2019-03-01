package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusDestinationStatus extends js.Object {
  /** The destination's approval status. */
  var approvalStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the destination */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the destination is required, excluded, selected by default or should be validated. */
  var intention: js.UndefOr[java.lang.String] = js.undefined
}

object ProductStatusDestinationStatus {
  @scala.inline
  def apply(
    approvalStatus: java.lang.String = null,
    destination: java.lang.String = null,
    intention: java.lang.String = null
  ): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (approvalStatus != null) __obj.updateDynamic("approvalStatus")(approvalStatus)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (intention != null) __obj.updateDynamic("intention")(intention)
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
}

