package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignment extends js.Object {
  /**
    * Drive folder where attachments from student submissions are placed.
    * This is only populated for course teachers and administrators.
    */
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
}

object Assignment {
  @scala.inline
  def apply(studentWorkFolder: DriveFolder = null): Assignment = {
    val __obj = js.Dynamic.literal()
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder)
    __obj.asInstanceOf[Assignment]
  }
}

