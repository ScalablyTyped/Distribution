package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends js.Object {
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object Invitation {
  @scala.inline
  def apply(
    courseId: java.lang.String = null,
    id: java.lang.String = null,
    role: java.lang.String = null,
    userId: java.lang.String = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (role != null) __obj.updateDynamic("role")(role)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Invitation]
  }
}

