package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  /**
    * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
    * This field must be specified if `feed_type` is `COURSE_ROSTER_CHANGES`.
    */
  var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.undefined
  /** The type of feed. */
  var feedType: js.UndefOr[String] = js.undefined
}

object Feed {
  @scala.inline
  def apply(courseRosterChangesInfo: CourseRosterChangesInfo = null, feedType: String = null): Feed = {
    val __obj = js.Dynamic.literal()
    if (courseRosterChangesInfo != null) __obj.updateDynamic("courseRosterChangesInfo")(courseRosterChangesInfo)
    if (feedType != null) __obj.updateDynamic("feedType")(feedType)
    __obj.asInstanceOf[Feed]
  }
}

