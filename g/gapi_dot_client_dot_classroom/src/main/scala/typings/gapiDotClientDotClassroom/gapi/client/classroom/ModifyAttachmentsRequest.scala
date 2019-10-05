package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyAttachmentsRequest extends js.Object {
  /**
    * Attachments to add.
    * A student submission may not have more than 20 attachments.
    *
    * Form attachments are not supported.
    */
  var addAttachments: js.UndefOr[js.Array[Attachment]] = js.undefined
}

object ModifyAttachmentsRequest {
  @scala.inline
  def apply(addAttachments: js.Array[Attachment] = null): ModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    if (addAttachments != null) __obj.updateDynamic("addAttachments")(addAttachments)
    __obj.asInstanceOf[ModifyAttachmentsRequest]
  }
}

