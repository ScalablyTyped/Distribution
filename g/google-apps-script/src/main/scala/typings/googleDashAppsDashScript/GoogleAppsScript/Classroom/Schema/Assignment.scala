package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assignment extends js.Object {
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
}

object Assignment {
  @scala.inline
  def apply(studentWorkFolder: DriveFolder = null): Assignment = {
    val __obj = js.Dynamic.literal()
    if (studentWorkFolder != null) __obj.updateDynamic("studentWorkFolder")(studentWorkFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
}

