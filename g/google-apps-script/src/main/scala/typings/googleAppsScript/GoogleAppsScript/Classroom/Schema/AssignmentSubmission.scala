package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentSubmission extends js.Object {
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
}

object AssignmentSubmission {
  @scala.inline
  def apply(attachments: js.Array[Attachment] = null): AssignmentSubmission = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentSubmission]
  }
}

