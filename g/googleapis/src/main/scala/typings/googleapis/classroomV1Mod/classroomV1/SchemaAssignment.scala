package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional details for assignments.
  */
@js.native
trait SchemaAssignment extends js.Object {
  /**
    * Drive folder where attachments from student submissions are placed. This
    * is only populated for course teachers and administrators.
    */
  var studentWorkFolder: js.UndefOr[SchemaDriveFolder] = js.native
}

object SchemaAssignment {
  @scala.inline
  def apply(studentWorkFolder: SchemaDriveFolder = null): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAssignment]
  }
}

