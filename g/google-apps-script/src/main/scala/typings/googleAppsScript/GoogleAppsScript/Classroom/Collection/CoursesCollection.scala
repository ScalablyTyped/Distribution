package typings.googleAppsScript.GoogleAppsScript.Classroom.Collection

import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.AliasesCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.AnnouncementsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.CourseWorkCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.StudentsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.TeachersCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Course
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCoursesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoursesCollection extends js.Object {
  var Aliases: js.UndefOr[AliasesCollection] = js.native
  var Announcements: js.UndefOr[AnnouncementsCollection] = js.native
  var CourseWork: js.UndefOr[CourseWorkCollection] = js.native
  var Students: js.UndefOr[StudentsCollection] = js.native
  var Teachers: js.UndefOr[TeachersCollection] = js.native
  // Creates a course.
  // The user specified in `ownerId` is the owner of the created course
  // and added as a teacher.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to create
  // courses or for access errors.
  // * `NOT_FOUND` if the primary teacher is not a valid user.
  // * `FAILED_PRECONDITION` if the course owner's account is disabled or for
  // the following request errors:
  //     * UserGroupsMembershipLimitReached
  // * `ALREADY_EXISTS` if an alias was specified in the `id` and
  // already exists.
  def create(resource: Course): Course = js.native
  // Returns a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // requested course or for access errors.
  // * `NOT_FOUND` if no course exists with the requested ID.
  def get(id: String): Course = js.native
  // Returns a list of courses that the requesting user is permitted to view,
  // restricted to those that match the request. Returned courses are ordered by
  // creation time, with the most recently created coming first.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` for access errors.
  // * `INVALID_ARGUMENT` if the query argument is malformed.
  // * `NOT_FOUND` if any users specified in the query arguments do not exist.
  def list(): ListCoursesResponse = js.native
  // Returns a list of courses that the requesting user is permitted to view,
  // restricted to those that match the request. Returned courses are ordered by
  // creation time, with the most recently created coming first.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` for access errors.
  // * `INVALID_ARGUMENT` if the query argument is malformed.
  // * `NOT_FOUND` if any users specified in the query arguments do not exist.
  def list(optionalArgs: js.Object): ListCoursesResponse = js.native
  // Updates one or more fields in a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to modify the
  // requested course or for access errors.
  // * `NOT_FOUND` if no course exists with the requested ID.
  // * `INVALID_ARGUMENT` if invalid fields are specified in the update mask or
  // if no update mask is supplied.
  // * `FAILED_PRECONDITION` for the following request errors:
  //     * CourseNotModifiable
  def patch(resource: Course, id: String): Course = js.native
  // Updates one or more fields in a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to modify the
  // requested course or for access errors.
  // * `NOT_FOUND` if no course exists with the requested ID.
  // * `INVALID_ARGUMENT` if invalid fields are specified in the update mask or
  // if no update mask is supplied.
  // * `FAILED_PRECONDITION` for the following request errors:
  //     * CourseNotModifiable
  def patch(resource: Course, id: String, optionalArgs: js.Object): Course = js.native
  // Deletes a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to delete the
  // requested course or for access errors.
  // * `NOT_FOUND` if no course exists with the requested ID.
  def remove(id: String): Unit = js.native
  // Updates a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to modify the
  // requested course or for access errors.
  // * `NOT_FOUND` if no course exists with the requested ID.
  // * `FAILED_PRECONDITION` for the following request errors:
  //     * CourseNotModifiable
  def update(resource: Course, id: String): Course = js.native
}

