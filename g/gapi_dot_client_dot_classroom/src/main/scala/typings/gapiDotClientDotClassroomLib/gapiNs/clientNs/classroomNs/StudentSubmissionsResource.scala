package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StudentSubmissionsResource extends js.Object {
  /**
    * Returns a student submission.
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course, course work, or student submission or for
    * access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def get(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId): gapiDotClientLib.gapiNs.clientNs.Request[StudentSubmission]
  /**
    * Returns a list of student submissions that the requester is permitted to
    * view, factoring in the OAuth scopes of the request.
    * `-` may be specified as the `course_work_id` to include student
    * submissions for multiple course work items.
    *
    * Course students may only view their own work. Course teachers
    * and domain administrators may view all student submissions.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course does not exist.
    */
  def list(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseIdCourseWorkId): gapiDotClientLib.gapiNs.clientNs.Request[ListStudentSubmissionsResponse]
  /**
    * Modifies attachments of student submission.
    *
    * Attachments may only be added to student submissions belonging to course
    * work objects with a `workType` of `ASSIGNMENT`.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, if the user is not permitted to modify
    * attachments on the requested student submission, or for
    * access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def modifyAttachments(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId): gapiDotClientLib.gapiNs.clientNs.Request[StudentSubmission]
  /**
    * Updates one or more fields of a student submission.
    *
    * See google.classroom.v1.StudentSubmission for details
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
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def patch(
    request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseIdCourseWorkIdFields
  ): gapiDotClientLib.gapiNs.clientNs.Request[StudentSubmission]
  /**
    * Reclaims a student submission on behalf of the student that owns it.
    *
    * Reclaiming a student submission transfers ownership of attached Drive
    * files to the student and update the submission state.
    *
    * Only the student that owns the requested student submission may call this
    * method, and only for a student submission that has been turned in.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, unsubmit the requested student submission,
    * or for access errors.
    * &#42; `FAILED_PRECONDITION` if the student submission has not been turned in.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def reclaim(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Returns a student submission.
    *
    * Returning a student submission transfers ownership of attached Drive
    * files to the student and may also update the submission state.
    * Unlike the Classroom application, returning a student submission does not
    * set assignedGrade to the draftGrade value.
    *
    * Only a teacher of the course that contains the requested student submission
    * may call this method.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, return the requested student submission,
    * or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def `return`(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Turns in a student submission.
    *
    * Turning in a student submission transfers ownership of attached Drive
    * files to the teacher and may also update the submission state.
    *
    * This may only be called by the student that owns the specified student
    * submission.
    *
    * This request must be made by the Developer Console project of the
    * [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    * create the corresponding course work item.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access the
    * requested course or course work, turn in the requested student submission,
    * or for access errors.
    * &#42; `INVALID_ARGUMENT` if the request is malformed.
    * &#42; `NOT_FOUND` if the requested course, course work, or student submission
    * does not exist.
    */
  def turnIn(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
}

object StudentSubmissionsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StudentSubmission]
    ],
    list: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseIdCourseWorkId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListStudentSubmissionsResponse]
    ],
    modifyAttachments: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId, 
      gapiDotClientLib.gapiNs.clientNs.Request[StudentSubmission]
    ],
    patch: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseIdCourseWorkIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[StudentSubmission]
    ],
    reclaim: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    `return`: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    turnIn: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackCourseId, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ]
  ): StudentSubmissionsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list, modifyAttachments = modifyAttachments, patch = patch, reclaim = reclaim, turnIn = turnIn)
    __obj.updateDynamic("return")(`return`)
    __obj.asInstanceOf[StudentSubmissionsResource]
  }
}

