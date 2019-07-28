package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.CollectionNs.CoursesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.CourseAlias
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs.ListCourseAliasesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasesCollection extends js.Object {
  // Creates an alias for a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to create the
  // alias or for access errors.
  // * `NOT_FOUND` if the course does not exist.
  // * `ALREADY_EXISTS` if the alias already exists.
  // * `FAILED_PRECONDITION` if the alias requested does not make sense for the
  //   requesting user or course (for example, if a user not in a domain
  //   attempts to access a domain-scoped alias).
  def create(resource: CourseAlias, courseId: String): CourseAlias = js.native
  // Returns a list of aliases for a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // course or for access errors.
  // * `NOT_FOUND` if the course does not exist.
  def list(courseId: String): ListCourseAliasesResponse = js.native
  // Returns a list of aliases for a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
  // course or for access errors.
  // * `NOT_FOUND` if the course does not exist.
  def list(courseId: String, optionalArgs: js.Object): ListCourseAliasesResponse = js.native
  // Deletes an alias of a course.
  // This method returns the following error codes:
  // * `PERMISSION_DENIED` if the requesting user is not permitted to remove the
  // alias or for access errors.
  // * `NOT_FOUND` if the alias does not exist.
  // * `FAILED_PRECONDITION` if the alias requested does not make sense for the
  //   requesting user or course (for example, if a user not in a domain
  //   attempts to delete a domain-scoped alias).
  def remove(courseId: String, alias: String): Unit = js.native
}

