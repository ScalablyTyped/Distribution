package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.undefined
  var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.undefined
  var feedType: js.UndefOr[String] = js.undefined
}

object Feed {
  @scala.inline
  def apply(
    courseRosterChangesInfo: CourseRosterChangesInfo = null,
    courseWorkChangesInfo: CourseWorkChangesInfo = null,
    feedType: String = null
  ): Feed = {
    val __obj = js.Dynamic.literal()
    if (courseRosterChangesInfo != null) __obj.updateDynamic("courseRosterChangesInfo")(courseRosterChangesInfo.asInstanceOf[js.Any])
    if (courseWorkChangesInfo != null) __obj.updateDynamic("courseWorkChangesInfo")(courseWorkChangesInfo.asInstanceOf[js.Any])
    if (feedType != null) __obj.updateDynamic("feedType")(feedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feed]
  }
}

