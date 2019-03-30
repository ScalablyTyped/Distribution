package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.undefined
  var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.undefined
  var feedType: js.UndefOr[java.lang.String] = js.undefined
}

object Feed {
  @scala.inline
  def apply(
    courseRosterChangesInfo: CourseRosterChangesInfo = null,
    courseWorkChangesInfo: CourseWorkChangesInfo = null,
    feedType: java.lang.String = null
  ): Feed = {
    val __obj = js.Dynamic.literal()
    if (courseRosterChangesInfo != null) __obj.updateDynamic("courseRosterChangesInfo")(courseRosterChangesInfo)
    if (courseWorkChangesInfo != null) __obj.updateDynamic("courseWorkChangesInfo")(courseWorkChangesInfo)
    if (feedType != null) __obj.updateDynamic("feedType")(feedType)
    __obj.asInstanceOf[Feed]
  }
}

