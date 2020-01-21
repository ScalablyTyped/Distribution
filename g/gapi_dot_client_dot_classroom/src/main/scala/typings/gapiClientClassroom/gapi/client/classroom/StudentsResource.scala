package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstokenAlt
import typings.gapiClientClassroom.AnonAccesstokenAltBearertokenCallbackCourseIdEnrollmentCode
import typings.gapiClientClassroom.AnonAccesstokenAltBearertokenCallbackCourseIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StudentsResource extends js.Object {
  /**
    * Adds a user as a student of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to create
    * students in this course or for access errors.
    * &#42; `NOT_FOUND` if the requested course ID does not exist.
    * &#42; `FAILED_PRECONDITION` if the requested user's account is disabled,
    * for the following request errors:
    * &#42; CourseMemberLimitReached
    * &#42; CourseNotModifiable
    * &#42; UserGroupsMembershipLimitReached
    * &#42; `ALREADY_EXISTS` if the user is already a student or teacher in the
    * course.
    */
  def create(request: AnonAccesstokenAltBearertokenCallbackCourseIdEnrollmentCode): Request_[Student]
  /**
    * Deletes a student of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete
    * students of this course or for access errors.
    * &#42; `NOT_FOUND` if no student of this course has the requested ID or if the
    * course does not exist.
    */
  def delete(request: AnonAccesstokenAltBearertokenCallbackCourseIdFields): Request_[js.Object]
  /**
    * Returns a student of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to view
    * students of this course or for access errors.
    * &#42; `NOT_FOUND` if no student of this course has the requested ID or if the
    * course does not exist.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackCourseIdFields): Request_[Student]
  /**
    * Returns a list of students of this course that the requester
    * is permitted to view.
    *
    * This method returns the following error codes:
    *
    * &#42; `NOT_FOUND` if the course does not exist.
    * &#42; `PERMISSION_DENIED` for access errors.
    */
  def list(request: AnonAccesstokenAlt): Request_[ListStudentsResponse]
}

object StudentsResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertokenCallbackCourseIdEnrollmentCode => Request_[Student],
    delete: AnonAccesstokenAltBearertokenCallbackCourseIdFields => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackCourseIdFields => Request_[Student],
    list: AnonAccesstokenAlt => Request_[ListStudentsResponse]
  ): StudentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[StudentsResource]
  }
}

