package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends js.Object {
  var courseId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object Invitation {
  @scala.inline
  def apply(courseId: String = null, id: String = null, role: String = null, userId: String = null): Invitation = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (role != null) __obj.updateDynamic("role")(role)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Invitation]
  }
}

