package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseWorkChangesInfo extends js.Object {
  var courseId: js.UndefOr[String] = js.undefined
}

object CourseWorkChangesInfo {
  @scala.inline
  def apply(courseId: String = null): CourseWorkChangesInfo = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CourseWorkChangesInfo]
  }
}

