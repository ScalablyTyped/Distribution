package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`.
  */
@js.native
trait SchemaCourseWorkChangesInfo extends js.Object {
  /**
    * The `course_id` of the course to subscribe to work changes for.
    */
  var courseId: js.UndefOr[String] = js.native
}

object SchemaCourseWorkChangesInfo {
  @scala.inline
  def apply(courseId: String = null): SchemaCourseWorkChangesInfo = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCourseWorkChangesInfo]
  }
}

