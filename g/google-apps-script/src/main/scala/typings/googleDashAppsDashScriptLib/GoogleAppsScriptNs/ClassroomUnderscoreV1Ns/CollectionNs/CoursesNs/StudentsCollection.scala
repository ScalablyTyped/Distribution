package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.CollectionNs.CoursesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StudentsCollection extends js.Object {
  // Adds a user as a student of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to create
  // students in this course or for access errors.
  // * `NOT_FOUND` if the requested course ID does not exist.
  // * `FAILED_PRECONDITION` if the requested user's account is disabled,
  // for the following request errors:
  //     * CourseMemberLimitReached
  //     * CourseNotModifiable
  //     * UserGroupsMembershipLimitReached
  // * `ALREADY_EXISTS` if the user is already a student or teacher in the
  // course.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Student,
    courseId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Student = js.native
  // Adds a user as a student of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to create
  // students in this course or for access errors.
  // * `NOT_FOUND` if the requested course ID does not exist.
  // * `FAILED_PRECONDITION` if the requested user's account is disabled,
  // for the following request errors:
  //     * CourseMemberLimitReached
  //     * CourseNotModifiable
  //     * UserGroupsMembershipLimitReached
  // * `ALREADY_EXISTS` if the user is already a student or teacher in the
  // course.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Student,
    courseId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Student = js.native
  // Returns a student of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to view
  // students of this course or for access errors.
  // * `NOT_FOUND` if no student of this course has the requested ID or if the
  // course does not exist.
  def get(courseId: java.lang.String, userId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.Student = js.native
  // Returns a list of students of this course that the requester
  // is permitted to view.
  // This method returns the following error codes:
  // * `NOT_FOUND` if the course does not exist.
  // * `PERMISSION_DENIED` for access errors.
  def list(courseId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.ListStudentsResponse = js.native
  // Returns a list of students of this course that the requester
  // is permitted to view.
  // This method returns the following error codes:
  // * `NOT_FOUND` if the course does not exist.
  // * `PERMISSION_DENIED` for access errors.
  def list(courseId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs.ListStudentsResponse = js.native
  // Deletes a student of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to delete
  // students of this course or for access errors.
  // * `NOT_FOUND` if no student of this course has the requested ID or if the
  // course does not exist.
  def remove(courseId: java.lang.String, userId: java.lang.String): scala.Unit = js.native
}

