package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstoken
import typings.gapiClientClassroom.AnonAlias
import typings.gapiClientClassroom.AnonAlt
import typings.gapiClientClassroom.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasesResource extends js.Object {
  /**
    * Creates an alias for a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to create the
    * alias or for access errors.
    * &#42; `NOT_FOUND` if the course does not exist.
    * &#42; `ALREADY_EXISTS` if the alias already exists.
    * &#42; `FAILED_PRECONDITION` if the alias requested does not make sense for the
    * requesting user or course (for example, if a user not in a domain
    * attempts to access a domain-scoped alias).
    */
  def create(request: AnonAccesstoken): Request_[CourseAlias] = js.native
  def create(request: AnonAlt, body: CourseAlias): Request_[CourseAlias] = js.native
  /**
    * Deletes an alias of a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to remove the
    * alias or for access errors.
    * &#42; `NOT_FOUND` if the alias does not exist.
    * &#42; `FAILED_PRECONDITION` if the alias requested does not make sense for the
    * requesting user or course (for example, if a user not in a domain
    * attempts to delete a domain-scoped alias).
    */
  def delete(request: AnonAlias): Request_[js.Object] = js.native
  /**
    * Returns a list of aliases for a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * course or for access errors.
    * &#42; `NOT_FOUND` if the course does not exist.
    */
  def list(request: AnonCallback): Request_[ListCourseAliasesResponse] = js.native
}

