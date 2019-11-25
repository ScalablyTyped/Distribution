package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teacher extends js.Object {
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[String] = js.undefined
  /**
    * Global user information for the teacher.
    *
    * Read-only.
    */
  var profile: js.UndefOr[UserProfile] = js.undefined
  /**
    * Identifier of the user.
    *
    * When specified as a parameter of a request, this identifier can be one of
    * the following:
    *
    * &#42; the numeric identifier for the user
    * &#42; the email address of the user
    * &#42; the string literal `"me"`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.undefined
}

object Teacher {
  @scala.inline
  def apply(courseId: String = null, profile: UserProfile = null, userId: String = null): Teacher = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teacher]
  }
}

