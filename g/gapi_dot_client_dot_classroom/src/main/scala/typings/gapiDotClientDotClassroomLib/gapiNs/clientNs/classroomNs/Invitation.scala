package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Invitation extends js.Object {
  /** Identifier of the course to invite the user to. */
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifier assigned by Classroom.
               *
               * Read-only.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Role to invite the user to have.
               * Must not be `COURSE_ROLE_UNSPECIFIED`.
               */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifier of the invited user.
               *
               * When specified as a parameter of a request, this identifier can be set to
               * one of the following:
               *
               * &#42; the numeric identifier for the user
               * &#42; the email address of the user
               * &#42; the string literal `"me"`, indicating the requesting user
               */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

