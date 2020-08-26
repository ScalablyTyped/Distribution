package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for an assignment.
  */
@js.native
trait SchemaAssignmentSubmission extends js.Object {
  /**
    * Attachments added by the student. Drive files that correspond to
    * materials with a share mode of STUDENT_COPY may not exist yet if the
    * student has not accessed the assignment in Classroom.  Some attachment
    * metadata is only populated if the requesting user has permission to
    * access it. Identifier and alternate_link fields are always available, but
    * others (e.g. title) may not be.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.native
}

object SchemaAssignmentSubmission {
  @scala.inline
  def apply(): SchemaAssignmentSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignmentSubmission]
  }
  @scala.inline
  implicit class SchemaAssignmentSubmissionOps[Self <: SchemaAssignmentSubmission] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: SchemaAttachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[SchemaAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
  }
  
}

