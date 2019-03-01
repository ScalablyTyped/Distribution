package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseRosterChangesInfo extends js.Object {
  /** The `course_id` of the course to subscribe to roster changes for. */
  var courseId: js.UndefOr[java.lang.String] = js.undefined
}

object CourseRosterChangesInfo {
  @scala.inline
  def apply(courseId: java.lang.String = null): CourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    __obj.asInstanceOf[CourseRosterChangesInfo]
  }
}

