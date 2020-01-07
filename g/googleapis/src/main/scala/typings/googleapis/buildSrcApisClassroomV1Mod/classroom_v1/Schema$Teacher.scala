package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Teacher of a course.
  */
@js.native
trait Schema$Teacher extends js.Object {
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Global user information for the teacher.  Read-only.
    */
  var profile: js.UndefOr[Schema$UserProfile] = js.native
  /**
    * Identifier of the user.  When specified as a parameter of a request, this
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal
    * `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$Teacher {
  @scala.inline
  def apply(courseId: String = null, profile: Schema$UserProfile = null, userId: String = null): Schema$Teacher = {
    val __obj = js.Dynamic.literal()
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Teacher]
  }
}

