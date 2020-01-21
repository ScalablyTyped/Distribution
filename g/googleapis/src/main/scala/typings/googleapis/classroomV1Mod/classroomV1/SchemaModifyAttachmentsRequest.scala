package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to modify the attachments of a student submission.
  */
@js.native
trait SchemaModifyAttachmentsRequest extends js.Object {
  /**
    * Attachments to add. A student submission may not have more than 20
    * attachments.  Form attachments are not supported.
    */
  var addAttachments: js.UndefOr[js.Array[SchemaAttachment]] = js.native
}

object SchemaModifyAttachmentsRequest {
  @scala.inline
  def apply(addAttachments: js.Array[SchemaAttachment] = null): SchemaModifyAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    if (addAttachments != null) __obj.updateDynamic("addAttachments")(addAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyAttachmentsRequest]
  }
}

