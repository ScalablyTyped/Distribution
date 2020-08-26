package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBeaconAttachmentsResponse extends js.Object {
  /** The attachments that corresponded to the request params. */
  var attachments: js.UndefOr[js.Array[BeaconAttachment]] = js.native
}

object ListBeaconAttachmentsResponse {
  @scala.inline
  def apply(): ListBeaconAttachmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBeaconAttachmentsResponse]
  }
  @scala.inline
  implicit class ListBeaconAttachmentsResponseOps[Self <: ListBeaconAttachmentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachmentsVarargs(value: BeaconAttachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[BeaconAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
  }
  
}

