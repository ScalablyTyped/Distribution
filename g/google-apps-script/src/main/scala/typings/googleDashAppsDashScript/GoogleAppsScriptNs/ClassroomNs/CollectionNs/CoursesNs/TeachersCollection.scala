package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.CollectionNs.CoursesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.ListTeachersResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.Teacher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeachersCollection extends js.Object {
  // Creates a teacher of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not  permitted to create
  // teachers in this course or for access errors.
  // * `NOT_FOUND` if the requested course ID does not exist.
  // * `FAILED_PRECONDITION` if the requested user's account is disabled,
  // for the following request errors:
  //     * CourseMemberLimitReached
  //     * CourseNotModifiable
  //     * CourseTeacherLimitReached
  //     * UserGroupsMembershipLimitReached
  // * `ALREADY_EXISTS` if the user is already a teacher or student in the
  // course.
  def create(resource: Teacher, courseId: String): Teacher = js.native
  // Returns a teacher of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to view
  // teachers of this course or for access errors.
  // * `NOT_FOUND` if no teacher of this course has the requested ID or if the
  // course does not exist.
  def get(courseId: String, userId: String): Teacher = js.native
  // Returns a list of teachers of this course that the requester
  // is permitted to view.
  // This method returns the following error codes:
  // * `NOT_FOUND` if the course does not exist.
  // * `PERMISSION_DENIED` for access errors.
  def list(courseId: String): ListTeachersResponse = js.native
  // Returns a list of teachers of this course that the requester
  // is permitted to view.
  // This method returns the following error codes:
  // * `NOT_FOUND` if the course does not exist.
  // * `PERMISSION_DENIED` for access errors.
  def list(courseId: String, optionalArgs: js.Object): ListTeachersResponse = js.native
  // Deletes a teacher of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to delete
  // teachers of this course or for access errors.
  // * `NOT_FOUND` if no teacher of this course has the requested ID or if the
  // course does not exist.
  // * `FAILED_PRECONDITION` if the requested ID belongs to the primary teacher
  // of this course.
  def remove(courseId: String, userId: String): Unit = js.native
}

