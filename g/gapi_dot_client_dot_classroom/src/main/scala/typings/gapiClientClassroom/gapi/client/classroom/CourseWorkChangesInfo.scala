package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseWorkChangesInfo extends js.Object {
  /** The `course_id` of the course to subscribe to work changes for. */
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

