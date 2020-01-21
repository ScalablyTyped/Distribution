package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusDestinationStatus extends js.Object {
  /** The destination's approval status. */
  var approvalStatus: js.UndefOr[String] = js.undefined
  /** The name of the destination */
  var destination: js.UndefOr[String] = js.undefined
  /** Whether the destination is required, excluded, selected by default or should be validated. */
  var intention: js.UndefOr[String] = js.undefined
}

object ProductStatusDestinationStatus {
  @scala.inline
  def apply(approvalStatus: String = null, destination: String = null, intention: String = null): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (approvalStatus != null) __obj.updateDynamic("approvalStatus")(approvalStatus.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (intention != null) __obj.updateDynamic("intention")(intention.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
}

