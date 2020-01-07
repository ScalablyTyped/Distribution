package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class of notifications that an application can register to receive. For
  * example: &quot;all roster changes for a domain&quot;.
  */
@js.native
trait Schema$Feed extends js.Object {
  /**
    * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
    * This field must be specified if `feed_type` is `COURSE_ROSTER_CHANGES`.
    */
  var courseRosterChangesInfo: js.UndefOr[Schema$CourseRosterChangesInfo] = js.native
  /**
    * Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`.
    * This field must be specified if `feed_type` is `COURSE_WORK_CHANGES`.
    */
  var courseWorkChangesInfo: js.UndefOr[Schema$CourseWorkChangesInfo] = js.native
  /**
    * The type of feed.
    */
  var feedType: js.UndefOr[String] = js.native
}

object Schema$Feed {
  @scala.inline
  def apply(
    courseRosterChangesInfo: Schema$CourseRosterChangesInfo = null,
    courseWorkChangesInfo: Schema$CourseWorkChangesInfo = null,
    feedType: String = null
  ): Schema$Feed = {
    val __obj = js.Dynamic.literal()
    if (courseRosterChangesInfo != null) __obj.updateDynamic("courseRosterChangesInfo")(courseRosterChangesInfo.asInstanceOf[js.Any])
    if (courseWorkChangesInfo != null) __obj.updateDynamic("courseWorkChangesInfo")(courseWorkChangesInfo.asInstanceOf[js.Any])
    if (feedType != null) __obj.updateDynamic("feedType")(feedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Feed]
  }
}

