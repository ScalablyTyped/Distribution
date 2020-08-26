package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
  */
@js.native
trait SchemaCourseRosterChangesInfo extends js.Object {
  /**
    * The `course_id` of the course to subscribe to roster changes for.
    */
  var courseId: js.UndefOr[String] = js.native
}

object SchemaCourseRosterChangesInfo {
  @scala.inline
  def apply(): SchemaCourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseRosterChangesInfo]
  }
  @scala.inline
  implicit class SchemaCourseRosterChangesInfoOps[Self <: SchemaCourseRosterChangesInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
  }
  
}

