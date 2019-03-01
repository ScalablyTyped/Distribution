package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoursesResource extends js.Object {
  var aliases: AliasesResource
  var announcements: AnnouncementsResource
  var courseWork: CourseWorkResource
  var students: StudentsResource
  var teachers: TeachersResource
  /**
    * Creates a course.
    *
    * The user specified in `ownerId` is the owner of the created course
    * and added as a teacher.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to create
    * courses or for access errors.
    * &#42; `NOT_FOUND` if the primary teacher is not a valid user.
    * &#42; `FAILED_PRECONDITION` if the course owner's account is disabled or for
    * the following request errors:
    * &#42; UserGroupsMembershipLimitReached
    * &#42; `ALREADY_EXISTS` if an alias was specified in the `id` and
    * already exists.
    */
  def create(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[Course]
  /**
    * Deletes a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Returns a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def get(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[Course]
  /**
    * Returns a list of courses that the requesting user is permitted to view,
    * restricted to those that match the request. Returned courses are ordered by
    * creation time, with the most recently created coming first.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` for access errors.
    * &#42; `INVALID_ARGUMENT` if the query argument is malformed.
    * &#42; `NOT_FOUND` if any users specified in the query arguments do not exist.
    */
  def list(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseStates): gapiDotClientLib.gapiNs.clientNs.Request[ListCoursesResponse]
  /**
    * Updates one or more fields in a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to modify the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    * &#42; `INVALID_ARGUMENT` if invalid fields are specified in the update mask or
    * if no update mask is supplied.
    * &#42; `FAILED_PRECONDITION` for the following request errors:
    * &#42; CourseNotModifiable
    */
  def patch(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsIdKey): gapiDotClientLib.gapiNs.clientNs.Request[Course]
  /**
    * Updates a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to modify the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    * &#42; `FAILED_PRECONDITION` for the following request errors:
    * &#42; CourseNotModifiable
    */
  def update(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[Course]
}

object CoursesResource {
  @scala.inline
  def apply(
    aliases: AliasesResource,
    announcements: AnnouncementsResource,
    courseWork: CourseWorkResource,
    create: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Course]
    ],
    delete: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Course]
    ],
    list: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseStates, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListCoursesResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsIdKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Course]
    ],
    students: StudentsResource,
    teachers: TeachersResource,
    update: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Course]
    ]
  ): CoursesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aliases")(aliases)
    __obj.updateDynamic("announcements")(announcements)
    __obj.updateDynamic("courseWork")(courseWork)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("students")(students)
    __obj.updateDynamic("teachers")(teachers)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CoursesResource]
  }
}

