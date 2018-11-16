package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Teacher extends js.Object {
  /**
               * Identifier of the course.
               *
               * Read-only.
               */
  var courseId: js.UndefOr[java.lang.String] = js.undefined
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
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

