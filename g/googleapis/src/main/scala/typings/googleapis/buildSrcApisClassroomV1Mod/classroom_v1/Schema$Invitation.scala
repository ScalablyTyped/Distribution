package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An invitation to join a course.
  */
@js.native
trait Schema$Invitation extends js.Object {
  /**
    * Identifier of the course to invite the user to.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Identifier assigned by Classroom.  Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Role to invite the user to have. Must not be `COURSE_ROLE_UNSPECIFIED`.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Identifier of the invited user.  When specified as a parameter of a
    * request, this identifier can be set to one of the following:  * the
    * numeric identifier for the user * the email address of the user * the
    * string literal `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$Invitation {
  @scala.inline
  def apply(courseId: String = null, id: String = null, role: String = null, userId: String = null): Schema$Invitation = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Invitation]
  }
}

