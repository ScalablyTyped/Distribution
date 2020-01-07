package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details for assignments.
  */
@js.native
trait Schema$Assignment extends js.Object {
  /**
    * Drive folder where attachments from student submissions are placed. This
    * is only populated for course teachers and administrators.
    */
  var studentWorkFolder: js.UndefOr[Schema$DriveFolder] = js.native
}

object Schema$Assignment {
  @scala.inline
  def apply(studentWorkFolder: Schema$DriveFolder = null): Schema$Assignment = {
    val __obj = js.Dynamic.literal()
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Assignment]
  }
}

