package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

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
  var feedType: js.UndefOr[java.lang.String] = js.undefined
}

