package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseRosterChangesInfo extends js.Object {
  var courseId: js.UndefOr[String] = js.undefined
}

object CourseRosterChangesInfo {
  @scala.inline
  def apply(courseId: String = null): CourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    __obj.asInstanceOf[CourseRosterChangesInfo]
  }
}

