package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotClassroom.Anon_Accesstoken
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAlt
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackCourseIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def create(request: Anon_Accesstoken): Request[Teacher]
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
  def delete(request: Anon_AccesstokenAltBearertokenCallbackCourseIdFields): Request[js.Object]
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
  def get(request: Anon_AccesstokenAltBearertokenCallbackCourseIdFields): Request[Teacher]
  /**
    * Returns a list of teachers of this course that the requester
    * is permitted to view.
    *
    * This method returns the following error codes:
    *
    * &#42; `NOT_FOUND` if the course does not exist.
    * &#42; `PERMISSION_DENIED` for access errors.
    */
  def list(request: Anon_AccesstokenAlt): Request[ListTeachersResponse]
}

object TeachersResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[Teacher],
    delete: Anon_AccesstokenAltBearertokenCallbackCourseIdFields => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackCourseIdFields => Request[Teacher],
    list: Anon_AccesstokenAlt => Request[ListTeachersResponse]
  ): TeachersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TeachersResource]
  }
}

