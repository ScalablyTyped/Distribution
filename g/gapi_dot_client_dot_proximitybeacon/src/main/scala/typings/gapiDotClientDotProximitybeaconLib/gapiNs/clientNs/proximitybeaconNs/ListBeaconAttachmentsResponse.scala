package typings
package gapiDotClientDotProximitybeaconLib.gapiNs.clientNs.proximitybeaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBeaconAttachmentsResponse extends js.Object {
  /** The attachments that corresponded to the request params. */
  var attachments: js.UndefOr[js.Array[BeaconAttachment]] = js.undefined
}

object ListBeaconAttachmentsResponse {
  @scala.inline
  def apply(attachments: js.Array[BeaconAttachment] = null): ListBeaconAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    __obj.asInstanceOf[ListBeaconAttachmentsResponse]
  }
}

