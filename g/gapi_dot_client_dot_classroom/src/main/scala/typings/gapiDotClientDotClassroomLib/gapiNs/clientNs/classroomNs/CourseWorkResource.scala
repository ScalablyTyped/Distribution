package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseWorkResource extends js.Object {
  var studentSubmissions: StudentSubmissionsResource
  /**
    * Creates course work.
    *
    * The resulting course work (and corresponding student submissions) are
    * associated with the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * make the request. Classroom API requests to modify course work and student
    * submissions must be made with an OAuth client ID from the associated
    * Developer Console project.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, create course work in the requested course, share a
    * Drive attachment, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    * &#42; `FAILED_PRECONDITION` for the following request error:
    * &#42; AttachmentNotVisible
    */
  def create(request: gapiDotClientDotClassroomLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
  /**
    * Deletes a course work.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding course work, if the requesting user is not permitted
    * to delete the requested course or for access errors.
    * &#42; `FAILED_PRECONDITION` if the requested course work has already been
    * deleted.
    * &#42; `NOT_FOUND` if no course exists with the requested ID.
    */
  def delete(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Returns course work.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or course work does not exist.
    */
  def get(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
  /**
    * Returns a list of course work that the requester is permitted to view.
    *
    * Course students may only view `PUBLISHED` course work. Course teachers
    * and domain administrators may view all course work.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * the requested course or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def list(
    request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseIdCourseWorkStates
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListCourseWorkResponse]
  /**
    * Modifies assignee mode and options of a coursework.
    *
    * Only a teacher of the course that contains the coursework may
    * call this method.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course or course work does not exist.
    */
  def modifyAssignees(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
  /**
    * Updates one or more fields of a course work.
    *
    * See google.classroom.v1.CourseWork for details
    * of which fields may be updated and who may change them.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting developer project did not create
    * the corresponding course work, if the user is not permitted to make the
    * requested modification to the student submission, or for
    * access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `FAILED_PRECONDITION` if the requested course work has already been
    * deleted.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def patch(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
}

object CourseWorkResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotClassroomLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
    ],
    delete: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
    ],
    list: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseIdCourseWorkStates, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListCourseWorkResponse]
    ],
    modifyAssignees: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
    ],
    patch: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[CourseWork]
    ],
    studentSubmissions: StudentSubmissionsResource
  ): CourseWorkResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, modifyAssignees = modifyAssignees, patch = patch, studentSubmissions = studentSubmissions)
  
    __obj.asInstanceOf[CourseWorkResource]
  }
}

