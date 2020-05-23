package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClassroom.anon.Callback
import typings.gapiClientClassroom.anon.CallbackCourseId
import typings.gapiClientClassroom.anon.EnrollmentCode
import typings.gapiClientClassroom.anon.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StudentsResource extends js.Object {
  def create(request: CallbackCourseId, body: Student): Request[Student] = js.native
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
  def create(request: EnrollmentCode): Request[Student] = js.native
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
  def delete(): Request[js.Object] = js.native
  def delete(request: UserId): Request[js.Object] = js.native
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
  def get(): Request[Student] = js.native
  def get(request: UserId): Request[Student] = js.native
  /**
    * Returns a list of students of this course that the requester
    * is permitted to view.
    *
    * This method returns the following error codes:
    *
    * &#42; `NOT_FOUND` if the course does not exist.
    * &#42; `PERMISSION_DENIED` for access errors.
    */
  def list(): Request[ListStudentsResponse] = js.native
  def list(request: Callback): Request[ListStudentsResponse] = js.native
}

