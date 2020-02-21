package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstokenAlt
import typings.gapiClientClassroom.AnonAccesstokenAltCallback
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtoken
import typings.gapiClientClassroom.AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeachersResource extends js.Object {
  /**
    * Creates a teacher of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not  permitted to create
    * teachers in this course or for access errors.
    * &#42; `NOT_FOUND` if the requested course ID does not exist.
    * &#42; `FAILED_PRECONDITION` if the requested user's account is disabled,
    * for the following request errors:
    * &#42; CourseMemberLimitReached
    * &#42; CourseNotModifiable
    * &#42; CourseTeacherLimitReached
    * &#42; UserGroupsMembershipLimitReached
    * &#42; `ALREADY_EXISTS` if the user is already a teacher or student in the
    * course.
    */
  def create(request: AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtokenPrettyPrint): Request_[Teacher] = js.native
  def create(request: AnonAccesstokenAlt, body: Teacher): Request_[Teacher] = js.native
  /**
    * Deletes a teacher of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete
    * teachers of this course or for access errors.
    * &#42; `NOT_FOUND` if no teacher of this course has the requested ID or if the
    * course does not exist.
    * &#42; `FAILED_PRECONDITION` if the requested ID belongs to the primary teacher
    * of this course.
    */
  def delete(request: AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtoken): Request_[js.Object] = js.native
  /**
    * Returns a teacher of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to view
    * teachers of this course or for access errors.
    * &#42; `NOT_FOUND` if no teacher of this course has the requested ID or if the
    * course does not exist.
    */
  def get(request: AnonAccesstokenAltCallbackCourseIdFieldsKeyOauthtoken): Request_[Teacher] = js.native
  /**
    * Returns a list of teachers of this course that the requester
    * is permitted to view.
    *
    * This method returns the following error codes:
    *
    * &#42; `NOT_FOUND` if the course does not exist.
    * &#42; `PERMISSION_DENIED` for access errors.
    */
  def list(request: AnonAccesstokenAltCallback): Request_[ListTeachersResponse] = js.native
}

