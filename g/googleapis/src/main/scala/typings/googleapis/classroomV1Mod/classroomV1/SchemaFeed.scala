package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class of notifications that an application can register to receive. For
  * example: &quot;all roster changes for a domain&quot;.
  */
@js.native
trait SchemaFeed extends js.Object {
  /**
    * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
    * This field must be specified if `feed_type` is `COURSE_ROSTER_CHANGES`.
    */
  var courseRosterChangesInfo: js.UndefOr[SchemaCourseRosterChangesInfo] = js.native
  /**
    * Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`.
    * This field must be specified if `feed_type` is `COURSE_WORK_CHANGES`.
    */
  var courseWorkChangesInfo: js.UndefOr[SchemaCourseWorkChangesInfo] = js.native
  /**
    * The type of feed.
    */
  var feedType: js.UndefOr[String] = js.native
}

object SchemaFeed {
  @scala.inline
  def apply(
    courseRosterChangesInfo: SchemaCourseRosterChangesInfo = null,
    courseWorkChangesInfo: SchemaCourseWorkChangesInfo = null,
    feedType: String = null
  ): SchemaFeed = {
    val __obj = js.Dynamic.literal()
    if (courseRosterChangesInfo != null) __obj.updateDynamic("courseRosterChangesInfo")(courseRosterChangesInfo.asInstanceOf[js.Any])
    if (courseWorkChangesInfo != null) __obj.updateDynamic("courseWorkChangesInfo")(courseWorkChangesInfo.asInstanceOf[js.Any])
    if (feedType != null) __obj.updateDynamic("feedType")(feedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFeed]
  }
}

