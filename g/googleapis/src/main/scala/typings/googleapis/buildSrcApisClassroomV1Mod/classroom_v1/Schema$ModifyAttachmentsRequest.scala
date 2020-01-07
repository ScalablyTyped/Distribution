package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to modify the attachments of a student submission.
  */
@js.native
trait Schema$ModifyAttachmentsRequest extends js.Object {
  /**
    * Attachments to add. A student submission may not have more than 20
    * attachments.  Form attachments are not supported.
    */
  var addAttachments: js.UndefOr[js.Array[Schema$Attachment]] = js.native
}

object Schema$ModifyAttachmentsRequest {
  @scala.inline
  def apply(addAttachments: js.Array[Schema$Attachment] = null): Schema$ModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    if (addAttachments != null) __obj.updateDynamic("addAttachments")(addAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyAttachmentsRequest]
  }
}

