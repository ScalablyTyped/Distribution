package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def create(request: gapiDotClientDotClassroomLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CourseAlias]
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
  def delete(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAlias): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Returns a list of aliases for a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * course or for access errors.
    * &#42; `NOT_FOUND` if the course does not exist.
    */
  def list(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListCourseAliasesResponse]
}

object AliasesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotClassroomLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CourseAlias]
    ],
    delete: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAlias, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    list: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListCourseAliasesResponse]
    ]
  ): AliasesResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, list = list)
  
    __obj.asInstanceOf[AliasesResource]
  }
}

