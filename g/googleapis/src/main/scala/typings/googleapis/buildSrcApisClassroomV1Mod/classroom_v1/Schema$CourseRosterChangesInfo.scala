package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
  */
@js.native
trait Schema$CourseRosterChangesInfo extends js.Object {
  /**
    * The `course_id` of the course to subscribe to roster changes for.
    */
  var courseId: js.UndefOr[String] = js.native
}

object Schema$CourseRosterChangesInfo {
  @scala.inline
  def apply(courseId: String = null): Schema$CourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CourseRosterChangesInfo]
  }
}

