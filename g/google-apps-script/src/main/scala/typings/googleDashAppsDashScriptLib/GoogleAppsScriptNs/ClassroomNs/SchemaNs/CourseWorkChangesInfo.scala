package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseWorkChangesInfo extends js.Object {
  var courseId: js.UndefOr[java.lang.String] = js.undefined
}

object CourseWorkChangesInfo {
  @scala.inline
  def apply(courseId: java.lang.String = null): CourseWorkChangesInfo = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    __obj.asInstanceOf[CourseWorkChangesInfo]
  }
}

