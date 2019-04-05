package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teacher extends js.Object {
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[UserProfile] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object Teacher {
  @scala.inline
  def apply(courseId: java.lang.String = null, profile: UserProfile = null, userId: java.lang.String = null): Teacher = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Teacher]
  }
}

