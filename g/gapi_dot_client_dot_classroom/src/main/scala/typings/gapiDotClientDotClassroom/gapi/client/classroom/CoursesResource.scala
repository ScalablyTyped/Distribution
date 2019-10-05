package typings.gapiDotClientDotClassroom.gapi.client.classroom

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackCourseStates
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackFieldsId
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackFieldsIdKey
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
  def create(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[Course]
  /**
    * Deletes a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to delete the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsId): Request[js.Object]
  /**
    * Returns a course.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or for access errors.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsId): Request[Course]
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
  def list(request: Anon_AccesstokenAltBearertokenCallbackCourseStates): Request[ListCoursesResponse]
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
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFieldsIdKey): Request[Course]
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
  def update(request: Anon_AccesstokenAltBearertokenCallbackFieldsId): Request[Course]
}

object CoursesResource {
  @scala.inline
  def apply(
    aliases: AliasesResource,
    announcements: AnnouncementsResource,
    courseWork: CourseWorkResource,
    create: Anon_AccesstokenAltBearertokenCallbackFields => Request[Course],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsId => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsId => Request[Course],
    list: Anon_AccesstokenAltBearertokenCallbackCourseStates => Request[ListCoursesResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsIdKey => Request[Course],
    students: StudentsResource,
    teachers: TeachersResource,
    update: Anon_AccesstokenAltBearertokenCallbackFieldsId => Request[Course]
  ): CoursesResource = {
    val __obj = js.Dynamic.literal(aliases = aliases, announcements = announcements, courseWork = courseWork, create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), students = students, teachers = teachers, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CoursesResource]
  }
}

