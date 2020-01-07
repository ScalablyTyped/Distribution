package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`.
  */
@js.native
trait Schema$CourseWorkChangesInfo extends js.Object {
  /**
    * The `course_id` of the course to subscribe to work changes for.
    */
  var courseId: js.UndefOr[String] = js.native
}

object Schema$CourseWorkChangesInfo {
  @scala.inline
  def apply(courseId: String = null): Schema$CourseWorkChangesInfo = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CourseWorkChangesInfo]
  }
}

